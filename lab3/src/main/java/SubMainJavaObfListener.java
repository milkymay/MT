import antlr.SubMainJavaBaseListener;
import antlr.SubMainJavaParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SubMainJavaObfListener extends SubMainJavaBaseListener {

    private final HashMap<String, String> varsNames = new HashMap<>();
    private List<String> vars = new ArrayList<>();
    private final Names names = new Names();
    private final Set<String> tab = Set.of("{", ";", ");", "}");
    private final ArrayList<String> extraVars = new ArrayList<>();
    int NUM = 3;

    private final StringBuilder majorOutput = new StringBuilder();

    public StringBuilder getMajorOutput() {
        return majorOutput;
    }

    @Override
    public void enterArgs(SubMainJavaParser.ArgsContext ctx) {
        super.enterArgs(ctx);
    }

    @Override
    public void exitArgs(SubMainJavaParser.ArgsContext ctx) {
        super.exitArgs(ctx);
        StringBuilder output = new StringBuilder("int ");
        for (int i = 0; i < NUM; i++) {
            String name = names.next();
            extraVars.add(name);
            output.append(name);
            if (i == 0) {
                output.append(", ");
            } else {
                output.append(" = ").append(getRandomNumber()).append(i < (NUM - 1) ? ", " : ";");
            }
        }
        majorOutput.append(output).append("\n");
    }

    @Override
    public void enterSouts(SubMainJavaParser.SoutsContext ctx) {
        super.enterSouts(ctx);
        vars = new ArrayList<>(varsNames.values());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < vars.size(); i++) {
            output.append("\n")
                    .append(extraVars.get(i % NUM)).append(" = ")
                    .append(extraVars.get((i + 1) % NUM))
                    .append(" + ")
                    .append(getRandomNumber())
                    .append(";");
        }
        majorOutput.append(output).append("\n");
    }

    @Override
    public void exitSouts(SubMainJavaParser.SoutsContext ctx) {
        super.exitSouts(ctx);
        vars = new ArrayList<>(varsNames.values());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < NUM; i++) {
            output.append("\n")
                    .append(extraVars.get((i) % NUM)).append(" = ")
                    .append(extraVars.get((i + 1) % NUM)).append(" * ")
                    .append(extraVars.get((i + 2) % NUM)).append(" - ")
                    .append(extraVars.get((i + 3) % NUM)).append(";");
        }
        majorOutput.append(output).append("\n");
    }

    @Override
    public void exitType(SubMainJavaParser.TypeContext ctx) {
        super.exitType(ctx);
        majorOutput.append(" ");
    }

    @Override
    public void enterComp(SubMainJavaParser.CompContext ctx) {
        super.enterComp(ctx);
        majorOutput.append(" ");
    }

    @Override
    public void exitComp(SubMainJavaParser.CompContext ctx) {
        super.exitComp(ctx);
        majorOutput.append(" ");
    }

    @Override
    public void enterSign(SubMainJavaParser.SignContext ctx) {
        super.enterSign(ctx);
        majorOutput.append(" ");
    }

    @Override
    public void exitSign(SubMainJavaParser.SignContext ctx) {
        super.exitSign(ctx);
        majorOutput.append(" ");
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
        int type = node.getSymbol().getType();
        String text = node.getSymbol().getText();
        if (type != 23) {
            if (text.equals("(") || text.equals("{")) {
                majorOutput.append(" ");
            }
            if (type == 20) {
                majorOutput.append(" outs");
            } else if (text.equals("=")) {
                majorOutput.append(" = ");
            } else {
                majorOutput.append(node.getText());
            }
            if (text.equals("public class")) {
                majorOutput.append(" ");
            }
            if (tab.contains(text)) {
                majorOutput.append("\n");
            }
        }
    }

    @Override
    public void enterName(SubMainJavaParser.NameContext ctx) {
        super.enterName(ctx);
        String name = ctx.N().getText();
        if (!varsNames.containsKey(name)) {
            varsNames.put(name, names.next());
        }
    }

    private int getRandomNumber() {
        return (int) ((Math.random() * (20 - 1)) + 1);
    }

    @Override
    public void exitName(SubMainJavaParser.NameContext ctx) {
        super.exitName(ctx);
        String name = ctx.N().getText();
        majorOutput.append(varsNames.get(name));
    }

    private static class Names {
        private int cur = 0;

        public String next() {
            BigInteger nextNum = new BigInteger(String.valueOf(cur++));
            String next = nextNum.toString(4).replace('2', 'I').replace('3', 'O');
            return "I".concat(next);
        }
    }
}