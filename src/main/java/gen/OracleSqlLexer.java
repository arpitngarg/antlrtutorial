// Generated from gen\OracleSql.g4 by ANTLR 4.7.1
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
public class OracleSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMMA=5, WHITESPACE=6, IDENTIFIER=7, CRLF=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "LETTER", "COMMA", "WHITESPACE", "IDENTIFIER", 
		"CRLF"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'select'", "'FROM'", "'from'", "','", "' '", null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "COMMA", "WHITESPACE", "IDENTIFIER", "CRLF"
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


	public OracleSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OracleSql.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n:\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\6\t\65\n\t\r\t\16\t\66"+
		"\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\3\2\3\5\2\62;"+
		"C\\c|\29\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\34\3\2\2\2\7#\3\2"+
		"\2\2\t(\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\64\3\2\2\2\23"+
		"8\3\2\2\2\25\26\7U\2\2\26\27\7G\2\2\27\30\7N\2\2\30\31\7G\2\2\31\32\7"+
		"E\2\2\32\33\7V\2\2\33\4\3\2\2\2\34\35\7u\2\2\35\36\7g\2\2\36\37\7n\2\2"+
		"\37 \7g\2\2 !\7e\2\2!\"\7v\2\2\"\6\3\2\2\2#$\7H\2\2$%\7T\2\2%&\7Q\2\2"+
		"&\'\7O\2\2\'\b\3\2\2\2()\7h\2\2)*\7t\2\2*+\7q\2\2+,\7o\2\2,\n\3\2\2\2"+
		"-.\t\2\2\2.\f\3\2\2\2/\60\7.\2\2\60\16\3\2\2\2\61\62\7\"\2\2\62\20\3\2"+
		"\2\2\63\65\5\13\6\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67\22\3\2\2\289\7=\2\29\24\3\2\2\2\4\2\66\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}