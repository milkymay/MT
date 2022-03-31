import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.List;

//char
//int
//float
//double

//unsigned char
//unsigned int
//unsigned short int
//unsigned long int

//signed char
//signed int
//signed short int
//signed long int

//short int

//long int
//long double

public class LexicalAnalyzer {
    InputStream inputStream;
    int curChar;
    int curPos;
    Token curToken;
    List<String> TYPES_ENDS = List.of("int", "char", "float", "double", "void");
    List<String> TYPES = List.of("long", "unsigned", "signed", "short");

    public LexicalAnalyzer(InputStream inputStream) throws ParseException {
        this.inputStream = inputStream;
        curPos = 0;
        nextChar();
    }

    private boolean isBlank(int c) {
        return Character.isWhitespace(c);
    }

    private void checkExtName(String name) throws ParseException {
        int pos = curPos - name.length();
        char firstChar = name.charAt(0);
        if (!(firstChar == '_' || Character.isAlphabetic(firstChar))) {
            throw new ParseException("Illegal character " + firstChar, pos);
        }
        for (int i = 1; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == '[') {
                c = name.charAt(i + 1);
                if ((i == name.length() - 2) && c == ']') {
                    return;
                } else {
                    throw new ParseException("Illegal character " + c, pos + i + 1);
                }
            }
            if (!(c == '_' || Character.isAlphabetic(c) || Character.isDigit(c))) {
                throw new ParseException("Illegal character " + c, pos + i);
            }
        }
    }

    private boolean checkName(String name) throws ParseException {
        int pos = curPos - name.length();
        char firstChar = name.charAt(0);
        if (!(firstChar == '_' || Character.isAlphabetic(firstChar))) {
            throw new ParseException("Illegal character " + firstChar, pos);
        }
        for (int i = 1; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!(c == '_' || Character.isAlphabetic(c) || Character.isDigit(c))) {
                if (c == '[' || c == ']') {
                    return false;
                }
                throw new ParseException("Illegal character " + c, pos + i);
            }
        }
        return true;
    }

    private void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = inputStream.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public void nextToken() throws ParseException {
        skipWs();

        label:
        switch (curChar) {
            case '(' -> {
                nextChar();
                curToken = Token.LPAREN;
            }
            case ')' -> {
                nextChar();
                if (curChar == ';') {
                    curToken = Token.RPAREN_SEM;
                    nextChar();
                } else
                    throw new ParseException("Illegal character " + (char) curChar, curPos);
            }
            case ',' -> {
                nextChar();
                curToken = Token.COMA;
            }
            case '*' -> {
                nextChar();
                curToken = Token.STAR;
            }
            case -1 -> curToken = Token.END;
            default -> {
                String token = getNextToken().toString();
                if (TYPES_ENDS.contains(token)) {
                    curToken = Token.TYPE;
                } else if (TYPES.contains(token)) {
                    String nextToken = getNextToken().toString();
                    switch (token) {
                        case "signed":
                        case "unsigned":
                            if (nextToken.equals("char") || nextToken.equals("int")) {
                                curToken = Token.TYPE;
                                break label;
                            } else if (nextToken.equals("short") || nextToken.equals("long")) {
                                String lastToken = getNextToken().toString();
                                if (lastToken.equals("int")) {
                                    curToken = Token.TYPE;
                                    break label;
                                } else {
                                    throw new ParseException("Illegal character " + (char) curChar, curPos - curToken.toString().length());
                                }
                            }
                            break;
                        case "short":
                            if (nextToken.equals("int")) {
                                curToken = Token.TYPE;
                                break label;
                            } else {
                                throw new ParseException("Illegal character " + (char) curChar, curPos - curToken.toString().length());
                            }
                        case "long":
                            if (nextToken.equals("int") || nextToken.equals("double")) {
                                curToken = Token.TYPE;
                                break label;
                            } else {
                                throw new ParseException("Illegal character " + (char) curChar, curPos - curToken.toString().length());
                            }
                        default:
                            throw new ParseException("Illegal character " + (char) curChar, curPos);
                    }
                } else {
                    if (checkName(token)) {
                        curToken = Token.NAME;
                    } else {
                        checkExtName(token);
                        curToken = Token.EXT_NAME;
                    }
                }
            }
        }
    }

    private void skipWs() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }
    }

    private StringBuilder getNextToken() throws ParseException {
        skipWs();
        StringBuilder sb = new StringBuilder();
        while (curChar == '_' || Character.isAlphabetic(curChar) || Character.isDigit(curChar) ||
               curChar == '[' || curChar == ']') {
            sb.append((char) curChar);
            nextChar();
        }
        if (sb.length() == 0) {
            throw new ParseException("Illegal character " + (char) curChar, curPos);
        }
        return sb;
    }

    public Token curToken() {
        return curToken;
    }

    public int curPos() {
        return curPos - 1;
    }
}