
public class Nil implements Data {

    public Object getData(){
        return null;
    }

    public void setData(Object data){
        return;
    }

    @Override
    public String toString() {
        return "nil";
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Nil))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
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
