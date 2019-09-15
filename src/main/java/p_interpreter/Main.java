package p_interpreter;

/**
 * <br>-lastModify:2019/9/15 9:37
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Expression expre1 = new TerminalExpression("李三思");
        Expression expre2 = new TerminalExpression("李三毛");

        //是否存在李三思这个人
        System.out.println(new OrExpression(expre1,expre2).interpret("李三思"));
    }
}
