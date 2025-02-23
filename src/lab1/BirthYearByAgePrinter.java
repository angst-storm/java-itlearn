package lab1;

import java.util.Calendar;
import java.util.Scanner;

public class BirthYearByAgePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Возраст: ");
        int age = in.nextInt();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        System.out.printf("Год рождения: %s-%s", currentYear - age - 1, currentYear - age);
        in.close();
    }
}