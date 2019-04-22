package proxy;

public class ProxyImage implements Image{

    private Image image;

    public ProxyImage(Image image){
        this.image = image;
    }

    @Override
    public void draw() {
        System.out.println("此处被代理了");
        image.draw();
    }
}
