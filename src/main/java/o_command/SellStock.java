package o_command;

/**
 * <br>-lastModify:2019/9/15 8:16
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        this.stock.sell();
    }
}
