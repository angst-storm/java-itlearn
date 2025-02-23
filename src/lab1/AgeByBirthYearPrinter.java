package lab1;

import java.util.Calendar;
import java.util.Scanner;

public class AgeByBirthYearPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println("В этом году исполнится лет: " + (currentYear - birthYear));
        in.close();
    }
}