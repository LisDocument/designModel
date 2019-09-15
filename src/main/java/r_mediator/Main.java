package r_mediator;

/**
 * <br>-lastModify:2019/9/15 18:44
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        User robot = new User("Li");
        User user = new User("Jin");

        robot.sendMessage("傻逼");
        user.sendMessage("是的");


    }
}
