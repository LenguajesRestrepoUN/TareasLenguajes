import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Vector implements Data, VLS, VL, VLSM {

    public LinkedList<Data> vector;
    public int size(){return vector.size();}
    public Vector() {
        vector = new LinkedList<>();
    }

    public void addData(Data data){
        vector.addLast(data);
    }

    @Override
    public double suma() {
        double n=0;
        for(Data x:vector)
            n+=Double.parseDouble(x.toString());
        return n;
    }

    @Override
    public double restar() {
        double n=Double.parseDouble(vector.getFirst().toString());
        double aux=n;
        for(Data x:vector)
            n-=Double.parseDouble(x.toString());
        return n+aux;
    }

    @Override
    public double multiplicar() {
        double n=1;
        for(Data x:vector)
            n*=Double.parseDouble(x.toString());
        return n;
    }

    @Override
    public double dividir() {
        double n=Double.parseDouble(vector.getFirst().toString());
        double aux=n;
        for(Data x:vector)
            n/=Double.parseDouble(x.toString());
        return n*aux;
    }

    @Override
    public Data functionget(Data element, Data defecto) {
        if (defecto!=null)
            return defecto;
        if (vector.size()>Double.parseDouble(element.toString()))
            return vector.get((int)Double.parseDouble(element.toString()));
        return new Nil();
    }

    @Override
    public Data functionfirst() {

        return vector.getFirst();
    }

    public void addDataLista(Data data){
        vector.addFirst(data);
    }

    public Object getData(){
        return vector;
    }

    public void setData(Object l) {
        vector = ((LinkedList<Data>) (l));
    }

    public Boolean contains( Data element){

        for (Data x:vector){
            if(x.equals(element))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return vector.toString();
    }

    @Override
    public Data getDataWithNTH(Integer n) {
        if(vector.size() < n)
            return null;
        return vector.get(n);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Vector)  {
            Vector aux = (Vector) o;
            if(aux.size()!=vector.size())
                return false;
            if (!aux.toString().equals(vector.toString()))
                return false;
            /*for (Data x:vector)
            if (!aux.contains(x))
                return false;*/
            return true;
        }
        if(o instanceof Lista)  {
            Lista aux = (Lista) o;
            if(aux.size()!=vector.size())
                return false;
            if (!aux.toString().equals(vector.toString()))
                return false;
            /*for (Data x:vector)
                if (!aux.contains(x))
                    return false;*/
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return vector.hashCode();
    }

    public void into(VLSM vlsm) {
        List<Data> l = vlsm.copyData();
        for(Data data: l)
            addData(data);
    }

    @Override
    public List<Data> copyData() {
        return vector;
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
