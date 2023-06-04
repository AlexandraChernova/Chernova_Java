package task.first;

import java.util.Scanner;

public class FirstTask { //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int number = scanner.nextInt();

        if (number >= 7) {
            System.out.println("Привет!");
        } else {
            System.out.println("До свидания!");
        }

    }
}
