package Roman;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел: ");
        String str = scanner.nextLine();
        String[] splitStr = str.split(" ");

        int[] arr = new int[splitStr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(splitStr[i]);
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
