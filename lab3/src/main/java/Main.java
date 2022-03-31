import antlr.SubMainJavaLexer;
import antlr.SubMainJavaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    private static int tests = 4;

    public static void main(String[] args) throws Exception {
        String fileInNamePrefix = "C:\\Users\\melis\\Desktop\\MT\\lab3\\src\\main\\java\\tests\\test";
        String fileOutNamePrefix = "C:\\Users\\melis\\Desktop\\MT\\lab3\\src\\main\\java\\outs\\test";
        String fileNameSuffix = ".java";

        for (int i = 0; i < tests; i++) {
            String example = Files.lines(Paths.get(fileInNamePrefix + i + fileNameSuffix)).reduce("", String::concat);

            try (FileWriter writer = new FileWriter(fileOutNamePrefix + i + fileNameSuffix, false)) {
                SubMainJavaLexer lexer = new SubMainJavaLexer(CharStreams.fromString(example));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                SubMainJavaParser parser = new SubMainJavaParser(tokens);
                ParseTree tree = parser.s();
                SubMainJavaWalker walker = new SubMainJavaWalker();
                SubMainJavaObfListener listener = new SubMainJavaObfListener();
                walker.walk(listener, tree);
                writer.write(listener.getMajorOutput().toString());
            }
        }
    }
}
