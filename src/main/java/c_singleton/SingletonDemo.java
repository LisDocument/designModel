package c_singleton;

/**
 * Created with IntelliJ IDEA.
 * 单例模式，它的定义就是确保某一个类只有一个实例，并且提供一个全局访问点。
 *
 * 单例模式具备典型的3个特点：1、只有一个实例。 2、自我实例化。 3、提供全局访问点。
 *
 *  因此当系统中只需要一个实例对象或者系统中只允许一个公共访问点，除了这个公共访问点外，不能通过其他访问点访问该实例时，可以使用单例模式。
 *
 * 单例模式的主要优点就是节约系统资源、提高了系统效率，同时也能够严格控制客户对它的访问。也许就是因为系统中只有一个实例，这样就导致了单例类的职责过重，
 * 违背了“单一职责原则”，同时也没有抽象类，所以扩展起来有一定的困难。其UML结构图非常简单，就只有一个类
 *
 * //////扩展///////
 * 为了防止在高并发的时候懒汉模式的问题，可采取上锁->不推荐
 * enum对象JVM维护其可并发性
 * 内部静态类静态属性->首次调用的时候JVM才会加载静态内部类的类对象，同时也完成静态内部类中静态对象的初始化，这个操作由JVM实现并发控制，因此不会发生并发问题
 * @author Libin
 */
public class SingletonDemo {

    private SingletonDemo(){
        System.out.println("StaticSingleton is create");
    }
    private static class SingletonHolder {
        private static SingletonDemo instance = new SingletonDemo();
    }
    public static SingletonDemo getInstance() {
        return SingletonHolder.instance;
    }
}
