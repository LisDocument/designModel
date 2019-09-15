package o_command;

/**
 * <p>
 *     类似命令请求参数的概念
 * </p>
 * <br>-lastModify:2019/9/15 8:12
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("Stock[ Name: " + name + "Quantity: " + quantity + " ] bought");
    }

    public void sell(){
        System.out.println("Stock[ Name: " + name + "Quantity: " + quantity + " ] sold");
    }
}
