grammar newg;

@header {
package assignment;
import java.util.HashMap;
import java.util.Scanner;  
}

@lexer::header {
package expressionparser;
}
@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
}

prog:   stat+ ;
                
stat:   expr NEWLINE {System.out.println($expr.value);}
    |   ID '=' expr NEWLINE
        {memory.put($ID.text, new Integer($expr.value));}
    |   NEWLINE {System.out.println("A newline has been issued");}
    |   'INTEGER' NEWID NEWLINE
    |   'INPUT' inputFun NEWLINE
    |  'PRINT' stringDisplay {System.out.println($stringDisplay.text.replace("\"",""));} NEWLINE
    ;
    
stringDisplay returns [String value]:	
    e=STRING {$value = $e.toString();}
;    
    
inputFun :	
	 NEWID
        {
        String temp = $NEWID.text;
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
;    

expr returns [int value]
    :   e=multExpr {$value = $e.value;}
        (   '+' e=multExpr {$value += $e.value;   }
        |   '-' e=multExpr {$value -= $e.value;}
        )*
    ;

multExpr returns [int value]
    :   e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*
    ; 

atom returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v!=null ) $value = v.intValue();
        else System.err.println("undefined variable "+$ID.text);
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;

ID  :   ('a'..'z'|'A'..'Z')+ ;
INT :   '0'..'9'+ ;
NEWLINE:'\r'? '\n' ;
WS  :   (' '|'\t')+ {skip();} ;
NEWID 	:   (('a'..'z'|'A'..'Z')+ ','*)+; 
STRING 	: '"' (~('\\'|'"'))* '"';