import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Visitor extends PsicoderBaseVisitor<String> {

    public static HashMap<String, Scope> scopes = DefPhase.scopes;
    private static GlobalScope globals = DefPhase.globals;
    public static Scope currentScope = DefPhase.currentScope;
    private Integer functionArgument = 0;
    private FunctionSymbol tmp;
    private Scope current;
    private String stringTmp;
    private TypeVisitor2 visitor = new TypeVisitor2();
    private String casesTmp;

    //b :FUNCION_PRINCIPAL statements FIN_PRINCIPAL  #bFuncionPrincipal
    @Override
    public String visitBFuncionPrincipal(PsicoderParser.BFuncionPrincipalContext ctx) {
        currentScope = scopes.get("funcionPrincipal");
        currentScope.setCounter(1);
        visit(ctx.statements());
        return null;
    }

    //FUNCION type ID TK_PAR_IZQ optparams TK_PAR_DER HACER statements RETORNAR exp TK_PYC FIN_FUNCION
    @Override
    public String visitElementFuncion(PsicoderParser.ElementFuncionContext ctx) {
        currentScope = scopes.get(ctx.ID().getText());
        currentScope.setCounter(1);
        visit(ctx.statements());
        return visit(ctx.exp());
    }

    //exp: ID  TK_PAR_IZQ  optargs  TK_PAR_DER      #expFuncion
    @Override
    public String visitExpFuncion(PsicoderParser.ExpFuncionContext ctx) {
        String name = ctx.ID().getText();
        tmp = ((FunctionSymbol) scopes.get(name));
        functionArgument = 0;
        visit(ctx.optargs());
        Scope scope = currentScope;
        String aux = visitElementFuncion(tmp.ctx);
        currentScope = scope;
        //System.out.println(currentScope);
        return aux;
    }

    //stmt : ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC     #stmtCallFunction
    @Override
    public String visitStmtCallFunction(PsicoderParser.StmtCallFunctionContext ctx) {
        String name = ctx.ID().getText();
        tmp = ((FunctionSymbol) scopes.get(name));
        functionArgument = 0;
        visit(ctx.optargs());
        Scope scope = currentScope;
        String aux = visitElementFuncion(tmp.ctx);
        currentScope = scope;
        return aux;
    }

    // args : exp       #argsExp
    @Override
    public String visitArgsExp(PsicoderParser.ArgsExpContext ctx) {
        tmp.arguments.get( tmp.parameters.get(functionArgument) ).value = visit(ctx.exp());
        return null;
    }

    // args : exp TK_COMA args       #argsExpArgs
    @Override
    public String visitArgsExpArgs(PsicoderParser.ArgsExpArgsContext ctx) {
        tmp.arguments.get( tmp.parameters.get(functionArgument) ).value = visit(ctx.exp());
        functionArgument++;
        visit(ctx.args());
        return null;
    }

    // optexp:  ID  TK_ASIG  exp  TK_COMA  optexp #optexpIDAsigExpComa
    @Override
    public String visitOptexpIDAsigExpComa(PsicoderParser.OptexpIDAsigExpComaContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        visit(ctx.optexp());
        return null;
    }

    // optexp: ID  TK_ASIG  exp  #optexpIDAsigExp
    @Override
    public String visitOptexpIDAsigExp(PsicoderParser.OptexpIDAsigExpContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt4: type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC      #stmt4TypeIDAsigComa
    @Override
    public String visitStmt4TypeIDAsigComa(PsicoderParser.Stmt4TypeIDAsigComaContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        visit(ctx.optexp());
        return null;
    }

    //stmt:  type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC       #stmtTypeAsig
    @Override public String visitStmtTypeAsig(PsicoderParser.StmtTypeAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        visit(ctx.optexp());
        return null;
    }

    // stmt: ID  TK_ASIG  exp  TK_PYC   #stmtIDAsig
    @Override
    public String visitStmtIDAsig(PsicoderParser.StmtIDAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt4: ID  TK_ASIG  exp  TK_PYC     #stmt4IDAsig
    @Override
    public String visitStmt4IDAsig(PsicoderParser.Stmt4IDAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt: type  ID  TK_ASIG  exp  TK_PYC        #stmtTypeAsifExp
    @Override
    public String visitStmtTypeAsigExp(PsicoderParser.StmtTypeAsigExpContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt4: type  ID  TK_ASIG  exp  TK_PYC       #stmt4TypeIDAsig
    @Override
    public String visitStmt4TypeIDAsig(PsicoderParser.Stmt4TypeIDAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC     #stmtIDChain
    @Override
    public String visitStmtIDChain(PsicoderParser.StmtIDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        current = scopes.get(name);
        stringTmp = visit(ctx.exp());
        visit(ctx.chain());
        return null;
    }

    //chain : ID  TK_PUNTO  chain
    @Override
    public String visitChainIDPunto(PsicoderParser.ChainIDPuntoContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        current = scopes.get(name);
        visit(ctx.chain());
        return null;
    }

    //chain : ID
    @Override
    public String visitChainID(PsicoderParser.ChainIDContext ctx) {
        String name = ctx.ID().getSymbol().getText();
        Symbol var = current.resolve(name);
        //System.out.println(var);
        if(stringTmp == null){
            return var.value;
        }
        var.value = stringTmp;
        //System.out.println(var);
        return null;
    }

    // exp: ID  TK_PUNTO  chain      #expIDChain
    @Override
    public String visitExpIDChain(PsicoderParser.ExpIDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        current = scopes.get(name);
        stringTmp = null;
        return visit(ctx.chain());
    }

    // stmt4:  ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC        #stmt4IDChainAsig
    @Override
    public String visitStmt4IDChainAsig(PsicoderParser.Stmt4IDChainAsigContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        current = DefPhase.scopes.get(name);
        stringTmp = visit(ctx.exp());
        visit(ctx.chain());
        return null;
    }

    // stmt: SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements  FIN_SI     #stmtSi
    @Override
    public String visitStmtSi(PsicoderParser.StmtSiContext ctx) {
        String flag = visit(ctx.exp());
        if(flag.equals("verdadero")){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            visit(ctx.statements());
            currentScope.setCounter(1);
            currentScope = currentScope.getEnclosingScope();
            //currentScope.setCounter(currentScope.getCounter() + 1);
        }
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt: SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements  FIN_SI     #stmtSi
    @Override
    public String visitStmt2Si(PsicoderParser.Stmt2SiContext ctx) {
        String flag = visit(ctx.exp());
        if(flag.equals("verdadero")){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            visit(ctx.statements3());
            currentScope.setCounter(1);
            currentScope = currentScope.getEnclosingScope();
            //currentScope.setCounter(currentScope.getCounter() + 1);
        }
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    //stmt: SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements si_noBlock       #stmtSiNo
    @Override
    public String visitStmtSiNo(PsicoderParser.StmtSiNoContext ctx) {
        String flag = visit(ctx.exp());
        if(flag.equals("verdadero")){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            currentScope.setCounter(1);
            visit(ctx.statements());
            currentScope = currentScope.getEnclosingScope();
            currentScope.setCounter(currentScope.getCounter() + 1);
        }
        else {
            currentScope.setCounter(currentScope.getCounter() + 1);
            visit(ctx.si_noBlock());
        }
        return null;
    }

    //stmt: SI  TK_PAR_IZQ  exp  TK_PAR_DER  ENTONCES  statements si_noBlock       #stmtSiNo
    @Override
    public String visitStmt2SiNo(PsicoderParser.Stmt2SiNoContext ctx) {
        String flag = visit(ctx.exp());
        if(flag.equals("verdadero")){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            currentScope.setCounter(1);
            visit(ctx.statements3());
            currentScope = currentScope.getEnclosingScope();
            currentScope.setCounter(currentScope.getCounter() + 1);
        }
        else {
            currentScope.setCounter(currentScope.getCounter() + 1);
            visit(ctx.si_noBlock2());
        }
        return null;
    }

    //si_noBlock: SI_NO  statements  FIN_SI
    @Override
    public String visitSi_no2(PsicoderParser.Si_no2Context ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        currentScope.setCounter(1);
        visit(ctx.statements3());
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }


    //si_noBlock: SI_NO  statements  FIN_SI
    @Override
    public String visitSi_no(PsicoderParser.Si_noContext ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        currentScope.setCounter(1);
        visit(ctx.statements());
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    //para_stmt: ID  TK_ASIG  exp  TK_PYC
    @Override
    public String visitParaStmtIDAsig(PsicoderParser.ParaStmtIDAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return ctx.ID().getText();
    }

    //para_stmt: type  ID  TK_ASIG  exp  TK_PYC
    @Override
    public String visitParaStmtTypeAsigExp(PsicoderParser.ParaStmtTypeAsigExpContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return ctx.ID().getText();
    }

    // stmt:  PARA  TK_PAR_IZQ  para_stmt  exp  TK_PYC  exp TK_PAR_DER  HACER  statements3  FIN_PARA     #stmtPara
    @Override
    public String visitStmtPara(PsicoderParser.StmtParaContext ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        currentScope.setCounter(1);
        String name = visit(ctx.para_stmt());
        String val = visit(ctx.exp(1));
        Symbol symbol = currentScope.resolve(name);
        while(visit(ctx.exp(0)).equals("verdadero")){
            visit(ctx.statements3());
            symbol.value = Integer.toString(Integer.parseInt(symbol.value) + Integer.parseInt(val));
            currentScope.setCounter(1);
        }
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt:  PARA  TK_PAR_IZQ  para_stmt  exp  TK_PYC  exp TK_PAR_DER  HACER  statements3  FIN_PARA     #stmtPara
    @Override
    public String visitStmt2Para(PsicoderParser.Stmt2ParaContext ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        currentScope.setCounter(1);
        String name = visit(ctx.para_stmt());
        String val = visit(ctx.exp(1));
        Symbol symbol = currentScope.resolve(name);
        while(visit(ctx.exp(0)).equals("verdadero")){
            visit(ctx.statements3());
            symbol.value = Integer.toString(Integer.parseInt(symbol.value) + Integer.parseInt(val));
            currentScope.setCounter(1);
        }
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt:  MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER statements3  FIN_MIENTRAS        #stmtMientras
    @Override
    public String visitStmtMientras(PsicoderParser.StmtMientrasContext ctx) {
        while(visit(ctx.exp()).equals("verdadero")){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            currentScope.setCounter(1);
            visit(ctx.statements3());
            currentScope = currentScope.getEnclosingScope();
        }
        //currentScope.setCounter(1);
        //currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt:  MIENTRAS  TK_PAR_IZQ  exp  TK_PAR_DER  HACER statements3  FIN_MIENTRAS        #stmtMientras
    @Override
    public String visitStmt2Mientras(PsicoderParser.Stmt2MientrasContext ctx) {
        while(visit(ctx.exp()).equals("verdadero")){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            currentScope.setCounter(1);
            visit(ctx.statements3());
            currentScope = currentScope.getEnclosingScope();
        }
        //currentScope.setCounter(1);
        //currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt:  HACER  statements  MIENTRAS  TK_PAR_IZQ  exp TK_PAR_DER  TK_PYC      #stmtHacer
    @Override
    public String visitStmtHacer(PsicoderParser.StmtHacerContext ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        currentScope.setCounter(1);
        visit(ctx.statements3());
        while(visit(ctx.exp()).equals("verdadero")){
            currentScope.setCounter(1);
            visit(ctx.statements3());
        }
        currentScope.setCounter(1);
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt:  HACER  statements3  MIENTRAS  TK_PAR_IZQ  exp TK_PAR_DER  TK_PYC      #stmtHacer
    @Override
    public String visitStmt2Hacer(PsicoderParser.Stmt2HacerContext ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        currentScope.setCounter(1);
        visit(ctx.statements3());
        while(visit(ctx.exp()).equals("verdadero")){
            currentScope.setCounter(1);
            visit(ctx.statements3());
        }
        currentScope.setCounter(1);
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    //stmt:  SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases FIN_SELECCIONAR     #stmtSeleccionar
    @Override
    public String visitStmtSeleccionar(PsicoderParser.StmtSeleccionarContext ctx) {
        casesTmp = currentScope.resolve(ctx.ID().getText()).value;
        //System.out.println(casesTmp);
        return visit(ctx.cases());
    }

    //stmt:  SELECCIONAR  TK_PAR_IZQ  ID  TK_PAR_DER  ENTRE  cases FIN_SELECCIONAR     #stmtSeleccionar
    @Override
    public String visitStmt2Seleccionar(PsicoderParser.Stmt2SeleccionarContext ctx) {
        casesTmp = currentScope.resolve(ctx.ID().getText()).value;
        return visitChildren(ctx);
    }

    // cases : CASO  exp  TK_POSD  statements3  cases2 #casesCaso
    @Override
    public String visitCasesCaso(PsicoderParser.CasesCasoContext ctx) {
        if(visit(ctx.exp()).equals(casesTmp)){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            visit(ctx.statements3());
            currentScope.setCounter(1);
            currentScope = currentScope.getEnclosingScope();
            currentScope.setCounter(currentScope.getCounter() + 1);
            return null;
        }
        currentScope.setCounter(currentScope.getCounter() + 1);
        visit(ctx.cases2());
        return null;
    }

    //cases2 : CASO  exp  TK_POSD  statements3  cases2    #cases2cacso
    @Override
    public String visitCases2Caso(PsicoderParser.Cases2CasoContext ctx) {
        if(visit(ctx.exp()).equals(casesTmp)){
            currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
            visit(ctx.statements3());
            currentScope.setCounter(1);
            currentScope = currentScope.getEnclosingScope();
            currentScope.setCounter(currentScope.getCounter() + 1);
            return null;
        }
        currentScope.setCounter(currentScope.getCounter() + 1);
        visit(ctx.cases2());
        return null;
    }

    //  deft : DEFECTO  TK_POSD  statements3
    @Override
    public String visitDeft(PsicoderParser.DeftContext ctx) {
        currentScope = scopes.get(currentScope.getScopeName() + currentScope.getCounter());
        visit(ctx.statements3());
        currentScope.setCounter(1);
        currentScope = currentScope.getEnclosingScope();
        currentScope.setCounter(currentScope.getCounter() + 1);
        return null;
    }

    // stmt:  LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC      #stmtLeerID
    @Override
    public String visitStmtLeerID(PsicoderParser.StmtLeerIDContext ctx) {
        Scanner s = new Scanner(System.in);
        currentScope.resolve(ctx.ID().getText()).value = s.nextLine();
        s.close();
        return null;
    }

    //  LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC     #stmtLeerChain
    @Override
    public String visitStmtLeerChain(PsicoderParser.StmtLeerChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        current = DefPhase.scopes.get(name);
        Scanner s = new Scanner(System.in);
        stringTmp = s.nextLine();
        s.close();
        visit(ctx.chain());
        return null;
    }

    //IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC  #stmtImprimir
    @Override
    public String visitStmtImprimir(PsicoderParser.StmtImprimirContext ctx) {
        visit(ctx.imp_params());
        return null;
    }

    //IMPRIMIR  TK_PAR_IZQ  imp_params  TK_PAR_DER  TK_PYC  #stmtImprimir
    @Override
    public String visitStmt2Imprimir(PsicoderParser.Stmt2ImprimirContext ctx) {
        visit(ctx.imp_params());
        return null;
    }

    //imp_params : exp  TK_COMA  imp_params #imp_paramsChain
    @Override
    public String visitImp_paramsChain(PsicoderParser.Imp_paramsChainContext ctx) {
        /*String split[] = visit(ctx.exp()).split("\\n");
        System.out.println(split);
        for(String aux : split){
            System.out.print(aux);
        }*/
        if (visit(ctx.exp()).equals("\\n"))
            System.out.println();
        else
            System.out.print(visit(ctx.exp()));

        visit(ctx.imp_params());
        return null;
    }

    //imp_params : exp   #imp_paramsExp
    @Override
    public String visitImp_paramsExp(PsicoderParser.Imp_paramsExpContext ctx) {
        /*String split[] = visit(ctx.exp()).split("\\n");
        for(String aux : split){
            System.out.println(aux);
        }*/
        if (visit(ctx.exp()).equals("\\n"))
            System.out.println("\n");
        else
            System.out.println(visit(ctx.exp()));
        return null;
    }

    // exp :  TK_NEG  TK_PAR_IZQ  exp  TK_PAR_DER      #expNegParExp
    @Override
    public String visitExpNegParExp(PsicoderParser.ExpNegParExpContext ctx) {

        if (visit(ctx.exp()).equals("verdadero"))
            return "falso";
        else if (visit(ctx.exp()).equals("falso"))
            return "verdadero";
        return null;
    }

    //exp : exp  TK_MULT  exp        #expMult
    @Override
    public String visitExpMult(PsicoderParser.ExpMultContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        return String.valueOf((int)(aux * aux1));
    }

    //exp : exp  TK_MOD  exp     #expModulo
    @Override
    public String visitExpModulo(PsicoderParser.ExpModuloContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        return String.valueOf((int)(aux % aux1));
    }

    //exp: exp  TK_MENOS  exp       #expMenos
    @Override
    public String visitExpMenos(PsicoderParser.ExpMenosContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        return String.valueOf((int)(aux - aux1));
    }

    //exp:  exp  TK_DIF  exp     #expDif
    @Override
    public String visitExpDif(PsicoderParser.ExpDifContext ctx) {
        boolean a = (ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b = (ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCadenaContext");
        boolean c = (ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean d = (ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCadenaContext");
        boolean i = (visit(ctx.exp(0))).equals("verdadero");
        boolean j = (visit(ctx.exp(0))).equals("falso");
        boolean k = visit(ctx.exp(1)).equals("verdadero");
        boolean l = (visit(ctx.exp(1))).equals("falso");
        //System.out.println(ctx.exp(0).getText()+ctx.exp(1).getText());
        if ((a || b) && (c || d)) {
            if (visit(ctx.exp(0)).equals(visit(ctx.exp(1))))
                return "falso";
            return "verdadero";
        } else if ((i || j) && (k || l)) {
            String aux2 = visit(ctx.exp(0));
            String aux3 = visit(ctx.exp(1));
            //System.out.println(aux2+aux3);
            if (aux2.equals(aux3))
                return "falso";
            return "verdadero";
        } else {
            Double aux0 = Double.parseDouble(visit(ctx.exp(0)));
            Double aux1 = Double.parseDouble(visit(ctx.exp(1)));
            //System.out.println(aux0);
            if (aux0.equals(aux1)) {
                //System.out.println("igual");
                return "falso";
            }
            return "verdadero";
        }
    }

    //exp : TK_MENOS  TK_PAR_IZQ  exp  TK_PAR_DER        #expMenosParExp
    @Override public String visitExpMenosParExp(PsicoderParser.ExpMenosParExpContext ctx) {
        boolean a=(ctx.exp().getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        Double aux;
        String ch = visit(ctx.exp());

        if (a)
            aux= (double) ch.codePointAt(0)+1;
        else aux =(-1)*Double.parseDouble(visit(ctx.exp()));

        return String.valueOf(aux);
    }


    //exp:  exp  TK_MENOR  exp       #expMenor
    @Override
    public String visitExpMenor(PsicoderParser.ExpMenorContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        if (aux<aux1)
            return "verdadero";
        else
            return "falso";
    }

    //exp: exp  TK_Y  exp       #expAnd
    @Override
    public String visitExpAnd(PsicoderParser.ExpAndContext ctx) {
        String aux = visit(ctx.exp(0));
        String aux1 = visit(ctx.exp(1));
        if (aux.equals("verdadero")&& aux1.equals("verdadero"))
            return "verdadero";
        return
                "falso";
    }

    //exp: TK_MENOS  ID     #expMenosID
    @Override
    public String visitExpMenosID(PsicoderParser.ExpMenosIDContext ctx) { return visitChildren(ctx); }

    //exp: TK_NEG  ID       #expNegID
    @Override
    public String visitExpNegID(PsicoderParser.ExpNegIDContext ctx) { return visitChildren(ctx); }

    //exp: exp  TK_DIV  exp     #expDiv
    @Override
    public String visitExpDiv(PsicoderParser.ExpDivContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        return String.valueOf(aux / aux1);
    }

    // exp: TK_ENTERO
    @Override
    public String visitExpEntero(PsicoderParser.ExpEnteroContext ctx) {
        //System.out.println("entero");
        return ctx.TK_ENTERO().getText();
    }

    //exp: exp  TK_MAYOR_IGUAL  exp     #expMayorIgual
    @Override
    public String visitExpMayorIgual(PsicoderParser.ExpMayorIgualContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        if (aux>=aux1)
            return "verdadero";
        else
            return "falso";
    }

    // exp: TK_NEG  ID  TK_PUNTO  chain      #expNegChain
    @Override
    public String visitExpNegChain(PsicoderParser.ExpNegChainContext ctx) { return visitChildren(ctx); }

    // exp: exp  TK_O  exp       #expOr
    @Override
    public String visitExpOr(PsicoderParser.ExpOrContext ctx) {

            String aux = visit(ctx.exp(0));
            String aux1 = visit(ctx.exp(1));
            if (aux.equals("verdadero")|| aux1.equals("verdaero"))
                return "verdadero";
            return
                    "falso";

    }

    // exp:  exp  TK_MAYOR  exp       #expMayor
    @Override
    public String visitExpMayor(PsicoderParser.ExpMayorContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        if (aux>aux1)
            return "verdadero";
        else
            return "falso";
    }

    // exp: exp  TK_MENOR_IGUAL  exp     #expMenorIgual
    @Override
    public String visitExpMenorIgual(PsicoderParser.ExpMenorIgualContext ctx) {
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean c = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean d = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        Double aux,aux1;
        String ch = visit(ctx.exp(0));
        String ch1 = visit(ctx.exp(1));

        if (a||c)
            aux= (double) ch.codePointAt(0)+1;
        else aux =Double.parseDouble(visit(ctx.exp(0)));

        if (b||d)
            aux1= (double) ch1.codePointAt(0)+1;
        else aux1 =Double.parseDouble(visit(ctx.exp(1)));

        if (aux<=aux1)
            return "verdadero";
        else
            return "falso";
    }

    //exp -> exp  TK_MAS  exp
    @Override
    public String visitExpMas(PsicoderParser.ExpMasContext ctx) {
        //System.out.println(ctx.exp(1).getClass().getName());
        //System.out.println( visitor.visit(ctx.exp(0))+"hola");

        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean g = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCARACTER");
        boolean h = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCARACTER");
        boolean c=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCadenaContext");
        boolean d=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCadenaContext");
        boolean e = (String.valueOf(visitor.visit(ctx.exp(0)))).equals("tCADENA");
        boolean f = (String.valueOf(visitor.visit(ctx.exp(1)))).equals("tCADENA");
        //System.out.println(g+""+h);
        if ((c||e) && (d||f)){
            //System.out.println(visit(ctx.exp(0))+visit(ctx.exp(1)));
            return visit(ctx.exp(0))+visit(ctx.exp(1));
        }
        else {
            Double aux, aux1;
            String ch = visit(ctx.exp(0));
            String ch1 = visit(ctx.exp(1));
            //System.out.println(a + " " + b + " " + c + " " + d);
            if (a||g)
                aux = (double) ch.codePointAt(0) + 1;
            else aux = Double.parseDouble(visit(ctx.exp(0)));

            if (b||h)
                aux1 = (double) ch1.codePointAt(0) + 1;
            else aux1 = Double.parseDouble(visit(ctx.exp(1)));

            //System.out.println(visit(ctx.exp(0))+visit(ctx.exp(1)));

            return String.valueOf((int)(aux + aux1));
        }
    }
    //  exp: TK_NEG  VERDADERO        #expNegVerdadero
    @Override
    public String visitExpNegVerdadero(PsicoderParser.ExpNegVerdaderoContext ctx) {
        //System.out.println("hora");
        return "falso";
    }

    //exp: TK_NEG  exp      #expNegExp
    @Override
    public String visitExpNegExp(PsicoderParser.ExpNegExpContext ctx) {
        if (visit(ctx.exp()).equals("verdadero"))
            return "falso";
        return "verdadero";
    }

    // exp: TK_CADENA
    @Override
    public String visitExpCadena(PsicoderParser.ExpCadenaContext ctx) {
        //System.out.println(ctx.getText());
        String aux =ctx.TK_CADENA().getText();
        aux=aux.substring(1,aux.length()-1);
        //System.out.println(aux);
        return aux;
    }

    //exp : TK_NEG  FALSO        #expNegFalso
    @Override
    public String visitExpNegFalso(PsicoderParser.ExpNegFalsoContext ctx) {
        return "verdadero";
    }

    //exp : TK_PAR_IZQ  exp  TK_PAR_DER      #expParExp
    @Override
    public String visitExpParExp(PsicoderParser.ExpParExpContext ctx) {
        return visit(ctx.exp());
    }

    //exp : VERDADERO        #expVerdadero
    @Override
    public String visitExpVerdadero(PsicoderParser.ExpVerdaderoContext ctx) {

        return ctx.VERDADERO().getText();
    }

    //exp : TK_MENOS  TK_REAL        #expMenosReal
    @Override
    public String visitExpMenosReal(PsicoderParser.ExpMenosRealContext ctx) {

        return visit(ctx);
    }

    //exp: exp  TK_IGUAL  exp       #expIgual
    @Override
    public String visitExpIgual(PsicoderParser.ExpIgualContext ctx) {
        //System.out.println(ctx.exp(0).getText()+ctx.exp(1).getText());
        //System.out.println(visit(ctx.exp(0))+visit(ctx.exp(1)));
        boolean a=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean b=(ctx.exp(0).getClass().getName()).equals("PsicoderParser$ExpCadenaContext");
        boolean c=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCaracterContext");
        boolean d=(ctx.exp(1).getClass().getName()).equals("PsicoderParser$ExpCadenaContext");
        boolean i=(visit(ctx.exp(0))).equals("verdadero");
        boolean j=(visit(ctx.exp(0))).equals("falso");
        boolean k=visit(ctx.exp(1)).equals("verdadero");
        boolean l=(visit(ctx.exp(1))).equals("falso");
        //System.out.println(ctx.exp(0).getText()+ctx.exp(1).getText());
        if((a||b)&&(c||d)){
            if (visit(ctx.exp(0)).equals(visit(ctx.exp(1))))
                return "verdadero";
            return "falso";
        }
        else  if((i||j)&&(k||l)){
            String aux2=visit(ctx.exp(0));
            String aux3=visit(ctx.exp(1));
            //System.out.println(aux2+aux3);
            if (aux2.equals(aux3))
                return "verdadero";
            return "falso";
        }
        else {
            Double aux0 = Double.parseDouble(visit(ctx.exp(0)));
            Double aux1 = Double.parseDouble(visit(ctx.exp(1)));
            //System.out.println(aux0);
            if (aux0.equals(aux1)) {
                //System.out.println("igual");
                return "verdadero";
            }
            return "falso";
        }
    }

    //exp: TK_MENOS  TK_ENTERO      #expMenosEntero
    @Override
    public String visitExpMenosEntero(PsicoderParser.ExpMenosEnteroContext ctx) {

        return ctx.getText();
    }

    // exp: TK_REAL
    @Override
    public String visitExpReal(PsicoderParser.ExpRealContext ctx) {
        //System.out.println(ctx.getText());
        return ctx.TK_REAL().getText();
    }

    // exp : TK_CARACTER      #expCaracter
    @Override
    public String visitExpCaracter(PsicoderParser.ExpCaracterContext ctx) {

        String aux = ctx.TK_CARACTER().getText();
        String letra = aux.substring(1,2);
        //System.out.println(letra+"hol");
        return letra;
    }

    // exp : FALSO        #expFalso
    @Override
    public String visitExpFalso(PsicoderParser.ExpFalsoContext ctx) {
        //System.out.println(ctx.getRuleContext().getText());
        return ctx.FALSO().getText();
    }

    // exp : ID
    @Override
    public String visitExpID(PsicoderParser.ExpIDContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        //System.out.println(var);
        return var.value;
    }

    //-------------------Statements2------------------------------------------------

    //stmt:  type  ID  TK_ASIG  exp  TK_COMA  optexp  TK_PYC       #stmtTypeAsig
    @Override public String visitStmt2TypeAsig(PsicoderParser.Stmt2TypeAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        visit(ctx.optexp());
        return null;
    }

    // stmt: ID  TK_ASIG  exp  TK_PYC   #stmtIDAsig
    @Override
    public String visitStmt2IDAsig(PsicoderParser.Stmt2IDAsigContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt: type  ID  TK_ASIG  exp  TK_PYC        #stmtTypeAsifExp
    @Override
    public String visitStmt2TypeAsigExp(PsicoderParser.Stmt2TypeAsigExpContext ctx) {
        currentScope.resolve(ctx.ID().getText()).value = visit(ctx.exp());
        return null;
    }

    // stmt: ID  TK_PUNTO  chain  TK_ASIG  exp  TK_PYC     #stmtIDChain
    @Override
    public String visitStmt2IDChain(PsicoderParser.Stmt2IDChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        current = DefPhase.scopes.get(name);
        stringTmp = visit(ctx.exp());
        visit(ctx.chain());
        return null;
    }

    // stmt:  LEER  TK_PAR_IZQ  ID  TK_PAR_DER  TK_PYC      #stmtLeerID
    @Override
    public String visitStmt2LeerID(PsicoderParser.Stmt2LeerIDContext ctx) {
        Scanner s = new Scanner(System.in);
        currentScope.resolve(ctx.ID().getText()).value = s.nextLine();
        s.close();
        return null;
    }

    //  LEER  TK_PAR_IZQ  ID  TK_PUNTO  chain  TK_PAR_DER  TK_PYC     #stmtLeerChain
    @Override
    public String visitStmt2LeerChain(PsicoderParser.Stmt2LeerChainContext ctx) {
        String name = ctx.ID().getText();
        Symbol var = currentScope.resolve(name);
        current = DefPhase.scopes.get(name);
        Scanner s = new Scanner(System.in);
        stringTmp = s.nextLine();
        s.close();
        visit(ctx.chain());
        return null;
    }

    //-----------------------No son necesarias (Creo)----------------------------------

    //optparams : params  #optparamsP
    @Override
    public String visitOptparamsP(PsicoderParser.OptparamsPContext ctx) { return visitChildren(ctx); }

    //optparams:    #optparamsEpsilon
    @Override
    public String visitOptparamsEpsilon(PsicoderParser.OptparamsEpsilonContext ctx) { return visitChildren(ctx); }

    //    params : type ID TK_COMA params #paramsTypeIDComa
    @Override
    public String visitParamsTypeIDComa(PsicoderParser.ParamsTypeIDComaContext ctx) { return visitChildren(ctx); }

    //params: type ID   #paramsTypeID
    @Override
    public String visitParamsTypeID(PsicoderParser.ParamsTypeIDContext ctx) { return visitChildren(ctx); }

    //  statements : stmt  statements   #statementsEpsilonStmt
    @Override
    public String visitStatementsStmt(PsicoderParser.StatementsStmtContext ctx) { return visitChildren(ctx); }

    //  statements :    #statementsEpsilon
    @Override
    public String visitStatementsEpsilon(PsicoderParser.StatementsEpsilonContext ctx) { return visitChildren(ctx); }

    //  statements3 : stmt2  statements3        #statements3Stmt
    @Override
    public String visitStatements3Stmt(PsicoderParser.Statements3StmtContext ctx) { return visitChildren(ctx); }

    //statements3 :       #statements3Epsilon
    @Override
    public String visitStatements3Epsilon(PsicoderParser.Statements3EpsilonContext ctx) { return visitChildren(ctx); }

    //statements4 : stmt4  statements4        #statements4Stmt
    @Override
    public String visitStatements4Stmt(PsicoderParser.Statements4StmtContext ctx) { return visitChildren(ctx); }

    // statements4 :       #statements3Epsilon
    @Override
    public String visitStatements4Epsilon(PsicoderParser.Statements4EpsilonContext ctx) { return visitChildren(ctx); }

    // optargs : args  #optargsArgs
    @Override
    public String visitOptargsArgs(PsicoderParser.OptargsArgsContext ctx) { return visitChildren(ctx); }

    // optargs : #optargsEpsilon
    @Override
    public String visitOptargsEpsilon(PsicoderParser.OptargsEpsilonContext ctx) { return visitChildren(ctx); }

    // optexp : ID  TK_COMA  optexp    #optexpIDComa
    @Override
    public String visitOptexpIDComa(PsicoderParser.OptexpIDComaContext ctx) { return visitChildren(ctx); }

    // optexp : ID    #optexpID
    @Override
    public String visitOptexpID(PsicoderParser.OptexpIDContext ctx) { return visitChildren(ctx); }

    //stmt:  type  ID  TK_COMA  optexp  TK_PYC     #stmtTypeAsigOptexp
    @Override public String visitStmtTypeAsigOptexp(PsicoderParser.StmtTypeAsigOptexpContext ctx) { return visitChildren(ctx); }

    // stmt: type  ID  TK_PYC      #stmtID
    @Override
    public String visitStmtID(PsicoderParser.StmtIDContext ctx) { return visitChildren(ctx); }

    // stmt4:  type  ID  TK_PYC     #stmt4TypeID
    @Override
    public String visitStmt4TypeID(PsicoderParser.Stmt4TypeIDContext ctx) { return visitChildren(ctx); }

    // stmt4: type  ID  TK_COMA  optexp  TK_PYC        #stmt4TypeIDComa
    @Override
    public String visitStmt4TypeIDComa(PsicoderParser.Stmt4TypeIDComaContext ctx) { return visitChildren(ctx); }

    // stmt4 : ID  TK_PAR_IZQ  optargs  TK_PAR_DER  TK_PYC        #stmt4Funcion
    @Override
    public String visitStmt4Funcion(PsicoderParser.Stmt4FuncionContext ctx) {
        String name = ctx.ID().getText();
        tmp = ((FunctionSymbol) scopes.get(name));
        functionArgument = 0;
        //currentScope = scopes.get(ctx.ID().getText());
        visit(ctx.optargs());
        return visitElementFuncion(tmp.ctx);
    }

    // cases:  deft  #casesDefecto
    @Override
    public String visitCasesDefecto(PsicoderParser.CasesDefectoContext ctx) { return visitChildren(ctx); }

    // cases2: #cases2Epsilon
    @Override
    public String visitCases2Epsilon(PsicoderParser.Cases2EpsilonContext ctx) { return visitChildren(ctx); }

    // cases2: deft  #cases2Defecto
    @Override
    public String visitCases2Defecto(PsicoderParser.Cases2DefectoContext ctx) { return visitChildren(ctx); }

    /*    //ps :   element ps   #psElement
    @Override
    public String visitPsElement(PsicoderParser.PsElementContext ctx) {
        currentScope = globals;
        return visitChildren(ctx);
    }

    //ps: b              #psB
    @Override
    public String visitPsB(PsicoderParser.PsBContext ctx) {
        currentScope = globals;
        return visitChildren(ctx);
    }

    //ps:                #psEpsilon
    @Override
    public String visitPsEpsilon(PsicoderParser.PsEpsilonContext ctx) {return visitChildren(ctx);}

    //element: ESTRUCTURA ID statements4 FIN_ESTRUCTURA     #elementEstructura
    @Override
    public String visitElementEstructura(PsicoderParser.ElementEstructuraContext ctx) {
        currentScope = scopes.get(ctx.ID().getText());
        visitChildren(ctx);
        currentScope = currentScope.getEnclosingScope();
        return null;
    }
*/
}
