import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class BlockScope extends Symbol implements Scope {

    Map<String, Symbol> arguments = new LinkedHashMap<String, Symbol>();
    Scope enclosingScope;
    JPanel fPanel;
    JTextArea fIntel;

    public BlockScope(String name, Scope scope){
        super(name);
        enclosingScope = scope;
        fIntel = new JTextArea(15, 40);
        fIntel.setLineWrap(true);
        fIntel.setWrapStyleWord(true);
        fIntel.setEditable(false);
        JScrollPane scroller = new JScrollPane(fIntel);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        fPanel = new JPanel();
        fPanel.add(scroller);
        fIntel.append(toString());
        value = new Cadena(name);
    }

    public Symbol resolve(String name) {
        Symbol s = arguments.get(name);
        if ( s!=null )
            return s;

        if ( getEnclosingScope() != null ) {
            return getEnclosingScope().resolve(name);
        }
        return null;
    }

    public void define(Symbol sym) {
        arguments.put(sym.name, sym);
        sym.scope = this;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String getScopeName() {
        return name;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Scope let \n");
        if(enclosingScope != null)
            builder.append("Enclosing scope: " + enclosingScope.getScopeName() + "\n\n");

        builder.append("Variables en memoria:\n\n");

        for(Symbol s : arguments.values())
            builder.append(s.toString() + "\n");

        return builder.toString();
    }

    public String toString2() {
        StringBuilder builder = new StringBuilder();
        builder.append("Scope let \n");
        if(enclosingScope != null)
            builder.append("Enclosing scope: " + enclosingScope.getScopeName() + "\n");

        return builder.toString();
    }

    public void updateFrame(){
        fIntel.setText(toString());
        if(enclosingScope != null)
            enclosingScope.updateFrame();
    }

    public void addFrame(){
        FunctionSymbol.scopesNumber++;
        Visitor.scopesTabs.add("Local Scope " + name, fPanel);
        Visitor.scopesTabs.setSelectedIndex(FunctionSymbol.scopesNumber);
    }

    public void deleteFrame(){
        FunctionSymbol.scopesNumber--;
        Visitor.scopesTabs.remove(fPanel);
    }
}