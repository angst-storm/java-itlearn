package lab1;

import java.util.Scanner;

public class NameAgePrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Name: ");
        String name = in.nextLine();

        System.out.println("Age: ");
        int age = in.nextInt();

        System.out.println("Name: " + name + " Age: " + age);
        in.close();
    }
}