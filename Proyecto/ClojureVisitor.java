// Generated from C:/Users/jccaleroe/Documents/Proyecto\Clojure.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClojureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClojureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClojureParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(ClojureParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainForms}
	 * labeled alternative in {@link ClojureParser#mainForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainForms(ClojureParser.MainFormsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainFormForm}
	 * labeled alternative in {@link ClojureParser#mainForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFormForm(ClojureParser.MainFormFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#auxform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxform(ClojureParser.AuxformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorForms}
	 * labeled alternative in {@link ClojureParser#priorForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorForms(ClojureParser.PriorFormsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code priorFormForm}
	 * labeled alternative in {@link ClojureParser#priorForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorFormForm(ClojureParser.PriorFormFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formLiteral}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormLiteral(ClojureParser.FormLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formDef}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDef(ClojureParser.FormDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formDefn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDefn(ClojureParser.FormDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formPrintln}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPrintln(ClojureParser.FormPrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formPrint}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormPrint(ClojureParser.FormPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formSum}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormSum(ClojureParser.FormSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMinus}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMinus(ClojureParser.FormMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMult}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMult(ClojureParser.FormMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formDiv}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormDiv(ClojureParser.FormDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formOr}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormOr(ClojureParser.FormOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formAnd}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormAnd(ClojureParser.FormAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formStr}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormStr(ClojureParser.FormStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formLoop}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormLoop(ClojureParser.FormLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formsi}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormsi(ClojureParser.FormsiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMayor}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMayor(ClojureParser.FormMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMenor}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMenor(ClojureParser.FormMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMayorIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMayorIgual(ClojureParser.FormMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMenorIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMenorIgual(ClojureParser.FormMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formIgual}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormIgual(ClojureParser.FormIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formInc}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormInc(ClojureParser.FormIncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formHacer}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormHacer(ClojureParser.FormHacerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formWhen}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormWhen(ClojureParser.FormWhenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formIsNil}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormIsNil(ClojureParser.FormIsNilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formNth}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormNth(ClojureParser.FormNthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formInto}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormInto(ClojureParser.FormIntoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formMapF}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormMapF(ClojureParser.FormMapFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formContains}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormContains(ClojureParser.FormContainsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formConj}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormConj(ClojureParser.FormConjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formGet}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormGet(ClojureParser.FormGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formFirst}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormFirst(ClojureParser.FormFirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formLet}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormLet(ClojureParser.FormLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formFunctionMap}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormFunctionMap(ClojureParser.FormFunctionMapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formTake}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormTake(ClojureParser.FormTakeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formReduce}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormReduce(ClojureParser.FormReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formCallFunction}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormCallFunction(ClojureParser.FormCallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formRecur}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormRecur(ClojureParser.FormRecurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formReader_macro}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormReader_macro(ClojureParser.FormReader_macroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formCallFunction2}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormCallFunction2(ClojureParser.FormCallFunction2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code formFn}
	 * labeled alternative in {@link ClojureParser#form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormFn(ClojureParser.FormFnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(ClojureParser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalNumber}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNumber(ClojureParser.LiteralNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalCharacter}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralCharacter(ClojureParser.LiteralCharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalNil}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralNil(ClojureParser.LiteralNilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalBOOLEAN}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalKeyword}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralKeyword(ClojureParser.LiteralKeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalSymbol}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalParam_name}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralParam_name(ClojureParser.LiteralParam_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalList}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralList(ClojureParser.LiteralListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalVector}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralVector(ClojureParser.LiteralVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalMap}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralMap(ClojureParser.LiteralMapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalSet}
	 * labeled alternative in {@link ClojureParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralSet(ClojureParser.LiteralSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formsForm}
	 * labeled alternative in {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormsForm(ClojureParser.FormsFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formsEpsilon}
	 * labeled alternative in {@link ClojureParser#forms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormsEpsilon(ClojureParser.FormsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#auxforms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxforms(ClojureParser.AuxformsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ClojureParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(ClojureParser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ClojureParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(ClojureParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defSymbol}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSymbol(ClojureParser.DefSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defSymbolForm}
	 * labeled alternative in {@link ClojureParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(ClojureParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ClojureParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(ClojureParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#minus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(ClojureParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(ClojureParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ClojureParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(ClojureParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(ClojureParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr(ClojureParser.StrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code description}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(ClojureParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noDescription}
	 * labeled alternative in {@link ClojureParser#optDescription}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoDescription(ClojureParser.NoDescriptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optparamsParams}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparamsParams(ClojureParser.OptparamsParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optparamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optparams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptparamsEpsilon(ClojureParser.OptparamsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbolsSymbol}
	 * labeled alternative in {@link ClojureParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolsSymbol(ClojureParser.SymbolsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbolsEpsilon}
	 * labeled alternative in {@link ClojureParser#symbols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolsEpsilon(ClojureParser.SymbolsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsSymbolParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsSymbolParams(ClojureParser.ParamsSymbolParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsSymbol}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsSymbol(ClojureParser.ParamsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsRestParameter}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsRestParameter(ClojureParser.ParamsRestParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsDestructuringParams}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsDestructuringParams(ClojureParser.ParamsDestructuringParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramsDestructuring}
	 * labeled alternative in {@link ClojureParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsDestructuring(ClojureParser.ParamsDestructuringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optLoopParamsParams}
	 * labeled alternative in {@link ClojureParser#optLoopParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptLoopParamsParams(ClojureParser.OptLoopParamsParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optLoopParamsEpsilon}
	 * labeled alternative in {@link ClojureParser#optLoopParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptLoopParamsEpsilon(ClojureParser.OptLoopParamsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopParamsSymbolParams}
	 * labeled alternative in {@link ClojureParser#loopParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopParamsSymbolParams(ClojureParser.LoopParamsSymbolParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loopParamsSymbol}
	 * labeled alternative in {@link ClojureParser#loopParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopParamsSymbol(ClojureParser.LoopParamsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optargsArgs}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargsArgs(ClojureParser.OptargsArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optargsEpsilon}
	 * labeled alternative in {@link ClojureParser#optargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsSymbolArgs}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsSymbol}
	 * labeled alternative in {@link ClojureParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsSymbol(ClojureParser.ArgsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDefn}
	 * labeled alternative in {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDefn(ClojureParser.SingleDefnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defnArity}
	 * labeled alternative in {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefnArity(ClojureParser.DefnArityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#fn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn(ClojureParser.FnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#arity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArity(ClojureParser.ArityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(ClojureParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(ClojureParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#recur}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecur(ClojureParser.RecurContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseForm}
	 * labeled alternative in {@link ClojureParser#siFalseForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseForm(ClojureParser.FalseFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseEpsilon}
	 * labeled alternative in {@link ClojureParser#siFalseForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseEpsilon(ClojureParser.FalseEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(ClojureParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#hacer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer(ClojureParser.HacerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#mayor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayor(ClojureParser.MayorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#menor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(ClojureParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#mayorIgual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMayorIgual(ClojureParser.MayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#menorIgual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgual(ClojureParser.MenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#igual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(ClojureParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#inc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(ClojureParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen(ClojureParser.WhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#isNil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNil(ClojureParser.IsNilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultForm}
	 * labeled alternative in {@link ClojureParser#defecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultForm(ClojureParser.DefaultFormContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultEpsilon}
	 * labeled alternative in {@link ClojureParser#defecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultEpsilon(ClojureParser.DefaultEpsilonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#mapF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapF(ClojureParser.MapFContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto(ClojureParser.IntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#nth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNth(ClojureParser.NthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(ClojureParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containsset}
	 * labeled alternative in {@link ClojureParser#contains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsset(ClojureParser.ContainssetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code containsvector}
	 * labeled alternative in {@link ClojureParser#contains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainsvector(ClojureParser.ContainsvectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#conj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConj(ClojureParser.ConjContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#first}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(ClojureParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstKeywordGet}
	 * labeled alternative in {@link ClojureParser#keywordGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstKeywordGet(ClojureParser.FirstKeywordGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lastKeywordGet}
	 * labeled alternative in {@link ClojureParser#keywordGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastKeywordGet(ClojureParser.LastKeywordGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#functionMap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionMap(ClojureParser.FunctionMapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#take}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTake(ClojureParser.TakeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#reduce}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduce(ClojureParser.ReduceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letParamsSymbolParams}
	 * labeled alternative in {@link ClojureParser#letParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetParamsSymbolParams(ClojureParser.LetParamsSymbolParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letParamsSymbol}
	 * labeled alternative in {@link ClojureParser#letParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetParamsSymbol(ClojureParser.LetParamsSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(ClojureParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#callFunction2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction2(ClojureParser.CallFunction2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code rmLamda}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmLamda(ClojureParser.RmLamdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmMeta_data}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmMeta_data(ClojureParser.RmMeta_dataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmRegex}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmRegex(ClojureParser.RmRegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmVar_quote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmVar_quote(ClojureParser.RmVar_quoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmHost_expr}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmHost_expr(ClojureParser.RmHost_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmSet}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmSet(ClojureParser.RmSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmTag}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmTag(ClojureParser.RmTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmDiscard}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmDiscard(ClojureParser.RmDiscardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmDispatch}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmDispatch(ClojureParser.RmDispatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmDeref}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmDeref(ClojureParser.RmDerefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmQuote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmQuote(ClojureParser.RmQuoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmBacktick}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmBacktick(ClojureParser.RmBacktickContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmUnquote}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmUnquote(ClojureParser.RmUnquoteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmUnquote_splicing}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmUnquote_splicing(ClojureParser.RmUnquote_splicingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmGensym}
	 * labeled alternative in {@link ClojureParser#reader_macro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmGensym(ClojureParser.RmGensymContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuote(ClojureParser.QuoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#backtick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBacktick(ClojureParser.BacktickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#unquote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquote(ClojureParser.UnquoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#unquote_splicing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquote_splicing(ClojureParser.Unquote_splicingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(ClojureParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#deref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeref(ClojureParser.DerefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#gensym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGensym(ClojureParser.GensymContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#lambda}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(ClojureParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#meta_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeta_data(ClojureParser.Meta_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#var_quote}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_quote(ClojureParser.Var_quoteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#host_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_expr(ClojureParser.Host_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#discard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscard(ClojureParser.DiscardContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#dispatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDispatch(ClojureParser.DispatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#regex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegex(ClojureParser.RegexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberFloat}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFloat(ClojureParser.NumberFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberHex}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberHex(ClojureParser.NumberHexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberBin}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBin(ClojureParser.NumberBinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberBign}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberBign(ClojureParser.NumberBignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLong}
	 * labeled alternative in {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLong(ClojureParser.NumberLongContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charNamed_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharNamed_char(ClojureParser.CharNamed_charContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charU_hex_quad}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharU_hex_quad(ClojureParser.CharU_hex_quadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charAny_char}
	 * labeled alternative in {@link ClojureParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharAny_char(ClojureParser.CharAny_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#named_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_char(ClojureParser.Named_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#any_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_char(ClojureParser.Any_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#u_hex_quad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU_hex_quad(ClojureParser.U_hex_quadContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(ClojureParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keywordMacro_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordMacro_keyword(ClojureParser.KeywordMacro_keywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code keywordSimple_keyword}
	 * labeled alternative in {@link ClojureParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#simple_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_keyword(ClojureParser.Simple_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#macro_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMacro_keyword(ClojureParser.Macro_keywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_ns_symbol}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_ns_symbol(ClojureParser.Symbol_ns_symbolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_simple_sym}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_simple_sym(ClojureParser.Symbol_simple_symContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_Sum}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_Sum(ClojureParser.Symbol_SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_MINUS}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_MINUS(ClojureParser.Symbol_MINUSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_MULT}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_MULT(ClojureParser.Symbol_MULTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_DIV}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_DIV(ClojureParser.Symbol_DIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_INC}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_INC(ClojureParser.Symbol_INCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_MAYOR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_MAYOR(ClojureParser.Symbol_MAYORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_MAYORIGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_MAYORIGUAL(ClojureParser.Symbol_MAYORIGUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_MENOR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_MENOR(ClojureParser.Symbol_MENORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_MENORIGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_MENORIGUAL(ClojureParser.Symbol_MENORIGUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_IGUAL}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_IGUAL(ClojureParser.Symbol_IGUALContext ctx);
	/**
	 * Visit a parse tree produced by the {@code symbol_STR}
	 * labeled alternative in {@link ClojureParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_STR(ClojureParser.Symbol_STRContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#simple_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_sym(ClojureParser.Simple_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#ns_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNs_symbol(ClojureParser.Ns_symbolContext ctx);
}