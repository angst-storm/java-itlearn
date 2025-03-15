package timus;

import java.util.Scanner;

public class Timus1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] characterPairs = new String[n];
        for (int i = 0; i < n; i++) {
            characterPairs[i] = scanner.nextLine();
        }

        String inputChar = scanner.nextLine();

        for (String pair : characterPairs) {
            if (pair.startsWith(inputChar)) {
                System.out.println(pair);
            }
        }

        scanner.close();
    }
}
