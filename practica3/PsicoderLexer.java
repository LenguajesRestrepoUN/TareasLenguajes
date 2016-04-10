// Generated from Psicoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsicoderLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FIN_FUNCION", "LEER", "SI_NO", "SI", "ENTONCES", "FIN_SI", "MIENTRAS", 
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


	public PsicoderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Psicoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2A\u021b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u017b\n\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\6\"\u019c"+
		"\n\"\r\"\16\"\u019d\3#\6#\u01a1\n#\r#\16#\u01a2\3#\3#\3$\3$\5$\u01a9\n"+
		"$\3$\5$\u01ac\n$\3$\3$\3%\3%\3%\3%\7%\u01b4\n%\f%\16%\u01b7\13%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\7&\u01c2\n&\f&\16&\u01c5\13&\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\6>\u01fe\n>\r>\16>\u01ff"+
		"\3>\7>\u0203\n>\f>\16>\u0206\13>\3?\6?\u0209\n?\r?\16?\u020a\3?\3?\6?"+
		"\u020f\n?\r?\16?\u0210\3@\3@\7@\u0215\n@\f@\16@\u0218\13@\3@\3@\3\u01b5"+
		"\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\3\2\b\5\2\62\63C\\c|\4\2\13\13\"\"\4\2\f\f\17"+
		"\17\4\2C\\c|\6\2\62\63C\\aac|\7\2\"\"\62;C\\aac|\u0225\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u008d\3\2\2\2\7\u0092\3\2\2\2\t\u0098"+
		"\3\2\2\2\13\u009b\3\2\2\2\r\u00a4\3\2\2\2\17\u00ab\3\2\2\2\21\u00b4\3"+
		"\2\2\2\23\u00ba\3\2\2\2\25\u00c7\3\2\2\2\27\u00cc\3\2\2\2\31\u00d5\3\2"+
		"\2\2\33\u00e1\3\2\2\2\35\u00e7\3\2\2\2\37\u00ec\3\2\2\2!\u00f3\3\2\2\2"+
		"#\u00fb\3\2\2\2%\u010b\3\2\2\2\'\u0114\3\2\2\2)\u011f\3\2\2\2+\u012e\3"+
		"\2\2\2-\u0137\3\2\2\2/\u0140\3\2\2\2\61\u0147\3\2\2\2\63\u0159\3\2\2\2"+
		"\65\u0161\3\2\2\2\67\u016f\3\2\2\29\u0178\3\2\2\2;\u017e\3\2\2\2=\u0188"+
		"\3\2\2\2?\u018e\3\2\2\2A\u0193\3\2\2\2C\u019b\3\2\2\2E\u01a0\3\2\2\2G"+
		"\u01ab\3\2\2\2I\u01af\3\2\2\2K\u01bd\3\2\2\2M\u01c8\3\2\2\2O\u01ca\3\2"+
		"\2\2Q\u01cc\3\2\2\2S\u01ce\3\2\2\2U\u01d0\3\2\2\2W\u01d2\3\2\2\2Y\u01d4"+
		"\3\2\2\2[\u01d6\3\2\2\2]\u01d8\3\2\2\2_\u01db\3\2\2\2a\u01de\3\2\2\2c"+
		"\u01e1\3\2\2\2e\u01e4\3\2\2\2g\u01e7\3\2\2\2i\u01ea\3\2\2\2k\u01ec\3\2"+
		"\2\2m\u01ee\3\2\2\2o\u01f0\3\2\2\2q\u01f2\3\2\2\2s\u01f4\3\2\2\2u\u01f6"+
		"\3\2\2\2w\u01f8\3\2\2\2y\u01fa\3\2\2\2{\u01fd\3\2\2\2}\u0208\3\2\2\2\177"+
		"\u0212\3\2\2\2\u0081\u0082\7h\2\2\u0082\u0083\7k\2\2\u0083\u0084\7p\2"+
		"\2\u0084\u0085\7a\2\2\u0085\u0086\7h\2\2\u0086\u0087\7w\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7e\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7p\2\2\u008c\4\3\2\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7g\2\2\u0090\u0091\7t\2\2\u0091\6\3\2\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7k\2\2\u0094\u0095\7a\2\2\u0095\u0096\7p\2\2\u0096\u0097\7q\2\2"+
		"\u0097\b\3\2\2\2\u0098\u0099\7u\2\2\u0099\u009a\7k\2\2\u009a\n\3\2\2\2"+
		"\u009b\u009c\7g\2\2\u009c\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7q\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7e\2\2\u00a1\u00a2\7g\2\2\u00a2"+
		"\u00a3\7u\2\2\u00a3\f\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7k\2\2\u00a6"+
		"\u00a7\7p\2\2\u00a7\u00a8\7a\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7k\2\2"+
		"\u00aa\16\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7"+
		"g\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7u\2\2\u00b3\20\3\2\2\2\u00b4\u00b5\7j\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7t\2\2\u00b9"+
		"\22\3\2\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\u00be\7a\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7g\2\2"+
		"\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7u\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7r\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7c\2\2\u00cb\26\3\2\2\2\u00cc\u00cd"+
		"\7h\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7a\2\2\u00d0"+
		"\u00d1\7r\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2"+
		"\u00d4\30\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7"+
		"n\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7c\2\2\u00df"+
		"\u00e0\7t\2\2\u00e0\32\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7g\2\2\u00e6\34\3\2\2\2\u00e7"+
		"\u00e8\7e\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\36\3\2\2\2\u00ec\u00ed\7t\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7"+
		"o\2\2\u00ef\u00f0\7r\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7t\2\2\u00f2 "+
		"\3\2\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6\7h\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u00f8\7e\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7q\2\2"+
		"\u00fa\"\3\2\2\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe\7p"+
		"\2\2\u00fe\u00ff\7a\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7g\2\2\u0101\u0102"+
		"\7n\2\2\u0102\u0103\7g\2\2\u0103\u0104\7e\2\2\u0104\u0105\7e\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7q\2\2\u0107\u0108\7p\2\2\u0108\u0109\7c\2\2"+
		"\u0109\u010a\7t\2\2\u010a$\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d\7g\2"+
		"\2\u010d\u010e\7v\2\2\u010e\u010f\7q\2\2\u010f\u0110\7t\2\2\u0110\u0111"+
		"\7p\2\2\u0111\u0112\7c\2\2\u0112\u0113\7t\2\2\u0113&\3\2\2\2\u0114\u0115"+
		"\7g\2\2\u0115\u0116\7u\2\2\u0116\u0117\7v\2\2\u0117\u0118\7t\2\2\u0118"+
		"\u0119\7w\2\2\u0119\u011a\7e\2\2\u011a\u011b\7v\2\2\u011b\u011c\7w\2\2"+
		"\u011c\u011d\7t\2\2\u011d\u011e\7c\2\2\u011e(\3\2\2\2\u011f\u0120\7h\2"+
		"\2\u0120\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122\u0123\7a\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7u\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t\2\2\u0127"+
		"\u0128\7w\2\2\u0128\u0129\7e\2\2\u0129\u012a\7v\2\2\u012a\u012b\7w\2\2"+
		"\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012d*\3\2\2\2\u012e\u012f\7k\2"+
		"\2\u012f\u0130\7o\2\2\u0130\u0131\7r\2\2\u0131\u0132\7t\2\2\u0132\u0133"+
		"\7k\2\2\u0133\u0134\7o\2\2\u0134\u0135\7k\2\2\u0135\u0136\7t\2\2\u0136"+
		",\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139\7c\2\2\u0139\u013a\7t\2\2\u013a"+
		"\u013b\7c\2\2\u013b\u013c\7e\2\2\u013c\u013d\7v\2\2\u013d\u013e\7g\2\2"+
		"\u013e\u013f\7t\2\2\u013f.\3\2\2\2\u0140\u0141\7e\2\2\u0141\u0142\7c\2"+
		"\2\u0142\u0143\7f\2\2\u0143\u0144\7g\2\2\u0144\u0145\7p\2\2\u0145\u0146"+
		"\7c\2\2\u0146\60\3\2\2\2\u0147\u0148\7h\2\2\u0148\u0149\7w\2\2\u0149\u014a"+
		"\7p\2\2\u014a\u014b\7e\2\2\u014b\u014c\7k\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7a\2\2\u014f\u0150\7r\2\2\u0150\u0151\7t\2\2"+
		"\u0151\u0152\7k\2\2\u0152\u0153\7p\2\2\u0153\u0154\7e\2\2\u0154\u0155"+
		"\7k\2\2\u0155\u0156\7r\2\2\u0156\u0157\7c\2\2\u0157\u0158\7n\2\2\u0158"+
		"\62\3\2\2\2\u0159\u015a\7h\2\2\u015a\u015b\7w\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7e\2\2\u015d\u015e\7k\2\2\u015e\u015f\7q\2\2\u015f\u0160\7p\2\2"+
		"\u0160\64\3\2\2\2\u0161\u0162\7h\2\2\u0162\u0163\7k\2\2\u0163\u0164\7"+
		"p\2\2\u0164\u0165\7a\2\2\u0165\u0166\7r\2\2\u0166\u0167\7t\2\2\u0167\u0168"+
		"\7k\2\2\u0168\u0169\7p\2\2\u0169\u016a\7e\2\2\u016a\u016b\7k\2\2\u016b"+
		"\u016c\7r\2\2\u016c\u016d\7c\2\2\u016d\u016e\7n\2\2\u016e\66\3\2\2\2\u016f"+
		"\u0170\7d\2\2\u0170\u0171\7q\2\2\u0171\u0172\7q\2\2\u0172\u0173\7n\2\2"+
		"\u0173\u0174\7g\2\2\u0174\u0175\7c\2\2\u0175\u0176\7p\2\2\u0176\u0177"+
		"\7q\2\2\u01778\3\2\2\2\u0178\u017a\7)\2\2\u0179\u017b\t\2\2\2\u017a\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\7)\2\2\u017d:\3\2\2\2\u017e\u017f"+
		"\7x\2\2\u017f\u0180\7g\2\2\u0180\u0181\7t\2\2\u0181\u0182\7f\2\2\u0182"+
		"\u0183\7c\2\2\u0183\u0184\7f\2\2\u0184\u0185\7g\2\2\u0185\u0186\7t\2\2"+
		"\u0186\u0187\7q\2\2\u0187<\3\2\2\2\u0188\u0189\7h\2\2\u0189\u018a\7c\2"+
		"\2\u018a\u018b\7n\2\2\u018b\u018c\7u\2\2\u018c\u018d\7q\2\2\u018d>\3\2"+
		"\2\2\u018e\u018f\7t\2\2\u018f\u0190\7g\2\2\u0190\u0191\7c\2\2\u0191\u0192"+
		"\7n\2\2\u0192@\3\2\2\2\u0193\u0194\7g\2\2\u0194\u0195\7p\2\2\u0195\u0196"+
		"\7v\2\2\u0196\u0197\7g\2\2\u0197\u0198\7t\2\2\u0198\u0199\7q\2\2\u0199"+
		"B\3\2\2\2\u019a\u019c\4\62;\2\u019b\u019a\3\2\2\2\u019c\u019d\3\2\2\2"+
		"\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019eD\3\2\2\2\u019f\u01a1\t"+
		"\3\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b#\2\2\u01a5F\3\2\2\2\u01a6"+
		"\u01a8\7\17\2\2\u01a7\u01a9\7\f\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3"+
		"\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\7\f\2\2\u01ab\u01a6\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\b$\2\2\u01aeH\3\2\2\2\u01af"+
		"\u01b0\7\61\2\2\u01b0\u01b1\7,\2\2\u01b1\u01b5\3\2\2\2\u01b2\u01b4\13"+
		"\2\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7,"+
		"\2\2\u01b9\u01ba\7\61\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\b%\2\2\u01bc"+
		"J\3\2\2\2\u01bd\u01be\7\61\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c3\3\2\2"+
		"\2\u01c0\u01c2\n\4\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\b&\2\2\u01c7L\3\2\2\2\u01c8\u01c9\7-\2\2\u01c9N\3\2\2\2\u01ca\u01cb"+
		"\7/\2\2\u01cbP\3\2\2\2\u01cc\u01cd\7,\2\2\u01cdR\3\2\2\2\u01ce\u01cf\7"+
		"\61\2\2\u01cfT\3\2\2\2\u01d0\u01d1\7\'\2\2\u01d1V\3\2\2\2\u01d2\u01d3"+
		"\7?\2\2\u01d3X\3\2\2\2\u01d4\u01d5\7>\2\2\u01d5Z\3\2\2\2\u01d6\u01d7\7"+
		"@\2\2\u01d7\\\3\2\2\2\u01d8\u01d9\7>\2\2\u01d9\u01da\7?\2\2\u01da^\3\2"+
		"\2\2\u01db\u01dc\7@\2\2\u01dc\u01dd\7?\2\2\u01dd`\3\2\2\2\u01de\u01df"+
		"\7?\2\2\u01df\u01e0\7?\2\2\u01e0b\3\2\2\2\u01e1\u01e2\7(\2\2\u01e2\u01e3"+
		"\7(\2\2\u01e3d\3\2\2\2\u01e4\u01e5\7~\2\2\u01e5\u01e6\7~\2\2\u01e6f\3"+
		"\2\2\2\u01e7\u01e8\7#\2\2\u01e8\u01e9\7?\2\2\u01e9h\3\2\2\2\u01ea\u01eb"+
		"\7#\2\2\u01ebj\3\2\2\2\u01ec\u01ed\7<\2\2\u01edl\3\2\2\2\u01ee\u01ef\7"+
		")\2\2\u01efn\3\2\2\2\u01f0\u01f1\7$\2\2\u01f1p\3\2\2\2\u01f2\u01f3\7="+
		"\2\2\u01f3r\3\2\2\2\u01f4\u01f5\7.\2\2\u01f5t\3\2\2\2\u01f6\u01f7\7\60"+
		"\2\2\u01f7v\3\2\2\2\u01f8\u01f9\7*\2\2\u01f9x\3\2\2\2\u01fa\u01fb\7+\2"+
		"\2\u01fbz\3\2\2\2\u01fc\u01fe\t\5\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff"+
		"\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0204\3\2\2\2\u0201"+
		"\u0203\t\6\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205|\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0209"+
		"\4\62;\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a"+
		"\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\7\60\2\2\u020d\u020f\4"+
		"\62;\2\u020e\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211~\3\2\2\2\u0212\u0216\7$\2\2\u0213\u0215\t\7\2\2\u0214"+
		"\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7$\2\2\u021a"+
		"\u0080\3\2\2\2\21\2\u017a\u019d\u01a2\u01a8\u01ab\u01b5\u01c3\u01fd\u01ff"+
		"\u0202\u0204\u020a\u0210\u0216\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}