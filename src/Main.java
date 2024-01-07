import processing.core.PApplet;

public class Main extends PApplet {

    @Override
    public void settings() {
        fullScreen(FX2D);
    }

    @Override
    public void setup() {
        background(0);
        frameRate(60);
    }

    @Override
    public void draw() {
        background(255);
        fill(255);
        textSize(104);
        text("Hello World!", width / 2, height / 2);
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}