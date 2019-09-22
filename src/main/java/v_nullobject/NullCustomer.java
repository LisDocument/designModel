package v_nullobject;

/**
 * <br>-lastModify:2019/9/18 20:11
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
