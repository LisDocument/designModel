package t_observer;

/**
 * <br>-lastModify:2019/9/15 19:20
 *
 * @author Lixiaoban
 * @version 1.0
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
