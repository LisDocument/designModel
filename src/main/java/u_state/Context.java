package u_state;

/**
 * <br>-lastModify:2019/9/16 22:03
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
