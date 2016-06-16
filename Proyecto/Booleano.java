public class Booleano implements Data {

    public Boolean flag;

    public Booleano(Boolean flag) {
        this.flag = flag;
    }

    public Object getData(){
        return flag;
    }

    public void setData(Object data){
        flag = ((Boolean) (data));
    }

    @Override
    public String toString() { return flag.toString(); }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Booleano))
            return false;
        return flag == (((Booleano) o).flag);
    }

    @Override
    public int hashCode() {
        return flag.hashCode();
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
