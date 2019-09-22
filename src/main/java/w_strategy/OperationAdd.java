package w_strategy;

/**
 * <br>-lastModify:2019/9/18 20:32
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class OperationAdd implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
