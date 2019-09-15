package b_abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Libin
 */
public class Factory2 implements Factory {

    public ProductA createA() {
        return new ProductA2();
    }

    public ProductB createB() {
        return new ProductB2();
    }
}
