package t_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <br>-lastModify:2019/9/15 19:19
 *
 * @author Lixiaoban
 * @version 1.0
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    /**
     * 通知所有观察者
     * @param state 观察对象
     */
    public void setState(int state){
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(Observer::update);
    }
}
