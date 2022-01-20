import processing.core.PApplet;


public class TryProcessing extends PApplet {


    public static final int WIDTH = 840;
    public static final int HEIGHT = 680;
    public static final int DIAMETER = 15;
    public int speed = 0;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircel( 1 * speed, 1 * HEIGHT / 5);
        drawCircel( 2 * speed, 2 * HEIGHT / 5);
        drawCircel( 3 * speed, 3 * HEIGHT / 5);
        drawCircel( 4 * speed, 4 * HEIGHT / 5);
        speed++;
    }

    private void drawCircel(int xPos, int yPos) {
        ellipse( xPos , yPos, DIAMETER, DIAMETER);
    }

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }
}
