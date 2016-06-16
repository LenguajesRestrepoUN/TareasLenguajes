import java.util.LinkedList;

public interface VLS extends Data{

    public void addData(Data a);
    public Data functionget(Data element,Data defecto);
    public void addDataLista(Data a);
    public  Boolean contains( Data element);
    public Data functionfirst();
    public double suma ();
    public double restar ();
    public double multiplicar ();
    public double dividir ();

}
