package o_command;

/**
 * <br>-lastModify:2019/9/15 8:18
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
