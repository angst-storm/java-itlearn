package lab1;

import java.util.Calendar;
import java.util.Scanner;

public class NameAgeByBirthYearPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = in.nextLine();

        System.out.println("Год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println(name + " этом году исполнится лет: " + (currentYear - birthYear));
        in.close();
    }
}