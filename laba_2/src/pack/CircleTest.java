package pack;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение радиуса: ");
        float num = in.nextInt();

        Circle c = new Circle();
        c.setRadius(num);

        System.out.println("Значение радиуса: " + c.getRadius());
        System.out.println("Значение площади: " + c.receiveArea(num));
    }
}
