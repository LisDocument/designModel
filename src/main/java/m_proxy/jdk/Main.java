package m_proxy.jdk;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Subject subject = new RealSubject();

        MyInvocationHandler handler = new MyInvocationHandler(subject);

        Subject proxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Subject.class},handler);

        proxy.sellBooks();
        proxy.speak();
    }
}
