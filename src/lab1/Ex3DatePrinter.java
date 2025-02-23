package lab1;

import java.util.Scanner;

public class Ex3DatePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("День недели: ");
        String weekDay = in.nextLine();

        System.out.println("Месяц: ");
        String month = in.nextLine();

        System.out.println("Номер дня: ");
        String monthDay = in.nextLine();

        System.out.println(String.join(", ", weekDay, monthDay, month));
        in.close();
    }
}
