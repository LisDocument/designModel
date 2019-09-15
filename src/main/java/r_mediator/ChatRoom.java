package r_mediator;

import java.util.Date;

/**
 * <br>-lastModify:2019/9/15 18:40
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "{" + user.getName() + "}: " + message);
    }
}
