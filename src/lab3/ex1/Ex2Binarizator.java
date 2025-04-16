package lab3.ex1;

import java.util.Scanner;

public class Ex2Binarizator {

    public static String toBinary(int n) {
        if (n == 0) {
            return "0";
        }
        if (n / 2 == 0) {
            return "1";
        } else {
            return toBinary(n / 2) + (n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");

        int number = scanner.nextInt();

        String binaryRepresentation = toBinary(number);
        System.out.println("Двоичное представление числа: " + binaryRepresentation);

        scanner.close();
    }
}
