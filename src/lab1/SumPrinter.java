package lab1;

import java.util.Scanner;

public class SumPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Первое слагаемое: ");
        int n1 = in.nextInt();

        System.out.println("Второе слагаемое: ");
        int n2 = in.nextInt();

        System.out.println("Сумма: " + (n1 + n2));
        in.close();
    }
}
