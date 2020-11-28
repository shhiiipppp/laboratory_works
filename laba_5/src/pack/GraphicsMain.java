package pack;

import pack.shape.Circle;
import pack.shape.Rectangle;
import pack.shape.Shape;
import pack.shape.Triangle;

import java.awt.*;
import javax.swing.JFrame;

public class GraphicsMain extends JFrame {

    public GraphicsMain() {
        super("Фигура");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public void draw(Shape s, Graphics2D g, int x, int y) {

        if (s instanceof Circle) {

            g.drawArc(x, y, 80, 80, ABORT, ABORT);
            g.fillOval(x, y, 80, 80);
        }

        if (s instanceof Rectangle) {

            g.drawRect(x, y, 80, 50);
            g.fillRect(x, y, 80, 50);
        }

        if (s instanceof Triangle) {

            int vysota = y;
            int shirina = x;
            int k = 0;
            int countV = 1;
            int countSh = 1;
            while (vysota < (y + 45)) {

                vysota = vysota + countV;
                g.drawLine((shirina + 50) - countSh*k, vysota, (shirina + 50) + countSh*k, vysota);
                k++;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        
        int x = 50;
        int y = 50;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                Shape shape = FigurePool.pool.get(j + i*5);

                if (shape.getColor() == 0) {

                    gr2d.setPaint(Color.red);
                }

                if (shape.getColor() == 1) {

                    gr2d.setPaint(Color.BLUE);
                }

                if (shape.getColor() == 2) {

                    gr2d.setPaint(Color.magenta);
                }

                draw(shape, gr2d, x, y);
                x += 100;
            }
            y = y + 100;
            x = 50;
        }
    }
}