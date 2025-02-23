package lab1;

import java.util.Scanner;

public class Ex9MathSequencePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("N: ");
        int n1 = in.nextInt();

        int n0 = n1 - 1;
        int n2 = n1 + 1;
        double n3 = Math.pow(n0 + n1 + n2, 2);

        System.out.printf("%s %s %s %s", n0, n1, n2, n3);
        in.close();
    }
}
