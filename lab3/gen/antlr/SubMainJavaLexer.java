// Generated from C:/Users/melis/Desktop/MT/lab3/src/main/java/antlr\SubMainJava.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SubMainJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, T=2, LPAREN=3, RPAREN=4, RPAREN_SEM=5, IF=6, WHILE=7, ELSE=8, PSVM=9, 
		PACKAGE=10, CLASS=11, LFB=12, RFB=13, SEM=14, COMP=15, EQ=16, COMA=17, 
		SIGN=18, SOUT=19, TESTS=20, TEST=21, NUM=22, N=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "T", "LPAREN", "RPAREN", "RPAREN_SEM", "IF", "WHILE", "ELSE", "PSVM", 
			"PACKAGE", "CLASS", "LFB", "RFB", "SEM", "COMP", "EQ", "COMA", "SIGN", 
			"SOUT", "TESTS", "TEST", "NUM", "N"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'('", "')'", "');'", "'if'", "'while'", "'else'", 
			"'public static void main(String[] args)'", "'package'", "'public class'", 
			"'{'", "'}'", "';'", null, "'='", "','", null, "'System.out.println('", 
			"'tests'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "T", "LPAREN", "RPAREN", "RPAREN_SEM", "IF", "WHILE", "ELSE", 
			"PSVM", "PACKAGE", "CLASS", "LFB", "RFB", "SEM", "COMP", "EQ", "COMA", 
			"SIGN", "SOUT", "TESTS", "TEST", "NUM", "N"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SubMainJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SubMainJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00de\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\6\2\63\n\2\r\2\16\2\64\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009d\n\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u00c5\n\26\r\26\16\26\u00c6\3\27\6"+
		"\27\u00ca\n\27\r\27\16\27\u00cb\3\27\7\27\u00cf\n\27\f\27\16\27\u00d2"+
		"\13\27\3\30\6\30\u00d5\n\30\r\30\16\30\u00d6\3\30\7\30\u00da\n\30\f\30"+
		"\16\30\u00dd\13\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\t"+
		"\5\2\13\f\17\17\"\"\4\2>>@@\4\2,-//\3\2\62;\3\2\63;\5\2C\\aac|\6\2\62"+
		";C\\aac|\2\u00e7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\3\62\3\2\2\2\58\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3"+
		"\2\2\2\rC\3\2\2\2\17F\3\2\2\2\21L\3\2\2\2\23Q\3\2\2\2\25x\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0091\3\2\2\2\37\u009c\3"+
		"\2\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a2\3\2\2\2\'\u00a4\3\2\2\2)\u00b8"+
		"\3\2\2\2+\u00be\3\2\2\2-\u00c9\3\2\2\2/\u00d4\3\2\2\2\61\63\t\2\2\2\62"+
		"\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66"+
		"\67\b\2\2\2\67\4\3\2\2\289\7k\2\29:\7p\2\2:;\7v\2\2;\6\3\2\2\2<=\7*\2"+
		"\2=\b\3\2\2\2>?\7+\2\2?\n\3\2\2\2@A\7+\2\2AB\7=\2\2B\f\3\2\2\2CD\7k\2"+
		"\2DE\7h\2\2E\16\3\2\2\2FG\7y\2\2GH\7j\2\2HI\7k\2\2IJ\7n\2\2JK\7g\2\2K"+
		"\20\3\2\2\2LM\7g\2\2MN\7n\2\2NO\7u\2\2OP\7g\2\2P\22\3\2\2\2QR\7r\2\2R"+
		"S\7w\2\2ST\7d\2\2TU\7n\2\2UV\7k\2\2VW\7e\2\2WX\7\"\2\2XY\7u\2\2YZ\7v\2"+
		"\2Z[\7c\2\2[\\\7v\2\2\\]\7k\2\2]^\7e\2\2^_\7\"\2\2_`\7x\2\2`a\7q\2\2a"+
		"b\7k\2\2bc\7f\2\2cd\7\"\2\2de\7o\2\2ef\7c\2\2fg\7k\2\2gh\7p\2\2hi\7*\2"+
		"\2ij\7U\2\2jk\7v\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7i\2\2op\7]\2\2pq\7"+
		"_\2\2qr\7\"\2\2rs\7c\2\2st\7t\2\2tu\7i\2\2uv\7u\2\2vw\7+\2\2w\24\3\2\2"+
		"\2xy\7r\2\2yz\7c\2\2z{\7e\2\2{|\7m\2\2|}\7c\2\2}~\7i\2\2~\177\7g\2\2\177"+
		"\26\3\2\2\2\u0080\u0081\7r\2\2\u0081\u0082\7w\2\2\u0082\u0083\7d\2\2\u0083"+
		"\u0084\7n\2\2\u0084\u0085\7k\2\2\u0085\u0086\7e\2\2\u0086\u0087\7\"\2"+
		"\2\u0087\u0088\7e\2\2\u0088\u0089\7n\2\2\u0089\u008a\7c\2\2\u008a\u008b"+
		"\7u\2\2\u008b\u008c\7u\2\2\u008c\30\3\2\2\2\u008d\u008e\7}\2\2\u008e\32"+
		"\3\2\2\2\u008f\u0090\7\177\2\2\u0090\34\3\2\2\2\u0091\u0092\7=\2\2\u0092"+
		"\36\3\2\2\2\u0093\u009d\t\3\2\2\u0094\u0095\7@\2\2\u0095\u009d\7?\2\2"+
		"\u0096\u0097\7>\2\2\u0097\u009d\7?\2\2\u0098\u0099\7?\2\2\u0099\u009d"+
		"\7?\2\2\u009a\u009b\7#\2\2\u009b\u009d\7?\2\2\u009c\u0093\3\2\2\2\u009c"+
		"\u0094\3\2\2\2\u009c\u0096\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009d \3\2\2\2\u009e\u009f\7?\2\2\u009f\"\3\2\2\2\u00a0\u00a1\7."+
		"\2\2\u00a1$\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3&\3\2\2\2\u00a4\u00a5\7U"+
		"\2\2\u00a5\u00a6\7{\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9"+
		"\7g\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7\60\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7w\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7\60\2\2\u00af\u00b0\7r\2"+
		"\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4"+
		"\7v\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7*\2\2\u00b7"+
		"(\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7u\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7u\2\2\u00bd*\3\2\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c4\3\2\2"+
		"\2\u00c3\u00c5\t\5\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4"+
		"\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7,\3\2\2\2\u00c8\u00ca\t\6\2\2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cf\t\5\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1.\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d5\t\7\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00db\3\2\2\2\u00d8"+
		"\u00da\t\b\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\60\3\2\2\2\u00dd\u00db\3\2\2\2\n\2\64\u009c"+
		"\u00c6\u00cb\u00d0\u00d6\u00db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}