package s_memento;

/**
 * <br>-lastModify:2019/9/15 19:04
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
