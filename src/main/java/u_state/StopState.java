package u_state;

/**
 * <br>-lastModify:2019/9/16 22:06
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
