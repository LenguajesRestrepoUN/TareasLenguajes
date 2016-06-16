import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

import java.util.Scanner;

public class Interpreter {

    public static String entrada;

    public static void error(Token t, String msg){
        Visitor.intel.setText(String.format("<%d:%d> Error semantico: %s\n", t.getLine(), t.getCharPositionInLine(), msg));
        System.err.printf("<%d:%d> Error semantico: %s\n", t.getLine(), t.getCharPositionInLine(), msg);
        Interpreter.exit();
    }

    //No se como bloquear el input cuando hay un error, entonces machete con una excepcion
    static String auxs = null;
    static void exit(){
        String  a = auxs;
    }

    public static void main(String[] args) throws Exception {

        try {
            ClojureLexer lexer;

            if (args.length > 0)
                lexer = new ClojureLexer(new ANTLRFileStream(args[0]));
            else
                lexer = new ClojureLexer(new ANTLRInputStream(System.in));

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            ClojureParser parser = new ClojureParser(tokens);

            entrada = lexer.getInputStream().toString();

            ParseTree tree = parser.file();
            //System.out.println(tree.toStringTree(parser));

            ParseTreeWalker walker = new ParseTreeWalker();
            DefPhase def = new DefPhase();
            walker.walk(def, tree);

        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}
