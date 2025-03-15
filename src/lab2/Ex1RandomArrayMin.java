package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex1RandomArrayMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        var size = in.nextInt();
        var nums = new int[size];
        Random random = new Random(42);
        var minElement = Integer.MAX_VALUE;
        var minElementIndexes = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = random.nextInt(200);
            nums[i] = num;
            if (num == minElement) {
                minElementIndexes.add(i);
            } else if (num < minElement) {
                minElement = num;
                minElementIndexes.clear();
                minElementIndexes.add(i);
            }
        }
        System.out.println("Массив: " + Arrays.toString(nums));
        System.out.println("Минимальное значение: " + minElement);
        System.out.println("Индексы: " + minElementIndexes);
        in.close();
    }
}
