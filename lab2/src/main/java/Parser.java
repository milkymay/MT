import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Objects;

public class Parser {
    LexicalAnalyzer lexicalAnalyzer;

    public Tree parse(InputStream is) throws ParseException {
        lexicalAnalyzer = new LexicalAnalyzer(is);
        nextToken();
        Tree expr = parseS();
        assertToken(Token.END, "$", 0);
        return expr;
    }

    public void parseAndGenerate(String expr, String outputFileName) {
        Parser parser = new Parser();
        Tree tree;
        try {
            tree = parser.parse(new ByteArrayInputStream(expr.getBytes()));
        } catch (ParseException e) {
            System.err.println("Parse exception in expression: " + expr + "\n"
                    + e.getMessage() + " at position " + e.getErrorOffset() + "\n");
            return;
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(outputFileName))) {
            writer.write("digraph { " + tree.toStringGraph() + "}");
        } catch (InvalidPathException e) {
            System.err.println("Invalid name of output file: " + outputFileName);
        } catch (IOException e) {
            System.err.println("I/O error while writing the string representation of graph");
        }

        try {
            Runtime rt = Runtime.getRuntime();
            String[] args = {"dot", "-Tsvg", outputFileName, "-o", outputFileName + ".svg"};
            Process p = rt.exec(args);
        } catch (IOException e) {
            System.err.println("Couldn't run graphviz. " + e.getMessage());
        }
    }

    private Tree parseS() throws ParseException {
        if (lexicalAnalyzer.curToken().equals(Token.TYPE)) {
            Tree l = parseF();
            String curToken = lexicalAnalyzer.curToken().toString();
            assertToken(Token.LPAREN, curToken, curToken.length());
            nextToken();
            Tree tree = new Tree("S", l, new Tree("("), parseArgs(), new Tree(");"));
            curToken = lexicalAnalyzer.curToken().toString();
            assertToken(Token.RPAREN_SEM, curToken, curToken.length());
            nextToken();
            return tree;
        } else throw getUnexpectedTokenException(lexicalAnalyzer.curToken().toString().length());
    }

    private Tree parseF() throws ParseException {
        if (lexicalAnalyzer.curToken().equals(Token.TYPE)) {
            nextToken();
            Tree tree = new Tree("F", new Tree("type"), parseP(), new Tree("name"));
            String curToken = lexicalAnalyzer.curToken().toString();
            assertToken(Token.NAME, curToken, curToken.length());
            nextToken();
            return tree;
        } else throw getUnexpectedTokenException(lexicalAnalyzer.curToken().toString().length());
    }

    private Tree parseT() throws ParseException {
        if (lexicalAnalyzer.curToken().equals(Token.TYPE)) {
            nextToken();
            Tree tree = new Tree("T", new Tree("type"), parseP(), new Tree("ext_name"));
            String curToken = lexicalAnalyzer.curToken().toString();
            if (!Objects.equals(curToken, Token.NAME.name())) {
                assertToken(Token.EXT_NAME, curToken, curToken.length());
            }
            nextToken();
            return tree;
        } else throw getUnexpectedTokenException(lexicalAnalyzer.curToken().toString().length());
    }

    private Tree parseP() throws ParseException {
        switch (lexicalAnalyzer.curToken()) {
            case STAR -> {
                nextToken();
                return new Tree("P", new Tree("*"), parseP());
            }
            case EXT_NAME, NAME -> {
                return new Tree("P");
            }
            default -> {
                throw getUnexpectedTokenException(lexicalAnalyzer.curToken().toString().length());
            }
        }
    }

    private Tree parseX() throws ParseException {
        switch (lexicalAnalyzer.curToken()) {
            case COMA -> {
                nextToken();
                return new Tree("X", new Tree(","), parseT(), parseX());
            }
            case RPAREN_SEM -> {
                return new Tree("X");
            }
            default -> {
                throw getUnexpectedTokenException(lexicalAnalyzer.curToken().toString().length());
            }
        }
    }

    private Tree parseArgs() throws ParseException {
        return switch (lexicalAnalyzer.curToken()) {
            case TYPE -> new Tree("args", parseT(), parseX());
            case RPAREN_SEM -> new Tree("X");
            default -> throw getUnexpectedTokenException(lexicalAnalyzer.curToken().toString().length());
        };
    }

    private ParseException getUnexpectedTokenException(int len) {
        return new ParseException("Unexpected token", lexicalAnalyzer.curPos() - len);
    }

    private void nextToken() throws ParseException {
        lexicalAnalyzer.nextToken();
    }

    private void assertToken(Token expected, String str, int len) throws ParseException {
        if (lexicalAnalyzer.curToken != expected) {
            throw new ParseException("Expected token " + expected + " but got " + str, lexicalAnalyzer.curPos() - len);
        }
    }
}
