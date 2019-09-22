package v_nullobject;

/**
 * <br>-lastModify:2019/9/18 20:10
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class RealCustomer extends AbstractCustomer{

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
