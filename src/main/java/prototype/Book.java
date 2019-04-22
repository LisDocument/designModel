package prototype;

public class Book implements Cloneable {

    @Override
    protected Object clone() {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
