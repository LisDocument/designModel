package u_state;

/**
 * <br>-lastModify:2019/9/16 22:06
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
