package timus;

import java.util.Scanner;

public class Timus1581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (numbers[i] == numbers[i - 1]) {
                count++;
            } else {
                System.out.print(count + " " + numbers[i - 1] + " ");
                count = 1;
            }
        }
        System.out.print(count + " " + numbers[n - 1]);
        scanner.close();
    }
}
