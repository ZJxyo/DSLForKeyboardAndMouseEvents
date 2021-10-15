// Generated from C:/Users/User/Desktop/CPSC410/410Project1Group17/src/parser\firstLexer.g4 by ANTLR 4.9.1
package parser;
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
		PRESS=7, HOLD_START=8, WRITE=9, HOVER=10, NEW=11, SET=12, PRINT=13, OPERATION=14, 
		COMMA=15, WS=16, TEXT=17, STRING=18, NAME=19, CONST=20, EXP_SEP=21, EXP_COMMA=22, 
		SPACE=23, NEWLINE=24;
	public static final int
		TEXT_MODE=1, STRING_MODE=2, EXP_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "TEXT_MODE", "STRING_MODE", "EXP_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REPEAT_START", "TIMES", "LEFT_BRACKET", "RIGHT_BRACKET", "WAIT", "AT", 
			"PRESS", "HOLD_START", "WRITE", "HOVER", "NEW", "SET", "PRINT", "OPERATION", 
			"COMMA", "WS", "TEXT", "STRING", "NAME", "CONST", "EXP_SEP", "EXP_COMMA", 
			"SPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'times'", "'{'", "'}'", null, null, null, null, null, null, 
			"'new'", "'set'", "'print'", null, null, null, null, null, null, null, 
			"'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPEAT_START", "TIMES", "LEFT_BRACKET", "RIGHT_BRACKET", "WAIT", 
			"AT", "PRESS", "HOLD_START", "WRITE", "HOVER", "NEW", "SET", "PRINT", 
			"OPERATION", "COMMA", "WS", "TEXT", "STRING", "NAME", "CONST", "EXP_SEP", 
			"EXP_COMMA", "SPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0109\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2C\n"+
		"\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\6\7\6b\n\6\f\6\16"+
		"\6e\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b~\n\b\3\b\7\b\u0081\n\b\f\b\16\b"+
		"\u0084\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\t"+
		"\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u00b4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3\13\20\3\20\3\20\3"+
		"\21\6\21\u00d8\n\21\r\21\16\21\u00d9\3\21\3\21\3\22\6\22\u00df\n\22\r"+
		"\22\16\22\u00e0\3\22\3\22\3\23\6\23\u00e6\n\23\r\23\16\23\u00e7\3\23\3"+
		"\23\3\24\3\24\7\24\u00ee\n\24\f\24\16\24\u00f1\13\24\3\25\6\25\u00f4\n"+
		"\25\r\25\16\25\u00f5\3\26\3\26\3\27\3\27\3\30\6\30\u00fd\n\30\r\30\16"+
		"\30\u00fe\3\30\3\30\3\31\6\31\u0104\n\31\r\31\16\31\u0105\3\31\3\31\2"+
		"\2\32\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r\34\16\36\17"+
		" \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\6\2\3\4\5\t\4\2,-"+
		"//\5\2\13\f\17\17\"\"\5\2\62;C\\c|\4\2\f\f\17\17\4\2C\\c|\3\2\62;\4\2"+
		"\13\13\"\"\2\u0118\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16"+
		"\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2"+
		"\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$"+
		"\3\2\2\2\3&\3\2\2\2\4(\3\2\2\2\5*\3\2\2\2\5,\3\2\2\2\5.\3\2\2\2\5\60\3"+
		"\2\2\2\5\62\3\2\2\2\5\64\3\2\2\2\6B\3\2\2\2\bL\3\2\2\2\nR\3\2\2\2\fT\3"+
		"\2\2\2\16^\3\2\2\2\20h\3\2\2\2\22}\3\2\2\2\24\u008f\3\2\2\2\26\u00a3\3"+
		"\2\2\2\30\u00b3\3\2\2\2\32\u00b5\3\2\2\2\34\u00bb\3\2\2\2\36\u00c1\3\2"+
		"\2\2 \u00c9\3\2\2\2\"\u00cd\3\2\2\2$\u00d7\3\2\2\2&\u00de\3\2\2\2(\u00e5"+
		"\3\2\2\2*\u00eb\3\2\2\2,\u00f3\3\2\2\2.\u00f7\3\2\2\2\60\u00f9\3\2\2\2"+
		"\62\u00fc\3\2\2\2\64\u0103\3\2\2\2\66\67\7T\2\2\678\7g\2\289\7r\2\29:"+
		"\7g\2\2:;\7c\2\2;C\7v\2\2<=\7t\2\2=>\7g\2\2>?\7r\2\2?@\7g\2\2@A\7c\2\2"+
		"AC\7v\2\2B\66\3\2\2\2B<\3\2\2\2CG\3\2\2\2DF\5$\21\2ED\3\2\2\2FI\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\b\2\2\2K\7\3\2\2\2LM\7v\2"+
		"\2MN\7k\2\2NO\7o\2\2OP\7g\2\2PQ\7u\2\2Q\t\3\2\2\2RS\7}\2\2S\13\3\2\2\2"+
		"TU\7\177\2\2U\r\3\2\2\2VW\7Y\2\2WX\7c\2\2XY\7k\2\2Y_\7v\2\2Z[\7y\2\2["+
		"\\\7c\2\2\\]\7k\2\2]_\7v\2\2^V\3\2\2\2^Z\3\2\2\2_c\3\2\2\2`b\5$\21\2a"+
		"`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\6\3\2"+
		"g\17\3\2\2\2hi\7c\2\2ij\7v\2\2jn\3\2\2\2km\5$\21\2lk\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\b\7\3\2r\21\3\2\2\2st\7R\2"+
		"\2tu\7t\2\2uv\7g\2\2vw\7u\2\2w~\7u\2\2xy\7r\2\2yz\7t\2\2z{\7g\2\2{|\7"+
		"u\2\2|~\7u\2\2}s\3\2\2\2}x\3\2\2\2~\u0082\3\2\2\2\177\u0081\5$\21\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\b\b\2\2\u0086\23"+
		"\3\2\2\2\u0087\u0088\7J\2\2\u0088\u0089\7q\2\2\u0089\u008a\7n\2\2\u008a"+
		"\u0090\7f\2\2\u008b\u008c\7j\2\2\u008c\u008d\7q\2\2\u008d\u008e\7n\2\2"+
		"\u008e\u0090\7f\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u0090\u0094"+
		"\3\2\2\2\u0091\u0093\5$\21\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\b\t\2\2\u0098\25\3\2\2\2\u0099\u009a\7Y\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7v\2\2\u009d\u00a4\7g\2\2\u009e"+
		"\u009f\7y\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7v\2\2"+
		"\u00a2\u00a4\7g\2\2\u00a3\u0099\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a6\5$\21\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\n\4\2\u00a8"+
		"\27\3\2\2\2\u00a9\u00aa\7J\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7x\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad\u00b4\7t\2\2\u00ae\u00af\7j\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\u00b1\7x\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b4\7t\2\2\u00b3\u00a9"+
		"\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4\31\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6"+
		"\u00b7\7g\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\f\3"+
		"\2\u00ba\33\3\2\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\b\r\3\2\u00c0\35\3\2\2\2\u00c1"+
		"\u00c2\7r\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00c6\7v\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\16\3\2\u00c8\37"+
		"\3\2\2\2\u00c9\u00ca\t\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\17\3\2"+
		"\u00cc!\3\2\2\2\u00cd\u00d1\7.\2\2\u00ce\u00d0\5$\21\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b\20\2\2\u00d5#\3\2\2\2"+
		"\u00d6\u00d8\t\3\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\b\21\5\2"+
		"\u00dc%\3\2\2\2\u00dd\u00df\t\4\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e3\b\22\6\2\u00e3\'\3\2\2\2\u00e4\u00e6\n\5\2\2\u00e5\u00e4\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\b\23\6\2\u00ea)\3\2\2\2\u00eb\u00ef\t\6\2\2\u00ec"+
		"\u00ee\t\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0+\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f4"+
		"\t\7\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7?\2\2\u00f8/\3\2\2\2\u00f9"+
		"\u00fa\7.\2\2\u00fa\61\3\2\2\2\u00fb\u00fd\t\b\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100\u0101\b\30\5\2\u0101\63\3\2\2\2\u0102\u0104\t\5\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\u0108\b\31\6\2\u0108\65\3\2\2\2\31\2\3"+
		"\4\5BG^cn}\u0082\u008f\u0094\u00a3\u00b3\u00d1\u00d9\u00e0\u00e7\u00ef"+
		"\u00f5\u00fe\u0105\7\4\3\2\4\5\2\4\4\2\2\3\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}