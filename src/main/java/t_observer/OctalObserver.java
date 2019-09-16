package t_observer;

/**
 * <br>-lastModify:2019/9/16 21:45
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString( subject.getState() ));
    }
}
