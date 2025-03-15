package lab2;

import java.util.Scanner;

public class Ex3CaesarCipher {
    public static String getEncryptString(String encryptString, int shift) {
        var arrayChar = encryptString.toCharArray();
        var arrayInt = new long[arrayChar.length];
        var arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        var encryptString = in.nextLine();
        System.out.println("Введите ключ:");
        var shift = in.nextInt();
        in.nextLine();
        var decryptString = getEncryptString(encryptString, shift);
        System.out.println(decryptString);
        System.out.println("Выполнить обратное преобразование? (y/n)");
        var correct = false;
        do {
            var choice = in.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println(getEncryptString(decryptString, -shift));
                correct = true;
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("До свидания!");
                correct = true;
            } else {
                System.out.println("Введите корректный ответ.");
            }
        } while (!correct);
        in.close();
    }
}
