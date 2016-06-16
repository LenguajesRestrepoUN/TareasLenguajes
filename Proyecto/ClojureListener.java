// Generated from C:/Users/jccaleroe/Documents/Proyecto\Clojure.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClojureParser}.
 */
public interface ClojureListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ClojureParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ClojureParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainForms}
	 * labeled alternative in {@link ClojureParser#mainForm}.
	 * @param ctx the parse tree
	 */
	void enterMainForms(ClojureParser.MainFormsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainForms}
	 * labeled alternative in {@link ClojureParser#mainForm}.
	 * @param ctx the parse tree
	 */
	void exitMainForms(ClojureParser.MainFormsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainFormForm}
	 * labeled alternative in {@link ClojureParser#mainForm}.
	 * @param ctx the parse tree
	 */
	void enterMainFormForm(ClojureParser.MainFormFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainFormForm}
	 * labeled alternative in {@link ClojureParser#mainForm}.
	 * @param ctx the parse tree
	 */
	void exitMainFormForm(ClojureParser.MainFormFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#auxform}.
	 * @param ctx the parse tree
	 */
	void enterAuxform(ClojureParser.AuxformContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#auxform}.
	 * @param ctx the parse tree
	 */
	void exitAuxform(ClojureParser.AuxformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorForms}
	 * labeled alternative in {@link ClojureParser#priorForm}.
	 * @param ctx the parse tree
	 */
	void enterPriorForms(ClojureParser.PriorFormsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorForms}
	 * labeled alternative in {@link ClojureParser#priorForm}.
	 * @param ctx the parse tree
	 */
	void exitPriorForms(ClojureParser.PriorFormsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code priorFormForm}
	 * labeled alternative in {@link ClojureParser#priorForm}.
	 * @param ctx the parse tree
	 */
	void enterPriorFormForm(ClojureParser.PriorFormFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code priorFormForm}
	 * labeled alternative in {@link ClojureParser#priorForm}.
	 * @param ctx the parse tree
	 */
	void exitPriorFormForm(ClojureParser.PriorFormFormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formLiteral}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormLiteral(ClojureParser.FormLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formLiteral}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormLiteral(ClojureParser.FormLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formDef}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormDef(ClojureParser.FormDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formDef}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormDef(ClojureParser.FormDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formDefn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormDefn(ClojureParser.FormDefnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formDefn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormDefn(ClojureParser.FormDefnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formPrintln}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormPrintln(ClojureParser.FormPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formPrintln}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormPrintln(ClojureParser.FormPrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formPrint}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormPrint(ClojureParser.FormPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formPrint}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormPrint(ClojureParser.FormPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formSum}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormSum(ClojureParser.FormSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formSum}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormSum(ClojureParser.FormSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMinus}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMinus(ClojureParser.FormMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMinus}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMinus(ClojureParser.FormMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMult}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMult(ClojureParser.FormMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMult}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMult(ClojureParser.FormMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formDiv}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormDiv(ClojureParser.FormDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formDiv}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormDiv(ClojureParser.FormDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formOr}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormOr(ClojureParser.FormOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formOr}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormOr(ClojureParser.FormOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formAnd}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormAnd(ClojureParser.FormAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formAnd}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormAnd(ClojureParser.FormAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formStr}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormStr(ClojureParser.FormStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formStr}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormStr(ClojureParser.FormStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formLoop}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormLoop(ClojureParser.FormLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formLoop}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormLoop(ClojureParser.FormLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formsi}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormsi(ClojureParser.FormsiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formsi}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormsi(ClojureParser.FormsiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMayor}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMayor(ClojureParser.FormMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMayor}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMayor(ClojureParser.FormMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMenor}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMenor(ClojureParser.FormMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMenor}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMenor(ClojureParser.FormMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMayorIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMayorIgual(ClojureParser.FormMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMayorIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMayorIgual(ClojureParser.FormMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMenorIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMenorIgual(ClojureParser.FormMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMenorIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMenorIgual(ClojureParser.FormMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormIgual(ClojureParser.FormIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormIgual(ClojureParser.FormIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formInc}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormInc(ClojureParser.FormIncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formInc}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormInc(ClojureParser.FormIncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formHacer}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormHacer(ClojureParser.FormHacerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formHacer}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormHacer(ClojureParser.FormHacerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formWhen}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormWhen(ClojureParser.FormWhenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formWhen}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormWhen(ClojureParser.FormWhenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formIsNil}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormIsNil(ClojureParser.FormIsNilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formIsNil}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormIsNil(ClojureParser.FormIsNilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formNth}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormNth(ClojureParser.FormNthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formNth}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormNth(ClojureParser.FormNthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formInto}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormInto(ClojureParser.FormIntoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formInto}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormInto(ClojureParser.FormIntoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formMapF}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormMapF(ClojureParser.FormMapFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formMapF}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormMapF(ClojureParser.FormMapFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formContains}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormContains(ClojureParser.FormContainsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formContains}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormContains(ClojureParser.FormContainsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formConj}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormConj(ClojureParser.FormConjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formConj}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormConj(ClojureParser.FormConjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formGet}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormGet(ClojureParser.FormGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formGet}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormGet(ClojureParser.FormGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formFirst}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormFirst(ClojureParser.FormFirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formFirst}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormFirst(ClojureParser.FormFirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formLet}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormLet(ClojureParser.FormLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formLet}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormLet(ClojureParser.FormLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formFunctionMap}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormFunctionMap(ClojureParser.FormFunctionMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formFunctionMap}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormFunctionMap(ClojureParser.FormFunctionMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formTake}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormTake(ClojureParser.FormTakeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formTake}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormTake(ClojureParser.FormTakeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formReduce}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormReduce(ClojureParser.FormReduceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formReduce}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormReduce(ClojureParser.FormReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formCallFunction}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormCallFunction(ClojureParser.FormCallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formCallFunction}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormCallFunction(ClojureParser.FormCallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formRecur}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormRecur(ClojureParser.FormRecurContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formRecur}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormRecur(ClojureParser.FormRecurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formReader_macro}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormReader_macro(ClojureParser.FormReader_macroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formReader_macro}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormReader_macro(ClojureParser.FormReader_macroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formCallFunction2}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormCallFunction2(ClojureParser.FormCallFunction2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code formCallFunction2}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormCallFunction2(ClojureParser.FormCallFunction2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code formFn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void enterFormFn(ClojureParser.FormFnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formFn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 */
	void exitFormFn(ClojureParser.FormFnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralString(ClojureParser.LiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralString(ClojureParser.LiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalNumber}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNumber(ClojureParser.LiteralNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalNumber}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNumber(ClojureParser.LiteralNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalCharacter}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralCharacter(ClojureParser.LiteralCharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalCharacter}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralCharacter(ClojureParser.LiteralCharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalNil}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralNil(ClojureParser.LiteralNilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalNil}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralNil(ClojureParser.LiteralNilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalBOOLEAN}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalBOOLEAN}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalKeyword}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralKeyword(ClojureParser.LiteralKeywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalKeyword}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralKeyword(ClojureParser.LiteralKeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalSymbol}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSymbol(ClojureParser.LiteralSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalSymbol}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalParam_name}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralParam_name(ClojureParser.LiteralParam_nameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalParam_name}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralParam_name(ClojureParser.LiteralParam_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalList}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralList(ClojureParser.LiteralListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalList}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralList(ClojureParser.LiteralListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalVector}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralVector(ClojureParser.LiteralVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalVector}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralVector(ClojureParser.LiteralVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalMap}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralMap(ClojureParser.LiteralMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalMap}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralMap(ClojureParser.LiteralMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalSet}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralSet(ClojureParser.LiteralSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalSet}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralSet(ClojureParser.LiteralSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formsForm}
	 * labeled alternative in {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterFormsForm(ClojureParser.FormsFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formsForm}
	 * labeled alternative in {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitFormsForm(ClojureParser.FormsFormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formsEpsilon}
	 * labeled alternative in {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void enterFormsEpsilon(ClojureParser.FormsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formsEpsilon}
	 * labeled alternative in {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 */
	void exitFormsEpsilon(ClojureParser.FormsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#auxforms}.
	 * @param ctx the parse tree
	 */
	void enterAuxforms(ClojureParser.AuxformsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#auxforms}.
	 * @param ctx the parse tree
	 */
	void exitAuxforms(ClojureParser.AuxformsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(ClojureParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(ClojureParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(ClojureParser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(ClojureParser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(ClojureParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(ClojureParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(ClojureParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(ClojureParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defSymbol}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDefSymbol(ClojureParser.DefSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defSymbol}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDefSymbol(ClojureParser.DefSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defSymbolForm}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDefSymbolForm(ClojureParser.DefSymbolFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defSymbolForm}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(ClojureParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(ClojureParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ClojureParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ClojureParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(ClojureParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(ClojureParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#minus}.
	 * @param ctx the parse tree
	 */
	void enterMinus(ClojureParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#minus}.
	 * @param ctx the parse tree
	 */
	void exitMinus(ClojureParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(ClojureParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(ClojureParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ClojureParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ClojureParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(ClojureParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(ClojureParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(ClojureParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(ClojureParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(ClojureParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(ClojureParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code description}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 */
	void enterDescription(ClojureParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code description}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 */
	void exitDescription(ClojureParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noDescription}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 */
	void enterNoDescription(ClojureParser.NoDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noDescription}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 */
	void exitNoDescription(ClojureParser.NoDescriptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optparamsParams}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 */
	void enterOptparamsParams(ClojureParser.OptparamsParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optparamsParams}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 */
	void exitOptparamsParams(ClojureParser.OptparamsParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 */
	void enterOptparamsEpsilon(ClojureParser.OptparamsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 */
	void exitOptparamsEpsilon(ClojureParser.OptparamsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbolsSymbol}
	 * labeled alternative in {@link ClojureParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsSymbol(ClojureParser.SymbolsSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbolsSymbol}
	 * labeled alternative in {@link ClojureParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsSymbol(ClojureParser.SymbolsSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbolsEpsilon}
	 * labeled alternative in {@link ClojureParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsEpsilon(ClojureParser.SymbolsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbolsEpsilon}
	 * labeled alternative in {@link ClojureParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsEpsilon(ClojureParser.SymbolsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsSymbolParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsSymbolParams(ClojureParser.ParamsSymbolParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsSymbolParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsSymbolParams(ClojureParser.ParamsSymbolParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsSymbol}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsSymbol(ClojureParser.ParamsSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsSymbol}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsSymbol(ClojureParser.ParamsSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsRestParameter}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsRestParameter(ClojureParser.ParamsRestParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsRestParameter}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsRestParameter(ClojureParser.ParamsRestParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsDestructuringParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsDestructuringParams(ClojureParser.ParamsDestructuringParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsDestructuringParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsDestructuringParams(ClojureParser.ParamsDestructuringParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramsDestructuring}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParamsDestructuring(ClojureParser.ParamsDestructuringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramsDestructuring}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParamsDestructuring(ClojureParser.ParamsDestructuringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optLoopParamsParams}
	 * labeled alternative in {@link ClojureParser#optLoopParams}.
	 * @param ctx the parse tree
	 */
	void enterOptLoopParamsParams(ClojureParser.OptLoopParamsParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optLoopParamsParams}
	 * labeled alternative in {@link ClojureParser#optLoopParams}.
	 * @param ctx the parse tree
	 */
	void exitOptLoopParamsParams(ClojureParser.OptLoopParamsParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optLoopParamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optLoopParams}.
	 * @param ctx the parse tree
	 */
	void enterOptLoopParamsEpsilon(ClojureParser.OptLoopParamsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optLoopParamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optLoopParams}.
	 * @param ctx the parse tree
	 */
	void exitOptLoopParamsEpsilon(ClojureParser.OptLoopParamsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopParamsSymbolParams}
	 * labeled alternative in {@link ClojureParser#loopParams}.
	 * @param ctx the parse tree
	 */
	void enterLoopParamsSymbolParams(ClojureParser.LoopParamsSymbolParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopParamsSymbolParams}
	 * labeled alternative in {@link ClojureParser#loopParams}.
	 * @param ctx the parse tree
	 */
	void exitLoopParamsSymbolParams(ClojureParser.LoopParamsSymbolParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loopParamsSymbol}
	 * labeled alternative in {@link ClojureParser#loopParams}.
	 * @param ctx the parse tree
	 */
	void enterLoopParamsSymbol(ClojureParser.LoopParamsSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loopParamsSymbol}
	 * labeled alternative in {@link ClojureParser#loopParams}.
	 * @param ctx the parse tree
	 */
	void exitLoopParamsSymbol(ClojureParser.LoopParamsSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 */
	void enterOptargsArgs(ClojureParser.OptargsArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 */
	void exitOptargsArgs(ClojureParser.OptargsArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 */
	void enterOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 */
	void exitOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsSymbolArgs}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsSymbolArgs}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsSymbol}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgsSymbol(ClojureParser.ArgsSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsSymbol}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgsSymbol(ClojureParser.ArgsSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDefn}
	 * labeled alternative in {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 */
	void enterSingleDefn(ClojureParser.SingleDefnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDefn}
	 * labeled alternative in {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 */
	void exitSingleDefn(ClojureParser.SingleDefnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defnArity}
	 * labeled alternative in {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 */
	void enterDefnArity(ClojureParser.DefnArityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defnArity}
	 * labeled alternative in {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 */
	void exitDefnArity(ClojureParser.DefnArityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#fn}.
	 * @param ctx the parse tree
	 */
	void enterFn(ClojureParser.FnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#fn}.
	 * @param ctx the parse tree
	 */
	void exitFn(ClojureParser.FnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#arity}.
	 * @param ctx the parse tree
	 */
	void enterArity(ClojureParser.ArityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#arity}.
	 * @param ctx the parse tree
	 */
	void exitArity(ClojureParser.ArityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(ClojureParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(ClojureParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(ClojureParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(ClojureParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#recur}.
	 * @param ctx the parse tree
	 */
	void enterRecur(ClojureParser.RecurContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#recur}.
	 * @param ctx the parse tree
	 */
	void exitRecur(ClojureParser.RecurContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseForm}
	 * labeled alternative in {@link ClojureParser#siFalseForm}.
	 * @param ctx the parse tree
	 */
	void enterFalseForm(ClojureParser.FalseFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseForm}
	 * labeled alternative in {@link ClojureParser#siFalseForm}.
	 * @param ctx the parse tree
	 */
	void exitFalseForm(ClojureParser.FalseFormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseEpsilon}
	 * labeled alternative in {@link ClojureParser#siFalseForm}.
	 * @param ctx the parse tree
	 */
	void enterFalseEpsilon(ClojureParser.FalseEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseEpsilon}
	 * labeled alternative in {@link ClojureParser#siFalseForm}.
	 * @param ctx the parse tree
	 */
	void exitFalseEpsilon(ClojureParser.FalseEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(ClojureParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(ClojureParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#hacer}.
	 * @param ctx the parse tree
	 */
	void enterHacer(ClojureParser.HacerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#hacer}.
	 * @param ctx the parse tree
	 */
	void exitHacer(ClojureParser.HacerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#mayor}.
	 * @param ctx the parse tree
	 */
	void enterMayor(ClojureParser.MayorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#mayor}.
	 * @param ctx the parse tree
	 */
	void exitMayor(ClojureParser.MayorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#menor}.
	 * @param ctx the parse tree
	 */
	void enterMenor(ClojureParser.MenorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#menor}.
	 * @param ctx the parse tree
	 */
	void exitMenor(ClojureParser.MenorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#mayorIgual}.
	 * @param ctx the parse tree
	 */
	void enterMayorIgual(ClojureParser.MayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#mayorIgual}.
	 * @param ctx the parse tree
	 */
	void exitMayorIgual(ClojureParser.MayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#menorIgual}.
	 * @param ctx the parse tree
	 */
	void enterMenorIgual(ClojureParser.MenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#menorIgual}.
	 * @param ctx the parse tree
	 */
	void exitMenorIgual(ClojureParser.MenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#igual}.
	 * @param ctx the parse tree
	 */
	void enterIgual(ClojureParser.IgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#igual}.
	 * @param ctx the parse tree
	 */
	void exitIgual(ClojureParser.IgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#inc}.
	 * @param ctx the parse tree
	 */
	void enterInc(ClojureParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#inc}.
	 * @param ctx the parse tree
	 */
	void exitInc(ClojureParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(ClojureParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(ClojureParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#isNil}.
	 * @param ctx the parse tree
	 */
	void enterIsNil(ClojureParser.IsNilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#isNil}.
	 * @param ctx the parse tree
	 */
	void exitIsNil(ClojureParser.IsNilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultForm}
	 * labeled alternative in {@link ClojureParser#defecto}.
	 * @param ctx the parse tree
	 */
	void enterDefaultForm(ClojureParser.DefaultFormContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultForm}
	 * labeled alternative in {@link ClojureParser#defecto}.
	 * @param ctx the parse tree
	 */
	void exitDefaultForm(ClojureParser.DefaultFormContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultEpsilon}
	 * labeled alternative in {@link ClojureParser#defecto}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEpsilon(ClojureParser.DefaultEpsilonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultEpsilon}
	 * labeled alternative in {@link ClojureParser#defecto}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEpsilon(ClojureParser.DefaultEpsilonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#mapF}.
	 * @param ctx the parse tree
	 */
	void enterMapF(ClojureParser.MapFContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#mapF}.
	 * @param ctx the parse tree
	 */
	void exitMapF(ClojureParser.MapFContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#into}.
	 * @param ctx the parse tree
	 */
	void enterInto(ClojureParser.IntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#into}.
	 * @param ctx the parse tree
	 */
	void exitInto(ClojureParser.IntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#nth}.
	 * @param ctx the parse tree
	 */
	void enterNth(ClojureParser.NthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#nth}.
	 * @param ctx the parse tree
	 */
	void exitNth(ClojureParser.NthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(ClojureParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(ClojureParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containsset}
	 * labeled alternative in {@link ClojureParser#contains}.
	 * @param ctx the parse tree
	 */
	void enterContainsset(ClojureParser.ContainssetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containsset}
	 * labeled alternative in {@link ClojureParser#contains}.
	 * @param ctx the parse tree
	 */
	void exitContainsset(ClojureParser.ContainssetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code containsvector}
	 * labeled alternative in {@link ClojureParser#contains}.
	 * @param ctx the parse tree
	 */
	void enterContainsvector(ClojureParser.ContainsvectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code containsvector}
	 * labeled alternative in {@link ClojureParser#contains}.
	 * @param ctx the parse tree
	 */
	void exitContainsvector(ClojureParser.ContainsvectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(ClojureParser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(ClojureParser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#first}.
	 * @param ctx the parse tree
	 */
	void enterFirst(ClojureParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#first}.
	 * @param ctx the parse tree
	 */
	void exitFirst(ClojureParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstKeywordGet}
	 * labeled alternative in {@link ClojureParser#keywordGet}.
	 * @param ctx the parse tree
	 */
	void enterFirstKeywordGet(ClojureParser.FirstKeywordGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstKeywordGet}
	 * labeled alternative in {@link ClojureParser#keywordGet}.
	 * @param ctx the parse tree
	 */
	void exitFirstKeywordGet(ClojureParser.FirstKeywordGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lastKeywordGet}
	 * labeled alternative in {@link ClojureParser#keywordGet}.
	 * @param ctx the parse tree
	 */
	void enterLastKeywordGet(ClojureParser.LastKeywordGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lastKeywordGet}
	 * labeled alternative in {@link ClojureParser#keywordGet}.
	 * @param ctx the parse tree
	 */
	void exitLastKeywordGet(ClojureParser.LastKeywordGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#functionMap}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMap(ClojureParser.FunctionMapContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#functionMap}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMap(ClojureParser.FunctionMapContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#take}.
	 * @param ctx the parse tree
	 */
	void enterTake(ClojureParser.TakeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#take}.
	 * @param ctx the parse tree
	 */
	void exitTake(ClojureParser.TakeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#reduce}.
	 * @param ctx the parse tree
	 */
	void enterReduce(ClojureParser.ReduceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#reduce}.
	 * @param ctx the parse tree
	 */
	void exitReduce(ClojureParser.ReduceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letParamsSymbolParams}
	 * labeled alternative in {@link ClojureParser#letParams}.
	 * @param ctx the parse tree
	 */
	void enterLetParamsSymbolParams(ClojureParser.LetParamsSymbolParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letParamsSymbolParams}
	 * labeled alternative in {@link ClojureParser#letParams}.
	 * @param ctx the parse tree
	 */
	void exitLetParamsSymbolParams(ClojureParser.LetParamsSymbolParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letParamsSymbol}
	 * labeled alternative in {@link ClojureParser#letParams}.
	 * @param ctx the parse tree
	 */
	void enterLetParamsSymbol(ClojureParser.LetParamsSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letParamsSymbol}
	 * labeled alternative in {@link ClojureParser#letParams}.
	 * @param ctx the parse tree
	 */
	void exitLetParamsSymbol(ClojureParser.LetParamsSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(ClojureParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(ClojureParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#callFunction2}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction2(ClojureParser.CallFunction2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#callFunction2}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction2(ClojureParser.CallFunction2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code rmLamda}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmLamda(ClojureParser.RmLamdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmLamda}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmLamda(ClojureParser.RmLamdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmMeta_data}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmMeta_data(ClojureParser.RmMeta_dataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmMeta_data}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmMeta_data(ClojureParser.RmMeta_dataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmRegex}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmRegex(ClojureParser.RmRegexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmRegex}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmRegex(ClojureParser.RmRegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmVar_quote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmVar_quote(ClojureParser.RmVar_quoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmVar_quote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmVar_quote(ClojureParser.RmVar_quoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmHost_expr}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmHost_expr(ClojureParser.RmHost_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmHost_expr}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmHost_expr(ClojureParser.RmHost_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmSet}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmSet(ClojureParser.RmSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmSet}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmSet(ClojureParser.RmSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmTag}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmTag(ClojureParser.RmTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmTag}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmTag(ClojureParser.RmTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmDiscard}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmDiscard(ClojureParser.RmDiscardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmDiscard}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmDiscard(ClojureParser.RmDiscardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmDispatch}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmDispatch(ClojureParser.RmDispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmDispatch}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmDispatch(ClojureParser.RmDispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmDeref}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmDeref(ClojureParser.RmDerefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmDeref}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmDeref(ClojureParser.RmDerefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmQuote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmQuote(ClojureParser.RmQuoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmQuote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmQuote(ClojureParser.RmQuoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmBacktick}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmBacktick(ClojureParser.RmBacktickContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmBacktick}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmBacktick(ClojureParser.RmBacktickContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmUnquote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmUnquote(ClojureParser.RmUnquoteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmUnquote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmUnquote(ClojureParser.RmUnquoteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmUnquote_splicing}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmUnquote_splicing(ClojureParser.RmUnquote_splicingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmUnquote_splicing}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmUnquote_splicing(ClojureParser.RmUnquote_splicingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rmGensym}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void enterRmGensym(ClojureParser.RmGensymContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rmGensym}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 */
	void exitRmGensym(ClojureParser.RmGensymContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void enterQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 */
	void exitQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void enterBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 */
	void exitBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void enterUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 */
	void exitUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void enterUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 */
	void exitUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(ClojureParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(ClojureParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void enterDeref(ClojureParser.DerefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 */
	void exitDeref(ClojureParser.DerefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void enterGensym(ClojureParser.GensymContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 */
	void exitGensym(ClojureParser.GensymContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void enterLambda(ClojureParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 */
	void exitLambda(ClojureParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void enterMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 */
	void exitMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void enterVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 */
	void exitVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void enterHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 */
	void exitHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void enterDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 */
	void exitDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void enterRegex(ClojureParser.RegexContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 */
	void exitRegex(ClojureParser.RegexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberFloat(ClojureParser.NumberFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberFloat(ClojureParser.NumberFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberHex(ClojureParser.NumberHexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberHex(ClojureParser.NumberHexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBin(ClojureParser.NumberBinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBin(ClojureParser.NumberBinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberBign}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberBign(ClojureParser.NumberBignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberBign}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberBign(ClojureParser.NumberBignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberLong}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumberLong(ClojureParser.NumberLongContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberLong}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumberLong(ClojureParser.NumberLongContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charNamed_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharNamed_char(ClojureParser.CharNamed_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charNamed_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharNamed_char(ClojureParser.CharNamed_charContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charU_hex_quad}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharU_hex_quad(ClojureParser.CharU_hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charU_hex_quad}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharU_hex_quad(ClojureParser.CharU_hex_quadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charAny_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharAny_char(ClojureParser.CharAny_charContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charAny_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharAny_char(ClojureParser.CharAny_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void enterNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 */
	void exitNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void enterAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 */
	void exitAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void enterU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 */
	void exitU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	void enterNil(ClojureParser.NilContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 */
	void exitNil(ClojureParser.NilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keywordMacro_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeywordMacro_keyword(ClojureParser.KeywordMacro_keywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keywordMacro_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeywordMacro_keyword(ClojureParser.KeywordMacro_keywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code keywordSimple_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code keywordSimple_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void enterSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 */
	void exitSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void enterMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 */
	void exitMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_ns_symbol}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_ns_symbol(ClojureParser.Symbol_ns_symbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_ns_symbol}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_ns_symbol(ClojureParser.Symbol_ns_symbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_simple_sym}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_simple_sym(ClojureParser.Symbol_simple_symContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_simple_sym}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_simple_sym(ClojureParser.Symbol_simple_symContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_Sum}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_Sum(ClojureParser.Symbol_SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_Sum}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_Sum(ClojureParser.Symbol_SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_MINUS}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_MINUS(ClojureParser.Symbol_MINUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_MINUS}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_MINUS(ClojureParser.Symbol_MINUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_MULT}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_MULT(ClojureParser.Symbol_MULTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_MULT}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_MULT(ClojureParser.Symbol_MULTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_DIV}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_DIV(ClojureParser.Symbol_DIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_DIV}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_DIV(ClojureParser.Symbol_DIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_INC}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_INC(ClojureParser.Symbol_INCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_INC}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_INC(ClojureParser.Symbol_INCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_MAYOR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_MAYOR(ClojureParser.Symbol_MAYORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_MAYOR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_MAYOR(ClojureParser.Symbol_MAYORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_MAYORIGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_MAYORIGUAL(ClojureParser.Symbol_MAYORIGUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_MAYORIGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_MAYORIGUAL(ClojureParser.Symbol_MAYORIGUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_MENOR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_MENOR(ClojureParser.Symbol_MENORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_MENOR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_MENOR(ClojureParser.Symbol_MENORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_MENORIGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_MENORIGUAL(ClojureParser.Symbol_MENORIGUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_MENORIGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_MENORIGUAL(ClojureParser.Symbol_MENORIGUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_IGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_IGUAL(ClojureParser.Symbol_IGUALContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_IGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_IGUAL(ClojureParser.Symbol_IGUALContext ctx);
	/**
	 * Enter a parse tree produced by the {@code symbol_STR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_STR(ClojureParser.Symbol_STRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code symbol_STR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_STR(ClojureParser.Symbol_STRContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void enterSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 */
	void exitSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void enterNs_symbol(ClojureParser.Ns_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 */
	void exitNs_symbol(ClojureParser.Ns_symbolContext ctx);
}