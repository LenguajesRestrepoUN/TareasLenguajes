// Generated from C:/Users/Orlando S/Documents/practica-3/practica3\Psicoder.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsicoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsicoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPs(PsicoderParser.PsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(PsicoderParser.BContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PsicoderParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#strct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrct(PsicoderParser.StrctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PsicoderParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparams(PsicoderParser.OptparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PsicoderParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#optpargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptpargs(PsicoderParser.OptpargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(PsicoderParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PsicoderParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements3(PsicoderParser.Statements3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements4(PsicoderParser.Statements4Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PsicoderParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases(PsicoderParser.CasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCases2(PsicoderParser.Cases2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#deft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeft(PsicoderParser.DeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp_params(PsicoderParser.Imp_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptexp(PsicoderParser.OptexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChain(PsicoderParser.ChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PsicoderParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargs(PsicoderParser.OptargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2(PsicoderParser.Stmt2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4(PsicoderParser.Stmt4Context ctx);
}