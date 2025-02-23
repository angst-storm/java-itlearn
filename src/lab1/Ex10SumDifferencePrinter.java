package lab1;

import java.util.Scanner;

public class Ex10SumDifferencePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Число a: ");
        int a = in.nextInt();

        System.out.println("Число b: ");
        int b = in.nextInt();

        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
        in.close();
    }
}
