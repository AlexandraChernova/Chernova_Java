package task.first;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 0 до 10: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 7) {
            System.out.println("Привет!");
        } else {
            System.out.println("До свидания!");
        }

    }
}
