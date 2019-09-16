package t_observer;

/**
 * <br>-lastModify:2019/9/16 21:50
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class HexaObserver extends Observer{

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString( subject.getState()).toLowerCase());
    }
}
