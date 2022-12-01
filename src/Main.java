import processing.core.PApplet;
public class Main extends PApplet {
    public static PApplet pApplet;
    public void Main(){
        pApplet = this;
    }
    public void settings(){size(600, 600);
    }
    public static void main(String[] args) { PApplet.main("Main");
    }
    public void setup(){

    }
    public void draw(){
        background(255);
        stroke(0);
        fill(255,0);
        drawCircle(width/2, height/2, 600);
        drawSquare(0,0, width, height);

    }
    public void drawCircle(int x, int y, float radius) {
        ellipse(x, y, radius, radius);
        if(radius > 4) {
            radius *= 0.75f;
            //The drawCircle() function is calling itself recursively.
                    drawCircle(x, y, radius);
        }
    }
    public void drawSquare(float a, float b, float c, float d) {
        rect(a, b, c, d);
        if (c > 4){
            c = c - 3;
            d = d -3;
            drawSquare(a, b, c, d);
        }

    }
}
