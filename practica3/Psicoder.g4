
grammar Psicoder;

ps :  ps element
    |b
    | /*epsilon*/
    ;
b : element ps
   |FUNCION_PRINCIPAL statements FIN_PRINCIPAL
   | /* epsilon */
    ;

element : FUNCION type ID TK_PAR_IZQ optparams
     TK_PAR_DER HACER statements RETORNAR exp TK_PYC
     FIN_FUNCION
    | strct
    ;

strct : ESTRUCTURA ID statements4 FIN_ESTRUCTURA
    ;

type : ENTERO
    | CARACTER
    | CADENA
    | REAL
    | BOOLEANO
    | ID
    ;

optparams : params
    | /* epsilon */
    ;

params : type ID TK_COMA params
    | type ID
    ;

optpargs : args
    | /* epsilon */
    ;
    
args : exp TK_COMA params
    | exp
    | exp  TK_COMA  args
    ;

statements : stmt  statements
    | /* epsilon */
    ;

statements3 : stmt2  statements3
    | /* epsilon */
    ;

statements4 : stmt4  statements4
    | /* epsilon */
    ;

stmt : ID  TK_PAR_IZQ  optpargs  TK_PAR_DER  TK_PYC
    | type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC
    | type  ID  TK_COMA  optexp  TK_PYC
    | ID  TK_ASIG  exp  TK_PYC
    | type  ID  TK_ASIG  exp  TK_PYC
    | ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    | type  ID  TK_PYC

    | SI  TK_PAR_IZQ  exp  TK_PAR_DER
              ENTONCES  statements  FIN_SI
    | SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements
              SI_NO  statements  FIN_SI
    | LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC
    | LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC
    | IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC
    | PARA  TK_PAR_IZQ  stmt  exp  TK_PYC  exp
              TK_PAR_DER  HACER  statements3  FIN_PARA
    | MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER
              statements3  FIN_MIENTRAS
    | HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp
              TK_PAR_DER  TK_PYC
    | SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases
              FIN_SELECCIONAR
    ;

cases : CASO  exp  TK_POSD  statements3  cases2
    | deft
    ;

cases2 : CASO  exp  TK_POSD  statements3  cases2
    | /*  epsilon */
    | deft
    ;

deft : DEFECTO  TK_POSD  statements3
    ;

imp_params : exp  TK_COMA  imp_params
    | exp
    ;

optexp : ID  TK_COMA  optexp
    | ID  TK_ASIG  exp  TK_COMA  optexp
    | ID
    | ID  TK_ASIG  exp
    ;

chain : ID  TK_PUNTO  chain
    | ID
    ;

exp :  TK_CARACTER
    |  ID
    |  ID  TK_PUNTO  chain
    |  TK_ENTERO
    |  TK_REAL
    |  TK_CADENA
    |  VERDADERO
    |  FALSO
    |  TK_MENOS  TK_REAL
    |  TK_MENOS  TK_ENTERO
    |  TK_MENOS  ID
    |  TK_MENOS  ID  TK_PUNTO  chain
    |  TK_MENOS  TK_PAR_IZQ  exp  TK_PAR_DER
    |  TK_NEG  ID
    |  TK_NEG  ID  TK_PUNTO  chain
    |  TK_NEG  VERDADERO
    |  TK_NEG  FALSO
    |  TK_NEG  TK_PAR_IZQ  exp  TK_PAR_DER

    |  TK_PAR_IZQ  exp  TK_PAR_DER
    |  ID  TK_PAR_IZQ  optargs  TK_PAR_DER
    |  TK_PAR_IZQ  optargs  TK_PAR_DER

    |  exp  TK_O  exp
    |  exp  TK_Y  exp
    |  exp  TK_IGUAL  exp
    |  exp  TK_MENOR  exp
    |  exp  TK_MAYOR  exp
    |  exp  TK_MENOR_IGUAL  exp
    |  exp  TK_MAYOR_IGUAL  exp
    |  exp  TK_DIF  exp

    |  exp  TK_MAS  exp
    |  exp  TK_MENOS  exp
    |  exp  TK_MULT  exp
    |  exp  TK_DIV  exp
    |  exp  TK_MOD  exp
    ;

optargs : /* epsilon*/
    | args
    ;




stmt2 : ROMPER  TK_PYC

    |  ID  TK_PAR_IZQ  optpargs  TK_PAR_DER  TK_PYC
    |  type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC
    |  type  ID  TK_COMA  optexp  TK_PYC
    |  ID  TK_ASIG  exp  TK_PYC
    |  type  ID  TK_ASIG  exp  TK_PYC
    |  ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    |  type  ID  TK_PYC

    |  SI  TK_PAR_IZQ  exp  TK_PAR_DER
              ENTONCES  statements3  FIN_SI
    |  SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements3
              SI_NO  statements3  FIN_SI

    |  LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC
    |  LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC
    |  IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC
    |  PARA  TK_PAR_IZQ  stmt  exp  TK_PYC  exp
              TK_PAR_DER  HACER  statements3  FIN_PARA
    |  MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER
              statements3  FIN_MIENTRAS
    |  HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp
              TK_PAR_DER  TK_PYC
    |  SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases
              FIN_SELECCIONAR
    ;

stmt4 : ID  TK_PAR_IZQ  optpargs  TK_PAR_DER  TK_PYC
    |  type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC
    |  type  ID  TK_COMA  optexp  TK_PYC
    |  ID  TK_ASIG  exp  TK_PYC
    |  type  ID  TK_ASIG  exp  TK_PYC
    |  ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC
    |  type  ID  TK_PYC
    ;




FIN_FUNCION : 'fin_funcion'
    ;

LEER : 'leer'
    ;

SI_NO : 'si_no'
    ;

SI : 'si'
    ;

ENTONCES: 'entonces'
    ;

FIN_SI: 'fin_si'
    ;

MIENTRAS: 'mientras'
    ;

HACER: 'hacer'
    ;

FIN_MIENTRAS: 'fin_mientras'
    ;

PARA: 'para'
    ;

FIN_PARA: 'fin_para'
    ;

SELECCIONAR: 'seleccionar'
    ;

ENTRE : 'entre'
    ;

CASO : 'caso'
    ;

ROMPER :  'romper'
    ;

DEFECTO : 'defecto'
    ;

FIN_SELECCIONAR : 'fin_seleccionar'
    ;

RETORNAR : 'retornar'
    ;

ESTRUCTURA : 'estructura'
    ;

FIN_ESTRUCTURA : 'fin_estructura'
    ;

IMPRIMIR : 'imprimir'
    ;

CARACTER : 'caracter'
    ;

CADENA : 'cadena'
    ;

FUNCION_PRINCIPAL : 'funcion_principal'
    ;

FUNCION : 'funcion'
    ;

FIN_PRINCIPAL : 'fin_principal'
    ;

BOOLEANO : 'booleano'
    ;

TK_CARACTER: '\''(('A'..'Z')|('a'..'z')|('0'..'1'))'\''
    ;

VERDADERO: 'verdadero'
    ;

FALSO: 'falso'
    ;

REAL : 'real'
    ;

ENTERO : 'entero'
    ;

TK_ENTERO : ('0'..'9')+
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;

TK_MAS: '+'
    ;

TK_MENOS: '-'
    ;

TK_MULT: '*'
    ;

TK_DIV: '/'
    ;

TK_MOD: '%'
    ;

TK_ASIG: '='
    ;

TK_MENOR: '<'
    ;

TK_MAYOR: '>'
    ;

TK_MENOR_IGUAL: '<='
    ;

TK_MAYOR_IGUAL: '>='
    ;

TK_IGUAL: '=='
    ;

TK_Y: '&&'
    ;

TK_O: '||'
    ;

TK_DIF: '!='
    ;

TK_NEG: '!'
    ;

TK_POSD: ':'
    ;

TK_COMILLA_SEN: '\''
    ;

TK_COMILLA_DOB: '"'
    ;

TK_PYC: ';'
     ;

TK_COMA: ','
     ;

TK_PUNTO: '.'
    ;

TK_PAR_IZQ: '('
    ;

TK_PAR_DER: ')';

ID : (('a'..'z')|('A'..'Z'))+(('A'..'Z')|('a'..'z')|('0'..'1')|('_'))*;

//TK_CADENA: '"'(('A'..'Z')|('a'..'z')|('0'..'1')|'_'|(' '))*'"';

TK_REAL : ('0'..'9')+'.'('0'..'9')+;
TK_CADENA: '"'([a-zA-Z0-9_  ])*'"';