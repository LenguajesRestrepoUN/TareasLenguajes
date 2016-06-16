
public class Keyword implements Data {
    public String keyword;

    public Keyword(String keyword) {
        this.keyword = keyword;
    }

    public Object getData(){
        return keyword;
    }

    public void setData(Object data){
        keyword = ((String)(data));
    }

    @Override
    public String toString() { return  keyword; }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Keyword))
            return false;
        return keyword.equals(((Keyword) o).keyword);
    }

    @Override
    public int hashCode() {
        return keyword.hashCode();
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
