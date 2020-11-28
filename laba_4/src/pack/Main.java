package pack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String firstName = in.next();
        Nameable obj = new FirstInst(firstName);

        String secondName = in.next();
        Nameable object = new SecondInst(secondName);

        obj.getName();
        object.getName();
    }
}
