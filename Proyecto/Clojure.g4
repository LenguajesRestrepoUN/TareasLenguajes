grammar Clojure;

file: mainForm;

mainForm: auxform mainForm       #mainForms
        | form                   #mainFormForm
        ;

auxform: form;

priorForm: form priorForm       #priorForms
         | form                 #priorFormForm
         ;

form: literal       #formLiteral
    | def           #formDef
    | defn          #formDefn
    | println       #formPrintln
    | print         #formPrint
    | sum           #formSum
    | minus         #formMinus
    | mult          #formMult
    | div           #formDiv
    | or            #formOr
    | and           #formAnd
    | str           #formStr
    | loop          #formLoop
    | si            #formsi
    | mayor         #formMayor
    | menor         #formMenor
    | mayorIgual    #formMayorIgual
    | menorIgual    #formMenorIgual
    | igual         #formIgual
    | inc           #formInc
    | hacer         #formHacer
    | when          #formWhen
    | isNil         #formIsNil
    | nth           #formNth
    | into          #formInto
    | mapF          #formMapF
    | contains      #formContains
    | conj          #formConj
    | get           #formGet
    | first         #formFirst
    | let           #formLet
    | functionMap   #formFunctionMap
    | take          #formTake
    | reduce        #formReduce
    | callFunction  #formCallFunction
    | recur         #formRecur
    | reader_macro  #formReader_macro
    | callFunction2 #formCallFunction2
    | fn            #formFn
    ;

literal
    : STRING            #literalString //ya
    | number            #literalNumber
    | character         #literalCharacter
    | nil               #literalNil
    | BOOLEAN           #literalBOOLEAN //ya
    | keyword           #literalKeyword //ya
    | symbol            #literalSymbol
    | PARAM_NAME        #literalParam_name
    | list              #literalList
    | vector            #literalVector
    | map               #literalMap
    | set               #literalSet
    //| SUM               #literalSum
    ;

forms: priorForm    #formsForm
     |              #formsEpsilon
     ;
auxforms: forms;

list: '\'(' forms ')' ; //ya
vector: '[' forms ']' ; //ya
map: '{' (form form)* '}' ;
set: '#{' forms '}' ; //ya

def: '(' DEF symbol ')'        #defSymbol //ya
   | '(' DEF symbol form')'    #defSymbolForm
   ;

println: '(' PRINTLN forms ')'; //ya
print: '(' PRINT forms ')'; //ya

sum: '(' SUM forms ')'; //ya
minus: '(' MINUS forms ')'; //ya
mult: '(' MULT forms ')'; //ya
div: '(' DIV forms ')'; //ya

or: '(' OR forms ')'; //ya
and: '(' AND forms ')'; //ya
str: '(' STR forms ')'; //ya

optDescription: STRING      #description
              |             #noDescription
              ;

optparams : params  #optparamsParams
          |         #optparamsEpsilon
          ;
symbols: symbol symbols      #symbolsSymbol
       |                     #symbolsEpsilon
       ;

params : symbol params                      #paramsSymbolParams
       | symbol                             #paramsSymbol
       | AMPER symbol                       #paramsRestParameter
       | '[' symbol symbols ']' params      #paramsDestructuringParams
       | '[' symbol symbols ']'             #paramsDestructuring
       ;

optLoopParams : loopParams  #optLoopParamsParams
     |                      #optLoopParamsEpsilon
     ;

loopParams : symbol form loopParams      #loopParamsSymbolParams
    | symbol form                        #loopParamsSymbol
    ;

optargs : args  #optargsArgs
     |          #optargsEpsilon
     ;

args : form args    #argsSymbolArgs
    | form          #argsSymbol
    ;

defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')'    #singleDefn //ya
    | '(' DEFN symbol optDescription  arity+ ')'                    #defnArity
    ;

fn: '(' FN '[' optparams ']' auxforms ')';

arity: '(' '[' optparams ']' forms ')'; //ya

callFunction: '(' symbol optargs ')' ; //ya

loop: '(' LOOP '[' optLoopParams ']' auxforms ')';

recur: '(' RECUR optargs ')'; //ya

siFalseForm: form         #falseForm
           |              #falseEpsilon
           ;

si: '(' SI form form siFalseForm ')'; //ya
hacer: '(' HACER forms ')';
mayor: '(' MAYOR forms ')'; //ya
menor: '(' MENOR forms ')'; //ya
mayorIgual: '(' MAYORIGUAL forms ')'; //ya
menorIgual: '(' MENORIGUAL forms ')'; //ya
igual: '(' IGUAL forms ')'; //ya
inc: '(' INC form ')'; //ya
when: '(' WHEN forms ')';
isNil: '(' ISNIL form ')';

defecto: form   #defaultForm
       |        #defaultEpsilon
       ;

mapF: '(' MAP form form ')';
into: '(' INTO form form')'; //ya
nth: '(' NTH form form')'; // ya, just vl
get: '(' GET form form defecto')'; //ya
contains: '(' CONTAINS set form ')'  #containsset //ya
        | '(' CONTAINS vector form ')' #containsvector //ya
        ;


conj: '(' CONJ form form ')'; //ya, Just vls
first: '(' FIRST form ')'; // just vl

//just ms
keywordGet: '(' keyword form ')'  #firstKeywordGet
          | '(' form keyword ')'  #lastKeywordGet
          ;

//functionMap: '(' MAP form vls ')';
functionMap: '(' MAP form form ')'; //just vls

//take: '(' TAKE LONG vlsm')';
take: '(' TAKE LONG form')'; //just vlsm

//reduce: '(' REDUCE form vls')';
reduce: '(' REDUCE form form')'; //juest vls

letParams : symbol form letParams      #letParamsSymbolParams
          | symbol form                #letParamsSymbol
          ;

let: '(' LET '[' letParams ']' forms ')'; //ya

callFunction2: '(' form optargs ')' ; //ya

reader_macro
    : lambda            #rmLamda
    | meta_data         #rmMeta_data
    | regex             #rmRegex
    | var_quote         #rmVar_quote
    | host_expr         #rmHost_expr
    | set               #rmSet
    | tag               #rmTag
    | discard           #rmDiscard
    | dispatch          #rmDispatch
    | deref             #rmDeref
    | quote             #rmQuote
    | backtick          #rmBacktick
    | unquote           #rmUnquote
    | unquote_splicing  #rmUnquote_splicing
    | gensym            #rmGensym
    ;

// TJP added '&' (gather a variable number of arguments)
quote : '\'' form;

backtick : '`' form;

unquote : '~' form;

unquote_splicing : '~@' form;

tag : '^' form form;

deref : '@' form;

gensym : SYMBOL '#';

lambda : '#(' form* ')';

meta_data : '#^' (map form | form);

var_quote : '#\'' symbol;

host_expr : '#+' form form;

discard : '#_' form;

dispatch : '#' symbol form;

regex : '#' STRING;

number
    : FLOAT     #numberFloat
    | HEX       #numberHex
    | BIN       #numberBin
    | BIGN      #numberBign
    | LONG      #numberLong
    ;

character
    : named_char    #charNamed_char
    | u_hex_quad    #charU_hex_quad
    | any_char      #charAny_char
    ;

named_char: CHAR_NAMED ;
any_char: CHAR_ANY ;
u_hex_quad: CHAR_U ;

nil: NIL; //ya

keyword
    : macro_keyword     #keywordMacro_keyword
    | simple_keyword    #keywordSimple_keyword
    ;

simple_keyword: ':' symbol;
macro_keyword: ':' ':' symbol;

symbol: ns_symbol     #symbol_ns_symbol//ya
      | simple_sym    #symbol_simple_sym//ya
      | SUM           #symbol_Sum
      | MINUS           #symbol_MINUS
      | MULT            #symbol_MULT
      | DIV         #symbol_DIV
      | INC         #symbol_INC
      | MAYOR           #symbol_MAYOR
      | MAYORIGUAL          #symbol_MAYORIGUAL
      | MENOR           #symbol_MENOR
      | MENORIGUAL          #symbol_MENORIGUAL
      | IGUAL           #symbol_IGUAL
      | STR         #symbol_STR
      ;

simple_sym: SYMBOL;//ya
ns_symbol: NS_SYMBOL;

// Lexers
//--------------------------------------------------------------------

DEF: 'def';
DEFN: 'defn';
PRINTLN: 'println';
PRINT: 'print';
SUM: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
OR: 'or';
AND: 'and';
STR: 'str';
LOOP: 'loop';
RECUR: 'recur';
SI: 'if';
INC: 'inc';
MAYOR: '>';
MENOR: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
IGUAL: '=';
HACER: 'do';
WHEN: 'when';
ISNIL: 'nil?';
NTH: 'nth';
GET: 'get';
CONTAINS: 'contains?';
CONJ: 'conj';
FIRST: 'first';
MAP: 'map';
STRING : '"' ( ~'"' | '\\' '"' )* '"' ;
AMPER: '&';
NIL: 'nil';
LET: 'let';
TAKE: 'take';
REDUCE: 'reduce';
FN: 'fn';
INTO: 'into';

FLOAT
    : '-'? [0-9]+ FLOAT_TAIL
    | '-'? 'Infinity'
    | '-'? 'NaN'
    ;

fragment
FLOAT_TAIL
    : FLOAT_DECIMAL FLOAT_EXP
    | FLOAT_DECIMAL
    | FLOAT_EXP
    ;

fragment
FLOAT_DECIMAL : '.' [0-9]+;

fragment
FLOAT_EXP : [eE] '-'? [0-9]+ ;

fragment
HEXD: [0-9a-fA-F] ;
HEX: '0' [xX] HEXD+ ;
BIN: '0' [bB] [10]+ ;
LONG: '-'? [0-9]+[lL]?;
BIGN: '-'? [0-9]+[nN];

CHAR_U : '\\' 'u'[0-9D-Fd-f] HEXD HEXD HEXD ;

CHAR_NAMED
    : '\\' ( 'newline'
           | 'return'
           | 'space'
           | 'tab'
           | 'formfeed'
           | 'backspace' ) ;

CHAR_ANY : '\\' . ;

BOOLEAN : 'true'
        | 'false'
        ;

SYMBOL : '.'
       | '/'
       | NAME
       ;

NS_SYMBOL
    : NAME '/' SYMBOL
    ;

PARAM_NAME: '%' ((('1'..'9')('0'..'9')*)|'&')? ;

// Fragments
//--------------------------------------------------------------------

fragment
NAME: SYMBOL_HEAD SYMBOL_REST* (':' SYMBOL_REST+)* ;

fragment
SYMBOL_HEAD
    : ~('0' .. '9'
        | '^' | '`' | '\'' | '"' | '#' | '~' | '@' | ':' | '/' | '%' | '(' | ')' | '[' | ']' | '{' | '}'
        | [ \n\r\t\,]
        )
    ;

fragment
SYMBOL_REST
    : SYMBOL_HEAD
    | '0'..'9'
    | '.'
    ;

// Discard
//--------------------------------------------------------------------

fragment
WS : [ \n\r\t\,] ;

fragment
COMMENT: ';' ~[\r\n]* ;

TRASH
    : ( WS | COMMENT ) -> channel(HIDDEN)
    ;
