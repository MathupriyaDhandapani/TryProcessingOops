import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

interface Shapes {
     void move();
     void draw(PApplet pApplet);

}

class Ball implements Shapes  {

    public static final int DIAMETER = 50;
    private int xCordinate;
    private int yCOrdinate;
     private int speed;



    public Ball(int xCordinate, int yCOrdinate, int speed) {
        this.xCordinate = xCordinate;
        this.yCOrdinate = yCOrdinate;
        this.speed = speed;
    }

    @Override
    public void move() {
        xCordinate += speed;
    }

    public void draw(PApplet pApplet){
        pApplet.ellipse(xCordinate,yCOrdinate,DIAMETER, DIAMETER);

    }

}
class Box implements Shapes  {

    public static final int LENGTH = 30;
    public static final int BREATH = 30;
    private int xCordinate;
    private int yCOrdinate;
    private int speed;



    public Box(int xCordinate, int yCOrdinate, int speed) {
        this.xCordinate = xCordinate;
        this.yCOrdinate = yCOrdinate;
        this.speed = speed;
    }

    @Override
    public void move() {
        xCordinate += speed;
    }

    @Override
    public void draw(PApplet pApplet){
        pApplet.rect(xCordinate,yCOrdinate,LENGTH, BREATH);

    }

}

public class CreatingShapes extends PApplet{

    public static final int HEIGHT = 360;
    public static final int WIDTH = 480;
    int speed1 = 1;
    int speed2 = 2;
    int speed3 = 3;
    int speed4 = 4;
    private List<Shapes> shapes;

    public static void main(String args[]){
        PApplet.main("CreatingShapes",args);
    }

    @Override
    public void settings() {
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        Ball ball1 = new Ball(0, HEIGHT * 1/5, speed1);
        Ball ball2 = new Ball(0, HEIGHT * 2/5, speed2);
        Box box1 = new Box(0, HEIGHT * 3/5,speed3);
        Ball ball4 = new Ball(0, HEIGHT*4/5, speed4);
        shapes = Arrays.asList(ball1,ball2,box1,ball4);
    }


    @Override
    public void draw() {
        shapes.forEach(Shapes::move);
        shapes.forEach(Shapes -> Shapes.draw(this));
    }
}

