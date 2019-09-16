package u_state;

/**
 * <br>-lastModify:2019/9/16 22:04
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
