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
'INTEGER' IDENT
	 {
		if(!memory.containsKey($IDENT.text))
		{
            memory.put($IDENT.text,null);
        }
        else
        {
			System.out.println($IDENT.text+" duplicates not allowed");
            System.exit(0);
		}
	 }
	 (',' IDENT
	 {
     		if(!memory.containsKey($IDENT.text))
     		{
                 memory.put($IDENT.text,null);
             }
             else
             {
     			System.out.println($IDENT.text+" duplicates not allowed");
                 System.exit(0);
     		}
     })*
	 NEWLINE?

| 'END' {System.exit(0);}

|'LET' IDENT '=' exprsn NEWLINE?
	 {
		if(memory.containsKey($IDENT.text))
		{
             memory.put($IDENT.text,new Integer($exprsn.value));
        }
        else
        {
             System.out.println($IDENT.text +" is undefined");
             System.exit(0);
        }
     }

| COMMENT NEWLINE

| 'INPUT' IDENT
    {
	    Scanner ipscan=new Scanner(System.in);
        System.out.println("Enter value for "+$IDENT.text+" ");
        String ip=ipscan.nextLine();
        if(!memory.containsKey($IDENT.text))
	    {
	        System.out.println($IDENT.text+ " is undefined");
        }
        else
        {
           memory.put($IDENT.text,new Integer(ip));
        }
    }
    (',' IDENT
    {
    	    Scanner iptscan=new Scanner(System.in);
            System.out.println("Enter value for "+$IDENT.text+" ");
            String ipt=iptscan.nextLine();
            if(!memory.containsKey($IDENT.text))
    	    {
    	        System.out.println($IDENT.text+ " is undefined");
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
|   IDENT '=' exprsn NEWLINE?
        {memory.put($IDENT.text, new Integer($exprsn.value));}
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
    |   IDENT
        {
        Integer v = (Integer)memory.get($IDENT.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$IDEN.text);
        }
    |   '(' exprsn ')' {$value = $exprsn.value;}
    ;


NEWLINE : '\r'? '\n';
IDENT  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
COMMENT : ('//' ~('\r''\n')*) {skip();};
WS  :   (' '|'\t'|'\n'|'\r')+ {skip();} ;
INT :   '0'..'9'+ ;
SLIT :   ('"'(.)+'"');



