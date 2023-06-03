package task.second;

import java.util.Objects;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя:");
        String name = scanner.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
