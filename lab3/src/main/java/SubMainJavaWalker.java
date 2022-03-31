import antlr.SubMainJavaListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SubMainJavaWalker {
    public static final SubMainJavaWalker DEFAULT = new SubMainJavaWalker();

    public SubMainJavaWalker() {
    }

    public void walk(SubMainJavaObfListener listener, ParseTree t) {
       if (t instanceof ErrorNode) {
            listener.visitErrorNode((ErrorNode)t);
        } else if (t instanceof TerminalNode) {
            listener.visitTerminal((TerminalNode)t);
        } else {
            RuleNode r = (RuleNode)t;
            this.enterRule(listener, r);
            int n = r.getChildCount();

            for(int i = 0; i < n; ++i) {
                this.walk(listener, r.getChild(i));
            }

            this.exitRule(listener, r);
        }
    }

    protected void enterRule(SubMainJavaObfListener listener, RuleNode r) {
//        System.out.println( "Entering : " + r);
        ParserRuleContext ctx = (ParserRuleContext)r.getRuleContext();
        listener.enterEveryRule(ctx);
        ctx.enterRule(listener);
    }

    protected void exitRule(SubMainJavaObfListener listener, RuleNode r) {
//        System.out.println( "Exiting : " + r);
        ParserRuleContext ctx = (ParserRuleContext)r.getRuleContext();
        ctx.exitRule(listener);
        listener.exitEveryRule(ctx);
    }
}
