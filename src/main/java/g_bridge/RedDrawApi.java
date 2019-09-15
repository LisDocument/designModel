package g_bridge;

public class RedDrawApi implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("red draw circle");
    }
}
