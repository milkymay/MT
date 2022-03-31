// Generated from C:/Users/melis/Desktop/MT/lab3/src/main/java/antlr\SubMainJava.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SubMainJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SubMainJavaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(SubMainJavaParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#package_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_info(SubMainJavaParser.Package_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#class_info}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_info(SubMainJavaParser.Class_infoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(SubMainJavaParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SubMainJavaParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#ns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNs(SubMainJavaParser.NsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#z}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitZ(SubMainJavaParser.ZContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(SubMainJavaParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(SubMainJavaParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs(SubMainJavaParser.AsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SubMainJavaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#if_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_block(SubMainJavaParser.If_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#while_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_block(SubMainJavaParser.While_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#souts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSouts(SubMainJavaParser.SoutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#q}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQ(SubMainJavaParser.QContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(SubMainJavaParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SubMainJavaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SubMainJavaParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SubMainJavaParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(SubMainJavaParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link SubMainJavaParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SubMainJavaParser.SignContext ctx);
}