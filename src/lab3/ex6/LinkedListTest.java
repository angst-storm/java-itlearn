package lab3.ex6;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args) {
        int N = 10000;
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        ListIterator<Integer> iterator = list.listIterator();
        long startTime = System.nanoTime();

        while (list.size() > 1) {
            if (!iterator.hasNext()) {
                iterator = list.listIterator();
            }
            iterator.next();

            if (!iterator.hasNext()) {
                iterator = list.listIterator();
            }
            iterator.next();
            iterator.remove();
        }

        long endTime = System.nanoTime();

        System.out.println(list.get(0));
        System.out.println((endTime - startTime) / 1e6);
    }
}
