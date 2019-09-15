package o_command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *     命令调用类
 * </p>
 * <br>-lastModify:2019/9/15 8:19
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        orderList.forEach(Order::execute);
        orderList.clear();
    }
}
