package pack;
import java.util.Scanner;

public class DishTest {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1 для создания экземпляра декоративной посуды, 0 - для столовой: ");
        int count = in.nextInt();

        if (count == 1) {

            String name = in.next();
            String brand = in.next();
            int mark = in.nextInt();

            DecorativeDish obj = new DecorativeDish(name, brand, mark);
            obj.displayInfo();
        }
        else {

            String name = in.next();
            String brand = in.next();
            String material = in.next();

            Dinnerware obj = new Dinnerware(name, brand, material);
            obj.displayInfo();
        }
    }
}
