package lab1;

import java.util.Scanner;

public class MonthLengthPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Название месяца: ");
        String month = in.nextLine();

        System.out.println("Количество дней в месяце: ");
        int length = in.nextInt();

        System.out.printf("В месяце \"%s\" %s дней", month, length);
        in.close();
    }
}
