package pack.shape;

public class Rectangle extends Shape {

    public Rectangle() {
    }

    public Rectangle(int color) {
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
