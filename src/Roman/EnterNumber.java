package Roman;

import java.util.Scanner;

public class EnterNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int number = scanner.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
    }
}