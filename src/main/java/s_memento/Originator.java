package s_memento;

/**
 * <br>-lastModify:2019/9/15 19:02
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public Originator setState(String state) {
        this.state = state;
        return this;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
