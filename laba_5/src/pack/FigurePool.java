package pack;

import pack.shape.Circle;
import pack.shape.Rectangle;
import pack.shape.Shape;
import pack.shape.Triangle;

import java.util.ArrayList;
import java.util.List;

public class FigurePool {
    public static List<Shape> pool = new ArrayList<Shape>();

    public static void init() {
        for (int i = 0; i < 20; i++) {

            int randomShape = 0 + ((int) (Math.random() * 3));
            int randomColor = 0 + ((int) (Math.random() * 3));

            if (randomShape == 0) {

                pool.add(new Circle(randomColor));
            }

            if (randomShape == 1) {

                pool.add(new Rectangle(randomColor));
            }

            if (randomShape == 2) {

                pool.add(new Triangle(randomColor));
            }
        }
    }
}
