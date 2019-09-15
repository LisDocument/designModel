package p_interpreter;

/**
 * <br>-lastModify:2019/9/15 9:15
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
