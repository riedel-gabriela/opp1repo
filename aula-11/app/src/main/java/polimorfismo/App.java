package polimorfismo;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

import java.util.Random;

public class App implements DrawListener {

    private Draw draw;
    private Double diametro;

    public App() {
        this.draw = new Draw();
        this.draw.addListener(this);
        this.diametro = 0.01;
    }

    public static void main(String[] args) {
        App app = new App();
    }

    @Override
    public void mousePressed(double x, double y) {
        Random r = new Random();
        draw.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        this.draw.filledCircle(x, y, this.diametro);
    }

    @Override
    public void keyTyped(char c) {
        if (c == 'c') this.draw.clear();
        if (c == '+') this.diametro += 0.01;
        if (c == '-'){
            if (this.diametro > 0.01) {
                this.diametro -= 0.01;
            }
        }
    }

    @Override
    public void mouseDragged(double x, double y) {
        Random r = new Random();
        draw.setPenColor(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        this.draw.filledCircle(x, y, this.diametro);
    }
}
