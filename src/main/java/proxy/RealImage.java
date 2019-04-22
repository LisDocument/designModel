package proxy;

public class RealImage implements Image {

    @Override
    public void draw() {
        System.out.println("这是实际的方法");
    }
}
