package m_proxy.jdk;

public class RealSubject implements Subject{

    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        return "他说";
    }
}
