package s_memento;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>-lastModify:2019/9/15 19:06
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
