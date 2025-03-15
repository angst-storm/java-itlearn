package timus;

import java.util.Scanner;

public class Timus1567 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] message = scanner.nextLine().toCharArray();
        int sum = 0;
        for (char c : message) {
            if (c == 32 || c == 46) {
                sum += 1;
            } else if (c == 44) {
                sum += 2;
            } else if (c == 33) {
                sum += 3;
            } else {
                sum += (c - 97) % 3 + 1;
            }
        }

        System.out.println(sum);

        scanner.close();
    }
}
