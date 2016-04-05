#autores= Carlos Orlando Solorzano y Juan Camilo Calero
#Echo con las enseñanzas de Udacity

import ply.lex as lex
import re 
import sys

tokens = (
    'fin_principal',
    'funcion_principal',
    'booleano',
    'leer',
    'entero',
    'funcion',
    'caracter',
    'cadena',
    'real',
    'id',
    'si',
    'entonces',
    'fin_si',
    'si_no',
    'mientras',
    'hacer',
    'fin_mientras',
    'fin_funcion',
    'para',
    'fin_para',
    'seleccionar',
    'entre',
    'caso',
    'romper',
    'defecto',
    'fin_seleccionar',
    'estructura',
    'fin_estructura',
    'imprimir',
    'retornar',
    'tk_caracter',
    'tk_entero',
    'tk_real',
    'tk_cadena',
    'tk_mas',
    'tk_menos',
    'tk_mult',
    'tk_div',
    'tk_mod',
    'tk_asig',
    'tk_menor', #<
    'tk_mayor', #>
    'tk_menor_igual',    
    'tk_mayor_igual',
    'tk_igual', #==
    'tk_y', #&&
    'tk_o', #||
    'tk_dif', #!=
    'tk_neg', #!
    'tk_dosp', #:
    'tk_comilla_sen', #'
    'tk_comilla_dob', #"
    'tk_pyc', #;
    'tk_coma',
    'tk_punto',
    'tk_par_izq', #(
    'tk_par_der', #)
    'verdadero',
    'falso',
    )
    
states = (
    ('psicodercomment', 'exclusive'),
    ('singlecomment', 'exclusive'),
    )

t_ignore = ' \t\v\r'
t_psicodercomment_ignore = ' \t\v\r'
t_singlecomment_ignore = ' \t\v\r'
global flag
flag = False

res = ['fin_principal', 'funcion_principal', 'booleano','leer','entero',
    'funcion', 'caracter', 'cadena', 'real', 'id', 'si', 'entonces',
    'fin_si', 'si_no', 'mientras', 'hacer', 'fin_mientras', 'fin_funcion',
    'para', 'fin_para', 'seleccionar', 'entre', 'caso', 'romper', 'defecto',
    'fin_seleccionar', 'estructura', 'fin_estructura',
    'imprimir', 'retornar','verdadero', 'falso']

dic = {"tk_mas" :"+" , 
"tk_menos" :"-" , 
"tk_mult" :"*" , 
"tk_div" :"/" , 
"tk_mod" :"%" , 
"tk_asig" :"=" , 
"tk_menor" :"<" , 
"tk_mayor" :">" , 
"tk_menor_igual" :"<=" , 
"tk_mayor_igual" :">=" , 
"tk_igual" :"==" , 
"tk_y" :"&&" , 
"tk_o" :"||" , 
"tk_dif" :"!=" , 
"tk_neg" :"!" , 
"tk_dosp" :":" , 
"tk_comilla_sen" :"'" , 
"tk_comilla_dob" :"\"" , 
"tk_pyc" :";" , 
"tk_coma" :"," , 
"tk_punto" :"." , 
"tk_par_izq" :"(" , 
"tk_par_der" :")" , 
"id" : "identificador" , 
"tk_entero" :"valor_entero" , 
"tk_real" :"valor_real" , 
"tk_caracter" :"valor_caracter" , 
"tk_cadena" :"valor_cadena" , 
"funcion_principal" : "funcion_principal" , 
"fin_principal" :"fin_principal" , 
"leer" :"leer", 
"imprimir" :"imprimir" , 
"booleano" :"booleano" , 
"caracter" :"caracter" , 
"entero" :"entero" , 
"real" :"real" , 
"cadena" :"cadena" ,
"si" :"si" , 
"entonces" :"entonces" , 
"fin_si" :"fin_si" , 
"si_no" :"si_no" , 
"mientras" :"mientras" , 
"hacer" :"hacer" , 
"fin_mientras" :"fin_mientras" , 
"para" :"para" , 
"fin_para" :"fin_para" , 
"seleccionar" :"seleccionar" , 
"entre" :"entre" , 
"caso" :"caso" , 
"romper" :"romper" , 
"defecto" :"defecto" , 
"fin_seleccionar" :"fin_seleccionar" , 
"estructura" :"estructura" , 
"fin_estructura" :"fin_estructura" , 
"funcion" :"funcion" , 
"fin_funcion" :"fin_funcion" , 
"retornar" :"retornar" , 
"falso" :"falso" , 
"verdadero" :"verdadero"}

dic1 = {
"+":1,
"-":2,
"*":3,
"/":4,
"%":5,
"=":6,
"<":7,
">":8,
"<=":9,
">=":10,
"==":11,
"&&":12,
"||":13,
"!=":14,
"!":15,
":":16,
"":17,
"\"":18,
";":19,
"":20,
".":21,
"(":22,
")":23,
"identificador":24,
"valor_entero":25,
"valor_real":26,
"valor_caracter":27,
"valor_cadena":28,
"funcion_principal":29,
"fin_principal":30,
"leer":31,
"imprimir":32,
"booleano":33,
"caracter":34,
"entero":35,
"real":36,
"cadena":37,
"si":38,
"entonces":39,
"fin_si":40,
"si_no":41,
"mientras":42,
"hacer":43,
"fin_mientras":44,
"para":45,
"fin_para":46,
"seleccionar":47,
"entre":48,
"caso":49,
"romper":50,
"defecto":51,
"fin_seleccionar":52,
"estructura":53,
"fin_estructura":54,
"funcion":55,
"fin_funcion":56,
"retornar":57,
"falso":58,
"verdadero":59,
    }

l2 = ['tk_mas', 'tk_menos','tk_mult','tk_div','tk_mod','tk_asig', 'tk_menor',
    'tk_mayor', 'tk_menor_igual', 'tk_mayor_igual', 'tk_igual', 'tk_y', 'tk_o',
    'tk_dif', 'tk_neg', 'tk_dosp', 'tk_comilla_sen', 'tk_comilla_dob', 'tk_pyc',
    'tk_coma', 'tk_par_izq', 'tk_par_der', 'tk_punto']

global lpos
lpos  = 0
global ln
ln = 1
global aux
aux = 1
Tokens = []
global TokensPos
TokensPos = []
global TokensValues
TokensValues = []

def t_newline(t):
    r'\n '
    global lpos
    lpos = t.lexpos + 1
    t.lexer.lineno += 1
    global ln
    ln += 1
    global aux
    aux = 1

def t_singlecomment(token):
    r'//'
    global aux
    aux = token.lexpos - lpos + 1 + len(str(token.value))
    token.lexer.begin('singlecomment')
    #token.lexer.begin('INITIAL')


def t_singlecomment_newline(token):
    r'\n'
    token.lexer.lineno += 1
    global ln
    ln += 1
    global aux
    aux = 1
    global lpos
    lpos = token.lexpos + 1
    token.lexer.begin('INITIAL')

def t_psicodercomment(token):
    r'/\*'
    global aux
    aux = token.lexpos - lpos + 1 + len(str(token.value))
    token.lexer.begin('psicodercomment')

def t_psicodercomment_end(token):
    r'\*/'
    global aux
    aux = token.lexpos - lpos + 1 + len(str(token.value))
    token.lexer.begin('INITIAL')

def t_error(token):
    global flag
    flag = True
    global lpos
    print (">>> Error lexico(linea: " +  str(token.lexer.lineno) + ", posicion: " + str(token.lexpos - lpos + 1) + ")")
    token.lexer.skip(1)
    sys.exit(0)

def t_psicodercomment_error(token):
    global aux
    aux = token.lexpos - lpos + 1 + len(str(token.value))
    token.lexer.skip(1)

def t_singlecomment_error(token):
    global aux
    aux = token.lexpos - lpos + 1 + len(str(token.value))
    token.lexer.skip(1)

def t_psicodercomment_newline(token):
    r'\n'
    global lpos
    lpos = token.lexpos + 1
    token.lexer.lineno += 1
    global ln
    ln += 1
    global aux
    aux = 1

def t_id(token):
    r'[a-zA-Z][a-zA-Z0-9_]*'
    if token.value not in res:
        return token
    else:
        #global lpo
        #print('<' + str(token.value) + ',' + str(token.lexer.lineno) + ',' + str(token.lexpos - lpos + 1) + '>')
        Tokens.append(str(token.value))
        global TokensPos
        global aux
        global TokensValues
        aux = token.lexpos - lpos + 1 + len(str(token.value))
        TokensPos.append((token.lexer.lineno, token.lexpos - lpos + 1))
        TokensValues.append(token.value)

def t_tk_cadena(token):
    r'"[a-zA-Z0-9_ \t\n\v\r]*"'
    return token

def t_tk_menos(token):
    r'\-'
    return token

def t_tk_real(token):
    r'[0-9]+\.[0-9]+'
    tmp = float(token.value)
    if(tmp < -2147483648.0 or tmp > 2147483647.0):
        t_error(token)
    else:
        token.value = tmp
        return token

def t_fin_funcion(token):
    r'fin_funcion'
    return token

def t_leer(token):
    r'leer'
    return token

def t_si_no(token):
    r'si_no'
    return token

def t_si(token):
    r'si'
    return token

def t_entonces(token):
    r'entonces'
    return token

def t_fin_si(token):
    r'fin_si'
    return token

def t_mientras(token):
    r'mientras'
    return token

def t_hacer(token):
    r'hacer'
    return token

def t_fin_mientras(token):
    r'fin_mientras'
    return token

def t_para(token):
    r'para'
    return token

def t_fin_para(token):
    r'fin_para'
    return token

def t_seleccionar(token):
    r'seleccionar'
    return token

def t_entre(token):
    r'entre'
    return token

def t_caso(token):
    r'caso'
    return token

def t_romper(token):
    r'romper'
    return token

def t_defecto(token):
    r'defecto'
    return token

def t_fin_seleccionar(token):
    r'fin_seleccionar'
    return token

def t_retornar(token):
    r'retornar'
    return token

def t_estructura(token):
    r'estructura'
    return token

def t_fin_estructura(token):
    r'fin_estructura'
    return token

def t_imprimir(token):
    r'imprimir'
    return token

def t_caracter(token):
    r'caracter'
    return token

def t_entero(token):
    r'entero'
    return token

def t_cadena(token):
    r'cadena'
    return token

def t_funcion_principal(token):
    r'funcion_principal'
    return token

def t_funcion(token):
    r'funcion'
    return token

def t_fin_principal(token):
    r'fin_principal'
    return token

def t_booleano(token):
    r'booleano'
    return token

def t_tk_caracter(token):
    r'\'[a-zA-Z0-9 _\-\+\*/\\]\''
    return token

def t_verdadero(token):
    r'verdadero'
    return token

def t_falso(token):
    r'falso'
    return token

def t_real(token):
    r'real'
    return token

def t_tk_entero(token):
    r'[0-9]+'
    tmp = int(token.value)
    if(tmp < -2147483648 or tmp > 2147483647):
        t_error(token)
    else:
        token.value = tmp
        return token

def t_tk_mas(token):
    r'\+'
    return token

def t_tk_mult(token):
    r'\*'
    return token

def t_tk_div(token):
    r'/'
    return token

def t_tk_mod(token):
    r'%'
    return token

def t_tk_menor_igual(token):
    r'<='
    return token

def t_tk_mayor_igual(token):
    r'>='
    return token

def t_tk_menor(token):
    r'<'
    return token

def t_tk_mayor(token):
    r'>'
    return token

def t_tk_igual(token):
    r'=='
    return token

def t_tk_asig(token):
    r'='
    return token

def t_tk_y(token):
    r'&&'
    return token

def t_tk_o(token):
    r'\|\|'
    return token

def t_tk_dif(token):
    r'!='
    return token

def t_tk_neg(token):
    r'!'
    return token

def t_tk_dosp(token):
    r':'
    return token

def t_tk_comilla_sen(token):
    r'\''
    return token

def t_tk_comilla_dob(token):
    r'"'
    return token

def t_tk_pyc(token):
    r';'
    return token

def t_tk_coma(token):
    r','
    return token

def t_tk_par_izq(token):
    r'\('
    return token

def t_tk_par_der(token):
    r'\)'
    return token

def t_tk_punto(token):
    r'\.'
    return token



grammar = [
    ("ps", ["element", "ps", "element"]),
    ("ps", ["funcion_principal", "statements", "fin_principal"]),
    ("element", ["funcion", "type", "id", "tk_par_izq", "optparams",
                 "tk_par_der", "hacer", "statements", "retornar", "exp", "tk_pyc",
                 "fin_funcion"]),
    ("element", ["strct"]),
    ("element", []),
    ("strct", ["estructura", "id", "statements4", "fin_estructura"]),
    
    ("type", ["entero"]),
    ("type", ["caracter"]),
    ("type", ["cadena"]),
    ("type", ["real"]),
    ("type", ["booleano"]),
    ("type", ["id"]),
    ("optparams", ["params"]),
    ("optparams", []),
    ("params", ["type", "id", "tk_coma", "params"]),
    ("params", ["type", "id"]),

    ("optpargs", ["args"]),
    ("optpargs", []),
    ("args", ["exp", "tk_coma", "params"]),
    ("args", ["exp"]),
    
    ("statements", ["stmt", "statements"]),
    ("statements", []),
    ("statements3", ["stmt2", "statements3"]),
    ("statements3", []),
    ("statements4", ["stmt4", "statements4"]),
    ("statements4", []),
    
    ("stmt", ["id", "tk_par_izq", "optpargs", "tk_par_der", "tk_pyc"]),
    ("stmt", ["type", "id", "tk_asig", "exp", "tk_coma", "optexp", "tk_pyc"]),
    ("stmt", ["type", "id", "tk_coma", "optexp", "tk_pyc"]),
    ("stmt", ["id", "tk_asig", "exp", "tk_pyc"]),
    ("stmt", ["type", "id", "tk_asig", "exp", "tk_pyc"]),
    ("stmt", ["id", "tk_punto", "chain", "tk_asig", "exp", "tk_pyc"]),
    ("stmt", ["type", "id", "tk_pyc"]),
    
    ("stmt", ["si", "tk_par_izq", "exp", "tk_par_der",
              "entonces", "statements", "fin_si"]),
    ("stmt", ["si", "tk_par_izq", "exp", "tk_par_der", "entonces", "statements",
              "si_no", "statements", "fin_si"]),
    ("stmt", ["leer", "tk_par_izq", "id", "tk_par_der", "tk_pyc"]),
    ("stmt", ["leer", "tk_par_izq", "id", "tk_punto", "chain", "tk_par_der", "tk_pyc"]),
    ("stmt", ["imprimir", "tk_par_izq", "imp_params", "tk_par_der", "tk_pyc"]),
    ("stmt", ["para", "tk_par_izq", "stmt", "exp", "tk_pyc", "exp",
              "tk_par_der", "hacer", "statements3", "fin_para"]),
    ("stmt", ["mientras", "tk_par_izq", "exp", "tk_par_der", "hacer",
              "statements3", "fin_mientras"]),
    ("stmt", ["hacer", "statements3", "mientras", "tk_par_izq", "exp",
              "tk_par_der", "tk_pyc"]),
    ("stmt", ["seleccionar", "tk_par_izq", "id", "tk_par_der", "entre", "cases",
              "fin_seleccionar"]),

    ("cases", ["caso", "exp", "tk_dosp", "statements3", "cases2"]),
    ("cases", ["deft"]),
    ("cases2", ["caso", "exp", "tk_dosp", "statements3", "cases2"]),
    ("cases2", []),
    ("cases2", ["deft"]),
    ("deft", ["defecto", "tk_dosp", "statements3"]),

    ("imp_params", ["exp", "tk_coma", "imp_params"]),
    ("imp_params", ["exp"]),

    ("exp", ["id"]),
    #("exp", ["id", "tk_asig", "exp", "tk_coma", "optexp"]),
    ("optexp", ["id", "tk_coma", "optexp"]),
    ("optexp", ["id", "tk_asig", "exp", "tk_coma", "optexp"]),
    ("optexp", ["id"]),
    ("optexp", ["id", "tk_asig", "exp"]),
    ("exp", ["id", "tk_punto", "chain"]),
    ("chain", ["id", "tk_punto", "chain"]),
    ("chain", ["id"]),
    ("exp", ["tk_caracter"]),
    ("exp", ["tk_entero"]),
    ("exp", ["tk_real"]),
    ("exp", ["tk_cadena"]),
    ("exp", ["verdadero"]),
    ("exp", ["falso"]),
    ("exp", ["tk_menos", "tk_real"]),
    ("exp", ["tk_menos", "tk_entero"]),
    ("exp", ["tk_menos", "id"]),
    ("exp", ["tk_menos", "id", "tk_punto", "chain"]),
    ("exp", ["tk_menos", "tk_par_izq", "exp", "tk_par_der"]),
    
    ("exp", ["tk_neg", "id"]),
    ("exp", ["tk_neg", "id", "tk_punto", "chain"]),
    ("exp", ["tk_neg", "verdadero"]),
    ("exp", ["tk_neg", "falso"]),
    ("exp", ["tk_neg", "tk_par_izq", "exp", "tk_par_der"]),
    
    ("exp", ["tk_par_izq", "exp", "tk_par_der"]),
    ("exp", ["id", "tk_par_izq", "optargs", "tk_par_der"]),
    ("exp", ["tk_par_izq", "optargs", "tk_par_der"]),

    ("exp", ["exp", "tk_o", "exp"]),        # lowest precedence, left associative
    ("exp", ["exp", "tk_y", "exp"]),        # higher precedence, left associative 
    ("exp", ["exp", "tk_igual", "exp"]),        # higher precedence, left associative
    ("exp", ["exp", "tk_menor", "exp"]),         # /---
    ("exp", ["exp", "tk_mayor", "exp"]),         # | higher precedence, 
    ("exp", ["exp", "tk_menor_igual", "exp"]),        # | left associative
    ("exp", ["exp", "tk_mayor_igual", "exp"]),        # \---
    ("exp", ["exp", "tk_dif", "exp"]),
    
    ("exp", ["exp", "tk_mas", "exp"]),         # /--- higher precedence,
    ("exp", ["exp", "tk_menos", "exp"]),         # \--- left associative
    ("exp", ["exp", "tk_mult", "exp"]),         # /--- higher precedence,
    ("exp", ["exp", "tk_div", "exp"]),         # \--- left associative
    ("exp", ["exp", "tk_mod", "exp"]),

    ("optargs", []),
    ("optargs", ["args"]),
    ("args", ["exp", "tk_coma", "args"]),
    ("args", ["exp"]),

    ("stmt2", ["romper", "tk_pyc"]),
    
    ("stmt2", ["id", "tk_par_izq", "optpargs", "tk_par_der", "tk_pyc"]),
    ("stmt2", ["type", "id", "tk_asig", "exp", "tk_coma", "optexp", "tk_pyc"]),
    ("stmt2", ["type", "id", "tk_coma", "optexp", "tk_pyc"]),
    ("stmt2", ["id", "tk_asig", "exp", "tk_pyc"]),
    ("stmt2", ["type", "id", "tk_asig", "exp", "tk_pyc"]),
    ("stmt2", ["id", "tk_punto", "chain", "tk_asig", "exp", "tk_pyc"]),
    ("stmt2", ["type", "id", "tk_pyc"]),
    
    ("stmt2", ["si", "tk_par_izq", "exp", "tk_par_der",
              "entonces", "statements3", "fin_si"]),
    ("stmt2", ["si", "tk_par_izq", "exp", "tk_par_der", "entonces", "statements3",
              "si_no", "statements3", "fin_si"]),
    #("stmt2", ["retornar", "exp", "tk_pyc"]),
    ("stmt2", ["leer", "tk_par_izq", "id", "tk_punto", "chain", "tk_par_der", "tk_pyc"]),
    ("stmt2", ["leer", "tk_par_izq", "id", "tk_par_der", "tk_pyc"]),
    ("stmt2", ["imprimir", "tk_par_izq", "imp_params", "tk_par_der", "tk_pyc"]),
    ("stmt2", ["para", "tk_par_izq", "stmt", "exp", "tk_pyc", "exp",
              "tk_par_der", "hacer", "statements3", "fin_para"]),
    ("stmt2", ["mientras", "tk_par_izq", "exp", "tk_par_der", "hacer",
              "statements3", "fin_mientras"]),
    ("stmt2", ["hacer", "statements3", "mientras", "tk_par_izq", "exp",
              "tk_par_der", "tk_pyc"]),
    ("stmt2", ["seleccionar", "tk_par_izq", "id", "tk_par_der", "entre", "cases",
              "fin_seleccionar"]),

    ("stmt4", ["id", "tk_par_izq", "optpargs", "tk_par_der", "tk_pyc"]),
    ("stmt4", ["type", "id", "tk_asig", "exp", "tk_coma", "optexp", "tk_pyc"]),
    ("stmt4", ["type", "id", "tk_coma", "optexp", "tk_pyc"]),
    ("stmt4", ["id", "tk_asig", "exp", "tk_pyc"]),
    ("stmt4", ["type", "id", "tk_asig", "exp", "tk_pyc"]),
    ("stmt4", ["id", "tk_punto", "chain", "tk_asig", "exp", "tk_pyc"]),
    ("stmt4", ["type", "id", "tk_pyc"])
    
    ]

def addtochart(chart, index, state):
    if state in chart[index]:
        return False
    chart[index] = chart[index] + [state]
    return True

def closure (grammar, i, x, ab, cd, j):
    next_states = [(rule[0], [], rule[1], i) for rule in grammar if cd != [] and cd[0] == rule[0]]
    return next_states

def shift (tokens, i, x, ab, cd, j):
    if cd != [] and tokens [i] == cd[0]:
        return (x, ab + [cd[0]], cd[1:], j)
    else:
        return None

def reductions(chart, i, x, ab, cd, j):
    return [ (jstate[0], jstate[1] + [x], (jstate[2])[1:], jstate[3])
             for jstate in chart[j] if cd == [] and jstate[2] != [] and (jstate[2])[0] == x]

def parse(tokens, grammar):
    tokens = tokens + ["EOF"]
    chart = {}
    start_rule = grammar[0]
    for i in range(len(tokens)+1):
        chart[i] = []
    start_state = (start_rule[0], [], start_rule[1], 0)
    chart[0] = [start_state]
    any_shift = False
    for i in range(len(tokens)):
        any_shift = False
        while True:
            changes = False
            for state in chart[i]:
                #State === x -> a b . c d , j
                x = state[0]
                ab = state[1]
                cd = state[2]
                j = state[3]

                # A Closure is possible?
                next_states = closure(grammar, i, x, ab, cd, j)
                for next_state in next_states:
                    changes = addtochart(chart, i, next_state) or changes

                # A reduction is possible?
                next_states = reductions(chart, i, x, ab, cd, j)
                for next_state in next_states:
                    changes = addtochart(chart, i, next_state) or changes

                # A Shift is possible?
                next_state = shift(tokens, i, x, ab, cd, j)
                if next_state != None:
                    any_shift = addtochart(chart, i+1, next_state) or any_shift

            if not changes:
                break
        if not any_shift:
            break
            
    """for a in range(len(tokens)):
        print "== chart" + str(a) + ",  ",
        if a > 0:
            print(tokens[a-1])
        else:
            print()
        for state in chart[a]:
            x = state[0]
            ab = state[1]
            cd = state[2]
            j = state[3]
            print " " + x + " ->",
            for sym in ab:
                print " " + sym,
            print " .",
            for sym in cd:
                print " " + sym,
            print(" from " + str(j))
        print("")"""
            
    accepting_state = (start_rule[0], start_rule[1], [], 0)
    if accepting_state in chart[len(tokens)-1]:
        return True
    else:
        aux = {}
        for y in chart[i]:
            if y[2] != [] and y[2][0] in dic:
                aux[dic[y[2][0]]] = 1
        if "funcion_principal" in aux:
            print("Error sintactico: falta funcion_principal")
        else:
            global TokensPos
            global TokensValues
            l = []
            for ii in aux:
                l.append((dic1[ii],ii))
            l.sort()
            TokensValues.append("EOF")
            print1 ="<%i,%i> " % (TokensPos[i][0],TokensPos[i][1])
            print2 = "Error sintactico: se encontro: \"%s\"; "  % (str(TokensValues[i]))
            #print("<"+str(TokensPos[i][0])+":"+str(TokensPos[i][1])+"> ",end="")
            #print("Error sintanctico: se encontro " + '"' + str(TokensValues[i]) + '"; ', end = "")
            #print("se esperaba: ", end = "")
            s = ""
            for h in l:
                s = s + '"'+ str(h[1]) + '", '
            if s != "":
                s = s[0:len(s)-2]
                s = s + "."
            print3= "se esperaba: %s" %(s)
            print print1+print2+print3
            #print(s)

        return False


entrada=sys.stdin.readlines()
entrada= "".join( entrada)
programa=str(entrada)

htmllexer = lex.lex()
htmllexer.input(programa)

while True:
    tok = htmllexer.token()
    if not tok or flag:
        break
    Tokens.append( str(tok.type) )
    aux = tok.lexpos - lpos + 1 + len(str(tok.value))
    TokensPos.append((tok.lineno, tok.lexpos - lpos + 1))
    TokensValues.append(tok.value)
    """if tok.type == tok.value or tok.type in l2:
        print('<' + str(tok.type) + ',' + str(tok.lineno) + ',' + str(tok.lexpos - lpos + 1) + '>')
    else:
        print('<' + str(tok.type) + ',' + str(tok.value) + ',' + str(tok.lineno) + ',' + str(tok.lexpos - lpos + 1) + '>')"""
TokensPos.append((ln, aux))
results = parse(Tokens, grammar)
if(results):
    print("El analisis sintactico ha finalizado exitosamente.")
