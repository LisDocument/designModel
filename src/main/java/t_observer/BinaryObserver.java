package t_observer;

/**
 * <br>-lastModify:2019/9/15 19:27
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
