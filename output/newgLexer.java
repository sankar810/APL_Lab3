// $ANTLR 3.5.1 I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g 2017-10-25 21:50:29

package expressionparser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class newgLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWID=6;
	public static final int NEWLINE=7;
	public static final int STRING=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public newgLexer() {} 
	public newgLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public newgLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:6:7: ( '(' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:6:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:7:7: ( ')' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:7:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:8:7: ( '*' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:8:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:9:7: ( '+' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:9:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:10:7: ( '-' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:10:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:11:7: ( '=' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:12:7: ( 'INPUT' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:12:9: 'INPUT'
			{
			match("INPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:13:7: ( 'INTEGER' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:13:9: 'INTEGER'
			{
			match("INTEGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:14:7: ( 'PRINT' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:14:9: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:88:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:88:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:88:9: ( 'a' .. 'z' | 'A' .. 'Z' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:89:5: ( ( '0' .. '9' )+ )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:89:9: ( '0' .. '9' )+
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:89:9: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:90:8: ( ( '\\r' )? '\\n' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:90:9: ( '\\r' )? '\\n'
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:90:9: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:90:9: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:91:5: ( ( ' ' | '\\t' )+ )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:91:9: ( ' ' | '\\t' )+
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:91:9: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "NEWID"
	public final void mNEWID() throws RecognitionException {
		try {
			int _type = NEWID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:8: ( ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( ',' )* )+ )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:12: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( ',' )* )+
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:12: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ ( ',' )* )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:13: ( 'a' .. 'z' | 'A' .. 'Z' )+ ( ',' )*
					{
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:13: ( 'a' .. 'z' | 'A' .. 'Z' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:
							{
							if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:34: ( ',' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==',') ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:92:34: ','
							{
							match(','); 
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWID"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:93:9: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:93:11: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:93:15: (~ ( '\\\\' | '\"' ) )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '[')||(LA8_0 >= ']' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	@Override
	public void mTokens() throws RecognitionException {
		// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | ID | INT | NEWLINE | WS | NEWID | STRING )
		int alt9=15;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:64: ID
				{
				mID(); 

				}
				break;
			case 11 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:67: INT
				{
				mINT(); 

				}
				break;
			case 12 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:71: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 13 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:79: WS
				{
				mWS(); 

				}
				break;
			case 14 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:82: NEWID
				{
				mNEWID(); 

				}
				break;
			case 15 :
				// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:1:88: STRING
				{
				mSTRING(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\7\uffff\3\17\4\uffff\1\17\2\uffff\7\17\1\33\1\17\1\35\1\uffff\1\17\1"+
		"\uffff\1\37\1\uffff";
	static final String DFA9_eofS =
		"\40\uffff";
	static final String DFA9_minS =
		"\1\11\6\uffff\3\54\4\uffff\1\54\2\uffff\12\54\1\uffff\1\54\1\uffff\1\54"+
		"\1\uffff";
	static final String DFA9_maxS =
		"\1\172\6\uffff\3\172\4\uffff\1\172\2\uffff\12\172\1\uffff\1\172\1\uffff"+
		"\1\172\1\uffff";
	static final String DFA9_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\3\uffff\1\13\1\14\1\15\1\17\1\uffff\1"+
		"\12\1\16\12\uffff\1\7\1\uffff\1\11\1\uffff\1\10";
	static final String DFA9_specialS =
		"\40\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\14\1\13\2\uffff\1\13\22\uffff\1\14\1\uffff\1\15\5\uffff\1\1\1\2\1"+
			"\3\1\4\1\uffff\1\5\2\uffff\12\12\3\uffff\1\6\3\uffff\10\11\1\7\6\11\1"+
			"\10\12\11\6\uffff\32\11",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\20\24\uffff\15\11\1\16\14\11\6\uffff\32\11",
			"\1\20\24\uffff\21\11\1\21\10\11\6\uffff\32\11",
			"\1\20\24\uffff\32\11\6\uffff\32\11",
			"",
			"",
			"",
			"",
			"\1\20\24\uffff\17\11\1\22\3\11\1\23\6\11\6\uffff\32\11",
			"",
			"",
			"\1\20\24\uffff\10\11\1\24\21\11\6\uffff\32\11",
			"\1\20\24\uffff\24\11\1\25\5\11\6\uffff\32\11",
			"\1\20\24\uffff\4\11\1\26\25\11\6\uffff\32\11",
			"\1\20\24\uffff\15\11\1\27\14\11\6\uffff\32\11",
			"\1\20\24\uffff\23\11\1\30\6\11\6\uffff\32\11",
			"\1\20\24\uffff\6\11\1\31\23\11\6\uffff\32\11",
			"\1\20\24\uffff\23\11\1\32\6\11\6\uffff\32\11",
			"\1\20\24\uffff\32\11\6\uffff\32\11",
			"\1\20\24\uffff\4\11\1\34\25\11\6\uffff\32\11",
			"\1\20\24\uffff\32\11\6\uffff\32\11",
			"",
			"\1\20\24\uffff\21\11\1\36\10\11\6\uffff\32\11",
			"",
			"\1\20\24\uffff\32\11\6\uffff\32\11",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | ID | INT | NEWLINE | WS | NEWID | STRING );";
		}
	}

}
