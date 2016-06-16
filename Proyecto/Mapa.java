import java.util.*;

public class Mapa implements Data, VLS, VL, VLSM{

    public Map<Data,Data> map;

    public Mapa() {
        map = new HashMap<Data,Data>();
    }
    public int size(){return map.size();}
    public void addDataMap(Data key,Data data){ map.put(key,data); }

    @Override
    public void addData(Data a) {
    }

    @Override
    public Data functionget(Data element, Data defecto) {
        if (defecto!=null )
            return defecto;
        if(map.containsKey(element))
            return map.get(element);
        return new Nil();
    }

    public void addDataLista(Data data){    }

    @Override
    public Boolean contains(Data element) {
        for (Data x:map.keySet()){
            if(x.equals(element))
                return true;
        }
        return false;
    }

    public Object getData(){      return map;    }

    public void setData(Object l) {
        map = ((Map<Data,Data>) (l));
    }

    @Override
    public String toString() {
        return map.toString();
    }

    public Data getDataWithget(Data element) {
        for (Data x:map.keySet()){
            if(x.equals(element))
                return map.get(element);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Mapa))
            return false;

        Mapa aux = (Mapa) o;

        if(aux.size()!=map.size())
            return false;
        for (Data x:map.keySet()) {
            if (!aux.contains(x))
                return false;
            if (!aux.getDataWithget(x).equals(map.get(x)))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }

    @Override
    public Data getDataWithNTH(Integer n) {
        return null;
    }

    @Override
    public double suma() {
        return 0;
    }

    @Override
    public double restar() {
        return 0;
    }

    @Override
    public double multiplicar() {
        return 0;
    }

    @Override
    public double dividir() {
        return 0;
    }

    @Override
    public Data functionfirst() {
        Mapa mapa = new Mapa();
        if (map.size()!=0)

            for (Data x:map.keySet()){
                mapa.addDataMap(x,map.get(x));
                return mapa;
            }
        return null;
    }

    @Override
    public List<Data> copyData() {
        ArrayList<Data> a = new ArrayList<>();
        Vector vector;
        for(Data data : map.keySet()){
            vector = new Vector();
            vector.addData(data);
            vector.addData(map.get(data));
            a.add(vector);
        }
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
