package task.third;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {   //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        double size = scanner.nextDouble();
        double array[] = new double[(int) size];
        System.out.print("Введите числовые значения: ");

        for (double i = 0; i < size; i++) {
            array[(int) i] = scanner.nextDouble();
        }

        for (double i : array) {
            if (i % 3 == 0) {
                System.out.println("Числа, кратные 3:");
                System.out.println(i + " ");
            }
        }
    }
}