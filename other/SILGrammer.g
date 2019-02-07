grammar SILGrammer;
@header {
import java.util.HashMap;
import java.util.Scanner;
}
@lexer::header {

package grammar;

}


@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
Scanner sc = new Scanner(System.in); // input from the keyword
}

prog 	:	stat+;
stat	:(       print  // PRINT RULE which will print the output no CR LF
               | println  //PRINTLN RULE which will print the output CR LF
               | integer   // INTEGER RULE which will define identifiers as integers 
                            //and will also check for duplicity i.e if the variable is already defined as an integer 
               | 'LET' ID '=' e1=expr          //LET will assign expression to identifier
               {
                 Integer a = (Integer)memory.get($ID.text);  //to get the value of ID from Hashmap
               if(a!=null)         // to check if the identifier is defined before using it in LET operation
                   memory.put($ID.text, new Integer($e1.value));   // If variable is not defined before, it will define it 
                                                                   //and store it the HashMap
                                                                   
               else
                  System.err.println("undefined variable "+$ID.text);                                                    
                        
               }    
               |  input          //INPUT RULE which will take input from the user.
               
          )*
          'END'
          ;
print 	:	'PRINT' 
            (
               ex = expr
               {
                 System.out.print($ex.value);
               }
               |
                ey = literal
               {
               String z=$ey.text.toString().replaceAll("^\"|\"$",   "");         //it will print the strings without double quotes
               System.out.flush();
               System.out.print(z); 
               }
            )
                     
 ;   
 println :
 	'PRINTLN' 
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
               
 	;
 integer returns [int value]   :
        'INTEGER'    e1=ID
        {
        Integer var=(Integer)memory.get($e1.text);
        if(var==null)          //to check if the variable is already defined
           memory.put($e1.text, new Integer(0));   //if the variable is not defined, it will add in memory of hashmap
        else
           System.err.println("Variable  "+ $e1.text + " is defined already ");     //it will give an error   
        }
        ( ',' e2=ID
        {
        Integer var2 = (Integer)memory.get($e2.text); 
          if ( var2==null ) // to check if the variable is already defined
             memory.put($e2.text, new Integer(0));  //if the variable is not defined, it will add in memory of hashmap 
          else
             System.err.println("Variable " + $e2.text + " is defined already");       //it will give an error

        })*
 ;		
 input 	:	
       'INPUT'  e1=ID              //it will be of the form INPUT a,b,c,d
       {
         Integer var=(Integer)memory.get($e1.text);  // to check if the identifier is defined before taking the input. 
                                                       //It will check for the identifier in the hashmap
                                                       
         if(var!=null)                               //if the value is present in the hashmap,it will take the input from the user
         {
             
              int a=sc.nextInt();
              memory.put($e1.text,a);                //it will store the identifier along with its ID
         }
         else
             System.err.println("Undefined Variable " + $e1.text);     //if the variable does not exist in hashmap
                   
       }
       (
       ',' e2=ID
       {
         Integer var2=(Integer)memory.get($e2.text);  // to check if the identifier is defined before taking the input. 
                                                       //It will check for the identifier in the hashmap
         if(var2!=null)                               //if the value is present in the hashmap,it will take the input from the user
         {
              
              int b=sc.nextInt();
              memory.put($e2.text,b);                //it will store the identifier along with its ID
         }
          else
             System.err.println("Undefined Variable " + $e2.text);     //if the variable does not exist in hashmap
                                                       
       }
       )*
       ;
      
  expr returns [int value]

: e=multExpr {$value = $e.value;}

( '+' e=multExpr {$value += $e.value; }   //addition

| '-' e=multExpr {$value -= $e.value;}   //subtraction

)*

;      
multExpr returns [int value]

: e=atom {$value = $e.value;}
   ('*' e=atom {$value *= $e.value;}           //multiplication
  | '/' e=atom {$value =$value / $e.value;}    //division
)*    

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
          '"' '"'
          | ~(':'|'!'|'"')
         )*
        '"'
        ;


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;



COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;
 

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;


