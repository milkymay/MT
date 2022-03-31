public class Main {
    private static final Parser parser = new Parser();
    private static final String outputFile = "out/tmp";
    private static final String expr = "void func(int a[], int b[]);";

    public static void main(String[] args) {
        parser.parseAndGenerate(expr, outputFile);
    }

}