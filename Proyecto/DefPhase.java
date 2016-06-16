import java.util.LinkedList;

public class DefPhase extends ClojureBaseListener {

    public static GlobalScope globals;
    public static Scope currentScope;
    public static LinkedList<FunctionSymbol> currentCall;
    FunctionSymbol currentFunction;
    Visitor visitor = new Visitor();
    private Boolean flag = true;

    @Override public void enterFile(ClojureParser.FileContext ctx) {
        globals = new GlobalScope(null);
        currentScope = globals;
        currentCall = new LinkedList<>();
        visitor.globals = globals;
        visitor.currentScope = currentScope;

        FunctionSymbol var;
        var = new FunctionSymbol("+", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("-", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("/", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("*", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol(">", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol(">=", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("<", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("<=", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("=", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("inc", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();

        var = new FunctionSymbol("str", currentScope, false);
        currentScope.define(var);
        var.setCurrentArityNumber(1);
        var.arity.put(1, new Arity());
        var.establishCurrentArity();
    }

    @Override public void exitFile(ClojureParser.FileContext ctx) {
        visitor.endSimulation();
    }

    @Override public void exitAuxform(ClojureParser.AuxformContext ctx) {
        visitor.visitAuxform(ctx);
    }

    //mainForms: form
    @Override public void exitMainFormForm(ClojureParser.MainFormFormContext ctx) {
        visitor.visitMainFormForm(ctx);
    }

    //def: '(' DEF symbol ')'
    @Override public void enterDefSymbol(ClojureParser.DefSymbolContext ctx) {
        String name = ctx.symbol().getText();
        VariableSymbol var = new VariableSymbol(name, null);
        globals.define(var);
    }

    //def: '(' DEF symbol form')'
    @Override public void enterDefSymbolForm(ClojureParser.DefSymbolFormContext ctx) {
        String name = ctx.symbol().getText();
        if(currentScope.resolve(name) == null) {
            VariableSymbol var = new VariableSymbol(name, null);
            globals.define(var);
        }
    }

    //symbols: symbol symbols
    @Override public void enterSymbolsSymbol(ClojureParser.SymbolsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
    }

    //params: '[' symbol symbols ']' params
    @Override public void enterParamsDestructuringParams(ClojureParser.ParamsDestructuringParamsContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.setDestructors(currentFunction.getDestructors() + 1);
        currentFunction.addParameter("destructor" + currentFunction.getDestructors());
    }

    //params: '[' symbol symbols ']'
    @Override public void enterParamsDestructuring(ClojureParser.ParamsDestructuringContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.setDestructors(currentFunction.getDestructors() + 1);
        currentFunction.addParameter("destructor" + currentFunction.getDestructors());
    }

    //params: AMPER symbol
    @Override public void enterParamsRestParameter(ClojureParser.ParamsRestParameterContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
        currentFunction.setHasRest(true);
    }

    //params : symbol params
    @Override public void enterParamsSymbolParams(ClojureParser.ParamsSymbolParamsContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
    }

    //params :  symbol
    @Override public void enterParamsSymbol(ClojureParser.ParamsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
    }

    //loopParams :  symbol form
    @Override public void enterLoopParamsSymbol(ClojureParser.LoopParamsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
    }

    //loopParams : symbol form loopParams
    @Override public void enterLoopParamsSymbolParams(ClojureParser.LoopParamsSymbolParamsContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
        currentFunction.setCurrentParameter(currentFunction.getCurrentParameter() + 1);
        currentFunction.addParameter(name);
    }

    //letParams : symbol form letParams
    @Override public void enterLetParamsSymbolParams(ClojureParser.LetParamsSymbolParamsContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
    }

    @Override public void enterLetParamsSymbol(ClojureParser.LetParamsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        defineVar(null, name);
    }

    //fn: '(' FN '[' optparams ']' auxforms ')'
    @Override public void enterFn(ClojureParser.FnContext ctx) {
        flag = true;
        String name = "fn";
        FunctionSymbol var = new FunctionSymbol(name, currentScope);
        currentScope.define(var);
        var.setCtx(ctx.auxforms());
        currentFunction = var;
        currentFunction.setCurrentArityNumber(currentFunction.getCurrentArityNumber() + 1);
        currentFunction.arity.put(currentFunction.getCurrentArityNumber(), new Arity());
        currentFunction.establishCurrentArity();
        currentCall.addLast(currentFunction);
        currentScope = var;
    }

    //defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')
    @Override public void enterSingleDefn(ClojureParser.SingleDefnContext ctx) {
        String name = ctx.symbol().getText();
        FunctionSymbol var = new FunctionSymbol(name, currentScope);
        currentScope.define(var);
        var.setCtx(ctx.auxforms());
        currentFunction = var;
        currentFunction.setCurrentArityNumber(currentFunction.getCurrentArityNumber() + 1);
        currentFunction.arity.put(currentFunction.getCurrentArityNumber(), new Arity());
        currentFunction.establishCurrentArity();
        currentCall.addLast(currentFunction);
        currentScope = var;
    }

    @Override public void exitSingleDefn(ClojureParser.SingleDefnContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        currentFunction.setInDeclaration(false);
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //loop: '(' LOOP '[' optLoopParams ']' forms ')'
    @Override public void enterLoop(ClojureParser.LoopContext ctx) {
        FunctionSymbol var = new FunctionSymbol("loop", currentScope);
        currentScope.define(var);
        var.setCtx(ctx.auxforms());
        currentFunction = var;
        currentFunction.setCurrentArityNumber(currentFunction.getCurrentArityNumber() + 1);
        currentFunction.arity.put(currentFunction.getCurrentArityNumber(), new Arity());
        currentFunction.establishCurrentArity();
        currentCall.addLast(currentFunction);
        currentScope = var;
    }

    @Override public void exitLoop(ClojureParser.LoopContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        currentScope = currentScope.getEnclosingScope();
        currentFunction.setInDeclaration(false);
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //let: '(' '[' letParams ']' forms ')'
    @Override public void enterLet(ClojureParser.LetContext ctx) {
        BlockScope var = new BlockScope("let", currentScope);
        currentScope.define(var);
        currentScope = var;
    }

    @Override public void exitLet(ClojureParser.LetContext ctx) {
        currentScope = currentScope.getEnclosingScope();
    }

    //defn: '(' DEFN symbol optDescription  arity+ ')'
    @Override public void enterDefnArity(ClojureParser.DefnArityContext ctx) {
        String name = ctx.symbol().getText();
        FunctionSymbol var = new FunctionSymbol(name, currentScope);
        currentScope.define(var);
        currentFunction = var;
        currentCall.addLast(currentFunction);
        currentScope = var;
    }

    @Override public void exitDefnArity(ClojureParser.DefnArityContext ctx) {
        currentScope = currentScope.getEnclosingScope();
        currentFunction.setInDeclaration(false);
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //arity: '(' '[' optparams ']' forms ')';
    @Override public void enterArity(ClojureParser.ArityContext ctx) {
        currentFunction.setCurrentArityNumber(currentFunction.getCurrentArityNumber() + 1);
        currentFunction.arity.put(currentFunction.getCurrentArityNumber(), new Arity());
        currentFunction.establishCurrentArity();
        currentFunction.setArityCtx(ctx);
    }

    //args : form args
    @Override public void enterArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx) {
        if(currentFunction == null || !flag)
            return;
        Boolean flag = false;
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        for(Arity a : currentFunction.arity.values()){
            if(a.getHasRest() || a.getCurrentArgument() < a.getParametersNumber()) {
                flag = true;
                break;
            }
        }
        if(!flag){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" es mayor a la declaracion.");
        }
    }

    //args : form
    @Override public void enterArgsSymbol(ClojureParser.ArgsSymbolContext ctx) {
        if(currentFunction == null || !flag)
            return;

        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        Boolean flag = false;
        for(Arity a : currentFunction.arity.values()){
            if(a.getHasRest()){
                if (a.getCurrentArgument() >= a.getParametersNumber() - 1) {
                    flag = true;
                    break;
                }
            }
            else {
                if (a.getCurrentArgument().equals(a.getParametersNumber())) {
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" no coincide con la declaracion.");
            return;
        }
        currentFunction.setCurrentArgument(0);
    }

    //args:
    @Override public void enterOptargsEpsilon(ClojureParser.OptargsEpsilonContext ctx) {
        if(currentFunction == null)
            return;

        Boolean flag = false;
        for(Arity a : currentFunction.arity.values()){
            if(a.getHasRest()){
                flag = true;
                break;
            }
            else {
                if (a.getCurrentArgument().equals(a.getParametersNumber())) {
                    flag = true;
                    break;
                }
            }
        }
        if(!flag){
            Interpreter.error(ctx.start, "el numero de argumentos en el llamado a la funcion \"" +
                    currentFunction.name + "\" no coincide con la declaracion.");
        }
    }

    @Override public void enterCallFunction2(ClojureParser.CallFunction2Context ctx) {
        flag = false;
    }

    @Override public void exitCallFunction2(ClojureParser.CallFunction2Context ctx) {
        flag = true;
    }

    //callFunction: '(' SYMBOL optargs ')'
    @Override public void enterCallFunction(ClojureParser.CallFunctionContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        if(symbol == null){
            Interpreter.error(ctx.symbol().getStart(), "la funcion con nombre \"" + name + "\" no ha sido declarada");
            return;
        }
        Symbol aux = null;
        if(symbol.value != null  && symbol.value instanceof Cadena )
             aux = currentScope.resolve(((Cadena) symbol.value).cadena);

        if(aux != null && (aux instanceof FunctionSymbol)){
            //aux.name = name;
            //currentScope.define(aux);
            //symbol = (Symbol) aux;
            //System.out.println(currentScope.resolve(name));
            currentFunction = (FunctionSymbol)aux;
            currentCall.addLast(currentFunction);
            return;
        }
        if(!(symbol instanceof FunctionSymbol) && symbol.value != null && !(symbol.value instanceof FunctionSymbol)){
            Interpreter.error(ctx.symbol().getStart(), "la variable con nombre \"" + name + "\" no es una funcion");
            return;
        }

        if(symbol instanceof FunctionSymbol)
            currentFunction = ((FunctionSymbol) symbol);
        else
            currentFunction = ((FunctionSymbol) symbol.value);
        currentCall.addLast(currentFunction);
    }

    @Override public void exitCallFunction(ClojureParser.CallFunctionContext ctx) {
        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;
    }

    //recur: '(' RECUR optargs ')'
    @Override public void enterFormRecur(ClojureParser.FormRecurContext ctx) {
        if(currentFunction == null)
            Interpreter.error(ctx.getStart(), "Debe estar en una funcion para hacer recursion");
    }

    @Override public void exitFormRecur(ClojureParser.FormRecurContext ctx) {
        currentFunction.setHasRecur(true);
    }

    //forms: priorForm
    @Override public void enterFormsForm(ClojureParser.FormsFormContext ctx) {
        if(currentFunction != null && currentFunction.getInDeclaration() && currentFunction.getHasRecur())
            Interpreter.error(ctx.getStart(), "Recur debe estar al final de la funcion o al final del Arity");
    }

    //literal: symbol
    @Override public void enterLiteralSymbol(ClojureParser.LiteralSymbolContext ctx) {
        String name = ctx.symbol().getText();
        if(currentScope.resolve(name) == null){
            Interpreter.error(ctx.symbol().getStart(), "la variable con nombre \"" + name + "\" no ha sido declarada");
        }
    }

    private void defineVar(Symbol.Type type, String nameToken) {
        VariableSymbol var = new VariableSymbol(nameToken, type);
        currentScope.define(var);
    }
}
