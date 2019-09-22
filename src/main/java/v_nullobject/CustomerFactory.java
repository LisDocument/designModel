package v_nullobject;

/**
 * <br>-lastModify:2019/9/18 20:13
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
