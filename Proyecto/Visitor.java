import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

public class Visitor extends ClojureBaseVisitor<Data>{

    public static GlobalScope globals;
    public static Scope currentScope;
    public static LinkedList<FunctionSymbol> currentCall = new LinkedList<>();
    public static LinkedList<FormReclaimer> reclaimers = new LinkedList<>();
    public static FormReclaimer currentReclaimer;
    public static JFrame frame;
    public static JTabbedPane scopesTabs;
    public static JTabbedPane recalimersTabs;
    public static JTextArea intel;
    FunctionSymbol currentFunction;
    Boolean next;

    public  Visitor(){
        frame = new JFrame("Console");
        intel = new JTextArea(15, 40);

        JTabbedPane consoleTabs = new JTabbedPane();
        intel.setLineWrap(true);
        intel.setWrapStyleWord(true);
        intel.setEditable(false);
        JScrollPane scroller = new JScrollPane(intel);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        JPanel panel = new JPanel();
        panel.add(scroller);
        consoleTabs.addTab("Cosonle", panel);

        scopesTabs = new JTabbedPane();
        recalimersTabs = new JTabbedPane();

        JTextArea intel2 = new JTextArea(15, 40);
        intel2.setLineWrap(true);
        intel2.setWrapStyleWord(true);
        intel2.setEditable(false);
        JScrollPane scroller2 = new JScrollPane(intel2);
        scroller2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        intel2.setText(Interpreter.entrada);
        JPanel panel2 = new JPanel();
        panel2.add(scroller2);
        recalimersTabs.addTab("Input", panel2);

        Box box = new Box(BoxLayout.Y_AXIS);
        Box box2 = new Box(BoxLayout.X_AXIS);
        box2.add(consoleTabs);
        box2.add(scopesTabs);
        box.add(box2);
        box.add(recalimersTabs);
        frame.add(box);

        JButton nextB = new JButton("Next");
        nextB.addActionListener(new NextListener());
        frame.add(BorderLayout.SOUTH, nextB);

        frame.setVisible(true);
        frame.setSize(1400, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        next = false;
    }

    class NextListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            next = true;
        }
    }

    public void block(){
        next = false;
        while(!next){
            System.out.print("");
        }
    }

    public void updateFrames(){
        currentScope.updateFrame();
        for(FormReclaimer r : reclaimers)
            r.updateFrame();
    }

    public void endSimulation(){
        intel.append("\nEnd of simulation");
        System.out.println("End of simulation");
        updateFrames();
    }

    @Override public Data visitAuxform(ClojureParser.AuxformContext ctx) {
        Data r = visit(ctx.form());
        intel.append("--> " + r.getData() + "\n");
        System.out.println(r.getData());
        updateFrames();
        block();
        return r;
    }

    //mainForm: auxform mainForm
    @Override public Data visitMainForms(ClojureParser.MainFormsContext ctx) {
        return visit(ctx.auxform());
    }

    //mainForms: form
    @Override public Data visitMainFormForm(ClojureParser.MainFormFormContext ctx) {
        Data r = visit(ctx.form());
        intel.append("--> " + r.getData() + "\n");
        System.out.println(r.getData());
        updateFrames();
        block();
        return r;
    }

    //priorForm: form priorForm
    @Override public Data visitPriorForms(ClojureParser.PriorFormsContext ctx) {
        visit(ctx.form());
        return visit(ctx.priorForm());
    }
    //priorForm: form
    @Override public Data visitPriorFormForm(ClojureParser.PriorFormFormContext ctx) {
        return visit(ctx.form());
    }

    //forms: priorForm
    @Override public Data visitFormsForm(ClojureParser.FormsFormContext ctx) {
        return visit(ctx.priorForm());
    }

    //args : form args
    @Override public Data visitArgsSymbolArgs(ClojureParser.ArgsSymbolArgsContext ctx) {
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        visit(ctx.form());
        visit(ctx.args());
        return null;
    }

    //args : form
    @Override public Data visitArgsSymbol(ClojureParser.ArgsSymbolContext ctx) {
        block();
        currentScope.updateFrame();
        currentFunction.setCurrentArgument(currentFunction.getCurrentArgument() + 1);
        return visit(ctx.form());
    }

    public Data callFunction(String name, ClojureParser.OptargsContext optargs) {
        Symbol symbol = currentScope.resolve(name);

        Symbol aux = null;
        if(symbol.value != null  && symbol.value instanceof Cadena )
            aux = currentScope.resolve(((Cadena) symbol.value).cadena);
        if(aux != null && (aux instanceof FunctionSymbol))
            currentFunction = ((FunctionSymbol) aux);
        else
            currentFunction = ((FunctionSymbol) symbol);

        currentCall.addLast(currentFunction);
        currentScope = currentFunction;
        currentFunction.addFrame();

        FormReclaimer reclaimer = new FormReclaimer(name);
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        updateFrames();
        block();

        visit(optargs);

        Data r = null;
        if(currentFunction.getCtx() != null) {
            for(int i = 1; i <= currentFunction.getParametersNumber(); i++){
                Symbol s = currentFunction.resolve(currentFunction.getParameter(i));
                s.value = currentReclaimer.getArgument(i);
                currentFunction.addArgument(s.name, s);
            }
            currentReclaimer.arguments.clear();
            r = visit(currentFunction.ctx);
        }
        else{
            for(Arity a : currentFunction.arity.values()){
                if(currentReclaimer.arguments.size() == a.getParametersNumber()) {
                    currentFunction.setArity(a);
                    for(int i = 1; i <= currentFunction.getParametersNumber(); i++) {
                        Symbol s = currentFunction.resolve(currentFunction.getParameter(i));
                        s.value = currentReclaimer.getArgument(i);
                        currentFunction.addArgument(s.name, s);

                    }
                    currentReclaimer.arguments.clear();
                    r = visit(currentFunction.getArityCtx());
                    break;
                }
            }
        }

        updateFrames();
        block();

        currentFunction.setCurrentArgument(0);
        currentFunction.deleteFrame();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;

        if(currentFunction == null)
            currentScope = currentScope.getEnclosingScope();
        else
            currentScope = currentFunction;
        return r;
    }

    //callFunction: '(' SYMBOL optargs ')'
    @Override public Data visitCallFunction(ClojureParser.CallFunctionContext ctx) {
        String name = ctx.symbol().getText();
        return callFunction(name, ctx.optargs());
    }

    //arity: '(' '[' optparams ']' forms ')';
    @Override public Data visitArity(ClojureParser.ArityContext ctx) {
        return visit(ctx.forms());
    }

    //siFalseForm: form
    @Override public Data visitFalseForm(ClojureParser.FalseFormContext ctx) {
        return visit(ctx.form());
    }

    //siFalseForm:
    @Override public Data visitFalseEpsilon(ClojureParser.FalseEpsilonContext ctx) {
        return new Nil();
    }

    //si: '(' SI form form siFalseForm ')'
    @Override public Data visitSi(ClojureParser.SiContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion if");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        Data data = visit(ctx.form(0));
        Data r;

        if(!(data instanceof Nil)){
            if(!(data instanceof Booleano))
                r = visit(ctx.form(1));
            else{
                Booleano flag = (Booleano)(data);
                if(flag.flag)
                    r = visit(ctx.form(1));
                else
                    r = visit(ctx.siFalseForm());
            }
        }
        else
            r = visit(ctx.siFalseForm());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        return r;
    }

    //and: '(' AND forms ')'
    @Override public Data visitAnd(ClojureParser.AndContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion and");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());
        Data r = new Nil();

        for(Data a: currentReclaimer.getArguments()) {
            r = a;
            if(!(a instanceof Nil)){
                if(a instanceof Booleano) {
                    Booleano flag = (Booleano) (a);
                    if (!flag.flag)
                        break;
                }
            }
            else
                break;
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        return r;
    }

    //or: '(' OR forms ')'
    @Override public Data visitOr(ClojureParser.OrContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion or");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());
        Data r = new Nil();

        for(Data a: currentReclaimer.getArguments()) {
            r = a;
            if(!(a instanceof Nil)){
                if(a instanceof Booleano) {
                    Booleano flag = (Booleano) (a);
                    if (flag.flag)
                        break;
                }
                else
                    break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        return r;
    }

    //hacer: '(' HACER forms ')'
    @Override public Data visitHacer(ClojureParser.HacerContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion do");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        Data r;
        if(currentReclaimer.arguments.size() > 0)
            r = currentReclaimer.getArgument(currentReclaimer.arguments.size());
        else
            r = new Nil();

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        return r;
    }

    //inc: '(' INC form ')';
    @Override public Data visitInc(ClojureParser.IncContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion inc");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        Numero r = (Numero)(visit(ctx.form()));

        r.numero = r.numero + 1;
        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        return r;
    }

    //contains:'(' CONTAINS vector form ')' #containsvector
    @Override public Data visitContainsvector(ClojureParser.ContainsvectorContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion Contains");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        Data r = visit(ctx.form());
        VLS c =  (VLS)(visit(ctx.vector()));

        Booleano result = new Booleano(c.contains(r));

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(c);
        return result;
    }

    //contains:'(' CONTAINS set form ')' #containsvector
    @Override public Data visitContainsset(ClojureParser.ContainssetContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion Contains");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        Data r = visit(ctx.form());
        VLS c =  (VLS)(visit(ctx.set()));

        Booleano result = new Booleano(c.contains(r));

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(c);
        return result;
    }

    //into: '(' INTO form form')'
    @Override public Data visitInto(ClojureParser.IntoContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion into");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        Vector r = (Vector) visit(ctx.form(0));
        VLSM c =  (VLSM)(visit(ctx.form(1)));

        r.into(c);

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);
        return r;
    }

    //conj: '(' CONJ form form ')'
    @Override public Data visitConj(ClojureParser.ConjContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion conj");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        Data r = visit(ctx.form(1));
        VLS c =  (VLS)(visit(ctx.form(0)));
        if (( c.getClass().getName()).equals("Lista"))
            c.addDataLista(r);
        else
            c.addData(r);

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(c);
        return c;
    }

    //nth: '(' NTH form form')';
    @Override public Data visitNth(ClojureParser.NthContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("NTH");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        Data tmp = visit(ctx.form(0));
        if(!(tmp instanceof VL))
            Interpreter.error(ctx.getStart(), "NTH recibe una lista o un vector");
        VL vl = (VL)(tmp);
        Data n = visit(ctx.form(1));
        if(!(n instanceof Numero))
            Interpreter.error(ctx.getStart(), "NTH recibe un numero esntero");

        Data data = vl.getDataWithNTH( (int) (((Numero)(n)).numero));

        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(data);
        return data;
    }

    @Override public Data visitMap(ClojureParser.MapContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("estructura Map");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);

        Mapa mapa = new Mapa();
        ArrayList<Data> arguments =currentReclaimer.getArguments();

        for(int i=0;i<arguments.size();i=i+2)
            mapa.addDataMap(arguments.get(i),arguments.get(i+1));

        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(mapa);

        return mapa;
    }

    //vector: '[' forms ']'
    @Override public Data visitVector(ClojureParser.VectorContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("estructura vector");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);

        Vector vector = new Vector();

        for(Data a: currentReclaimer.getArguments())
            vector.addData(a);

        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(vector);

        return vector;
    }

    //get: '(' GET form form defecto')';
    @Override
    public Data visitGet(ClojureParser.GetContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion Get");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        VLS c =  (VLS)(visit(ctx.form(0)));

        Data element=  visit(ctx.form(1));
        Data defecto =  (visit(ctx.defecto()));

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(c.functionget(element,defecto));

        return c.functionget(element,defecto);
    }

    //list: '\'(' forms ')'
    @Override public Data visitList(ClojureParser.ListContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("estructura lista");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);

        Lista lista = new Lista();

        for(Data a: currentReclaimer.getArguments())
            lista.addData(a);

        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(lista);

        return lista;
    }

    //set: '#{' forms '}' ;
    @Override public Data visitSet(ClojureParser.SetContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("estructura set");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        block();
        Conjunto set = new Conjunto();

        for(Data a: currentReclaimer.getArguments())
            set.addData(a);

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(set);

        return set;
    }

    //println: '(' PRINTLN forms ')';
    @Override public Data visitPrintln(ClojureParser.PrintlnContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("println");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        for(Data a: currentReclaimer.getArguments()){
            System.out.println(a);
            intel.append("--> " + a + "\n");
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Nil nil = new Nil();
        if(currentReclaimer != null)
            currentReclaimer.addArgument(nil);

        return nil;
    }

    //str: '(' STR forms ')'
    @Override public Data visitStr(ClojureParser.StrContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("STR");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());

        StringBuilder bulBuilder =  new StringBuilder();
        for(Data a: currentReclaimer.getArguments())
            bulBuilder.append(a.toString());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Cadena cadena = new Cadena(bulBuilder.toString());
        if(currentReclaimer != null)
            currentReclaimer.addArgument(cadena);

        return cadena;
    }

    ////reduce: '(' REDUCE form vls')';
    @Override public Data visitReduce(ClojureParser.ReduceContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer;
        String name = ctx.form(0).getText();
        if(name.equals("+"))
            reclaimer= new FormReclaimer("la funcion sumar");
        else if(name.equals("-"))
            reclaimer= new FormReclaimer("la funcion restar");
        else if(name.equals("*"))
            reclaimer= new FormReclaimer("la funcion multiplicar");
        else
            reclaimer= new FormReclaimer("la funcion dividir");

        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        VLS c=(VLS)(visit(ctx.form(1)));
        double result=0;
        if(name.equals("+"))
            result=c.suma();
        else if(name.equals("-"))
            result=c.restar();
        else if(name.equals("*"))
            result=c.multiplicar();
        else if(name.equals("/"))
            result=c.dividir();

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(result);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //sum: '(' SUM forms ')'
    @Override public Data visitSum(ClojureParser.SumContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion sumar");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());
        double sum = 0;
        for(Data a: currentReclaimer.getArguments())
            sum += ((Double) a.getData());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(sum);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //minus: '(' MINUS forms ')';
    @Override public Data visitMinus(ClojureParser.MinusContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion resta");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        if(currentReclaimer.getArguments().size() < 2)
            Interpreter.error(ctx.getStart(), "Se necesitan al menos dos argumentos para restar");

        double sum = ((Double) (currentReclaimer.getArgument(1).getData()));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++)
            sum = sum - ((Double) (currentReclaimer.getArgument(i).getData()));

        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(sum);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //mult: '(' MULT forms ')'
    @Override public Data visitMult(ClojureParser.MultContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion multiplicar");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        double mult = 1;
        for(Data a: currentReclaimer.getArguments())
            mult *= ((Double) a.getData());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(mult);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //div: '(' DIV forms ')';
    @Override public Data visitDiv(ClojureParser.DivContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion dividir");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        if(currentReclaimer.getArguments().size() < 2)
            Interpreter.error(ctx.getStart(), "Se necesitan al menos dos argumentos para dividir");

        double div = ((Double) (currentReclaimer.getArgument(1).getData()));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++)
            div = div / ((Double) (currentReclaimer.getArgument(i).getData()));

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(div);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //def: '(' DEF symbol form')'
    @Override public Data visitDefSymbolForm(ClojureParser.DefSymbolFormContext ctx) {
        FormReclaimer reclaimer = new FormReclaimer("definir variable");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        updateFrames();
        block();
        String name = ctx.symbol().getText();
        Symbol s = currentScope.resolve(name);
        s.value = visit(ctx.form());

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;
        return new Cadena("Variable " + name + ", valor: " + s.value.toString());
    }

    //fn: '(' FN '[' optparams ']' auxforms ')'
    @Override public Data visitFn(ClojureParser.FnContext ctx) {
        updateFrames();
        Cadena cadena = new Cadena("fn");
        if(currentReclaimer != null)
            currentReclaimer.addArgument(cadena);
        return cadena;
    }

    //defn: '(' DEFN symbol optDescription  arity+ ')'
    @Override public Data visitDefnArity(ClojureParser.DefnArityContext ctx) {
        updateFrames();
        return new Cadena(((FunctionSymbol) (currentScope.resolve(ctx.symbol().getText()))).toString2() );
    }

    //defn: '(' DEFN symbol optDescription '[' optparams ']' auxforms ')
    @Override public Data visitSingleDefn(ClojureParser.SingleDefnContext ctx) {
        updateFrames();
        return new Cadena(((FunctionSymbol) (currentScope.resolve(ctx.symbol().getText()))).toString2());
    }

    //literal: symbol
    @Override public Data visitLiteralSymbol(ClojureParser.LiteralSymbolContext ctx) {
        String name = ctx.symbol().getText();
        if(currentReclaimer != null)
            currentReclaimer.addArgument(currentScope.resolve(name).value);

        updateFrames();
        block();
        return (Data)currentScope.resolve(name).value.clone();
    }

    //loopParams :  symbol form
    @Override public Data visitLoopParamsSymbol(ClojureParser.LoopParamsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        symbol.value = visit(ctx.form());
        return  symbol.value;
    }

    //loopParams : symbol form loopParams
    @Override public Data visitLoopParamsSymbolParams(ClojureParser.LoopParamsSymbolParamsContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        symbol.value = visit(ctx.form());
        visit(ctx.loopParams());
        return  symbol.value;
    }

    //letParams : symbol form letParams
    @Override public Data visitLetParamsSymbolParams(ClojureParser.LetParamsSymbolParamsContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        symbol.value = visit(ctx.form());
        visit(ctx.letParams());
        return  symbol.value;
    }

    @Override public Data visitLetParamsSymbol(ClojureParser.LetParamsSymbolContext ctx) {
        String name = ctx.symbol().getText();
        Symbol symbol = currentScope.resolve(name);
        symbol.value = visit(ctx.form());
        return  symbol.value;
    }

    //let: '(' '[' letParams ']' forms ')'
    @Override public Data visitLet(ClojureParser.LetContext ctx) {
        BlockScope symbol = (BlockScope) currentScope.resolve("let");
        currentScope = symbol;
        symbol.addFrame();

        FormReclaimer reclaimer = new FormReclaimer("let");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        updateFrames();
        block();

        visit(ctx.letParams());
        currentReclaimer.arguments.clear();
        visit(ctx.forms());

        Data r;
        if(currentReclaimer.arguments.size() > 0)
            r = currentReclaimer.getArgument(currentReclaimer.arguments.size());
        else
            r = new Nil();

        updateFrames();
        block();

        symbol.deleteFrame();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();

        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        currentScope = currentScope.getEnclosingScope();
        return r;
    }

    //loop: '(' LOOP '[' optLoopParams ']' forms ')'
    @Override public Data visitLoop(ClojureParser.LoopContext ctx) {
        Symbol symbol = currentScope.resolve("loop");
        currentFunction = ((FunctionSymbol) symbol);
        currentCall.addLast(currentFunction);
        currentScope = ((FunctionSymbol) symbol);
        currentFunction.addFrame();

        FormReclaimer reclaimer = new FormReclaimer("loop");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        currentFunction.setCurrentArgument(0);
        updateFrames();
        block();

        visit(ctx.optLoopParams());
        currentReclaimer.arguments.clear();
        visit(ctx.auxforms());

        Data r;
        if(currentReclaimer.arguments.size() > 0)
            r = currentReclaimer.getArgument(currentReclaimer.arguments.size());
        else
            r = new Nil();

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        currentFunction.setCurrentArgument(0);
        currentFunction.deleteFrame();

        currentCall.removeLast();
        if(currentCall.size() > 0)
            currentFunction = currentCall.getLast();
        else
            currentFunction = null;

        currentScope = currentScope.getEnclosingScope();
        return r;
    }

    //nil: NIL;
    @Override public Data visitNil(ClojureParser.NilContext ctx) {
        Nil nil = new Nil();
        if(currentReclaimer != null)
            currentReclaimer.addArgument(nil);
        updateFrames();
        block();
        return nil;
    }

    //literal: BOOLEAN
    @Override public Data visitLiteralBOOLEAN(ClojureParser.LiteralBOOLEANContext ctx) {
        String s = ctx.BOOLEAN().getText();

        Booleano b;
        if(s.equals("true"))
            b = new Booleano(true);
        else
            b = new Booleano(false);

        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        updateFrames();
        block();
        return b;
    }

    //literal: STRING
    @Override public Data visitLiteralString(ClojureParser.LiteralStringContext ctx) {
        String s = ctx.STRING().getText();
        s = s.substring(1, s.length()-1);
        Cadena cadena = new Cadena(s);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(cadena);

        updateFrames();
        block();
        return cadena;
    }

    //number: LONG
    @Override public Data visitNumberLong(ClojureParser.NumberLongContext ctx) {
        Numero numero = new Numero(Double.parseDouble(ctx.LONG().getText()));
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        updateFrames();
        block();
        return numero;
    }

    //number: FLOAT
    @Override public Data visitNumberFloat(ClojureParser.NumberFloatContext ctx) {
        Numero numero = new Numero(Double.parseDouble(ctx.FLOAT().getText()));
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        updateFrames();
        block();
        return numero;
    }

    //------------------ Comparadores --------------------------------------

    //igual: '(' IGUAL forms ')';
    @Override public Data visitIgual(ClojureParser.IgualContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion igual");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(ctx.getStart(), "Se necesitan al un argumentos para igualar");

        Boolean flag = true;
        System.out.println(currentReclaimer.getArguments());
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){

            if( !(currentReclaimer.getArgument(i).equals(currentReclaimer.getArgument(i-1)))){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //mayor: '(' MAYOR forms ')';
    @Override public Data visitMayor(ClojureParser.MayorContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion mayor");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(ctx.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) <= 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //menor: '(' MENOR forms ')';
    @Override public Data visitMenor(ClojureParser.MenorContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion menor");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(ctx.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) >= 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //mayorIgual: '(' MAYORIGUAL forms ')';
    @Override public Data visitMayorIgual(ClojureParser.MayorIgualContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion mayor igual");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(ctx.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) < 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //menorIgual: '(' MENORIGUAL forms ')';
    @Override public Data visitMenorIgual(ClojureParser.MenorIgualContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion menor");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(ctx.forms());

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(ctx.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) > 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //------------------------ recur -------------------------

    //recur: '(' RECUR optargs ')';
    @Override public Data visitRecur(ClojureParser.RecurContext ctx) {
        updateFrames();
        block();

        String name = currentScope.getScopeName();
        ClojureParser.OptargsContext optargs = ctx.optargs();

        FormReclaimer reclaimer = new FormReclaimer("recur " + name);
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        updateFrames();
        block();

        visit(optargs);

        Data r = null;
        if(currentFunction.getCtx() != null) {
            for(int i = 1; i <= currentFunction.getParametersNumber(); i++){
                Symbol s = currentFunction.resolve(currentFunction.getParameter(i));
                s.value = currentReclaimer.getArgument(i);
                currentFunction.addArgument(s.name, s);
            }
            currentReclaimer.arguments.clear();
            r = visit(currentFunction.ctx);
        }
        else{
            for(Arity a : currentFunction.arity.values()){
                if(currentReclaimer.arguments.size() == a.getParametersNumber()) {
                    currentFunction.setArity(a);
                    for(int i = 1; i <= currentFunction.getParametersNumber(); i++) {
                        Symbol s = currentFunction.resolve(currentFunction.getParameter(i));
                        s.value = currentReclaimer.getArgument(i);
                        currentFunction.addArgument(s.name, s);

                    }
                    currentReclaimer.arguments.clear();
                    r = visit(currentFunction.getArityCtx());
                    break;
                }
            }
        }

        updateFrames();
        block();

        currentFunction.setCurrentArgument(0);
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        return r;
    }

    //isNil: '(' ISNIL form ')';
    @Override public Data visitIsNil(ClojureParser.IsNilContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion isNIL");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        String r = ctx.form().getText();

        Booleano flag =new Booleano(false) ;
        if (r.compareTo("nil")==0)
             flag=new Booleano(true);

        updateFrames();
        block();
        if(currentReclaimer != null)
            currentReclaimer.addArgument(visit(ctx.form()));
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();

        if(currentReclaimer != null)
            currentReclaimer.addArgument(flag);

        return flag;
    }

    //simple_sym: SYMBOL;
    @Override public Data visitSimple_sym(ClojureParser.Simple_symContext ctx) {
        String s = ctx.SYMBOL().getText();

        Keyword keyword = new Keyword(s);
        //if (currentReclaimer != null)
        //   currentReclaimer.addArgument(keyword);
        updateFrames();
        block();
        return keyword;
    }

    //literal:keyword
    @Override public Data visitLiteralKeyword(ClojureParser.LiteralKeywordContext ctx) { return visit(ctx.keyword()); }

    //simple_keyword: ':' symbol;
    @Override public Data visitSimple_keyword(ClojureParser.Simple_keywordContext ctx) {
        String s = ":" + ctx.symbol().getText();

        Keyword keyword = new Keyword(s);
        if (currentReclaimer != null)
            currentReclaimer.addArgument(keyword);
        updateFrames();
        block();
        return keyword;
    }

    @Override public Data visitSymbol_ns_symbol(ClojureParser.Symbol_ns_symbolContext ctx) { return visit(ctx.ns_symbol()); }

    @Override public Data visitSymbol_simple_sym(ClojureParser.Symbol_simple_symContext ctx) {
        String s = ctx.simple_sym().getText();

        Keyword keyword = new Keyword(s);
        //if (currentReclaimer != null)
         //   currentReclaimer.addArgument(keyword);
        updateFrames();
        block();
        return keyword;
    }
    //keyword :simple_keyword
    @Override public Data visitKeywordSimple_keyword(ClojureParser.KeywordSimple_keywordContext ctx) {
        String s = ctx.simple_keyword().getText();

        Keyword keyword = new Keyword(s);
        if (currentReclaimer != null)
            currentReclaimer.addArgument(keyword);
        updateFrames();
        block();
        return keyword;
    }

    //print: '(' PRINT forms ')';
    @Override public Data visitPrint(ClojureParser.PrintContext ctx) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("print");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(ctx.forms());
        for(Data a: currentReclaimer.getArguments()){
            System.out.print(a + " ");
            intel.append("--> " + a + " ");
        }

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Nil nil = new Nil();
        if(currentReclaimer != null)
            currentReclaimer.addArgument(nil);

        return nil;
    }

    //----------------------operadores aritmeticos 2 ----------------------------------------

    public Data sum(ClojureParser.OptargsContext optargs){
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion sumar");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(optargs);
        double sum = 0;
        for(Data a: currentReclaimer.getArguments())
            sum += ((Double) a.getData());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(sum);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //minus: '(' MINUS forms ')';
    public Data minus(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion resta");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(optargs);
        if(currentReclaimer.getArguments().size() < 2)
            Interpreter.error(optargs.getStart(), "Se necesitan al menos dos argumentos para restar");

        double sum = ((Double) (currentReclaimer.getArgument(1).getData()));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++)
            sum = sum - ((Double) (currentReclaimer.getArgument(i).getData()));

        updateFrames();
        block();

        currentReclaimer.destroyReclaimer();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(sum);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //mult: '(' MULT forms ')'
    public Data mult(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion multiplicar");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(optargs);
        double mult = 1;
        for(Data a: currentReclaimer.getArguments())
            mult *= ((Double) a.getData());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(mult);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //div: '(' DIV forms ')';
    public Data div(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion dividir");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(optargs);
        if(currentReclaimer.getArguments().size() < 2)
            Interpreter.error(optargs.getStart(), "Se necesitan al menos dos argumentos para dividir");

        double div = ((Double) (currentReclaimer.getArgument(1).getData()));
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++)
            div = div / ((Double) (currentReclaimer.getArgument(i).getData()));

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Numero numero = new Numero(div);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(numero);

        return numero;
    }

    //------------------ Comparadores --------------------------------------

    //igual: '(' IGUAL forms ')';
    public Data igual(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion igual");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(optargs);

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(optargs.getStart(), "Se necesitan al un argumentos para igualar");

        Boolean flag = true;
        System.out.println(currentReclaimer.getArguments());
        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){

            if( !(currentReclaimer.getArgument(i).equals(currentReclaimer.getArgument(i-1)))){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //mayor: '(' MAYOR forms ')';
    public Data mayor(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion mayor");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(optargs);

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(optargs.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) <= 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //menor: '(' MENOR forms ')';
    public Data menor(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion menor");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(optargs);

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(optargs.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) >= 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //mayorIgual: '(' MAYORIGUAL forms ')';
    public Data mayorIgual(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion mayor igual");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(optargs);

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(optargs.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) < 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //menorIgual: '(' MENORIGUAL forms ')';
    public Data menorIgual(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion menor");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        visit(optargs);

        if(currentReclaimer.getArguments().size() < 1)
            Interpreter.error(optargs.getStart(), "Se necesita al un argumentos para comparar");

        Boolean flag = true;

        for(int i = 2; i <= currentReclaimer.getArguments().size(); i++){
            if( ((Numero)(currentReclaimer.getArgument(i))).compareTo((Numero)(currentReclaimer.getArgument(i-1))) > 0){
                flag = false;
                break;
            }
        }

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Booleano b = new Booleano(flag);
        if(currentReclaimer != null)
            currentReclaimer.addArgument(b);

        return b;
    }

    //inc: '(' INC form ')';
    public Data inc(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion inc");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        Numero r = (Numero)(visit(optargs));

        r.numero = r.numero + 1;
        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);

        return r;
    }

    //str: '(' STR forms ')'
    public Data str(ClojureParser.OptargsContext optargs) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("STR");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visit(optargs);

        StringBuilder bulBuilder =  new StringBuilder();
        for(Data a: currentReclaimer.getArguments())
            bulBuilder.append(a.toString());

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        Cadena cadena = new Cadena(bulBuilder.toString());
        if(currentReclaimer != null)
            currentReclaimer.addArgument(cadena);

        return cadena;
    }

    //callFunction2: '(' form optargs ')'
    @Override public Data visitCallFunction2(ClojureParser.CallFunction2Context ctx) {

        FormReclaimer reclaimer = new FormReclaimer("llamar funcion");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;

        Cadena cadena = (Cadena)(visit(ctx.form()));

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();

        Data r;
        if(cadena.cadena.equals("fn")){
            return callFunction("fn", ctx.optargs());
        }
        if(cadena.cadena.equals("+")) {
            Symbol symbol = currentScope.resolve("+");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = sum(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("-")) {
            Symbol symbol = currentScope.resolve("-");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = minus(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("*")) {
            Symbol symbol = currentScope.resolve("*");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = mult(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("/")) {
            Symbol symbol = currentScope.resolve("/");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = div(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals(">")) {
            Symbol symbol = currentScope.resolve(">");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = mayor(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals(">=")) {
            Symbol symbol = currentScope.resolve(">=");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = mayorIgual(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("<")) {
            Symbol symbol = currentScope.resolve("<");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = menor(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("<=")) {
            Symbol symbol = currentScope.resolve("<=");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = menorIgual(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("=")) {
            Symbol symbol = currentScope.resolve("=");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = igual(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("inc")) {
            Symbol symbol = currentScope.resolve("inc");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = inc(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        if(cadena.cadena.equals("str")) {
            Symbol symbol = currentScope.resolve("str");
            currentFunction = ((FunctionSymbol) symbol);
            currentCall.addLast(currentFunction);
            r = str(ctx.optargs());

            currentFunction.setCurrentArgument(0);
            currentCall.removeLast();
            if(currentCall.size() > 0)
                currentFunction = currentCall.getLast();
            else
                currentFunction = null;
            return r;
        }
        return callFunction(cadena.cadena, ctx.optargs());
    }

    @Override public Data visitRmRegex(ClojureParser.RmRegexContext ctx) {
        updateFrames();
        block();

        FormReclaimer reclaimer = new FormReclaimer("Expresion regular");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        visitChildren(ctx);
        Data r;
        r = new Cadena(ctx.regex().getText());
        updateFrames();
        block();

        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        if(currentReclaimer != null)
            currentReclaimer.addArgument(r);


        return r;
    }

    @Override public Data visitFirst(ClojureParser.FirstContext ctx) {

        updateFrames();
        block();
        FormReclaimer reclaimer = new FormReclaimer("la funcion First");
        reclaimers.addLast(reclaimer);
        currentReclaimer = reclaimer;
        VLS c =  (VLS)(visit(ctx.form()));

        Data result = c.functionfirst();

        updateFrames();
        block();
        reclaimers.removeLast();
        currentReclaimer.destroyReclaimer();
        updateFrames();
        if(reclaimers.size() > 0)
            currentReclaimer = reclaimers.getLast();
        else
            currentReclaimer = null;

        //if(currentReclaimer != null)
        //   currentReclaimer.addArgument(r);

        return result;
    }
}
