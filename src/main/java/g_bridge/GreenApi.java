package g_bridge;

public class GreenApi implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("green draw circle");
    }
}
