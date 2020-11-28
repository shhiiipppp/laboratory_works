package pack.shape;

public class Triangle extends Shape {

    public Triangle() {
    }

    public Triangle(int color) {
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
