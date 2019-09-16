package t_observer;

/**
 * <br>-lastModify:2019/9/16 21:51
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(15);

        subject.setState(16);
    }
}
