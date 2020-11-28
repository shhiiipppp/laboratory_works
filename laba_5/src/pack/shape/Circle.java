package pack.shape;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(int color) {
        this.color = color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return this.color;
    }
}
