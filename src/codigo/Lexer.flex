package codigo;
import static codigo.Tokens.*;

%%
%class Lexer
%type Tokens
D=([0-9])+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"%" {return Residuo;}

{D}+("."{D}+)? {lexeme=yytext(); return Numero;}
 . {return ERROR;}