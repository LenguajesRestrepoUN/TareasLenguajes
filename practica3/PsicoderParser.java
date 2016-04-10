// Generated from Psicoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FIN_FUNCION=1, LEER=2, SI_NO=3, SI=4, ENTONCES=5, FIN_SI=6, MIENTRAS=7, 
		HACER=8, FIN_MIENTRAS=9, PARA=10, FIN_PARA=11, SELECCIONAR=12, ENTRE=13, 
		CASO=14, ROMPER=15, DEFECTO=16, FIN_SELECCIONAR=17, RETORNAR=18, ESTRUCTURA=19, 
		FIN_ESTRUCTURA=20, IMPRIMIR=21, CARACTER=22, CADENA=23, FUNCION_PRINCIPAL=24, 
		FUNCION=25, FIN_PRINCIPAL=26, BOOLEANO=27, TK_CARACTER=28, VERDADERO=29, 
		FALSO=30, REAL=31, ENTERO=32, TK_ENTERO=33, Whitespace=34, Newline=35, 
		BlockComment=36, LineComment=37, TK_MAS=38, TK_MENOS=39, TK_MULT=40, TK_DIV=41, 
		TK_MOD=42, TK_ASIG=43, TK_MENOR=44, TK_MAYOR=45, TK_MENOR_IGUAL=46, TK_MAYOR_IGUAL=47, 
		TK_IGUAL=48, TK_Y=49, TK_O=50, TK_DIF=51, TK_NEG=52, TK_POSD=53, TK_COMILLA_SEN=54, 
		TK_COMILLA_DOB=55, TK_PYC=56, TK_COMA=57, TK_PUNTO=58, TK_PAR_IZQ=59, 
		TK_PAR_DER=60, ID=61, TK_REAL=62, TK_CADENA=63;
	public static final int
		RULE_ps = 0, RULE_b = 1, RULE_element = 2, RULE_strct = 3, RULE_type = 4, 
		RULE_optparams = 5, RULE_params = 6, RULE_optpargs = 7, RULE_args = 8, 
		RULE_statements = 9, RULE_statements3 = 10, RULE_statements4 = 11, RULE_stmt = 12, 
		RULE_cases = 13, RULE_cases2 = 14, RULE_deft = 15, RULE_imp_params = 16, 
		RULE_optexp = 17, RULE_chain = 18, RULE_exp = 19, RULE_optargs = 20, RULE_stmt2 = 21, 
		RULE_stmt4 = 22;
	public static final String[] ruleNames = {
		"ps", "b", "element", "strct", "type", "optparams", "params", "optpargs", 
		"args", "statements", "statements3", "statements4", "stmt", "cases", "cases2", 
		"deft", "imp_params", "optexp", "chain", "exp", "optargs", "stmt2", "stmt4"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'fin_funcion'", "'leer'", "'si_no'", "'si'", "'entonces'", "'fin_si'", 
		"'mientras'", "'hacer'", "'fin_mientras'", "'para'", "'fin_para'", "'seleccionar'", 
		"'entre'", "'caso'", "'romper'", "'defecto'", "'fin_seleccionar'", "'retornar'", 
		"'estructura'", "'fin_estructura'", "'imprimir'", "'caracter'", "'cadena'", 
		"'funcion_principal'", "'funcion'", "'fin_principal'", "'booleano'", null, 
		"'verdadero'", "'falso'", "'real'", "'entero'", null, null, null, null, 
		null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'&&'", "'||'", "'!='", "'!'", "':'", "'''", "'\"'", "';'", 
		"','", "'.'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FIN_FUNCION", "LEER", "SI_NO", "SI", "ENTONCES", "FIN_SI", "MIENTRAS", 
		"HACER", "FIN_MIENTRAS", "PARA", "FIN_PARA", "SELECCIONAR", "ENTRE", "CASO", 
		"ROMPER", "DEFECTO", "FIN_SELECCIONAR", "RETORNAR", "ESTRUCTURA", "FIN_ESTRUCTURA", 
		"IMPRIMIR", "CARACTER", "CADENA", "FUNCION_PRINCIPAL", "FUNCION", "FIN_PRINCIPAL", 
		"BOOLEANO", "TK_CARACTER", "VERDADERO", "FALSO", "REAL", "ENTERO", "TK_ENTERO", 
		"Whitespace", "Newline", "BlockComment", "LineComment", "TK_MAS", "TK_MENOS", 
		"TK_MULT", "TK_DIV", "TK_MOD", "TK_ASIG", "TK_MENOR", "TK_MAYOR", "TK_MENOR_IGUAL", 
		"TK_MAYOR_IGUAL", "TK_IGUAL", "TK_Y", "TK_O", "TK_DIF", "TK_NEG", "TK_POSD", 
		"TK_COMILLA_SEN", "TK_COMILLA_DOB", "TK_PYC", "TK_COMA", "TK_PUNTO", "TK_PAR_IZQ", 
		"TK_PAR_DER", "ID", "TK_REAL", "TK_CADENA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsicoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PsContext extends ParserRuleContext {
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public PsContext ps() {
			return getRuleContext(PsContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterPs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitPs(this);
		}
	}

	public final PsContext ps() throws RecognitionException {
		return ps(0);
	}

	private PsContext ps(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PsContext _localctx = new PsContext(_ctx, _parentState);
		PsContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_ps, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(47);
				b();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ps);
					setState(51);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(52);
					element();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BContext extends ParserRuleContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public PsContext ps() {
			return getRuleContext(PsContext.class,0);
		}
		public TerminalNode FUNCION_PRINCIPAL() { return getToken(PsicoderParser.FUNCION_PRINCIPAL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode FIN_PRINCIPAL() { return getToken(PsicoderParser.FIN_PRINCIPAL, 0); }
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitB(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_b);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				element();
				setState(59);
				ps(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(FUNCION_PRINCIPAL);
				setState(62);
				statements();
				setState(63);
				match(FIN_PRINCIPAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(PsicoderParser.FUNCION, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptparamsContext optparams() {
			return getRuleContext(OptparamsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RETORNAR() { return getToken(PsicoderParser.RETORNAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TerminalNode FIN_FUNCION() { return getToken(PsicoderParser.FIN_FUNCION, 0); }
		public StrctContext strct() {
			return getRuleContext(StrctContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(82);
			switch (_input.LA(1)) {
			case FUNCION:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(FUNCION);
				setState(69);
				type();
				setState(70);
				match(ID);
				setState(71);
				match(TK_PAR_IZQ);
				setState(72);
				optparams();
				setState(73);
				match(TK_PAR_DER);
				setState(74);
				match(HACER);
				setState(75);
				statements();
				setState(76);
				match(RETORNAR);
				setState(77);
				exp(0);
				setState(78);
				match(TK_PYC);
				setState(79);
				match(FIN_FUNCION);
				}
				break;
			case ESTRUCTURA:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				strct();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrctContext extends ParserRuleContext {
		public TerminalNode ESTRUCTURA() { return getToken(PsicoderParser.ESTRUCTURA, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public Statements4Context statements4() {
			return getRuleContext(Statements4Context.class,0);
		}
		public TerminalNode FIN_ESTRUCTURA() { return getToken(PsicoderParser.FIN_ESTRUCTURA, 0); }
		public StrctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStrct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStrct(this);
		}
	}

	public final StrctContext strct() throws RecognitionException {
		StrctContext _localctx = new StrctContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_strct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ESTRUCTURA);
			setState(85);
			match(ID);
			setState(86);
			statements4();
			setState(87);
			match(FIN_ESTRUCTURA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(PsicoderParser.ENTERO, 0); }
		public TerminalNode CARACTER() { return getToken(PsicoderParser.CARACTER, 0); }
		public TerminalNode CADENA() { return getToken(PsicoderParser.CADENA, 0); }
		public TerminalNode REAL() { return getToken(PsicoderParser.REAL, 0); }
		public TerminalNode BOOLEANO() { return getToken(PsicoderParser.BOOLEANO, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CARACTER) | (1L << CADENA) | (1L << BOOLEANO) | (1L << REAL) | (1L << ENTERO) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptparamsContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public OptparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptparams(this);
		}
	}

	public final OptparamsContext optparams() throws RecognitionException {
		OptparamsContext _localctx = new OptparamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_optparams);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case CARACTER:
			case CADENA:
			case BOOLEANO:
			case REAL:
			case ENTERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				params();
				}
				break;
			case TK_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				type();
				setState(96);
				match(ID);
				setState(97);
				match(TK_COMA);
				setState(98);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				type();
				setState(101);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptpargsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OptpargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optpargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptpargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptpargs(this);
		}
	}

	public final OptpargsContext optpargs() throws RecognitionException {
		OptpargsContext _localctx = new OptpargsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_optpargs);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
			case TK_ENTERO:
			case TK_MENOS:
			case TK_NEG:
			case TK_PAR_IZQ:
			case ID:
			case TK_REAL:
			case TK_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				args();
				}
				break;
			case TK_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				exp(0);
				setState(110);
				match(TK_COMA);
				setState(111);
				params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				exp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				exp(0);
				setState(115);
				match(TK_COMA);
				setState(116);
				args();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statements);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case LEER:
			case SI:
			case MIENTRAS:
			case HACER:
			case PARA:
			case SELECCIONAR:
			case IMPRIMIR:
			case CARACTER:
			case CADENA:
			case BOOLEANO:
			case REAL:
			case ENTERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				stmt();
				setState(121);
				statements();
				}
				break;
			case SI_NO:
			case FIN_SI:
			case RETORNAR:
			case FIN_PRINCIPAL:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statements3Context extends ParserRuleContext {
		public Stmt2Context stmt2() {
			return getRuleContext(Stmt2Context.class,0);
		}
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Statements3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements3(this);
		}
	}

	public final Statements3Context statements3() throws RecognitionException {
		Statements3Context _localctx = new Statements3Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements3);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				stmt2();
				setState(127);
				statements3();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Statements4Context extends ParserRuleContext {
		public Stmt4Context stmt4() {
			return getRuleContext(Stmt4Context.class,0);
		}
		public Statements4Context statements4() {
			return getRuleContext(Statements4Context.class,0);
		}
		public Statements4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStatements4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStatements4(this);
		}
	}

	public final Statements4Context statements4() throws RecognitionException {
		Statements4Context _localctx = new Statements4Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_statements4);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case CARACTER:
			case CADENA:
			case BOOLEANO:
			case REAL:
			case ENTERO:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				stmt4();
				setState(133);
				statements4();
				}
				break;
			case FIN_ESTRUCTURA:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptpargsContext optpargs() {
			return getRuleContext(OptpargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode IMPRIMIR() { return getToken(PsicoderParser.IMPRIMIR, 0); }
		public Imp_paramsContext imp_params() {
			return getRuleContext(Imp_paramsContext.class,0);
		}
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public TerminalNode FIN_PARA() { return getToken(PsicoderParser.FIN_PARA, 0); }
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode FIN_MIENTRAS() { return getToken(PsicoderParser.FIN_MIENTRAS, 0); }
		public TerminalNode SELECCIONAR() { return getToken(PsicoderParser.SELECCIONAR, 0); }
		public TerminalNode ENTRE() { return getToken(PsicoderParser.ENTRE, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(PsicoderParser.FIN_SELECCIONAR, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stmt);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(ID);
				setState(139);
				match(TK_PAR_IZQ);
				setState(140);
				optpargs();
				setState(141);
				match(TK_PAR_DER);
				setState(142);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				type();
				setState(145);
				match(ID);
				setState(146);
				match(TK_ASIG);
				setState(147);
				exp(0);
				setState(148);
				match(TK_COMA);
				setState(149);
				optexp();
				setState(150);
				match(TK_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				type();
				setState(153);
				match(ID);
				setState(154);
				match(TK_COMA);
				setState(155);
				optexp();
				setState(156);
				match(TK_PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(ID);
				setState(159);
				match(TK_ASIG);
				setState(160);
				exp(0);
				setState(161);
				match(TK_PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				type();
				setState(164);
				match(ID);
				setState(165);
				match(TK_ASIG);
				setState(166);
				exp(0);
				setState(167);
				match(TK_PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				match(ID);
				setState(170);
				match(TK_PUNTO);
				setState(171);
				chain();
				setState(172);
				match(TK_ASIG);
				setState(173);
				exp(0);
				setState(174);
				match(TK_PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				type();
				setState(177);
				match(ID);
				setState(178);
				match(TK_PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				match(SI);
				setState(181);
				match(TK_PAR_IZQ);
				setState(182);
				exp(0);
				setState(183);
				match(TK_PAR_DER);
				setState(184);
				match(ENTONCES);
				setState(185);
				statements();
				setState(186);
				match(FIN_SI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				match(SI);
				setState(189);
				match(TK_PAR_IZQ);
				setState(190);
				exp(0);
				setState(191);
				match(TK_PAR_DER);
				setState(192);
				match(ENTONCES);
				setState(193);
				statements();
				setState(194);
				match(SI_NO);
				setState(195);
				statements();
				setState(196);
				match(FIN_SI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(198);
				match(LEER);
				setState(199);
				match(TK_PAR_IZQ);
				setState(200);
				match(ID);
				setState(201);
				match(TK_PAR_DER);
				setState(202);
				match(TK_PYC);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(203);
				match(LEER);
				setState(204);
				match(TK_PAR_IZQ);
				setState(205);
				match(ID);
				setState(206);
				match(TK_PUNTO);
				setState(207);
				chain();
				setState(208);
				match(TK_PAR_DER);
				setState(209);
				match(TK_PYC);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(211);
				match(IMPRIMIR);
				setState(212);
				match(TK_PAR_IZQ);
				setState(213);
				imp_params();
				setState(214);
				match(TK_PAR_DER);
				setState(215);
				match(TK_PYC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(217);
				match(PARA);
				setState(218);
				match(TK_PAR_IZQ);
				setState(219);
				stmt();
				setState(220);
				exp(0);
				setState(221);
				match(TK_PYC);
				setState(222);
				exp(0);
				setState(223);
				match(TK_PAR_DER);
				setState(224);
				match(HACER);
				setState(225);
				statements3();
				setState(226);
				match(FIN_PARA);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(228);
				match(MIENTRAS);
				setState(229);
				match(TK_PAR_IZQ);
				setState(230);
				exp(0);
				setState(231);
				match(TK_PAR_DER);
				setState(232);
				match(HACER);
				setState(233);
				statements3();
				setState(234);
				match(FIN_MIENTRAS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(236);
				match(HACER);
				setState(237);
				statements3();
				setState(238);
				match(MIENTRAS);
				setState(239);
				match(TK_PAR_IZQ);
				setState(240);
				exp(0);
				setState(241);
				match(TK_PAR_DER);
				setState(242);
				match(TK_PYC);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(244);
				match(SELECCIONAR);
				setState(245);
				match(TK_PAR_IZQ);
				setState(246);
				match(ID);
				setState(247);
				match(TK_PAR_DER);
				setState(248);
				match(ENTRE);
				setState(249);
				cases();
				setState(250);
				match(FIN_SELECCIONAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CasesContext extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PsicoderParser.CASO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_POSD() { return getToken(PsicoderParser.TK_POSD, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Cases2Context cases2() {
			return getRuleContext(Cases2Context.class,0);
		}
		public DeftContext deft() {
			return getRuleContext(DeftContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCases(this);
		}
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cases);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(CASO);
				setState(255);
				exp(0);
				setState(256);
				match(TK_POSD);
				setState(257);
				statements3();
				setState(258);
				cases2();
				}
				break;
			case DEFECTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				deft();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cases2Context extends ParserRuleContext {
		public TerminalNode CASO() { return getToken(PsicoderParser.CASO, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_POSD() { return getToken(PsicoderParser.TK_POSD, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public Cases2Context cases2() {
			return getRuleContext(Cases2Context.class,0);
		}
		public DeftContext deft() {
			return getRuleContext(DeftContext.class,0);
		}
		public Cases2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterCases2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitCases2(this);
		}
	}

	public final Cases2Context cases2() throws RecognitionException {
		Cases2Context _localctx = new Cases2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_cases2);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case CASO:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(CASO);
				setState(264);
				exp(0);
				setState(265);
				match(TK_POSD);
				setState(266);
				statements3();
				setState(267);
				cases2();
				}
				break;
			case FIN_SELECCIONAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case DEFECTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				deft();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeftContext extends ParserRuleContext {
		public TerminalNode DEFECTO() { return getToken(PsicoderParser.DEFECTO, 0); }
		public TerminalNode TK_POSD() { return getToken(PsicoderParser.TK_POSD, 0); }
		public Statements3Context statements3() {
			return getRuleContext(Statements3Context.class,0);
		}
		public DeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterDeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitDeft(this);
		}
	}

	public final DeftContext deft() throws RecognitionException {
		DeftContext _localctx = new DeftContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_deft);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(DEFECTO);
			setState(274);
			match(TK_POSD);
			setState(275);
			statements3();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Imp_paramsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public Imp_paramsContext imp_params() {
			return getRuleContext(Imp_paramsContext.class,0);
		}
		public Imp_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imp_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterImp_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitImp_params(this);
		}
	}

	public final Imp_paramsContext imp_params() throws RecognitionException {
		Imp_paramsContext _localctx = new Imp_paramsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_imp_params);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				exp(0);
				setState(278);
				match(TK_COMA);
				setState(279);
				imp_params();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptexpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OptexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptexp(this);
		}
	}

	public final OptexpContext optexp() throws RecognitionException {
		OptexpContext _localctx = new OptexpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_optexp);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(ID);
				setState(285);
				match(TK_COMA);
				setState(286);
				optexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(ID);
				setState(288);
				match(TK_ASIG);
				setState(289);
				exp(0);
				setState(290);
				match(TK_COMA);
				setState(291);
				optexp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(ID);
				setState(295);
				match(TK_ASIG);
				setState(296);
				exp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChainContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitChain(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		ChainContext _localctx = new ChainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_chain);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(ID);
				setState(300);
				match(TK_PUNTO);
				setState(301);
				chain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode TK_CARACTER() { return getToken(PsicoderParser.TK_CARACTER, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode TK_ENTERO() { return getToken(PsicoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsicoderParser.TK_REAL, 0); }
		public TerminalNode TK_CADENA() { return getToken(PsicoderParser.TK_CADENA, 0); }
		public TerminalNode VERDADERO() { return getToken(PsicoderParser.VERDADERO, 0); }
		public TerminalNode FALSO() { return getToken(PsicoderParser.FALSO, 0); }
		public TerminalNode TK_MENOS() { return getToken(PsicoderParser.TK_MENOS, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_NEG() { return getToken(PsicoderParser.TK_NEG, 0); }
		public OptargsContext optargs() {
			return getRuleContext(OptargsContext.class,0);
		}
		public TerminalNode TK_O() { return getToken(PsicoderParser.TK_O, 0); }
		public TerminalNode TK_Y() { return getToken(PsicoderParser.TK_Y, 0); }
		public TerminalNode TK_IGUAL() { return getToken(PsicoderParser.TK_IGUAL, 0); }
		public TerminalNode TK_MENOR() { return getToken(PsicoderParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(PsicoderParser.TK_MAYOR, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(PsicoderParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(PsicoderParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_DIF() { return getToken(PsicoderParser.TK_DIF, 0); }
		public TerminalNode TK_MAS() { return getToken(PsicoderParser.TK_MAS, 0); }
		public TerminalNode TK_MULT() { return getToken(PsicoderParser.TK_MULT, 0); }
		public TerminalNode TK_DIV() { return getToken(PsicoderParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(PsicoderParser.TK_MOD, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(306);
				match(TK_CARACTER);
				}
				break;
			case 2:
				{
				setState(307);
				match(ID);
				}
				break;
			case 3:
				{
				setState(308);
				match(ID);
				setState(309);
				match(TK_PUNTO);
				setState(310);
				chain();
				}
				break;
			case 4:
				{
				setState(311);
				match(TK_ENTERO);
				}
				break;
			case 5:
				{
				setState(312);
				match(TK_REAL);
				}
				break;
			case 6:
				{
				setState(313);
				match(TK_CADENA);
				}
				break;
			case 7:
				{
				setState(314);
				match(VERDADERO);
				}
				break;
			case 8:
				{
				setState(315);
				match(FALSO);
				}
				break;
			case 9:
				{
				setState(316);
				match(TK_MENOS);
				setState(317);
				match(TK_REAL);
				}
				break;
			case 10:
				{
				setState(318);
				match(TK_MENOS);
				setState(319);
				match(TK_ENTERO);
				}
				break;
			case 11:
				{
				setState(320);
				match(TK_MENOS);
				setState(321);
				match(ID);
				}
				break;
			case 12:
				{
				setState(322);
				match(TK_MENOS);
				setState(323);
				match(ID);
				setState(324);
				match(TK_PUNTO);
				setState(325);
				chain();
				}
				break;
			case 13:
				{
				setState(326);
				match(TK_MENOS);
				setState(327);
				match(TK_PAR_IZQ);
				setState(328);
				exp(0);
				setState(329);
				match(TK_PAR_DER);
				}
				break;
			case 14:
				{
				setState(331);
				match(TK_NEG);
				setState(332);
				match(ID);
				}
				break;
			case 15:
				{
				setState(333);
				match(TK_NEG);
				setState(334);
				match(ID);
				setState(335);
				match(TK_PUNTO);
				setState(336);
				chain();
				}
				break;
			case 16:
				{
				setState(337);
				match(TK_NEG);
				setState(338);
				match(VERDADERO);
				}
				break;
			case 17:
				{
				setState(339);
				match(TK_NEG);
				setState(340);
				match(FALSO);
				}
				break;
			case 18:
				{
				setState(341);
				match(TK_NEG);
				setState(342);
				match(TK_PAR_IZQ);
				setState(343);
				exp(0);
				setState(344);
				match(TK_PAR_DER);
				}
				break;
			case 19:
				{
				setState(346);
				match(TK_PAR_IZQ);
				setState(347);
				exp(0);
				setState(348);
				match(TK_PAR_DER);
				}
				break;
			case 20:
				{
				setState(350);
				match(ID);
				setState(351);
				match(TK_PAR_IZQ);
				setState(352);
				optargs();
				setState(353);
				match(TK_PAR_DER);
				}
				break;
			case 21:
				{
				setState(355);
				match(TK_PAR_IZQ);
				setState(356);
				optargs();
				setState(357);
				match(TK_PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(361);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(362);
						match(TK_O);
						setState(363);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(364);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(365);
						match(TK_Y);
						setState(366);
						exp(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(367);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(368);
						match(TK_IGUAL);
						setState(369);
						exp(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(370);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(371);
						match(TK_MENOR);
						setState(372);
						exp(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(373);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(374);
						match(TK_MAYOR);
						setState(375);
						exp(10);
						}
						break;
					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(376);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(377);
						match(TK_MENOR_IGUAL);
						setState(378);
						exp(9);
						}
						break;
					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(379);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(380);
						match(TK_MAYOR_IGUAL);
						setState(381);
						exp(8);
						}
						break;
					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(382);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(383);
						match(TK_DIF);
						setState(384);
						exp(7);
						}
						break;
					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(385);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(386);
						match(TK_MAS);
						setState(387);
						exp(6);
						}
						break;
					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(388);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(389);
						match(TK_MENOS);
						setState(390);
						exp(5);
						}
						break;
					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(391);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(392);
						match(TK_MULT);
						setState(393);
						exp(4);
						}
						break;
					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(394);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(395);
						match(TK_DIV);
						setState(396);
						exp(3);
						}
						break;
					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(397);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(398);
						match(TK_MOD);
						setState(399);
						exp(2);
						}
						break;
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class OptargsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OptargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optargs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterOptargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitOptargs(this);
		}
	}

	public final OptargsContext optargs() throws RecognitionException {
		OptargsContext _localctx = new OptargsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_optargs);
		try {
			setState(407);
			switch (_input.LA(1)) {
			case TK_PAR_DER:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case TK_CARACTER:
			case VERDADERO:
			case FALSO:
			case TK_ENTERO:
			case TK_MENOS:
			case TK_NEG:
			case TK_PAR_IZQ:
			case ID:
			case TK_REAL:
			case TK_CADENA:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				args();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt2Context extends ParserRuleContext {
		public TerminalNode ROMPER() { return getToken(PsicoderParser.ROMPER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptpargsContext optpargs() {
			return getRuleContext(OptpargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminalNode SI() { return getToken(PsicoderParser.SI, 0); }
		public TerminalNode ENTONCES() { return getToken(PsicoderParser.ENTONCES, 0); }
		public List<Statements3Context> statements3() {
			return getRuleContexts(Statements3Context.class);
		}
		public Statements3Context statements3(int i) {
			return getRuleContext(Statements3Context.class,i);
		}
		public TerminalNode FIN_SI() { return getToken(PsicoderParser.FIN_SI, 0); }
		public TerminalNode SI_NO() { return getToken(PsicoderParser.SI_NO, 0); }
		public TerminalNode LEER() { return getToken(PsicoderParser.LEER, 0); }
		public TerminalNode IMPRIMIR() { return getToken(PsicoderParser.IMPRIMIR, 0); }
		public Imp_paramsContext imp_params() {
			return getRuleContext(Imp_paramsContext.class,0);
		}
		public TerminalNode PARA() { return getToken(PsicoderParser.PARA, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode HACER() { return getToken(PsicoderParser.HACER, 0); }
		public TerminalNode FIN_PARA() { return getToken(PsicoderParser.FIN_PARA, 0); }
		public TerminalNode MIENTRAS() { return getToken(PsicoderParser.MIENTRAS, 0); }
		public TerminalNode FIN_MIENTRAS() { return getToken(PsicoderParser.FIN_MIENTRAS, 0); }
		public TerminalNode SELECCIONAR() { return getToken(PsicoderParser.SELECCIONAR, 0); }
		public TerminalNode ENTRE() { return getToken(PsicoderParser.ENTRE, 0); }
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public TerminalNode FIN_SELECCIONAR() { return getToken(PsicoderParser.FIN_SELECCIONAR, 0); }
		public Stmt2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt2(this);
		}
	}

	public final Stmt2Context stmt2() throws RecognitionException {
		Stmt2Context _localctx = new Stmt2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_stmt2);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(ROMPER);
				setState(410);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(ID);
				setState(412);
				match(TK_PAR_IZQ);
				setState(413);
				optpargs();
				setState(414);
				match(TK_PAR_DER);
				setState(415);
				match(TK_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				type();
				setState(418);
				match(ID);
				setState(419);
				match(TK_ASIG);
				setState(420);
				exp(0);
				setState(421);
				match(TK_COMA);
				setState(422);
				optexp();
				setState(423);
				match(TK_PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				type();
				setState(426);
				match(ID);
				setState(427);
				match(TK_COMA);
				setState(428);
				optexp();
				setState(429);
				match(TK_PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(431);
				match(ID);
				setState(432);
				match(TK_ASIG);
				setState(433);
				exp(0);
				setState(434);
				match(TK_PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				type();
				setState(437);
				match(ID);
				setState(438);
				match(TK_ASIG);
				setState(439);
				exp(0);
				setState(440);
				match(TK_PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				match(ID);
				setState(443);
				match(TK_PUNTO);
				setState(444);
				chain();
				setState(445);
				match(TK_ASIG);
				setState(446);
				exp(0);
				setState(447);
				match(TK_PYC);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				type();
				setState(450);
				match(ID);
				setState(451);
				match(TK_PYC);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				match(SI);
				setState(454);
				match(TK_PAR_IZQ);
				setState(455);
				exp(0);
				setState(456);
				match(TK_PAR_DER);
				setState(457);
				match(ENTONCES);
				setState(458);
				statements3();
				setState(459);
				match(FIN_SI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(461);
				match(SI);
				setState(462);
				match(TK_PAR_IZQ);
				setState(463);
				exp(0);
				setState(464);
				match(TK_PAR_DER);
				setState(465);
				match(ENTONCES);
				setState(466);
				statements3();
				setState(467);
				match(SI_NO);
				setState(468);
				statements3();
				setState(469);
				match(FIN_SI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(471);
				match(LEER);
				setState(472);
				match(TK_PAR_IZQ);
				setState(473);
				match(ID);
				setState(474);
				match(TK_PUNTO);
				setState(475);
				chain();
				setState(476);
				match(TK_PAR_DER);
				setState(477);
				match(TK_PYC);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(479);
				match(LEER);
				setState(480);
				match(TK_PAR_IZQ);
				setState(481);
				match(ID);
				setState(482);
				match(TK_PAR_DER);
				setState(483);
				match(TK_PYC);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(484);
				match(IMPRIMIR);
				setState(485);
				match(TK_PAR_IZQ);
				setState(486);
				imp_params();
				setState(487);
				match(TK_PAR_DER);
				setState(488);
				match(TK_PYC);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(490);
				match(PARA);
				setState(491);
				match(TK_PAR_IZQ);
				setState(492);
				stmt();
				setState(493);
				exp(0);
				setState(494);
				match(TK_PYC);
				setState(495);
				exp(0);
				setState(496);
				match(TK_PAR_DER);
				setState(497);
				match(HACER);
				setState(498);
				statements3();
				setState(499);
				match(FIN_PARA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(501);
				match(MIENTRAS);
				setState(502);
				match(TK_PAR_IZQ);
				setState(503);
				exp(0);
				setState(504);
				match(TK_PAR_DER);
				setState(505);
				match(HACER);
				setState(506);
				statements3();
				setState(507);
				match(FIN_MIENTRAS);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(509);
				match(HACER);
				setState(510);
				statements3();
				setState(511);
				match(MIENTRAS);
				setState(512);
				match(TK_PAR_IZQ);
				setState(513);
				exp(0);
				setState(514);
				match(TK_PAR_DER);
				setState(515);
				match(TK_PYC);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(517);
				match(SELECCIONAR);
				setState(518);
				match(TK_PAR_IZQ);
				setState(519);
				match(ID);
				setState(520);
				match(TK_PAR_DER);
				setState(521);
				match(ENTRE);
				setState(522);
				cases();
				setState(523);
				match(FIN_SELECCIONAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt4Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsicoderParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(PsicoderParser.TK_PAR_IZQ, 0); }
		public OptpargsContext optpargs() {
			return getRuleContext(OptpargsContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(PsicoderParser.TK_PAR_DER, 0); }
		public TerminalNode TK_PYC() { return getToken(PsicoderParser.TK_PYC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(PsicoderParser.TK_ASIG, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TK_COMA() { return getToken(PsicoderParser.TK_COMA, 0); }
		public OptexpContext optexp() {
			return getRuleContext(OptexpContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(PsicoderParser.TK_PUNTO, 0); }
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public Stmt4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).enterStmt4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsicoderListener ) ((PsicoderListener)listener).exitStmt4(this);
		}
	}

	public final Stmt4Context stmt4() throws RecognitionException {
		Stmt4Context _localctx = new Stmt4Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_stmt4);
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				match(ID);
				setState(528);
				match(TK_PAR_IZQ);
				setState(529);
				optpargs();
				setState(530);
				match(TK_PAR_DER);
				setState(531);
				match(TK_PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				type();
				setState(534);
				match(ID);
				setState(535);
				match(TK_ASIG);
				setState(536);
				exp(0);
				setState(537);
				match(TK_COMA);
				setState(538);
				optexp();
				setState(539);
				match(TK_PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				type();
				setState(542);
				match(ID);
				setState(543);
				match(TK_COMA);
				setState(544);
				optexp();
				setState(545);
				match(TK_PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				match(ID);
				setState(548);
				match(TK_ASIG);
				setState(549);
				exp(0);
				setState(550);
				match(TK_PYC);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				type();
				setState(553);
				match(ID);
				setState(554);
				match(TK_ASIG);
				setState(555);
				exp(0);
				setState(556);
				match(TK_PYC);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(558);
				match(ID);
				setState(559);
				match(TK_PUNTO);
				setState(560);
				chain();
				setState(561);
				match(TK_ASIG);
				setState(562);
				exp(0);
				setState(563);
				match(TK_PYC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(565);
				type();
				setState(566);
				match(ID);
				setState(567);
				match(TK_PYC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return ps_sempred((PsContext)_localctx, predIndex);
		case 19:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ps_sempred(PsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3A\u023e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\5\2\64\n\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\5\7`\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\ny\n\n\3\13\3\13\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ff\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0108\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0112\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u011d\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u012c\n\23\3\24\3\24\3\24\3\24\5\24\u0132\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u016a"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0193"+
		"\n\25\f\25\16\25\u0196\13\25\3\26\3\26\5\26\u019a\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u0210\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u023c\n\30\3\30\2\4\2(\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\3\6\2\30\31\35\35!\"??\u0282\2\63\3\2"+
		"\2\2\4D\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\n[\3\2\2\2\f_\3\2\2\2\16i\3\2\2"+
		"\2\20m\3\2\2\2\22x\3\2\2\2\24~\3\2\2\2\26\u0084\3\2\2\2\30\u008a\3\2\2"+
		"\2\32\u00fe\3\2\2\2\34\u0107\3\2\2\2\36\u0111\3\2\2\2 \u0113\3\2\2\2\""+
		"\u011c\3\2\2\2$\u012b\3\2\2\2&\u0131\3\2\2\2(\u0169\3\2\2\2*\u0199\3\2"+
		"\2\2,\u020f\3\2\2\2.\u023b\3\2\2\2\60\61\b\2\1\2\61\64\5\4\3\2\62\64\3"+
		"\2\2\2\63\60\3\2\2\2\63\62\3\2\2\2\649\3\2\2\2\65\66\f\5\2\2\668\5\6\4"+
		"\2\67\65\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2"+
		"<=\5\6\4\2=>\5\2\2\2>E\3\2\2\2?@\7\32\2\2@A\5\24\13\2AB\7\34\2\2BE\3\2"+
		"\2\2CE\3\2\2\2D<\3\2\2\2D?\3\2\2\2DC\3\2\2\2E\5\3\2\2\2FG\7\33\2\2GH\5"+
		"\n\6\2HI\7?\2\2IJ\7=\2\2JK\5\f\7\2KL\7>\2\2LM\7\n\2\2MN\5\24\13\2NO\7"+
		"\24\2\2OP\5(\25\2PQ\7:\2\2QR\7\3\2\2RU\3\2\2\2SU\5\b\5\2TF\3\2\2\2TS\3"+
		"\2\2\2U\7\3\2\2\2VW\7\25\2\2WX\7?\2\2XY\5\30\r\2YZ\7\26\2\2Z\t\3\2\2\2"+
		"[\\\t\2\2\2\\\13\3\2\2\2]`\5\16\b\2^`\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\r\3"+
		"\2\2\2ab\5\n\6\2bc\7?\2\2cd\7;\2\2de\5\16\b\2ej\3\2\2\2fg\5\n\6\2gh\7"+
		"?\2\2hj\3\2\2\2ia\3\2\2\2if\3\2\2\2j\17\3\2\2\2kn\5\22\n\2ln\3\2\2\2m"+
		"k\3\2\2\2ml\3\2\2\2n\21\3\2\2\2op\5(\25\2pq\7;\2\2qr\5\16\b\2ry\3\2\2"+
		"\2sy\5(\25\2tu\5(\25\2uv\7;\2\2vw\5\22\n\2wy\3\2\2\2xo\3\2\2\2xs\3\2\2"+
		"\2xt\3\2\2\2y\23\3\2\2\2z{\5\32\16\2{|\5\24\13\2|\177\3\2\2\2}\177\3\2"+
		"\2\2~z\3\2\2\2~}\3\2\2\2\177\25\3\2\2\2\u0080\u0081\5,\27\2\u0081\u0082"+
		"\5\26\f\2\u0082\u0085\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2"+
		"\u0084\u0083\3\2\2\2\u0085\27\3\2\2\2\u0086\u0087\5.\30\2\u0087\u0088"+
		"\5\30\r\2\u0088\u008b\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2"+
		"\u008a\u0089\3\2\2\2\u008b\31\3\2\2\2\u008c\u008d\7?\2\2\u008d\u008e\7"+
		"=\2\2\u008e\u008f\5\20\t\2\u008f\u0090\7>\2\2\u0090\u0091\7:\2\2\u0091"+
		"\u00ff\3\2\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7?\2\2\u0094\u0095\7-\2"+
		"\2\u0095\u0096\5(\25\2\u0096\u0097\7;\2\2\u0097\u0098\5$\23\2\u0098\u0099"+
		"\7:\2\2\u0099\u00ff\3\2\2\2\u009a\u009b\5\n\6\2\u009b\u009c\7?\2\2\u009c"+
		"\u009d\7;\2\2\u009d\u009e\5$\23\2\u009e\u009f\7:\2\2\u009f\u00ff\3\2\2"+
		"\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7-\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4"+
		"\7:\2\2\u00a4\u00ff\3\2\2\2\u00a5\u00a6\5\n\6\2\u00a6\u00a7\7?\2\2\u00a7"+
		"\u00a8\7-\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7:\2\2\u00aa\u00ff\3\2\2"+
		"\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7<\2\2\u00ad\u00ae\5&\24\2\u00ae\u00af"+
		"\7-\2\2\u00af\u00b0\5(\25\2\u00b0\u00b1\7:\2\2\u00b1\u00ff\3\2\2\2\u00b2"+
		"\u00b3\5\n\6\2\u00b3\u00b4\7?\2\2\u00b4\u00b5\7:\2\2\u00b5\u00ff\3\2\2"+
		"\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\7=\2\2\u00b8\u00b9\5(\25\2\u00b9\u00ba"+
		"\7>\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\5\24\13\2\u00bc\u00bd\7\b\2\2"+
		"\u00bd\u00ff\3\2\2\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\7=\2\2\u00c0\u00c1"+
		"\5(\25\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\5\24\13\2"+
		"\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5\24\13\2\u00c6\u00c7\7\b\2\2\u00c7\u00ff"+
		"\3\2\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00ca\7=\2\2\u00ca\u00cb\7?\2\2\u00cb"+
		"\u00cc\7>\2\2\u00cc\u00ff\7:\2\2\u00cd\u00ce\7\4\2\2\u00ce\u00cf\7=\2"+
		"\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7<\2\2\u00d1\u00d2\5&\24\2\u00d2\u00d3"+
		"\7>\2\2\u00d3\u00d4\7:\2\2\u00d4\u00ff\3\2\2\2\u00d5\u00d6\7\27\2\2\u00d6"+
		"\u00d7\7=\2\2\u00d7\u00d8\5\"\22\2\u00d8\u00d9\7>\2\2\u00d9\u00da\7:\2"+
		"\2\u00da\u00ff\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\7=\2\2\u00dd\u00de"+
		"\5\32\16\2\u00de\u00df\5(\25\2\u00df\u00e0\7:\2\2\u00e0\u00e1\5(\25\2"+
		"\u00e1\u00e2\7>\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\5\26\f\2\u00e4\u00e5"+
		"\7\r\2\2\u00e5\u00ff\3\2\2\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\7=\2\2\u00e8"+
		"\u00e9\5(\25\2\u00e9\u00ea\7>\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5\26"+
		"\f\2\u00ec\u00ed\7\13\2\2\u00ed\u00ff\3\2\2\2\u00ee\u00ef\7\n\2\2\u00ef"+
		"\u00f0\5\26\f\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\7=\2\2\u00f2\u00f3\5("+
		"\25\2\u00f3\u00f4\7>\2\2\u00f4\u00f5\7:\2\2\u00f5\u00ff\3\2\2\2\u00f6"+
		"\u00f7\7\16\2\2\u00f7\u00f8\7=\2\2\u00f8\u00f9\7?\2\2\u00f9\u00fa\7>\2"+
		"\2\u00fa\u00fb\7\17\2\2\u00fb\u00fc\5\34\17\2\u00fc\u00fd\7\23\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u008c\3\2\2\2\u00fe\u0092\3\2\2\2\u00fe\u009a\3\2"+
		"\2\2\u00fe\u00a0\3\2\2\2\u00fe\u00a5\3\2\2\2\u00fe\u00ab\3\2\2\2\u00fe"+
		"\u00b2\3\2\2\2\u00fe\u00b6\3\2\2\2\u00fe\u00be\3\2\2\2\u00fe\u00c8\3\2"+
		"\2\2\u00fe\u00cd\3\2\2\2\u00fe\u00d5\3\2\2\2\u00fe\u00db\3\2\2\2\u00fe"+
		"\u00e6\3\2\2\2\u00fe\u00ee\3\2\2\2\u00fe\u00f6\3\2\2\2\u00ff\33\3\2\2"+
		"\2\u0100\u0101\7\20\2\2\u0101\u0102\5(\25\2\u0102\u0103\7\67\2\2\u0103"+
		"\u0104\5\26\f\2\u0104\u0105\5\36\20\2\u0105\u0108\3\2\2\2\u0106\u0108"+
		"\5 \21\2\u0107\u0100\3\2\2\2\u0107\u0106\3\2\2\2\u0108\35\3\2\2\2\u0109"+
		"\u010a\7\20\2\2\u010a\u010b\5(\25\2\u010b\u010c\7\67\2\2\u010c\u010d\5"+
		"\26\f\2\u010d\u010e\5\36\20\2\u010e\u0112\3\2\2\2\u010f\u0112\3\2\2\2"+
		"\u0110\u0112\5 \21\2\u0111\u0109\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\37\3\2\2\2\u0113\u0114\7\22\2\2\u0114\u0115\7\67\2\2\u0115"+
		"\u0116\5\26\f\2\u0116!\3\2\2\2\u0117\u0118\5(\25\2\u0118\u0119\7;\2\2"+
		"\u0119\u011a\5\"\22\2\u011a\u011d\3\2\2\2\u011b\u011d\5(\25\2\u011c\u0117"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d#\3\2\2\2\u011e\u011f\7?\2\2\u011f\u0120"+
		"\7;\2\2\u0120\u012c\5$\23\2\u0121\u0122\7?\2\2\u0122\u0123\7-\2\2\u0123"+
		"\u0124\5(\25\2\u0124\u0125\7;\2\2\u0125\u0126\5$\23\2\u0126\u012c\3\2"+
		"\2\2\u0127\u012c\7?\2\2\u0128\u0129\7?\2\2\u0129\u012a\7-\2\2\u012a\u012c"+
		"\5(\25\2\u012b\u011e\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u0127\3\2\2\2\u012b"+
		"\u0128\3\2\2\2\u012c%\3\2\2\2\u012d\u012e\7?\2\2\u012e\u012f\7<\2\2\u012f"+
		"\u0132\5&\24\2\u0130\u0132\7?\2\2\u0131\u012d\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132\'\3\2\2\2\u0133\u0134\b\25\1\2\u0134\u016a\7\36\2\2\u0135\u016a"+
		"\7?\2\2\u0136\u0137\7?\2\2\u0137\u0138\7<\2\2\u0138\u016a\5&\24\2\u0139"+
		"\u016a\7#\2\2\u013a\u016a\7@\2\2\u013b\u016a\7A\2\2\u013c\u016a\7\37\2"+
		"\2\u013d\u016a\7 \2\2\u013e\u013f\7)\2\2\u013f\u016a\7@\2\2\u0140\u0141"+
		"\7)\2\2\u0141\u016a\7#\2\2\u0142\u0143\7)\2\2\u0143\u016a\7?\2\2\u0144"+
		"\u0145\7)\2\2\u0145\u0146\7?\2\2\u0146\u0147\7<\2\2\u0147\u016a\5&\24"+
		"\2\u0148\u0149\7)\2\2\u0149\u014a\7=\2\2\u014a\u014b\5(\25\2\u014b\u014c"+
		"\7>\2\2\u014c\u016a\3\2\2\2\u014d\u014e\7\66\2\2\u014e\u016a\7?\2\2\u014f"+
		"\u0150\7\66\2\2\u0150\u0151\7?\2\2\u0151\u0152\7<\2\2\u0152\u016a\5&\24"+
		"\2\u0153\u0154\7\66\2\2\u0154\u016a\7\37\2\2\u0155\u0156\7\66\2\2\u0156"+
		"\u016a\7 \2\2\u0157\u0158\7\66\2\2\u0158\u0159\7=\2\2\u0159\u015a\5(\25"+
		"\2\u015a\u015b\7>\2\2\u015b\u016a\3\2\2\2\u015c\u015d\7=\2\2\u015d\u015e"+
		"\5(\25\2\u015e\u015f\7>\2\2\u015f\u016a\3\2\2\2\u0160\u0161\7?\2\2\u0161"+
		"\u0162\7=\2\2\u0162\u0163\5*\26\2\u0163\u0164\7>\2\2\u0164\u016a\3\2\2"+
		"\2\u0165\u0166\7=\2\2\u0166\u0167\5*\26\2\u0167\u0168\7>\2\2\u0168\u016a"+
		"\3\2\2\2\u0169\u0133\3\2\2\2\u0169\u0135\3\2\2\2\u0169\u0136\3\2\2\2\u0169"+
		"\u0139\3\2\2\2\u0169\u013a\3\2\2\2\u0169\u013b\3\2\2\2\u0169\u013c\3\2"+
		"\2\2\u0169\u013d\3\2\2\2\u0169\u013e\3\2\2\2\u0169\u0140\3\2\2\2\u0169"+
		"\u0142\3\2\2\2\u0169\u0144\3\2\2\2\u0169\u0148\3\2\2\2\u0169\u014d\3\2"+
		"\2\2\u0169\u014f\3\2\2\2\u0169\u0153\3\2\2\2\u0169\u0155\3\2\2\2\u0169"+
		"\u0157\3\2\2\2\u0169\u015c\3\2\2\2\u0169\u0160\3\2\2\2\u0169\u0165\3\2"+
		"\2\2\u016a\u0194\3\2\2\2\u016b\u016c\f\17\2\2\u016c\u016d\7\64\2\2\u016d"+
		"\u0193\5(\25\20\u016e\u016f\f\16\2\2\u016f\u0170\7\63\2\2\u0170\u0193"+
		"\5(\25\17\u0171\u0172\f\r\2\2\u0172\u0173\7\62\2\2\u0173\u0193\5(\25\16"+
		"\u0174\u0175\f\f\2\2\u0175\u0176\7.\2\2\u0176\u0193\5(\25\r\u0177\u0178"+
		"\f\13\2\2\u0178\u0179\7/\2\2\u0179\u0193\5(\25\f\u017a\u017b\f\n\2\2\u017b"+
		"\u017c\7\60\2\2\u017c\u0193\5(\25\13\u017d\u017e\f\t\2\2\u017e\u017f\7"+
		"\61\2\2\u017f\u0193\5(\25\n\u0180\u0181\f\b\2\2\u0181\u0182\7\65\2\2\u0182"+
		"\u0193\5(\25\t\u0183\u0184\f\7\2\2\u0184\u0185\7(\2\2\u0185\u0193\5(\25"+
		"\b\u0186\u0187\f\6\2\2\u0187\u0188\7)\2\2\u0188\u0193\5(\25\7\u0189\u018a"+
		"\f\5\2\2\u018a\u018b\7*\2\2\u018b\u0193\5(\25\6\u018c\u018d\f\4\2\2\u018d"+
		"\u018e\7+\2\2\u018e\u0193\5(\25\5\u018f\u0190\f\3\2\2\u0190\u0191\7,\2"+
		"\2\u0191\u0193\5(\25\4\u0192\u016b\3\2\2\2\u0192\u016e\3\2\2\2\u0192\u0171"+
		"\3\2\2\2\u0192\u0174\3\2\2\2\u0192\u0177\3\2\2\2\u0192\u017a\3\2\2\2\u0192"+
		"\u017d\3\2\2\2\u0192\u0180\3\2\2\2\u0192\u0183\3\2\2\2\u0192\u0186\3\2"+
		"\2\2\u0192\u0189\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018f\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195)\3\2\2\2"+
		"\u0196\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u019a\5\22\n\2\u0199\u0197"+
		"\3\2\2\2\u0199\u0198\3\2\2\2\u019a+\3\2\2\2\u019b\u019c\7\21\2\2\u019c"+
		"\u0210\7:\2\2\u019d\u019e\7?\2\2\u019e\u019f\7=\2\2\u019f\u01a0\5\20\t"+
		"\2\u01a0\u01a1\7>\2\2\u01a1\u01a2\7:\2\2\u01a2\u0210\3\2\2\2\u01a3\u01a4"+
		"\5\n\6\2\u01a4\u01a5\7?\2\2\u01a5\u01a6\7-\2\2\u01a6\u01a7\5(\25\2\u01a7"+
		"\u01a8\7;\2\2\u01a8\u01a9\5$\23\2\u01a9\u01aa\7:\2\2\u01aa\u0210\3\2\2"+
		"\2\u01ab\u01ac\5\n\6\2\u01ac\u01ad\7?\2\2\u01ad\u01ae\7;\2\2\u01ae\u01af"+
		"\5$\23\2\u01af\u01b0\7:\2\2\u01b0\u0210\3\2\2\2\u01b1\u01b2\7?\2\2\u01b2"+
		"\u01b3\7-\2\2\u01b3\u01b4\5(\25\2\u01b4\u01b5\7:\2\2\u01b5\u0210\3\2\2"+
		"\2\u01b6\u01b7\5\n\6\2\u01b7\u01b8\7?\2\2\u01b8\u01b9\7-\2\2\u01b9\u01ba"+
		"\5(\25\2\u01ba\u01bb\7:\2\2\u01bb\u0210\3\2\2\2\u01bc\u01bd\7?\2\2\u01bd"+
		"\u01be\7<\2\2\u01be\u01bf\5&\24\2\u01bf\u01c0\7-\2\2\u01c0\u01c1\5(\25"+
		"\2\u01c1\u01c2\7:\2\2\u01c2\u0210\3\2\2\2\u01c3\u01c4\5\n\6\2\u01c4\u01c5"+
		"\7?\2\2\u01c5\u01c6\7:\2\2\u01c6\u0210\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8"+
		"\u01c9\7=\2\2\u01c9\u01ca\5(\25\2\u01ca\u01cb\7>\2\2\u01cb\u01cc\7\7\2"+
		"\2\u01cc\u01cd\5\26\f\2\u01cd\u01ce\7\b\2\2\u01ce\u0210\3\2\2\2\u01cf"+
		"\u01d0\7\6\2\2\u01d0\u01d1\7=\2\2\u01d1\u01d2\5(\25\2\u01d2\u01d3\7>\2"+
		"\2\u01d3\u01d4\7\7\2\2\u01d4\u01d5\5\26\f\2\u01d5\u01d6\7\5\2\2\u01d6"+
		"\u01d7\5\26\f\2\u01d7\u01d8\7\b\2\2\u01d8\u0210\3\2\2\2\u01d9\u01da\7"+
		"\4\2\2\u01da\u01db\7=\2\2\u01db\u01dc\7?\2\2\u01dc\u01dd\7<\2\2\u01dd"+
		"\u01de\5&\24\2\u01de\u01df\7>\2\2\u01df\u01e0\7:\2\2\u01e0\u0210\3\2\2"+
		"\2\u01e1\u01e2\7\4\2\2\u01e2\u01e3\7=\2\2\u01e3\u01e4\7?\2\2\u01e4\u01e5"+
		"\7>\2\2\u01e5\u0210\7:\2\2\u01e6\u01e7\7\27\2\2\u01e7\u01e8\7=\2\2\u01e8"+
		"\u01e9\5\"\22\2\u01e9\u01ea\7>\2\2\u01ea\u01eb\7:\2\2\u01eb\u0210\3\2"+
		"\2\2\u01ec\u01ed\7\f\2\2\u01ed\u01ee\7=\2\2\u01ee\u01ef\5\32\16\2\u01ef"+
		"\u01f0\5(\25\2\u01f0\u01f1\7:\2\2\u01f1\u01f2\5(\25\2\u01f2\u01f3\7>\2"+
		"\2\u01f3\u01f4\7\n\2\2\u01f4\u01f5\5\26\f\2\u01f5\u01f6\7\r\2\2\u01f6"+
		"\u0210\3\2\2\2\u01f7\u01f8\7\t\2\2\u01f8\u01f9\7=\2\2\u01f9\u01fa\5(\25"+
		"\2\u01fa\u01fb\7>\2\2\u01fb\u01fc\7\n\2\2\u01fc\u01fd\5\26\f\2\u01fd\u01fe"+
		"\7\13\2\2\u01fe\u0210\3\2\2\2\u01ff\u0200\7\n\2\2\u0200\u0201\5\26\f\2"+
		"\u0201\u0202\7\t\2\2\u0202\u0203\7=\2\2\u0203\u0204\5(\25\2\u0204\u0205"+
		"\7>\2\2\u0205\u0206\7:\2\2\u0206\u0210\3\2\2\2\u0207\u0208\7\16\2\2\u0208"+
		"\u0209\7=\2\2\u0209\u020a\7?\2\2\u020a\u020b\7>\2\2\u020b\u020c\7\17\2"+
		"\2\u020c\u020d\5\34\17\2\u020d\u020e\7\23\2\2\u020e\u0210\3\2\2\2\u020f"+
		"\u019b\3\2\2\2\u020f\u019d\3\2\2\2\u020f\u01a3\3\2\2\2\u020f\u01ab\3\2"+
		"\2\2\u020f\u01b1\3\2\2\2\u020f\u01b6\3\2\2\2\u020f\u01bc\3\2\2\2\u020f"+
		"\u01c3\3\2\2\2\u020f\u01c7\3\2\2\2\u020f\u01cf\3\2\2\2\u020f\u01d9\3\2"+
		"\2\2\u020f\u01e1\3\2\2\2\u020f\u01e6\3\2\2\2\u020f\u01ec\3\2\2\2\u020f"+
		"\u01f7\3\2\2\2\u020f\u01ff\3\2\2\2\u020f\u0207\3\2\2\2\u0210-\3\2\2\2"+
		"\u0211\u0212\7?\2\2\u0212\u0213\7=\2\2\u0213\u0214\5\20\t\2\u0214\u0215"+
		"\7>\2\2\u0215\u0216\7:\2\2\u0216\u023c\3\2\2\2\u0217\u0218\5\n\6\2\u0218"+
		"\u0219\7?\2\2\u0219\u021a\7-\2\2\u021a\u021b\5(\25\2\u021b\u021c\7;\2"+
		"\2\u021c\u021d\5$\23\2\u021d\u021e\7:\2\2\u021e\u023c\3\2\2\2\u021f\u0220"+
		"\5\n\6\2\u0220\u0221\7?\2\2\u0221\u0222\7;\2\2\u0222\u0223\5$\23\2\u0223"+
		"\u0224\7:\2\2\u0224\u023c\3\2\2\2\u0225\u0226\7?\2\2\u0226\u0227\7-\2"+
		"\2\u0227\u0228\5(\25\2\u0228\u0229\7:\2\2\u0229\u023c\3\2\2\2\u022a\u022b"+
		"\5\n\6\2\u022b\u022c\7?\2\2\u022c\u022d\7-\2\2\u022d\u022e\5(\25\2\u022e"+
		"\u022f\7:\2\2\u022f\u023c\3\2\2\2\u0230\u0231\7?\2\2\u0231\u0232\7<\2"+
		"\2\u0232\u0233\5&\24\2\u0233\u0234\7-\2\2\u0234\u0235\5(\25\2\u0235\u0236"+
		"\7:\2\2\u0236\u023c\3\2\2\2\u0237\u0238\5\n\6\2\u0238\u0239\7?\2\2\u0239"+
		"\u023a\7:\2\2\u023a\u023c\3\2\2\2\u023b\u0211\3\2\2\2\u023b\u0217\3\2"+
		"\2\2\u023b\u021f\3\2\2\2\u023b\u0225\3\2\2\2\u023b\u022a\3\2\2\2\u023b"+
		"\u0230\3\2\2\2\u023b\u0237\3\2\2\2\u023c/\3\2\2\2\31\639DT_imx~\u0084"+
		"\u008a\u00fe\u0107\u0111\u011c\u012b\u0131\u0169\u0192\u0194\u0199\u020f"+
		"\u023b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}