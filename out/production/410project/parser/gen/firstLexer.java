// Generated from /Users/avinash/Desktop/CPSC410/Project1Group17/out/production/410project/parser/firstLexer.g4 by ANTLR 4.9.1
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
		SEMICOLON=23, SPACE=24, NEWLINE=25;
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
			"SEMICOLON", "SPACE", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'times'", "'{'", "'}'", null, null, null, null, null, null, 
			"'new'", "'set'", "'print'", null, null, null, null, null, null, null, 
			"'='", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPEAT_START", "TIMES", "LEFT_BRACKET", "RIGHT_BRACKET", "WAIT", 
			"AT", "PRESS", "HOLD_START", "WRITE", "HOVER", "NEW", "SET", "PRINT", 
			"OPERATION", "COMMA", "WS", "TEXT", "STRING", "NAME", "CONST", "EXP_SEP", 
			"EXP_COMMA", "SEMICOLON", "SPACE", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u010d\b\1\b\1"+
		"\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21"+
		"\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30"+
		"\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2E\n\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\7\6"+
		"d\n\6\f\6\16\6g\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7o\n\7\f\7\16\7r\13\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\b\7\b\u0083"+
		"\n\b\f\b\16\b\u0086\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092"+
		"\n\t\3\t\7\t\u0095\n\t\f\t\16\t\u0098\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u00a6\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b6\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\7\20\u00d2\n\20\f\20\16\20\u00d5\13\20\3\20"+
		"\3\20\3\21\6\21\u00da\n\21\r\21\16\21\u00db\3\21\3\21\3\22\6\22\u00e1"+
		"\n\22\r\22\16\22\u00e2\3\22\3\22\3\23\6\23\u00e8\n\23\r\23\16\23\u00e9"+
		"\3\23\3\23\3\24\3\24\7\24\u00f0\n\24\f\24\16\24\u00f3\13\24\3\25\6\25"+
		"\u00f6\n\25\r\25\16\25\u00f7\3\26\3\26\3\27\3\27\3\30\3\30\3\31\6\31\u0101"+
		"\n\31\r\31\16\31\u0102\3\31\3\31\3\32\6\32\u0108\n\32\r\32\16\32\u0109"+
		"\3\32\3\32\2\2\33\6\3\b\4\n\5\f\6\16\7\20\b\22\t\24\n\26\13\30\f\32\r"+
		"\34\16\36\17 \20\"\21$\22&\23(\24*\25,\26.\27\60\30\62\31\64\32\66\33"+
		"\6\2\3\4\5\t\4\2,-//\5\2\13\f\17\17\"\"\5\2\62;C\\c|\4\2\f\f\17\17\4\2"+
		"C\\c|\3\2\62;\4\2\13\13\"\"\2\u011c\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2"+
		"\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26"+
		"\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2"+
		"\2\2\"\3\2\2\2\2$\3\2\2\2\3&\3\2\2\2\4(\3\2\2\2\5*\3\2\2\2\5,\3\2\2\2"+
		"\5.\3\2\2\2\5\60\3\2\2\2\5\62\3\2\2\2\5\64\3\2\2\2\5\66\3\2\2\2\6D\3\2"+
		"\2\2\bN\3\2\2\2\nT\3\2\2\2\fV\3\2\2\2\16`\3\2\2\2\20j\3\2\2\2\22\177\3"+
		"\2\2\2\24\u0091\3\2\2\2\26\u00a5\3\2\2\2\30\u00b5\3\2\2\2\32\u00b7\3\2"+
		"\2\2\34\u00bd\3\2\2\2\36\u00c3\3\2\2\2 \u00cb\3\2\2\2\"\u00cf\3\2\2\2"+
		"$\u00d9\3\2\2\2&\u00e0\3\2\2\2(\u00e7\3\2\2\2*\u00ed\3\2\2\2,\u00f5\3"+
		"\2\2\2.\u00f9\3\2\2\2\60\u00fb\3\2\2\2\62\u00fd\3\2\2\2\64\u0100\3\2\2"+
		"\2\66\u0107\3\2\2\289\7T\2\29:\7g\2\2:;\7r\2\2;<\7g\2\2<=\7c\2\2=E\7v"+
		"\2\2>?\7t\2\2?@\7g\2\2@A\7r\2\2AB\7g\2\2BC\7c\2\2CE\7v\2\2D8\3\2\2\2D"+
		">\3\2\2\2EI\3\2\2\2FH\5$\21\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2"+
		"JL\3\2\2\2KI\3\2\2\2LM\b\2\2\2M\7\3\2\2\2NO\7v\2\2OP\7k\2\2PQ\7o\2\2Q"+
		"R\7g\2\2RS\7u\2\2S\t\3\2\2\2TU\7}\2\2U\13\3\2\2\2VW\7\177\2\2W\r\3\2\2"+
		"\2XY\7Y\2\2YZ\7c\2\2Z[\7k\2\2[a\7v\2\2\\]\7y\2\2]^\7c\2\2^_\7k\2\2_a\7"+
		"v\2\2`X\3\2\2\2`\\\3\2\2\2ae\3\2\2\2bd\5$\21\2cb\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\b\6\2\2i\17\3\2\2\2jk\7c\2\2kl"+
		"\7v\2\2lp\3\2\2\2mo\5$\21\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs"+
		"\3\2\2\2rp\3\2\2\2st\b\7\3\2t\21\3\2\2\2uv\7R\2\2vw\7t\2\2wx\7g\2\2xy"+
		"\7u\2\2y\u0080\7u\2\2z{\7r\2\2{|\7t\2\2|}\7g\2\2}~\7u\2\2~\u0080\7u\2"+
		"\2\177u\3\2\2\2\177z\3\2\2\2\u0080\u0084\3\2\2\2\u0081\u0083\5$\21\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\b\2\2\u0088"+
		"\23\3\2\2\2\u0089\u008a\7J\2\2\u008a\u008b\7q\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u0092\7f\2\2\u008d\u008e\7j\2\2\u008e\u008f\7q\2\2\u008f\u0090\7n\2\2"+
		"\u0090\u0092\7f\2\2\u0091\u0089\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0096"+
		"\3\2\2\2\u0093\u0095\5$\21\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\b\t\2\2\u009a\25\3\2\2\2\u009b\u009c\7Y\2\2\u009c\u009d"+
		"\7t\2\2\u009d\u009e\7k\2\2\u009e\u009f\7v\2\2\u009f\u00a6\7g\2\2\u00a0"+
		"\u00a1\7y\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\u00a6\7g\2\2\u00a5\u009b\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\5$\21\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\n\4\2\u00aa"+
		"\27\3\2\2\2\u00ab\u00ac\7J\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7x\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b6\7t\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7q\2\2"+
		"\u00b2\u00b3\7x\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b6\7t\2\2\u00b5\u00ab"+
		"\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\31\3\2\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7y\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\f\3"+
		"\2\u00bc\33\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\r\3\2\u00c2\35\3\2\2\2\u00c3"+
		"\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\16\3\2\u00ca\37"+
		"\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\17\3\2"+
		"\u00ce!\3\2\2\2\u00cf\u00d3\7.\2\2\u00d0\u00d2\5$\21\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\b\20\2\2\u00d7#\3\2\2\2"+
		"\u00d8\u00da\t\3\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\21\5\2"+
		"\u00de%\3\2\2\2\u00df\u00e1\t\4\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e5\b\22\6\2\u00e5\'\3\2\2\2\u00e6\u00e8\n\5\2\2\u00e7\u00e6\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\b\23\6\2\u00ec)\3\2\2\2\u00ed\u00f1\t\6\2\2\u00ee"+
		"\u00f0\t\4\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2+\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6"+
		"\t\7\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8-\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa/\3\2\2\2\u00fb"+
		"\u00fc\7.\2\2\u00fc\61\3\2\2\2\u00fd\u00fe\7=\2\2\u00fe\63\3\2\2\2\u00ff"+
		"\u0101\t\b\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\b\31\5\2\u0105"+
		"\65\3\2\2\2\u0106\u0108\t\5\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c"+
		"\b\32\6\2\u010c\67\3\2\2\2\31\2\3\4\5DI`ep\177\u0084\u0091\u0096\u00a5"+
		"\u00b5\u00d3\u00db\u00e2\u00e9\u00f1\u00f7\u0102\u0109\7\4\3\2\4\5\2\4"+
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
