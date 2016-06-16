import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Conjunto implements Data, VLS, VLSM{

    public LinkedHashSet<Data> set;

    public Conjunto() {
        set = new LinkedHashSet<>();
    }
    @Override
    public double suma() {
        double n=0;
        for(Data x:set)
            n+=Double.parseDouble(x.toString());
        return n;
    }

    @Override
    public double restar() {
        double n=Double.parseDouble(functionfirst().toString());
        double aux=n;
        for(Data x:set)
            n-=Double.parseDouble(x.toString());
        return n+aux;
    }

    @Override
    public double multiplicar() {
        double n=1;
        for(Data x:set)
            n*=Double.parseDouble(x.toString());
        return n;
    }

    @Override
    public double dividir() {
        double n=Double.parseDouble(functionfirst().toString());
        double aux=n;
        for(Data x:set)
            n/=Double.parseDouble(x.toString());
        return n*aux;
    }

    public void addData(Data data){
        set.add(data);
    }

    public void addDataLista(Data data){
        set.add(data);
    }

    public Object getData(){
        return set;
    }

    public void setData(Object l) {
        set = ((LinkedHashSet<Data>) (l));
    }

    @Override
    public Data functionfirst() {
        return functionget(new Numero(1),null);
    }

    @Override
    public Data functionget(Data element, Data defecto) {
        int n=0;
        if (defecto!=null)
            return defecto;
        if (set.size()>Double.parseDouble(element.toString()))

            for(Data x:set) {
                n++;
                if (n == (int)Double.parseDouble(element.toString())) {
                    return x;
                }
            }
        return new Nil();
    }

    @Override
    public String toString() {
        return set.toString();
    }

    public Boolean contains( Data element){

        for (Data x:set){
            if(x.equals(element))
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Conjunto))
            return false;
        boolean flag = true;
        Conjunto aux = ((Conjunto) o);
        for(Data i : aux.set){
            if(!aux.set.contains(i)){
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return set.hashCode();
    }

    @Override
    public List<Data> copyData() {
        ArrayList<Data> a = new ArrayList<>();
        for(Data data: set)
        a.add(data);
        return a;
    }

    @Override
    public Object clone()  {
        try {
            return super.clone();
        } catch (Exception e){
            return null;
        }
    }
}
