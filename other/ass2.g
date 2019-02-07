grammar ass2;

@header {
package assignment;
import java.util.*;
import java.lang.*;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog:   statement+ ;

statement:
'INTEGER' IDEN
	 {
		if(!memory.containsKey($IDEN.text))
		{
            memory.put($IDEN.text,null);
        }
        else
        {
			System.out.println($IDEN.text+" duplicates not allowed");
            System.exit(0);
		}
	 }
	 (',' IDEN
	 {
     		if(!memory.containsKey($IDEN.text))
     		{
                 memory.put($IDEN.text,null);
             }
             else
             {
     			System.out.println($IDEN.text+" duplicates not allowed");
                 System.exit(0);
     		}
     })*
	 NEWLINE?

| 'END' {System.exit(0);}

|'LET' IDEN '=' exprsn NEWLINE?
	 {
		if(memory.containsKey($IDEN.text))
		{
             memory.put($IDEN.text,new Integer($exprsn.value));
        }
        else
        {
             System.out.println($IDEN.text +" is undefined");
             System.exit(0);
        }
     }

| COMMENT NEWLINE

| 'INPUT' IDEN
    {
	    Scanner ipscan=new Scanner(System.in);
        System.out.println("Enter value for "+$IDEN.text+" ");
        String ip=ipscan.nextLine();
        if(!memory.containsKey($IDEN.text))
	    {
	        System.out.println($IDEN.text+ " is undefined");
        }
        else
        {
           memory.put($IDEN.text,new Integer(ip));
        }
    }
    (',' IDEN
    {
    	    Scanner iptscan=new Scanner(System.in);
            System.out.println("Enter value for "+$IDEN.text+" ");
            String ipt=iptscan.nextLine();
            if(!memory.containsKey($IDEN.text))
    	    {
    	        System.out.println($IDEN.text+ " is undefined");
            }
            else
            {
               memory.put($IDEN.text,new Integer(ipt));
            }
    })*
    NEWLINE?

| 'PRINT' (exprsn|SLIT) NEWLINE?
  	{
  		if($SLIT.text==null)
  		{
  		     System.out.print($exprsn.value);
  		}
  		else
  		{
  		      String data1=$SLIT.text.substring(1,$SLIT.text.length()-1);
          	  System.out.print(data1);
          }
  	}

| 'PRINTLN' (exprsn|SLIT) NEWLINE?
  	{
  		if($SLIT.text==null)
          		{
          		     System.out.println($exprsn.value);
          		}
          		else
          		{
          		      String data2=$SLIT.text.substring(1,$SLIT.text.length()-1);
                  	  System.out.println(data2);
                  }
  	}

| exprsn NEWLINE? {System.out.println($exprsn.value);}
|   IDEN '=' exprsn NEWLINE?
        {memory.put($IDEN.text, new Integer($exprsn.value));}
|   NEWLINE {System.out.println("Newline provided");};

exprsn returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;}
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    ;

multExpr returns [int value]
    :   e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*
    ;

atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   IDEN
        {
        Integer v = (Integer)memory.get($IDEN.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$IDEN.text);
        }
    |   '(' exprsn ')' {$value = $exprsn.value;}
    ;

COMMENT : ('//' ~['\r''\n']*) {skip();};
NEWLINE : '\r'? '\n';
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
INT :   '-'?[0-9]+ ;
SLIT :   ('"'(.)+?'"');
IDEN  :   ['A'..'Z'|'a'..'z']+ ['A'..'Z'|'a'..'z'|'0'..'9'_]* ;


