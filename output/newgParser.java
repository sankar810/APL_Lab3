// $ANTLR 3.5.1 I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g 2017-10-25 21:50:29

package assignment;
import java.util.HashMap;
import java.util.Scanner;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class newgParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWID", "NEWLINE", 
		"STRING", "WS", "'('", "')'", "'*'", "'+'", "'-'", "'='", "'INPUT'", "'INTEGER'", 
		"'PRINT'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public newgParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public newgParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return newgParser.tokenNames; }
	@Override public String getGrammarFileName() { return "I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();



	// $ANTLR start "prog"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:17:1: prog : ( stat )+ ;
	public final void prog() throws RecognitionException {
		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:17:5: ( ( stat )+ )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:17:9: ( stat )+
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:17:9: ( stat )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= ID && LA1_0 <= INT)||LA1_0==NEWLINE||LA1_0==10||(LA1_0 >= 16 && LA1_0 <= 18)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:17:9: stat
					{
					pushFollow(FOLLOW_stat_in_prog31);
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
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:19:1: stat : ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE | 'INTEGER' NEWID NEWLINE | 'INPUT' inputFun NEWLINE | 'PRINT' stringDisplay NEWLINE );
	public final void stat() throws RecognitionException {
		Token ID2=null;
		int expr1 =0;
		int expr3 =0;
		ParserRuleReturnScope stringDisplay4 =null;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:19:5: ( expr NEWLINE | ID '=' expr NEWLINE | NEWLINE | 'INTEGER' NEWID NEWLINE | 'INPUT' inputFun NEWLINE | 'PRINT' stringDisplay NEWLINE )
			int alt2=6;
			switch ( input.LA(1) ) {
			case INT:
			case 10:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==15) ) {
					alt2=2;
				}
				else if ( (LA2_2==NEWLINE||(LA2_2 >= 12 && LA2_2 <= 14)) ) {
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
			case 17:
				{
				alt2=4;
				}
				break;
			case 16:
				{
				alt2=5;
				}
				break;
			case 18:
				{
				alt2=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:19:9: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_stat58);
					expr1=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat60); 
					System.out.println(expr1);
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:20:9: ID '=' expr NEWLINE
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_stat72); 
					match(input,15,FOLLOW_15_in_stat74); 
					pushFollow(FOLLOW_expr_in_stat76);
					expr3=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat78); 
					memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));
					}
					break;
				case 3 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:22:9: NEWLINE
					{
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat98); 
					System.out.println("A newline has been issued");
					}
					break;
				case 4 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:23:9: 'INTEGER' NEWID NEWLINE
					{
					match(input,17,FOLLOW_17_in_stat110); 
					match(input,NEWID,FOLLOW_NEWID_in_stat112); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat114); 
					}
					break;
				case 5 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:24:9: 'INPUT' inputFun NEWLINE
					{
					match(input,16,FOLLOW_16_in_stat124); 
					pushFollow(FOLLOW_inputFun_in_stat126);
					inputFun();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat128); 
					}
					break;
				case 6 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:25:8: 'PRINT' stringDisplay NEWLINE
					{
					match(input,18,FOLLOW_18_in_stat137); 
					pushFollow(FOLLOW_stringDisplay_in_stat139);
					stringDisplay4=stringDisplay();
					state._fsp--;

					System.out.println((stringDisplay4!=null?input.toString(stringDisplay4.start,stringDisplay4.stop):null).replace("\"",""));
					match(input,NEWLINE,FOLLOW_NEWLINE_in_stat143); 
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


	public static class stringDisplay_return extends ParserRuleReturnScope {
		public String value;
	};


	// $ANTLR start "stringDisplay"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:28:1: stringDisplay returns [String value] : e= STRING ;
	public final newgParser.stringDisplay_return stringDisplay() throws RecognitionException {
		newgParser.stringDisplay_return retval = new newgParser.stringDisplay_return();
		retval.start = input.LT(1);

		Token e=null;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:28:37: (e= STRING )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:29:5: e= STRING
			{
			e=(Token)match(input,STRING,FOLLOW_STRING_in_stringDisplay170); 
			retval.value = e.toString();
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stringDisplay"



	// $ANTLR start "inputFun"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:32:1: inputFun : NEWID ;
	public final void inputFun() throws RecognitionException {
		Token NEWID5=null;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:32:10: ( NEWID )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:33:3: NEWID
			{
			NEWID5=(Token)match(input,NEWID,FOLLOW_NEWID_in_inputFun192); 

			        String temp = (NEWID5!=null?NEWID5.getText():null);
			        System.out.println("temp : "+temp);
			        System.out.println("Enter value of temp");
			        String[] identifiers = temp.split(",");
			        
			        
			        
			        Scanner sc=new Scanner(System.in); 
			        
			        int i = 0;
			        
			        while (sc.hasNext()){
			        String indentifier = identifiers[i];
			        memory.put(indentifier, new Integer(0));
			        
			        Integer v = (Integer)memory.get(indentifier);
			        if ( v!=null ) {
			        
			       
			         
			        v=sc.nextInt(); 
			        memory.put(indentifier, v);
			        System.out.println("identifiers : "+identifiers[i] + "\nvalue : "+v);
			        }
			        else System.err.println("undefined variable "+identifiers[i]);
			        i++;
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
	// $ANTLR end "inputFun"



	// $ANTLR start "expr"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:66:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:67:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:67:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr228);
			e=multExpr();
			state._fsp--;

			value = e;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:68:9: ( '+' e= multExpr | '-' e= multExpr )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==13) ) {
					alt3=1;
				}
				else if ( (LA3_0==14) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:68:13: '+' e= multExpr
					{
					match(input,13,FOLLOW_13_in_expr244); 
					pushFollow(FOLLOW_multExpr_in_expr248);
					e=multExpr();
					state._fsp--;

					value += e;   
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:69:13: '-' e= multExpr
					{
					match(input,14,FOLLOW_14_in_expr264); 
					pushFollow(FOLLOW_multExpr_in_expr268);
					e=multExpr();
					state._fsp--;

					value -= e;
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
	// $ANTLR end "expr"



	// $ANTLR start "multExpr"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:73:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:74:5: (e= atom ( '*' e= atom )* )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:74:9: e= atom ( '*' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr306);
			e=atom();
			state._fsp--;

			value = e;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:74:37: ( '*' e= atom )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==12) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:74:38: '*' e= atom
					{
					match(input,12,FOLLOW_12_in_multExpr311); 
					pushFollow(FOLLOW_atom_in_multExpr315);
					e=atom();
					state._fsp--;

					value *= e;
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
	// $ANTLR end "multExpr"



	// $ANTLR start "atom"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:77:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT6=null;
		Token ID7=null;
		int expr8 =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:78:5: ( INT | ID | '(' expr ')' )
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
			case 10:
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
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:78:9: INT
					{
					INT6=(Token)match(input,INT,FOLLOW_INT_in_atom343); 
					value = Integer.parseInt((INT6!=null?INT6.getText():null));
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:79:9: ID
					{
					ID7=(Token)match(input,ID,FOLLOW_ID_in_atom355); 

					        Integer v = (Integer)memory.get((ID7!=null?ID7.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("undefined variable "+(ID7!=null?ID7.getText():null));
					        
					}
					break;
				case 3 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\6th\\newg.g:85:9: '(' expr ')'
					{
					match(input,10,FOLLOW_10_in_atom375); 
					pushFollow(FOLLOW_expr_in_atom377);
					expr8=expr();
					state._fsp--;

					match(input,11,FOLLOW_11_in_atom379); 
					value = expr8;
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



	public static final BitSet FOLLOW_stat_in_prog31 = new BitSet(new long[]{0x00000000000704B2L});
	public static final BitSet FOLLOW_expr_in_stat58 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat60 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_stat72 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_stat74 = new BitSet(new long[]{0x0000000000000430L});
	public static final BitSet FOLLOW_expr_in_stat76 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWLINE_in_stat98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_stat110 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWID_in_stat112 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_stat124 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_inputFun_in_stat126 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_stat137 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_stringDisplay_in_stat139 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_NEWLINE_in_stat143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_stringDisplay170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEWID_in_inputFun192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr228 = new BitSet(new long[]{0x0000000000006002L});
	public static final BitSet FOLLOW_13_in_expr244 = new BitSet(new long[]{0x0000000000000430L});
	public static final BitSet FOLLOW_multExpr_in_expr248 = new BitSet(new long[]{0x0000000000006002L});
	public static final BitSet FOLLOW_14_in_expr264 = new BitSet(new long[]{0x0000000000000430L});
	public static final BitSet FOLLOW_multExpr_in_expr268 = new BitSet(new long[]{0x0000000000006002L});
	public static final BitSet FOLLOW_atom_in_multExpr306 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_multExpr311 = new BitSet(new long[]{0x0000000000000430L});
	public static final BitSet FOLLOW_atom_in_multExpr315 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_INT_in_atom343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_10_in_atom375 = new BitSet(new long[]{0x0000000000000430L});
	public static final BitSet FOLLOW_expr_in_atom377 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_atom379 = new BitSet(new long[]{0x0000000000000002L});
}
