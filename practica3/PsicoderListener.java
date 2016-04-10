// Generated from Psicoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsicoderParser}.
 */
public interface PsicoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void enterPs(PsicoderParser.PsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#ps}.
	 * @param ctx the parse tree
	 */
	void exitPs(PsicoderParser.PsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(PsicoderParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(PsicoderParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PsicoderParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PsicoderParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#strct}.
	 * @param ctx the parse tree
	 */
	void enterStrct(PsicoderParser.StrctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#strct}.
	 * @param ctx the parse tree
	 */
	void exitStrct(PsicoderParser.StrctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PsicoderParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PsicoderParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 */
	void enterOptparams(PsicoderParser.OptparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#optparams}.
	 * @param ctx the parse tree
	 */
	void exitOptparams(PsicoderParser.OptparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PsicoderParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PsicoderParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#optpargs}.
	 * @param ctx the parse tree
	 */
	void enterOptpargs(PsicoderParser.OptpargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#optpargs}.
	 * @param ctx the parse tree
	 */
	void exitOptpargs(PsicoderParser.OptpargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(PsicoderParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(PsicoderParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PsicoderParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PsicoderParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 */
	void enterStatements3(PsicoderParser.Statements3Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#statements3}.
	 * @param ctx the parse tree
	 */
	void exitStatements3(PsicoderParser.Statements3Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 */
	void enterStatements4(PsicoderParser.Statements4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#statements4}.
	 * @param ctx the parse tree
	 */
	void exitStatements4(PsicoderParser.Statements4Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PsicoderParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PsicoderParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 */
	void enterCases(PsicoderParser.CasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#cases}.
	 * @param ctx the parse tree
	 */
	void exitCases(PsicoderParser.CasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void enterCases2(PsicoderParser.Cases2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#cases2}.
	 * @param ctx the parse tree
	 */
	void exitCases2(PsicoderParser.Cases2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#deft}.
	 * @param ctx the parse tree
	 */
	void enterDeft(PsicoderParser.DeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#deft}.
	 * @param ctx the parse tree
	 */
	void exitDeft(PsicoderParser.DeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 */
	void enterImp_params(PsicoderParser.Imp_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#imp_params}.
	 * @param ctx the parse tree
	 */
	void exitImp_params(PsicoderParser.Imp_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void enterOptexp(PsicoderParser.OptexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#optexp}.
	 * @param ctx the parse tree
	 */
	void exitOptexp(PsicoderParser.OptexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 */
	void enterChain(PsicoderParser.ChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#chain}.
	 * @param ctx the parse tree
	 */
	void exitChain(PsicoderParser.ChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PsicoderParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PsicoderParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 */
	void enterOptargs(PsicoderParser.OptargsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#optargs}.
	 * @param ctx the parse tree
	 */
	void exitOptargs(PsicoderParser.OptargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void enterStmt2(PsicoderParser.Stmt2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#stmt2}.
	 * @param ctx the parse tree
	 */
	void exitStmt2(PsicoderParser.Stmt2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void enterStmt4(PsicoderParser.Stmt4Context ctx);
	/**
	 * Exit a parse tree produced by {@link PsicoderParser#stmt4}.
	 * @param ctx the parse tree
	 */
	void exitStmt4(PsicoderParser.Stmt4Context ctx);
}