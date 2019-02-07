grammar SIL;

@header {
package grammar;
import java.util.HashMap;
}


@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();

}

prog 	:	stat+;
stat	:(       print  // PRINT RULE which will print the output no CR LF
               | println  //PRINTLN RULE which will print the output CR LF
 )*
          'END'
          ;
print 	:	'PRINT' '(' 
            (
               ex = expr
               {
                 System.out.print($ex.value);
               }
               |
                ey = literal
               {
               String z=$ey.text.toString().replaceAll("^\"|\"$",  ""); 
               System.out.print(z); 
               }
            )
 ')'
 ;   
 println :
 	'PRINTLN' '('
 	(
 	   e1=expr
 	   {
 	   
 	   System.out.println($e1.value);
 	   }
 	   |  
 	    e2=literal
 	   {
 	   String z=$e2.text.toString().replaceAll("^\"|\"$",   ""); 
 	   System.out.flush();
               System.out.println(z); 
 	   }
 	)
               ')'	
 	;
expr returns [int value]

: e=multExpr {$value = $e.value;}

( '+' e=multExpr {$value += $e.value; }   //addition

| '-' e=multExpr {$value -= $e.value;}   //subtraction

)*

;      
multExpr returns [int value]

: e=atom {$value = $e.value;} ('*' e=atom {$value *= $e.value;})*    //multiplication

;
atom returns [int value]

: INT {$value = Integer.parseInt($INT.text);}

| ID

{

Integer v = (Integer)memory.get($ID.text);

if ( v!=null ) $value = v.intValue();

else System.err.println("undefined variable "+$ID.text);

}

| '(' expr ')' {$value = $expr.value;}

;
literal : //string literals should be specified between " "
        '"'
         (
          '"' 
          | ~('"')
         )*
        '"'
        ;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;



COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' 
    |   '/*''*/') 
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) 
    ;

