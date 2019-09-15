package l_flyweight;
import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private static final Map<String,IBean> data = new HashMap<>(16);

    public static IBean getBean(String type){
        IBean bean = null;
        synchronized (data){
            IBean iBean = data.get(type);
            if(null != iBean){
                bean = iBean;
            }else{
                data.put(type,type.contains("2") ? new Bean2() : new Bean1());
                bean = data.get(type);
            }
        }
        return bean;
    }
}
