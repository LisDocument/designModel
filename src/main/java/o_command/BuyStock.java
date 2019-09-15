package o_command;

/**
 * <br>-lastModify:2019/9/15 8:15
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        this.stock.buy();
    }
}
