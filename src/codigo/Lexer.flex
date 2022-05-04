package codigo;
import static codigo.Tokens.*;

%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%

private | class | if | else | static | return | interface | try | catch | finally | 
for | for each | while | elif | continue | break | return | throws | NaN | Infinity |
null | true | false | implementes | class | new | method | super | objectof | import | package |
while {lexeme=yytext(); return Reservadas;}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"/" {return Division;}

{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
 . {return ERROR;}