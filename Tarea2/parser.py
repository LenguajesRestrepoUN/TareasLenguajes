"""grammar = [
    ("S", ["P"]),
    ("P", ["(", "P", ")"]),
    ("P", []),
    ]

tokens = ["(", "(", ")", ")"]"""

grammar = [
    ("S", ["Prisoner", "N"]),
    ("N", ["i", "N"]),
    ("N", ["i"]),
    ("i", ["0"]),
    ("i", ["1"]),
    ("i", ["2"]),
    ("i", ["3"]),
    ("i", ["4"]),
    ("i", ["5"]),
    ("i", ["6"]),
    ]

tokens = ["Prisoner", "2", "4", "6", "0", "7", "1"]

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
    tokens = tokens + ["end_of_input_marker"]
    chart = {}
    start_rule = grammar[0]
    for i in range(len(tokens)+1):
        chart[i] = []
    start_state = (start_rule[0], [], start_rule[1], 0)
    chart[0] = [start_state]
    for i in range(len(tokens)):
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

                # A Shift is possible?
                next_state = shift(tokens, i, x, ab, cd, j)
                if next_state != None:
                    changes = addtochart(chart, i+1, next_state) or changes

                # A reduction is possible?
                next_states = reductions(chart, i, x, ab, cd, j)
                for next_state in next_states:
                    changes = addtochart(chart, i, next_state) or changes

            if not changes:
                break
    for i in range(len(tokens)):
        print("== chart" + str(i))
        for state in chart[i]:
            x = state[0]
            ab = state[1]
            cd = state[2]
            j = state[3]
            print(" " + x + " ->", end = "")
            for sym in ab:
                print(" " + sym, end = "")
            print (" .", end = "")
            for sym in cd:
                print(" " + sym, end = "")
            print(" from " + str(j))
                
    accepting_state = (start_rule[0], start_rule[1], [], 0)
    return accepting_state in chart[len(tokens)-1]

results = parse(tokens, grammar)
print(results)

"""grammar = [ 
    ("exp", ["exp", "+", "exp"]),
    ("exp", ["exp", "-", "exp"]),
    ("exp", ["(", "exp", ")"]),
    ("exp", ["num"]),
    ("t",["I","like","t"]),
    ("t",[""])
    ]

print closure(grammar,0,"exp",["exp","+"],["exp"]) ==
[('exp', [], ['exp', '+', 'exp'], 0),
('exp', [], ['exp', '-', 'exp'], 0),
('exp', [], ['(', 'exp', ')'], 0), ('exp', [], ['num'], 0)]

print closure(grammar,0,"exp",[],["exp","+","exp"]) ==
[('exp', [], ['exp', '+', 'exp'], 0),
('exp', [], ['exp', '-', 'exp'], 0),
('exp', [], ['(', 'exp', ')'], 0), ('exp', [], ['num'], 0)]
print closure(grammar,0,"exp",["exp"],["+","exp"]) == []"""


"""print shift(["exp","+","exp"],2,"exp",["exp","+"],["exp"],0) ==
('exp', ['exp', '+', 'exp'], [], 0)
print shift(["exp","+","exp"],0,"exp",[],["exp","+","exp"],0) ==
('exp', ['exp'], ['+', 'exp'], 0)
print shift(["exp","+","exp"],3,"exp",["exp","+","exp"],[],0) == None
print shift(["exp","+","ANDY LOVES COOKIES"],2,"exp",["exp","+"],["exp"],0) ==
None"""
    
"""chart = {0: [ 
('exp', ['exp'], ['+', 'exp'], 0), 
('exp', [], ['num'], 0), 
('exp', [], ['(', 'exp', ')'], 0), 
('exp', [], ['exp', '-', 'exp'], 0), 
('exp', [], ['exp', '+', 'exp'], 0) 
], 
1: [('exp', ['exp', '+'], ['exp'], 0)], 
2: [('exp', ['exp', '+', 'exp'], [], 0)]}

print reductions(chart,2,'exp',['exp','+','exp'],[],0) == [
    ('exp', ['exp'], ['-', 'exp'], 0), 
    ('exp', ['exp'], ['+', 'exp'], 0)]"""
