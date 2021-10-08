// Generated from C:/Users/User/Desktop/CPSC410/410project/src/parser\firstLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class firstLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPEAT_START=1, TIMES=2, LEFT_BRACKET=3, RIGHT_BRACKET=4, WAIT=5, AT=6, 
		PRESS=7, HOLD_START=8, WRITE=9, HOVER=10, COMMA=11, WS=12, TEXT=13, STRING=14;
	public static final int
		TEXT_MODE=1, STRING_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TEXT_MODE", "STRING_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REPEAT_START", "TIMES", "LEFT_BRACKET", "RIGHT_BRACKET", "WAIT", "AT", 
			"PRESS", "HOLD_START", "WRITE", "HOVER", "COMMA", "WS", "TEXT", "STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'times'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPEAT_START", "TIMES", "LEFT_BRACKET", "RIGHT_BRACKET", "WAIT", 
			"AT", "PRESS", "HOLD_START", "WRITE", "HOVER", "COMMA", "WS", "TEXT", 
			"STRING"
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


	public firstLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "firstLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20\u00be\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\2\7\2\61\n\2\f\2\16\2\64\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6J\n\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bi\n\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t{\n\t\3\t\7\t~\n\t\f\t\16\t\u0081\13\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\f\3\f"+
		"\7\f\u00a3\n\f\f\f\16\f\u00a6\13\f\3\f\3\f\3\r\6\r\u00ab\n\r\r\r\16\r"+
		"\u00ac\3\r\3\r\3\16\6\16\u00b2\n\16\r\16\16\16\u00b3\3\16\3\16\3\17\6"+
		"\17\u00b9\n\17\r\17\16\17\u00ba\3\17\3\17\2\2\20\5\3\7\4\t\5\13\6\r\7"+
		"\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20\5\2\3\4\5\5\2\13\f\17"+
		"\17\"\"\5\2\62;C\\c|\4\2\f\f\17\17\2\u00ca\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\4"+
		"\37\3\2\2\2\5-\3\2\2\2\7\67\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rI\3\2\2\2"+
		"\17S\3\2\2\2\21h\3\2\2\2\23z\3\2\2\2\25\u008e\3\2\2\2\27\u009e\3\2\2\2"+
		"\31\u00a0\3\2\2\2\33\u00aa\3\2\2\2\35\u00b1\3\2\2\2\37\u00b8\3\2\2\2!"+
		"\"\7T\2\2\"#\7g\2\2#$\7r\2\2$%\7g\2\2%&\7c\2\2&.\7v\2\2\'(\7t\2\2()\7"+
		"g\2\2)*\7r\2\2*+\7g\2\2+,\7c\2\2,.\7v\2\2-!\3\2\2\2-\'\3\2\2\2.\62\3\2"+
		"\2\2/\61\5\33\r\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\b\2\2\2\66\6\3\2\2\2\678\7v\2\28"+
		"9\7k\2\29:\7o\2\2:;\7g\2\2;<\7u\2\2<\b\3\2\2\2=>\7}\2\2>\n\3\2\2\2?@\7"+
		"\177\2\2@\f\3\2\2\2AB\7Y\2\2BC\7c\2\2CD\7k\2\2DJ\7v\2\2EF\7y\2\2FG\7c"+
		"\2\2GH\7k\2\2HJ\7v\2\2IA\3\2\2\2IE\3\2\2\2JN\3\2\2\2KM\5\33\r\2LK\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\b\6\2\2R\16\3"+
		"\2\2\2ST\7c\2\2TU\7v\2\2UY\3\2\2\2VX\5\33\r\2WV\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\b\7\2\2]\20\3\2\2\2^_\7R\2\2"+
		"_`\7t\2\2`a\7g\2\2ab\7u\2\2bi\7u\2\2cd\7r\2\2de\7t\2\2ef\7g\2\2fg\7u\2"+
		"\2gi\7u\2\2h^\3\2\2\2hc\3\2\2\2im\3\2\2\2jl\5\33\r\2kj\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pq\b\b\2\2q\22\3\2\2\2rs\7J"+
		"\2\2st\7q\2\2tu\7n\2\2u{\7f\2\2vw\7j\2\2wx\7q\2\2xy\7n\2\2y{\7f\2\2zr"+
		"\3\2\2\2zv\3\2\2\2{\177\3\2\2\2|~\5\33\r\2}|\3\2\2\2~\u0081\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\b\t\2\2\u0083\24\3\2\2\2\u0084\u0085\7Y\2\2\u0085\u0086\7t\2\2"+
		"\u0086\u0087\7k\2\2\u0087\u0088\7v\2\2\u0088\u008f\7g\2\2\u0089\u008a"+
		"\7y\2\2\u008a\u008b\7t\2\2\u008b\u008c\7k\2\2\u008c\u008d\7v\2\2\u008d"+
		"\u008f\7g\2\2\u008e\u0084\3\2\2\2\u008e\u0089\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\5\33\r\2\u0091\u0092\3\2\2\2\u0092\u0093\b\n\3\2\u0093"+
		"\26\3\2\2\2\u0094\u0095\7J\2\2\u0095\u0096\7q\2\2\u0096\u0097\7x\2\2\u0097"+
		"\u0098\7g\2\2\u0098\u009f\7t\2\2\u0099\u009a\7j\2\2\u009a\u009b\7q\2\2"+
		"\u009b\u009c\7x\2\2\u009c\u009d\7g\2\2\u009d\u009f\7t\2\2\u009e\u0094"+
		"\3\2\2\2\u009e\u0099\3\2\2\2\u009f\30\3\2\2\2\u00a0\u00a4\7.\2\2\u00a1"+
		"\u00a3\5\33\r\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3"+
		"\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7"+
		"\u00a8\b\f\2\2\u00a8\32\3\2\2\2\u00a9\u00ab\t\2\2\2\u00aa\u00a9\3\2\2"+
		"\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\b\r\4\2\u00af\34\3\2\2\2\u00b0\u00b2\t\3\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\16\5\2\u00b6\36\3\2\2\2\u00b7\u00b9"+
		"\n\4\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\17\5\2\u00bd \3\2\2\2"+
		"\24\2\3\4-\62INYhmz\177\u008e\u009e\u00a4\u00ac\u00b3\u00ba\6\4\3\2\4"+
		"\4\2\2\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}