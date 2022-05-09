package codigo;
import static codigo.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=([0-9])+
P=[\-,\+]
O=[\*,\/,\%]
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%

{espacio} {/*Ignore*/}

"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}
"%" {return Residuo;}

{D}+("."{D}+)? {lexeme=yytext(); return Numero;}
{L}*|{P}{O}|"."{P}+|"."{O}+|{O}{O}+ {lexeme=yytext(); return ERROR;}
