package b_abstractfactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @author Libin
 */
public class Factory1 implements Factory{
    public ProductA createA() {
        return new ProductA1();
    }

    public ProductB createB() {
        return new ProductB1();
    }
}
