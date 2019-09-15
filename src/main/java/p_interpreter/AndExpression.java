package p_interpreter;

/**
 * <p>
 *     多个Expression和运算
 * </p>
 * <br>-lastModify:2019/9/15 9:34
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class AndExpression implements Expression{

    private Expression expr1 = null;

    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
