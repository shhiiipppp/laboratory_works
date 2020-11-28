package pack;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размерность массива: ");
        int num = in.nextInt();
        int[] array = new int[num];

        System.out.println("Введите массив: ");
        for (int i = 0; i < num; i++) {
            array[i] = in.nextInt();
        }

        int sumFor = 0;
        int sumWhile = 0;
        int sumDoWhile = 0;

        for (int i = 0; i < num; i++) {
            sumFor += array[i];
        }

        int buf = num - 1;
        while (buf >= 0) {
            sumWhile += array[buf];
            buf--;
        }

        do {
            sumDoWhile += array[num - 1];
            num--;
        } while (num != 0);

        System.out.println("Сумма чисел массива посредством вычисления цикла for: " + sumFor);
        System.out.println("Сумма чисел массива посредством вычисления цикла while: " + sumWhile);
        System.out.println("Сумма чисел массива посредством вычисления цикла do while: " + sumDoWhile);
    }
}