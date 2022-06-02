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
{L}* {lexeme=yytext(); return ERROR;}
{P}{O} {lexeme=yytext(); return ErrorOperador;}
"."{P}+|"."{O}+ {lexeme=yytext(); return ErrorPuntoOperador;}
{O}{O}+ {lexeme=yytext(); return ErrorMultiplesOperadores;}
"."+ {lexeme=yytext(); return ErrorMultipunto;}
"/""0"+(".""0"+)? {lexeme=yytext(); return ErrorDivZero;}