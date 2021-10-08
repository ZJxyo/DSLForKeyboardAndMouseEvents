// Generated from C:/Users/User/Desktop/CPSC410/410project/src/parser\firstParser.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class firstParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPEAT_START=1, TIMES=2, LEFT_BRACKET=3, RIGHT_BRACKET=4, WAIT=5, AT=6, 
		PRESS=7, HOLD_START=8, WRITE=9, HOVER=10, COMMA=11, WS=12, TEXT=13, STRING=14;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_repeat = 2, RULE_hold = 3, RULE_command = 4, 
		RULE_waitFor = 5, RULE_press = 6, RULE_hover = 7, RULE_write = 8, RULE_mouse = 9, 
		RULE_coord = 10, RULE_keys = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "code", "repeat", "hold", "command", "waitFor", "press", "hover", 
			"write", "mouse", "coord", "keys"
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

	@Override
	public String getGrammarFileName() { return "firstParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public firstParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				code();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << WAIT) | (1L << PRESS) | (1L << HOLD_START) | (1L << WRITE) | (1L << HOVER))) != 0) );
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

	public static class CodeContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public HoldContext hold() {
			return getRuleContext(HoldContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WAIT:
			case PRESS:
			case WRITE:
			case HOVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				command();
				}
				break;
			case REPEAT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				repeat();
				}
				break;
			case HOLD_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				hold();
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT_START() { return getToken(firstParser.REPEAT_START, 0); }
		public TerminalNode TEXT() { return getToken(firstParser.TEXT, 0); }
		public TerminalNode TIMES() { return getToken(firstParser.TIMES, 0); }
		public TerminalNode LEFT_BRACKET() { return getToken(firstParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(firstParser.RIGHT_BRACKET, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(REPEAT_START);
			setState(35);
			match(TEXT);
			setState(36);
			match(TIMES);
			setState(37);
			match(LEFT_BRACKET);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				code();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << WAIT) | (1L << PRESS) | (1L << HOLD_START) | (1L << WRITE) | (1L << HOVER))) != 0) );
			setState(43);
			match(RIGHT_BRACKET);
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

	public static class HoldContext extends ParserRuleContext {
		public TerminalNode HOLD_START() { return getToken(firstParser.HOLD_START, 0); }
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public TerminalNode LEFT_BRACKET() { return getToken(firstParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(firstParser.RIGHT_BRACKET, 0); }
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public HoldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterHold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitHold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitHold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoldContext hold() throws RecognitionException {
		HoldContext _localctx = new HoldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hold);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(HOLD_START);
			setState(46);
			keys();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(47);
				mouse();
				}
			}

			setState(50);
			match(LEFT_BRACKET);
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				code();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REPEAT_START) | (1L << WAIT) | (1L << PRESS) | (1L << HOLD_START) | (1L << WRITE) | (1L << HOVER))) != 0) );
			setState(56);
			match(RIGHT_BRACKET);
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

	public static class CommandContext extends ParserRuleContext {
		public WaitForContext waitFor() {
			return getRuleContext(WaitForContext.class,0);
		}
		public PressContext press() {
			return getRuleContext(PressContext.class,0);
		}
		public HoverContext hover() {
			return getRuleContext(HoverContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WAIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				waitFor();
				}
				break;
			case PRESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				press();
				}
				break;
			case HOVER:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				hover();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				write();
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

	public static class WaitForContext extends ParserRuleContext {
		public TerminalNode WAIT() { return getToken(firstParser.WAIT, 0); }
		public TerminalNode TEXT() { return getToken(firstParser.TEXT, 0); }
		public WaitForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_waitFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterWaitFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitWaitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitWaitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WaitForContext waitFor() throws RecognitionException {
		WaitForContext _localctx = new WaitForContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_waitFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(WAIT);
			setState(65);
			match(TEXT);
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

	public static class PressContext extends ParserRuleContext {
		public TerminalNode PRESS() { return getToken(firstParser.PRESS, 0); }
		public KeysContext keys() {
			return getRuleContext(KeysContext.class,0);
		}
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public PressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_press; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterPress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitPress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitPress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PressContext press() throws RecognitionException {
		PressContext _localctx = new PressContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_press);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(PRESS);
			setState(68);
			keys();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(69);
				mouse();
				}
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

	public static class HoverContext extends ParserRuleContext {
		public TerminalNode HOVER() { return getToken(firstParser.HOVER, 0); }
		public MouseContext mouse() {
			return getRuleContext(MouseContext.class,0);
		}
		public HoverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterHover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitHover(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitHover(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoverContext hover() throws RecognitionException {
		HoverContext _localctx = new HoverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hover);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(HOVER);
			setState(73);
			mouse();
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(firstParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(firstParser.STRING, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(WRITE);
			setState(76);
			match(STRING);
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

	public static class MouseContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(firstParser.AT, 0); }
		public CoordContext coord() {
			return getRuleContext(CoordContext.class,0);
		}
		public MouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterMouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitMouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitMouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MouseContext mouse() throws RecognitionException {
		MouseContext _localctx = new MouseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(AT);
			setState(79);
			coord();
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

	public static class CoordContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(firstParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(firstParser.TEXT, i);
		}
		public TerminalNode COMMA() { return getToken(firstParser.COMMA, 0); }
		public CoordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitCoord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitCoord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoordContext coord() throws RecognitionException {
		CoordContext _localctx = new CoordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_coord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TEXT);
			setState(82);
			match(COMMA);
			setState(83);
			match(TEXT);
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

	public static class KeysContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(firstParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(firstParser.TEXT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(firstParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(firstParser.COMMA, i);
		}
		public KeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).enterKeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof firstParserListener ) ((firstParserListener)listener).exitKeys(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof firstParserVisitor ) return ((firstParserVisitor<? extends T>)visitor).visitKeys(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeysContext keys() throws RecognitionException {
		KeysContext _localctx = new KeysContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_keys);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(TEXT);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(86);
				match(COMMA);
				setState(87);
				match(TEXT);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\5\3#\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\6\4*\n\4\r\4\16\4+\3\4\3\4\3\5\3\5\3\5\5\5\63\n\5\3\5\3\5"+
		"\6\5\67\n\5\r\5\16\58\3\5\3\5\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\5\bI\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\2\2\2^\2\33\3\2\2\2\4\"\3\2\2\2\6$\3\2\2\2\b/\3\2\2\2\n@\3\2"+
		"\2\2\fB\3\2\2\2\16E\3\2\2\2\20J\3\2\2\2\22M\3\2\2\2\24P\3\2\2\2\26S\3"+
		"\2\2\2\30W\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2"+
		"\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37#\5\n\6\2 #\5\6\4\2!#\5\b\5\2\"\37\3"+
		"\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\3\2\2%&\7\17\2\2&\'\7\4\2"+
		"\2\')\7\5\2\2(*\5\4\3\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2"+
		"\2\2-.\7\6\2\2.\7\3\2\2\2/\60\7\n\2\2\60\62\5\30\r\2\61\63\5\24\13\2\62"+
		"\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\66\7\5\2\2\65\67\5\4\3\2\66"+
		"\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\7\6\2\2;\t\3"+
		"\2\2\2<A\5\f\7\2=A\5\16\b\2>A\5\20\t\2?A\5\22\n\2@<\3\2\2\2@=\3\2\2\2"+
		"@>\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BC\7\7\2\2CD\7\17\2\2D\r\3\2\2\2EF\7\t"+
		"\2\2FH\5\30\r\2GI\5\24\13\2HG\3\2\2\2HI\3\2\2\2I\17\3\2\2\2JK\7\f\2\2"+
		"KL\5\24\13\2L\21\3\2\2\2MN\7\13\2\2NO\7\20\2\2O\23\3\2\2\2PQ\7\b\2\2Q"+
		"R\5\26\f\2R\25\3\2\2\2ST\7\17\2\2TU\7\r\2\2UV\7\17\2\2V\27\3\2\2\2W\\"+
		"\7\17\2\2XY\7\r\2\2Y[\7\17\2\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2"+
		"\2]\31\3\2\2\2^\\\3\2\2\2\n\35\"+\628@H\\";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}