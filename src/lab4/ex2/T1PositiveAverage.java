package lab4.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T1PositiveAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] array = readArray(scanner);
            double average = calculateAverageOfPositives(array);
            System.out.println("Среднее значение положительных элементов " + average);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static int[] readArray(Scanner scanner) throws Exception {
        System.out.print("Введите длину массива");

        int length;
        try {
            length = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new Exception("Это не число");
        }

        if (length <= 0) {
            throw new Exception("Массив не может быть пустым");
        }

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Введите элемент №" + (i + 1));
            try {
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                throw new Exception("Это не число");
            }
        }

        return array;
    }

    private static double calculateAverageOfPositives(int[] array) throws Exception {
        boolean hasPositive = false;
        int sum = 0;

        for (int num : array) {
            if (num > 0) {
                hasPositive = true;
                sum += num;
            }
        }

        if (!hasPositive) {
            throw new Exception("В массиве нет положительных элементов.");
        }

        return (double) sum / array.length;
    }
}
