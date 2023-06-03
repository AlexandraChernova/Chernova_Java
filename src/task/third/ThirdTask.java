package task.third;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdTask {   //Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void main(String[] args) {
        int[] a = new int[5];
        int i = 0;
        Scanner scanner = new Scanner(System.in);

        for (int element : a) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            a[i] = scanner.nextInt();
            //System.out.println(a[i]);
            i++;
        }
        for (int element : a) {
            if (element % 3 == 0) {
                System.out.print(element + " ");
            }
        }

    }
}


