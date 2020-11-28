package pack;

public class Circle {

    private float radius;
    private double area;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double receiveArea(float radius) {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
