package lab4.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T3ByteSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int arraySize = getArraySize(scanner);
            byte[] byteArray = new byte[arraySize];
            int totalSum = fillArrayAndCalculateSum(scanner, byteArray, arraySize);

            System.out.println("Сумма элементов " + totalSum);
        } finally {
            scanner.close();
        }
    }

    private static int getArraySize(Scanner scanner) {
        System.out.print("Введите размер массива");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Это не число");
            System.exit(0);
            return 0;
        }
    }

    private static int fillArrayAndCalculateSum(Scanner scanner, byte[] array, int length) {
        int sum = 0;

        for (int index = 0; index < length; index++) {
            System.out.print("Введите элемент № " + (index + 1));

            try {
                byte element = scanner.nextByte();
                sum += element;

                if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                    System.out.println("Сумма выходит за пределы диапазона типа byte");
                    System.exit(0);
                }

                array[index] = element;
            } catch (InputMismatchException e) {
                System.out.println("Это не число");
                System.exit(0);
            } catch (NumberFormatException e) {
                System.out.println("Число недопустимо для byte");
                System.exit(0);
            }
        }

        return sum;
    }
}
