
public class Cadena implements Data{

    public String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public Object getData(){
        return cadena;
    }

    public void setData(Object data){
        cadena = ((String)(data));
    }

    @Override
    public String toString() { return cadena; }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Cadena))
            return false;
        return cadena.equals(((Cadena) o).cadena);
    }

    @Override
    public int hashCode() {
        return cadena.hashCode();
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
