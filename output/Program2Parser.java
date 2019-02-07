// $ANTLR 3.5.1 I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g 2017-10-26 14:46:19

package assignment;
import java.util.HashMap;
import java.util.Scanner;  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Program2Parser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NEWLINE", "STRING", 
		"WS", "'('", "')'", "'*'", "'+'", "'-'", "'='", "'END'", "'INPUT'", "'INTEGER'", 
		"'LET'", "'NEWLINE'", "'PRINT'", "'PRINTLN'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int ID=4;
	public static final int INT=5;
	public static final int NEWLINE=6;
	public static final int STRING=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Program2Parser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Program2Parser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return Program2Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g"; }


	/** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();



	// $ANTLR start "prog"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:14:1: prog : ( statement )+ end ;
	public final void prog() throws RecognitionException {
		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:14:5: ( ( statement )+ end )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:14:9: ( statement )+ end
			{
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:14:9: ( statement )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==15) ) {
					int LA1_1 = input.LA(2);
					if ( ((LA1_1 >= ID && LA1_1 <= INT)||LA1_1==9||(LA1_1 >= 15 && LA1_1 <= 21)) ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= ID && LA1_0 <= INT)||LA1_0==9||(LA1_0 >= 16 && LA1_0 <= 21)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:14:9: statement
					{
					pushFollow(FOLLOW_statement_in_prog23);
					statement();
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

			pushFollow(FOLLOW_end_in_prog26);
			end();
			state._fsp--;

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



	// $ANTLR start "statement"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:16:1: statement : ( expr NEWLINE | ID '=' expr NEWLINE | 'NEWLINE' | 'INTEGER' ID | 'INPUT' input | 'PRINT' print NEWLINE | 'PRINTLN' println NEWLINE | 'LET' ID '=' expr | 'END' );
	public final void statement() throws RecognitionException {
		Token ID2=null;
		Token ID5=null;
		int expr1 =0;
		int expr3 =0;
		ParserRuleReturnScope print4 =null;
		int expr6 =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:16:10: ( expr NEWLINE | ID '=' expr NEWLINE | 'NEWLINE' | 'INTEGER' ID | 'INPUT' input | 'PRINT' print NEWLINE | 'PRINTLN' println NEWLINE | 'LET' ID '=' expr | 'END' )
			int alt2=9;
			switch ( input.LA(1) ) {
			case INT:
			case 9:
				{
				alt2=1;
				}
				break;
			case ID:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==14) ) {
					alt2=2;
				}
				else if ( (LA2_2==NEWLINE||(LA2_2 >= 11 && LA2_2 <= 13)) ) {
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
			case 19:
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
			case 20:
				{
				alt2=6;
				}
				break;
			case 21:
				{
				alt2=7;
				}
				break;
			case 18:
				{
				alt2=8;
				}
				break;
			case 15:
				{
				alt2=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:16:14: expr NEWLINE
					{
					pushFollow(FOLLOW_expr_in_statement51);
					expr1=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement53); 
					System.out.println(expr1);
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:17:9: ID '=' expr NEWLINE
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_statement65); 
					match(input,14,FOLLOW_14_in_statement67); 
					pushFollow(FOLLOW_expr_in_statement69);
					expr3=expr();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement71); 
					memory.put((ID2!=null?ID2.getText():null), new Integer(expr3));
					}
					break;
				case 3 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:18:9: 'NEWLINE'
					{
					match(input,19,FOLLOW_19_in_statement83); 
					}
					break;
				case 4 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:19:9: 'INTEGER' ID
					{
					match(input,17,FOLLOW_17_in_statement93); 
					match(input,ID,FOLLOW_ID_in_statement95); 
					}
					break;
				case 5 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:20:9: 'INPUT' input
					{
					match(input,16,FOLLOW_16_in_statement106); 
					pushFollow(FOLLOW_input_in_statement108);
					input();
					state._fsp--;

					}
					break;
				case 6 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:21:9: 'PRINT' print NEWLINE
					{
					match(input,20,FOLLOW_20_in_statement119); 
					pushFollow(FOLLOW_print_in_statement121);
					print4=print();
					state._fsp--;

					System.out.println((print4!=null?input.toString(print4.start,print4.stop):null).replace("\"",""));
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement125); 
					}
					break;
				case 7 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:22:9: 'PRINTLN' println NEWLINE
					{
					match(input,21,FOLLOW_21_in_statement135); 
					pushFollow(FOLLOW_println_in_statement137);
					println();
					state._fsp--;

					System.out.println($print.text.replace("\"",""));
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statement141); 
					}
					break;
				case 8 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:23:9: 'LET' ID '=' expr
					{
					match(input,18,FOLLOW_18_in_statement151); 
					ID5=(Token)match(input,ID,FOLLOW_ID_in_statement153); 
					match(input,14,FOLLOW_14_in_statement155); 
					pushFollow(FOLLOW_expr_in_statement157);
					expr6=expr();
					state._fsp--;

					memory.put((ID5!=null?ID5.getText():null), new Integer(expr6));
					}
					break;
				case 9 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:24:9: 'END'
					{
					match(input,15,FOLLOW_15_in_statement169); 
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
	// $ANTLR end "statement"



	// $ANTLR start "end"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:27:1: end : 'END' ;
	public final void end() throws RecognitionException {
		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:27:5: ( 'END' )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:28:2: 'END'
			{
			match(input,15,FOLLOW_15_in_end193); 
			System.Exit(0);
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
	// $ANTLR end "end"


	public static class print_return extends ParserRuleReturnScope {
		public String value;
	};


	// $ANTLR start "print"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:31:1: print returns [String value] : e= STRING ;
	public final Program2Parser.print_return print() throws RecognitionException {
		Program2Parser.print_return retval = new Program2Parser.print_return();
		retval.start = input.LT(1);

		Token e=null;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:31:29: (e= STRING )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:32:2: e= STRING
			{
			e=(Token)match(input,STRING,FOLLOW_STRING_in_print216); 
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
	// $ANTLR end "print"



	// $ANTLR start "println"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:35:1: println returns [String value] : e= STRING ;
	public final String println() throws RecognitionException {
		String value = null;


		Token e=null;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:35:31: (e= STRING )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:36:9: e= STRING
			{
			e=(Token)match(input,STRING,FOLLOW_STRING_in_println245); 
			value = e.toString();
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
	// $ANTLR end "println"



	// $ANTLR start "input"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:39:1: input : ID ;
	public final void input() throws RecognitionException {
		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:39:7: ( ID )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:40:2: ID
			{
			match(input,ID,FOLLOW_ID_in_input274); 

			        String temp = $NEWID.text;
			        System.out.println("Enter a value");
			        String[] I = temp.split(",");
			        Scanner sc=new Scanner(System.in); 
			        int i = 0;
			        while (sc.hasNext()){
			        String idn = I[i];
			        memory.put(idn, new Integer(0));
			        Integer v = (Integer)memory.get(idn);
			        if ( v!=null ) {
			        v=sc.nextInt(); 
			        memory.put(idn, v);
			        System.out.println("Variable : "+I[i] + "\nvalue : "+v);
			        }
			        else System.err.println("undefined variable "+I[i]);
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
	// $ANTLR end "input"



	// $ANTLR start "expr"
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:63:1: expr returns [int value] : e= multExpr ( '+' e= multExpr | '-' e= multExpr )* ;
	public final int expr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:64:5: (e= multExpr ( '+' e= multExpr | '-' e= multExpr )* )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:64:9: e= multExpr ( '+' e= multExpr | '-' e= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr311);
			e=multExpr();
			state._fsp--;

			value = e;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:65:9: ( '+' e= multExpr | '-' e= multExpr )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==12) ) {
					alt3=1;
				}
				else if ( (LA3_0==13) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:65:13: '+' e= multExpr
					{
					match(input,12,FOLLOW_12_in_expr327); 
					pushFollow(FOLLOW_multExpr_in_expr331);
					e=multExpr();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:66:13: '-' e= multExpr
					{
					match(input,13,FOLLOW_13_in_expr347); 
					pushFollow(FOLLOW_multExpr_in_expr351);
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
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:70:1: multExpr returns [int value] : e= atom ( '*' e= atom )* ;
	public final int multExpr() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:71:5: (e= atom ( '*' e= atom )* )
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:71:9: e= atom ( '*' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr389);
			e=atom();
			state._fsp--;

			value = e;
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:71:37: ( '*' e= atom )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==11) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:71:38: '*' e= atom
					{
					match(input,11,FOLLOW_11_in_multExpr394); 
					pushFollow(FOLLOW_atom_in_multExpr398);
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
	// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:74:1: atom returns [int value] : ( INT | ID | '(' expr ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT7=null;
		Token ID8=null;
		int expr9 =0;

		try {
			// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:75:5: ( INT | ID | '(' expr ')' )
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
			case 9:
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
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:75:9: INT
					{
					INT7=(Token)match(input,INT,FOLLOW_INT_in_atom426); 
					value = Integer.parseInt((INT7!=null?INT7.getText():null));
					}
					break;
				case 2 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:76:9: ID
					{
					ID8=(Token)match(input,ID,FOLLOW_ID_in_atom438); 

					        Integer v = (Integer)memory.get((ID8!=null?ID8.getText():null));
					        if ( v!=null ) value = v.intValue();
					        else System.err.println("variable undefined "+(ID8!=null?ID8.getText():null));
					        
					}
					break;
				case 3 :
					// I:\\College\\Semester 1\\CECS 524 Advanced Topics in Programming Languages\\Lab Assignments\\5th\\output\\Program2.g:82:9: '(' expr ')'
					{
					match(input,9,FOLLOW_9_in_atom458); 
					pushFollow(FOLLOW_expr_in_atom460);
					expr9=expr();
					state._fsp--;

					match(input,10,FOLLOW_10_in_atom462); 
					value = expr9;
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



	public static final BitSet FOLLOW_statement_in_prog23 = new BitSet(new long[]{0x00000000003F8230L});
	public static final BitSet FOLLOW_end_in_prog26 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_statement51 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_statement53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_statement65 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_statement67 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expr_in_statement69 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_statement71 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_statement83 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_statement93 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_statement95 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_statement106 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_input_in_statement108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_statement119 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_print_in_statement121 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_statement125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_statement135 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_println_in_statement137 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_NEWLINE_in_statement141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_statement151 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_ID_in_statement153 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_statement155 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expr_in_statement157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_statement169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_end193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_print216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_println245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_input274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr311 = new BitSet(new long[]{0x0000000000003002L});
	public static final BitSet FOLLOW_12_in_expr327 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_multExpr_in_expr331 = new BitSet(new long[]{0x0000000000003002L});
	public static final BitSet FOLLOW_13_in_expr347 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_multExpr_in_expr351 = new BitSet(new long[]{0x0000000000003002L});
	public static final BitSet FOLLOW_atom_in_multExpr389 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_11_in_multExpr394 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_atom_in_multExpr398 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_INT_in_atom426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_atom458 = new BitSet(new long[]{0x0000000000000230L});
	public static final BitSet FOLLOW_expr_in_atom460 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_atom462 = new BitSet(new long[]{0x0000000000000002L});
}
