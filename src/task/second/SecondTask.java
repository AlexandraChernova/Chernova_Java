package task.second;

import java.util.Scanner;

public class SecondTask { //Составить алгоритм: если введенное имя совпадает с Вячеслав,
                          // то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
