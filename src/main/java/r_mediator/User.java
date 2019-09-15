package r_mediator;

/**
 * <br>-lastModify:2019/9/15 18:42
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
