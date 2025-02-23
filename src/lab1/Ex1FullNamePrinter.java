package lab1;

import java.util.Scanner;

public class Ex1FullNamePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Surname: ");
        String surname = in.nextLine();

        System.out.println("First Name: ");
        String firstName = in.nextLine();

        System.out.println("Patronymic: ");
        String patronymic = in.nextLine();

        System.out.println(String.join(" ", "Hello", surname, firstName, patronymic));
        in.close();
    }
}

