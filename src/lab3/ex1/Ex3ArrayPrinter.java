package lab3.ex1;

import java.util.Scanner;

public class Ex3ArrayPrinter {

    private static Scanner scanner = new Scanner(System.in);

    public static void readArrayRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }

        System.out.print("Элемент [" + index + "]: ");
        arr[index] = scanner.nextInt();
        readArrayRecursive(arr, index + 1);
    }

    public static void printArrayRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            System.out.println();
            return;
        }

        System.out.print(arr[index] + " ");
        printArrayRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        readArrayRecursive(array, 0);

        System.out.print("Элементы массива: ");
        printArrayRecursive(array, 0);

        scanner.close();
    }
}
