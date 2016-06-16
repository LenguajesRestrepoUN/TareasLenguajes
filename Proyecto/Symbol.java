
public class Symbol {

    public static enum Type {tINVALID, tENTERO, tREAL, tCADENA, tBOOLEANO}

    String name;
    Type type;
    Scope scope;
    Data value = null;

    public Symbol(String name) {
        this.name = name;
    }

    public Symbol(String name, Type type) {
        this(name);
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Data getValue(){
        return value;
    }

    public void setValue(Data v){
        value = v;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Variable \"" + name + "\"");
        if(value != null)
            builder.append(", tipo : " +  value.getClass().getName() + ", valor: " + value);
        else
            builder.append(", no inicializada todavia");
        builder.append("\n");
        return builder.toString();
    }
}
