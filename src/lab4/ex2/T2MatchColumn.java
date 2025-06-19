package lab4.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T2MatchColumn {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int targetNumber;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число");
            try {
                targetNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Это не число");
                return;
            }
        }

        boolean numberFound = false;
        System.out.println("Столбец с числом " + targetNumber + ":");

        for (int[] currentRow : matrix) {
            for (int columnIndex = 0; columnIndex < currentRow.length; columnIndex++) {
                if (currentRow[columnIndex] == targetNumber) {
                    numberFound = true;
                    for (int[] row : matrix) {
                        System.out.println(row[columnIndex]);
                    }
                    break;
                }
            }
        }

        if (!numberFound) {
            System.out.println("Число не найдено в матрице " + targetNumber);
        }
    }
}
