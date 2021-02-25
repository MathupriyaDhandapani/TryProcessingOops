import processing.core.PApplet;

public class CreateBallOne extends PApplet {

    public static final int HEIGHT = 1000;
    public static final int WIDTH = 1000;
    public static final int DIAMETER = 40;
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;

    public static void generateBalls(String args[]) {
        PApplet.main("CreateBallOne",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {

        ellipse(one, (float) (HEIGHT / 1.25), DIAMETER, DIAMETER);
        one+=4;
        ellipse(two, (float) (HEIGHT / 1.66), DIAMETER, DIAMETER);
        two+=3;
        ellipse(three, (float) (HEIGHT / 2.5), DIAMETER, DIAMETER);
        three+=2;
        ellipse(four, HEIGHT / 5, DIAMETER, DIAMETER);
        four+=1;
    }
}
