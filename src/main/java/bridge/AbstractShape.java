package bridge;

public abstract class AbstractShape {

    protected DrawApi drawApi;

    protected AbstractShape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
