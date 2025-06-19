package timus;

import java.util.*;

public class Timus1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Long> deque = new ArrayDeque<>();

        while (scanner.hasNextLong()) {
            deque.push(scanner.nextLong());
        }

        while (!deque.isEmpty()) {
            System.out.printf("%.4f%n", Math.sqrt(deque.pop()));
        }
    }
}
