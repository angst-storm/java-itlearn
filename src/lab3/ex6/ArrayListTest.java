package lab3.ex6;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        int N = 10000;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int index = 0;

        long startTime = System.nanoTime();
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        long endTime = System.nanoTime();

        System.out.println(list.get(0));
        System.out.println((endTime - startTime) / 1e6);
    }
}
