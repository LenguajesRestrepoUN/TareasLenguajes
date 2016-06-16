import java.util.LinkedList;
import java.util.List;

public class Lista implements Data, VLS, VL, VLSM{
    @Override
    public Data functionfirst() {
        if (lista.size()!=0)
            return lista.getFirst();
        return new Nil();
    }

    public LinkedList<Data> lista;
    public int size(){return lista.size();}
    public Lista() {
        lista = new LinkedList<>();
    }

    @Override
    public double suma() {
        double n=0;
        for(Data x:lista)
            n+=Double.parseDouble(x.toString());
        return n;
    }

    @Override
    public double restar() {
        double n=Double.parseDouble(functionfirst().toString());
        double aux=n;
        for(Data x:lista)
            n-=Double.parseDouble(x.toString());
        return n+aux;
    }

    @Override
    public double multiplicar() {
        double n=1;
        for(Data x:lista)
            n*=Double.parseDouble(x.toString());
        return n;
    }

    @Override
    public double dividir() {
        double n=Double.parseDouble(lista.getFirst().toString());
        double aux=n;
        for(Data x:lista)
            n/=Double.parseDouble(x.toString());
        return n*aux;
    }

    @Override
    public Data functionget(Data element, Data defecto) {

        if (defecto!=null)
            return defecto;
        return new Nil();
    }

    public void addData(Data data){
        lista.addLast(data);
    }

    public void addDataLista(Data data){
        lista.addFirst(data);
    }

    @Override
    public Boolean contains(Data element) {
        for (Data x:lista){
            if(x.equals(element))
                return true;
        }
        return false;
    }

    public Object getData(){      return lista;    }

    public void setData(Object l) {
        lista = ((LinkedList<Data>) (l));
    }

    @Override
    public String toString() {
        return lista.toString();
    }

    @Override
    public Data getDataWithNTH(Integer n) {
        if(lista.size() < n)
            return null;
        return lista.get(n);
    }

    @Override
    public boolean equals(Object o) {

        if(o instanceof Lista)  {
            Lista aux = (Lista) o;
            if(aux.size()!=lista.size())
                return false;
            if (!aux.toString().equals(lista.toString()))
                return false;
            /*for (Data x:lista)
                if (!aux.contains(x))
                    return false;*/
            return true;
        }
        if(o instanceof Vector)  {
            Vector aux = (Vector) o;
            if(aux.size()!=lista.size())
                return false;
            if (!aux.toString().equals(lista.toString()))
                return false;
            /*for (Data x:lista)
                if (!aux.contains(x))
                    return false;*/
            return true;
        }
        return false;

    }

    @Override
    public int hashCode() {
        return lista.hashCode();
    }

    @Override
    public List<Data> copyData() {
        return lista;
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
