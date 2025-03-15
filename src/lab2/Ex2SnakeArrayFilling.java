package lab2;

import java.util.Scanner;

public class Ex2SnakeArrayFilling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество столбцов:");
        var sizeX = in.nextInt();
        System.out.println("Введите количество строк:");
        var sizeY = in.nextInt();
        var nums = new int[sizeY][sizeX];
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                var n = i * sizeX + j + 1;
                if (i % 2 == 0) {
                    nums[i][j] = n;
                } else {
                    nums[i][sizeX - j - 1] = n;
                }
            }
        }
        for (int i = 0; i < sizeY; i++) {
            for (int j = 0; j < sizeX; j++) {
                System.out.print(" " + nums[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
