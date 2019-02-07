// $ANTLR 3.5.1 I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g 2017-10-25 22:44:26

package expressionparser;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "WS", 
		"'('", "')'", "'*'", "'+'", "'-'", "'='"
	};
	public static final int EOF=-1;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int WS=7;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public ExprParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return ExprParser.tokenNames; }
	@Override public String getGrammarFileName() { return "I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();



	// $ANTLR start "prog"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:13:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:13:5: ( ( stat )+ )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:13:9: ( stat )+
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:13:9: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= NEWLINE)||LA1_0==8) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:13:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog23);
					stat();
					state._fsp--;

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

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "stat"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:15:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE );
	public final void stat() throws RecognitionException {
		Token ID2=null;
		int expr1 =0;
		int expr3 =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:15:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE )
			int alt2=3;
			switch ( input.LA(1) ) {
			case INT:
			case 8:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==13) ) {
					alt2=2;
				}
				else if ( (LA2_2==NEWLINE||(LA2_2 >= 10 && LA2_2 <= 12)) ) {
					alt2=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NEWLINE:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:15:9: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_stat50);
					expr1=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat52); 
					System.out.println(expr1);
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:16:9: ID '=' expr NEWLINE
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_stat64); 
					match(input,13,FOLLOW_13_in_stat66); 
					pushFollow(FOLLOW_expr_in_stat68);
					expr3=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat70); 
					memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));
					}
					break;
				case 3 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:18:9: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat90); 
					System.out.println("A newline has been issued");
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "multExpr"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:20:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:21:5: (e= atom ( '*' e= atom )* )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:21:9: e= atom ( '*' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr116);
			e=atom();
			state._fsp--;

			value = e;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:21:37: ( '*' e= atom )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==10) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:21:38: '*' e= atom
					{
					match(input,10,FOLLOW_10_in_multExpr121); 
					pushFollow(FOLLOW_atom_in_multExpr125);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpr"



	// $ANTLR start "expr"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:25:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:26:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:26:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr164);
			e=multExpr();
			state._fsp--;

			value = e;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:27:9: ( '+' e= multExpr | '-' e= multExpr )*
			loop4:
			while (true) {
				int alt4=3;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}
				else if ( (LA4_0==12) ) {
					alt4=2;
				}

				switch (alt4) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:27:13: '+' e= multExpr
					{
					match(input,11,FOLLOW_11_in_expr180); 
					pushFollow(FOLLOW_multExpr_in_expr184);
					e=multExpr();
					state._fsp--;

					value += e;   
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:28:13: '-' e= multExpr
					{
					match(input,12,FOLLOW_12_in_expr200); 
					pushFollow(FOLLOW_multExpr_in_expr204);
					e=multExpr();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expr"



	// $ANTLR start "atom"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:34:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT4=null;
		Token ID5=null;
		int expr6 =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:35:5: ( INT | ID | '(' expr ')' )
			int alt5=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case ID:
				{
				alt5=2;
				}
				break;
			case 8:
				{
				alt5=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:35:9: INT
					{
					INT4=(Token)match(input,INT,FOLLOW_INT_in_atom242); 
					value = Integer.parseInt((INT4!=null?INT4.getText():null));
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:36:9: ID
					{
					ID5=(Token)match(input,ID,FOLLOW_ID_in_atom254); 

					        Integer v = (Integer)memory.get((ID5!=null?ID5.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID5!=null?ID5.getText():null));
					        
					}
					break;
				case 3 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Expr.g:42:9: '(' expr ')'
					{
					match(input,8,FOLLOW_8_in_atom274); 
					pushFollow(FOLLOW_expr_in_atom276);
					expr6=expr();
					state._fsp--;

					match(input,9,FOLLOW_9_in_atom278); 
					value = expr6;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_stat_in_prog23 = new BitSet(new long[]{0x0000000000000172L});
	public static final BitSet FOLLOW_expr_in_stat50 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat64 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_stat66 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_expr_in_stat68 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_stat70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat90 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_multExpr116 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_multExpr121 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_atom_in_multExpr125 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_multExpr_in_expr164 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_11_in_expr180 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_multExpr_in_expr184 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_12_in_expr200 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_multExpr_in_expr204 = new BitSet(new long[]{0x0000000000001802L});
	public static final BitSet FOLLOW_INT_in_atom242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_atom274 = new BitSet(new long[]{0x0000000000000130L});
	public static final BitSet FOLLOW_expr_in_atom276 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_atom278 = new BitSet(new long[]{0x0000000000000002L});
}
