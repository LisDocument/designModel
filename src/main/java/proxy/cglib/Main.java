package proxy.cglib;

public class Main {

    public static void main(String[] args) {
        Engineer e = (Engineer) CglibProxy.getProxy(new Engineer());

        e.eat();
        e.work();
    }
}
