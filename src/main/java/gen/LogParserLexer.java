// Generated from gen\LogParser.g4 by ANTLR 4.7.1
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, YEAR=5, MONTH=6, DAY=7, DATE=8, TIME=9, 
		TEXT=10, CRLF=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "DIGIT", "TWODIGIT", "LETTER", "YEAR", 
		"MONTH", "DAY", "DATE", "TIME", "TEXT", "CRLF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'ERROR'", "'INFO'", "'DEBUG'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "YEAR", "MONTH", "DAY", "DATE", "TIME", 
		"TEXT", "CRLF"
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


	public LogParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LogParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rZ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\6\16P\n\16\r\16\16\16Q\3\17\5\17U\n\17\3\17"+
		"\3\17\5\17Y\n\17\2\2\20\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\7\23\b\25\t\27"+
		"\n\31\13\33\f\35\r\3\2\4\3\2\62;\4\2C\\c|\2Y\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7"+
		"\'\3\2\2\2\t,\3\2\2\2\13\62\3\2\2\2\r\64\3\2\2\2\17\67\3\2\2\2\219\3\2"+
		"\2\2\23<\3\2\2\2\25@\3\2\2\2\27B\3\2\2\2\31H\3\2\2\2\33O\3\2\2\2\35X\3"+
		"\2\2\2\37 \7\"\2\2 \4\3\2\2\2!\"\7G\2\2\"#\7T\2\2#$\7T\2\2$%\7Q\2\2%&"+
		"\7T\2\2&\6\3\2\2\2\'(\7K\2\2()\7P\2\2)*\7H\2\2*+\7Q\2\2+\b\3\2\2\2,-\7"+
		"F\2\2-.\7G\2\2./\7D\2\2/\60\7W\2\2\60\61\7I\2\2\61\n\3\2\2\2\62\63\t\2"+
		"\2\2\63\f\3\2\2\2\64\65\5\13\6\2\65\66\5\13\6\2\66\16\3\2\2\2\678\t\3"+
		"\2\28\20\3\2\2\29:\5\r\7\2:;\5\r\7\2;\22\3\2\2\2<=\5\17\b\2=>\5\17\b\2"+
		">?\5\17\b\2?\24\3\2\2\2@A\5\r\7\2A\26\3\2\2\2BC\5\21\t\2CD\7/\2\2DE\5"+
		"\23\n\2EF\7/\2\2FG\5\25\13\2G\30\3\2\2\2HI\5\r\7\2IJ\7<\2\2JK\5\r\7\2"+
		"KL\7<\2\2LM\5\r\7\2M\32\3\2\2\2NP\5\17\b\2ON\3\2\2\2PQ\3\2\2\2QO\3\2\2"+
		"\2QR\3\2\2\2R\34\3\2\2\2SU\7\17\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VY\7"+
		"\f\2\2WY\7t\2\2XT\3\2\2\2XW\3\2\2\2Y\36\3\2\2\2\6\2QTX\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}