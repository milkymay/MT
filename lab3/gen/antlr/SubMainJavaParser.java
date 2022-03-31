// Generated from C:/Users/melis/Desktop/MT/lab3/src/main/java/antlr\SubMainJava.g4 by ANTLR 4.9.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SubMainJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, T=2, LPAREN=3, RPAREN=4, RPAREN_SEM=5, IF=6, WHILE=7, ELSE=8, PSVM=9, 
		PACKAGE=10, CLASS=11, LFB=12, RFB=13, SEM=14, COMP=15, EQ=16, COMA=17, 
		SIGN=18, SOUT=19, TESTS=20, TEST=21, NUM=22, N=23;
	public static final int
		RULE_s = 0, RULE_package_info = 1, RULE_class_info = 2, RULE_b = 3, RULE_args = 4, 
		RULE_ns = 5, RULE_z = 6, RULE_ops = 7, RULE_eq = 8, RULE_as = 9, RULE_expr = 10, 
		RULE_if_block = 11, RULE_while_block = 12, RULE_souts = 13, RULE_q = 14, 
		RULE_cond = 15, RULE_type = 16, RULE_name = 17, RULE_num = 18, RULE_comp = 19, 
		RULE_sign = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "package_info", "class_info", "b", "args", "ns", "z", "ops", "eq", 
			"as", "expr", "if_block", "while_block", "souts", "q", "cond", "type", 
			"name", "num", "comp", "sign"
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

	@Override
	public String getGrammarFileName() { return "SubMainJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SubMainJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Package_infoContext package_info() {
			return getRuleContext(Package_infoContext.class,0);
		}
		public Class_infoContext class_info() {
			return getRuleContext(Class_infoContext.class,0);
		}
		public TerminalNode PSVM() { return getToken(SubMainJavaParser.PSVM, 0); }
		public TerminalNode LFB() { return getToken(SubMainJavaParser.LFB, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public List<TerminalNode> RFB() { return getTokens(SubMainJavaParser.RFB); }
		public TerminalNode RFB(int i) {
			return getToken(SubMainJavaParser.RFB, i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			package_info();
			setState(43);
			class_info();
			setState(44);
			match(PSVM);
			setState(45);
			match(LFB);
			setState(46);
			b();
			setState(47);
			match(RFB);
			setState(48);
			match(RFB);
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

	public static class Package_infoContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(SubMainJavaParser.PACKAGE, 0); }
		public TerminalNode TESTS() { return getToken(SubMainJavaParser.TESTS, 0); }
		public TerminalNode SEM() { return getToken(SubMainJavaParser.SEM, 0); }
		public Package_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterPackage_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitPackage_info(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitPackage_info(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_infoContext package_info() throws RecognitionException {
		Package_infoContext _localctx = new Package_infoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_package_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(PACKAGE);
			setState(51);
			match(TESTS);
			setState(52);
			match(SEM);
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

	public static class Class_infoContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SubMainJavaParser.CLASS, 0); }
		public TerminalNode TEST() { return getToken(SubMainJavaParser.TEST, 0); }
		public TerminalNode LFB() { return getToken(SubMainJavaParser.LFB, 0); }
		public Class_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterClass_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitClass_info(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitClass_info(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_infoContext class_info() throws RecognitionException {
		Class_infoContext _localctx = new Class_infoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_info);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(CLASS);
			setState(55);
			match(TEST);
			setState(56);
			match(LFB);
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

	public static class BContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public SoutsContext souts() {
			return getRuleContext(SoutsContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			args();
			setState(59);
			ops();
			setState(60);
			souts();
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NsContext ns() {
			return getRuleContext(NsContext.class,0);
		}
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public TerminalNode SEM() { return getToken(SubMainJavaParser.SEM, 0); }
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			name();
			setState(64);
			ns();
			setState(65);
			z();
			setState(66);
			match(SEM);
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

	public static class NsContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(SubMainJavaParser.COMA, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NsContext ns() {
			return getRuleContext(NsContext.class,0);
		}
		public NsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterNs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitNs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitNs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NsContext ns() throws RecognitionException {
		NsContext _localctx = new NsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ns);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEM:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(COMA);
				setState(70);
				name();
				setState(71);
				ns();
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

	public static class ZContext extends ParserRuleContext {
		public TerminalNode SEM() { return getToken(SubMainJavaParser.SEM, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NsContext ns() {
			return getRuleContext(NsContext.class,0);
		}
		public ZContext z() {
			return getRuleContext(ZContext.class,0);
		}
		public ZContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_z; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterZ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitZ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitZ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ZContext z() throws RecognitionException {
		ZContext _localctx = new ZContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_z);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(SEM);
				setState(77);
				type();
				setState(78);
				name();
				setState(79);
				ns();
				setState(80);
				z();
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

	public static class OpsContext extends ParserRuleContext {
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public EqContext eq() {
			return getRuleContext(EqContext.class,0);
		}
		public AsContext as() {
			return getRuleContext(AsContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitOps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitOps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ops);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RFB:
			case SOUT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case IF:
			case WHILE:
			case N:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(85);
					eq();
					}
					break;
				case 2:
					{
					setState(86);
					as();
					}
					break;
				case 3:
					{
					setState(87);
					if_block();
					}
					break;
				case 4:
					{
					setState(88);
					while_block();
					}
					break;
				}
				setState(91);
				ops();
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

	public static class EqContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SubMainJavaParser.EQ, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode SEM() { return getToken(SubMainJavaParser.SEM, 0); }
		public EqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqContext eq() throws RecognitionException {
		EqContext _localctx = new EqContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_eq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			name();
			setState(96);
			match(EQ);
			setState(97);
			expr();
			setState(98);
			sign();
			setState(99);
			expr();
			setState(100);
			match(SEM);
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

	public static class AsContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SubMainJavaParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEM() { return getToken(SubMainJavaParser.SEM, 0); }
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitAs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitAs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_as);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			name();
			setState(103);
			match(EQ);
			setState(104);
			expr();
			setState(105);
			match(SEM);
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

	public static class ExprContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case N:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				name();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				num();
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SubMainJavaParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(SubMainJavaParser.LPAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SubMainJavaParser.RPAREN, 0); }
		public List<TerminalNode> LFB() { return getTokens(SubMainJavaParser.LFB); }
		public TerminalNode LFB(int i) {
			return getToken(SubMainJavaParser.LFB, i);
		}
		public List<OpsContext> ops() {
			return getRuleContexts(OpsContext.class);
		}
		public OpsContext ops(int i) {
			return getRuleContext(OpsContext.class,i);
		}
		public List<TerminalNode> RFB() { return getTokens(SubMainJavaParser.RFB); }
		public TerminalNode RFB(int i) {
			return getToken(SubMainJavaParser.RFB, i);
		}
		public TerminalNode ELSE() { return getToken(SubMainJavaParser.ELSE, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitIf_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitIf_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_block);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(IF);
				setState(112);
				match(LPAREN);
				setState(113);
				cond();
				setState(114);
				match(RPAREN);
				setState(115);
				match(LFB);
				setState(116);
				ops();
				setState(117);
				match(RFB);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(IF);
				setState(120);
				match(LPAREN);
				setState(121);
				cond();
				setState(122);
				match(RPAREN);
				setState(123);
				match(LFB);
				setState(124);
				ops();
				setState(125);
				match(RFB);
				setState(126);
				match(ELSE);
				setState(127);
				match(LFB);
				setState(128);
				ops();
				setState(129);
				match(RFB);
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SubMainJavaParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(SubMainJavaParser.LPAREN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SubMainJavaParser.RPAREN, 0); }
		public TerminalNode LFB() { return getToken(SubMainJavaParser.LFB, 0); }
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public TerminalNode RFB() { return getToken(SubMainJavaParser.RFB, 0); }
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitWhile_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitWhile_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHILE);
			setState(134);
			match(LPAREN);
			setState(135);
			cond();
			setState(136);
			match(RPAREN);
			setState(137);
			match(LFB);
			setState(138);
			ops();
			setState(139);
			match(RFB);
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

	public static class SoutsContext extends ParserRuleContext {
		public TerminalNode SOUT() { return getToken(SubMainJavaParser.SOUT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAREN_SEM() { return getToken(SubMainJavaParser.RPAREN_SEM, 0); }
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public SoutsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_souts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterSouts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitSouts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitSouts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoutsContext souts() throws RecognitionException {
		SoutsContext _localctx = new SoutsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_souts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(SOUT);
			setState(142);
			name();
			setState(143);
			match(RPAREN_SEM);
			setState(144);
			q();
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

	public static class QContext extends ParserRuleContext {
		public TerminalNode SOUT() { return getToken(SubMainJavaParser.SOUT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode RPAREN_SEM() { return getToken(SubMainJavaParser.RPAREN_SEM, 0); }
		public QContext q() {
			return getRuleContext(QContext.class,0);
		}
		public QContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_q; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QContext q() throws RecognitionException {
		QContext _localctx = new QContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_q);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RFB:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case SOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(SOUT);
				setState(148);
				name();
				setState(149);
				match(RPAREN_SEM);
				setState(150);
				q();
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

	public static class CondContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cond);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				name();
				setState(155);
				comp();
				setState(156);
				num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				num();
				setState(159);
				comp();
				setState(160);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				name();
				setState(163);
				comp();
				setState(164);
				name();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(SubMainJavaParser.T, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode N() { return getToken(SubMainJavaParser.N, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(N);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SubMainJavaParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(NUM);
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode COMP() { return getToken(SubMainJavaParser.COMP, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(COMP);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode SIGN() { return getToken(SubMainJavaParser.SIGN, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubMainJavaListener ) ((SubMainJavaListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SubMainJavaVisitor ) return ((SubMainJavaVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(SIGN);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bU\n\b"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\5\fp\n\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0086\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u009b\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00a9\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\2\2\u00aa\2,\3\2\2\2\4\64\3\2\2\2\68\3\2\2\2\b<"+
		"\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16T\3\2\2\2\20_\3\2\2\2\22a\3\2\2\2\24"+
		"h\3\2\2\2\26o\3\2\2\2\30\u0085\3\2\2\2\32\u0087\3\2\2\2\34\u008f\3\2\2"+
		"\2\36\u009a\3\2\2\2 \u00a8\3\2\2\2\"\u00aa\3\2\2\2$\u00ac\3\2\2\2&\u00ae"+
		"\3\2\2\2(\u00b0\3\2\2\2*\u00b2\3\2\2\2,-\5\4\3\2-.\5\6\4\2./\7\13\2\2"+
		"/\60\7\16\2\2\60\61\5\b\5\2\61\62\7\17\2\2\62\63\7\17\2\2\63\3\3\2\2\2"+
		"\64\65\7\f\2\2\65\66\7\26\2\2\66\67\7\20\2\2\67\5\3\2\2\289\7\r\2\29:"+
		"\7\27\2\2:;\7\16\2\2;\7\3\2\2\2<=\5\n\6\2=>\5\20\t\2>?\5\34\17\2?\t\3"+
		"\2\2\2@A\5\"\22\2AB\5$\23\2BC\5\f\7\2CD\5\16\b\2DE\7\20\2\2E\13\3\2\2"+
		"\2FL\3\2\2\2GH\7\23\2\2HI\5$\23\2IJ\5\f\7\2JL\3\2\2\2KF\3\2\2\2KG\3\2"+
		"\2\2L\r\3\2\2\2MU\3\2\2\2NO\7\20\2\2OP\5\"\22\2PQ\5$\23\2QR\5\f\7\2RS"+
		"\5\16\b\2SU\3\2\2\2TM\3\2\2\2TN\3\2\2\2U\17\3\2\2\2V`\3\2\2\2W\\\5\22"+
		"\n\2X\\\5\24\13\2Y\\\5\30\r\2Z\\\5\32\16\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2"+
		"\2[Z\3\2\2\2\\]\3\2\2\2]^\5\20\t\2^`\3\2\2\2_V\3\2\2\2_[\3\2\2\2`\21\3"+
		"\2\2\2ab\5$\23\2bc\7\22\2\2cd\5\26\f\2de\5*\26\2ef\5\26\f\2fg\7\20\2\2"+
		"g\23\3\2\2\2hi\5$\23\2ij\7\22\2\2jk\5\26\f\2kl\7\20\2\2l\25\3\2\2\2mp"+
		"\5$\23\2np\5&\24\2om\3\2\2\2on\3\2\2\2p\27\3\2\2\2qr\7\b\2\2rs\7\5\2\2"+
		"st\5 \21\2tu\7\6\2\2uv\7\16\2\2vw\5\20\t\2wx\7\17\2\2x\u0086\3\2\2\2y"+
		"z\7\b\2\2z{\7\5\2\2{|\5 \21\2|}\7\6\2\2}~\7\16\2\2~\177\5\20\t\2\177\u0080"+
		"\7\17\2\2\u0080\u0081\7\n\2\2\u0081\u0082\7\16\2\2\u0082\u0083\5\20\t"+
		"\2\u0083\u0084\7\17\2\2\u0084\u0086\3\2\2\2\u0085q\3\2\2\2\u0085y\3\2"+
		"\2\2\u0086\31\3\2\2\2\u0087\u0088\7\t\2\2\u0088\u0089\7\5\2\2\u0089\u008a"+
		"\5 \21\2\u008a\u008b\7\6\2\2\u008b\u008c\7\16\2\2\u008c\u008d\5\20\t\2"+
		"\u008d\u008e\7\17\2\2\u008e\33\3\2\2\2\u008f\u0090\7\25\2\2\u0090\u0091"+
		"\5$\23\2\u0091\u0092\7\7\2\2\u0092\u0093\5\36\20\2\u0093\35\3\2\2\2\u0094"+
		"\u009b\3\2\2\2\u0095\u0096\7\25\2\2\u0096\u0097\5$\23\2\u0097\u0098\7"+
		"\7\2\2\u0098\u0099\5\36\20\2\u0099\u009b\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u0095\3\2\2\2\u009b\37\3\2\2\2\u009c\u009d\5$\23\2\u009d\u009e\5(\25"+
		"\2\u009e\u009f\5&\24\2\u009f\u00a9\3\2\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a2"+
		"\5(\25\2\u00a2\u00a3\5$\23\2\u00a3\u00a9\3\2\2\2\u00a4\u00a5\5$\23\2\u00a5"+
		"\u00a6\5(\25\2\u00a6\u00a7\5$\23\2\u00a7\u00a9\3\2\2\2\u00a8\u009c\3\2"+
		"\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9!\3\2\2\2\u00aa\u00ab"+
		"\7\4\2\2\u00ab#\3\2\2\2\u00ac\u00ad\7\31\2\2\u00ad%\3\2\2\2\u00ae\u00af"+
		"\7\30\2\2\u00af\'\3\2\2\2\u00b0\u00b1\7\21\2\2\u00b1)\3\2\2\2\u00b2\u00b3"+
		"\7\24\2\2\u00b3+\3\2\2\2\nKT[_o\u0085\u009a\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}