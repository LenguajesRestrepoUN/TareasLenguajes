import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Arity {

    public HashMap<Integer, String> parameters;
    public Map<String, Symbol> arguments;
    public Integer currentParameter;
    public Integer currentArgument;
    public Boolean hasRest;
    public Integer destructors;
    Boolean hasRecur;
    ClojureParser.ArityContext arityCtx;

    public Arity(){
        parameters = new HashMap<>();
        arguments = new LinkedHashMap<>();
        currentParameter = 0;
        currentArgument = 0;
        hasRest = false;
        destructors = 0;
        hasRecur = false;
    }

    public Integer getParametersNumber(){ return parameters.size(); }

    public Integer getCurrentArgument() {
        return currentArgument;
    }

    public Integer getCurrentParameter() { return currentParameter; }

    public Boolean getHasRest() {
        return hasRest;
    }

    public void setHasRest(Boolean hasRest) {
        this.hasRest = hasRest;
    }

    public Integer getDestructors() {
        return destructors;
    }

    public void setDestructors(Integer destructors) {
        this.destructors = destructors;
    }

    public Boolean getHasRecur() {
        return hasRecur;
    }

    public void setHasRecur(Boolean hasRecur) {
        this.hasRecur = hasRecur;
    }

    public ClojureParser.ArityContext getArityCtx() {
        return arityCtx;
    }

    public void setArityCtx(ClojureParser.ArityContext arityCtx) {
        this.arityCtx = arityCtx;
    }
}
