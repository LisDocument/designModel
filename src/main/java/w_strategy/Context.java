package w_strategy;

/**
 * <br>-lastModify:2019/9/18 20:35
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
