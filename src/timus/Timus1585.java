package timus;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Timus1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        Map<String, Integer> penguinCounts = new HashMap<>();
        penguinCounts.put("Emperor Penguin", 0);
        penguinCounts.put("Little Penguin", 0);
        penguinCounts.put("Macaroni Penguin", 0);

        for (int i = 0; i < n; i++) {
            String penguinType = scanner.nextLine();
            penguinCounts.put(penguinType, penguinCounts.get(penguinType) + 1);
        }

        String mostPopularPenguin = null;
        int maxCount = 0;

        for (Map.Entry<String, Integer> penguin : penguinCounts.entrySet()) {
            if (penguin.getValue() > maxCount) {
                maxCount = penguin.getValue();
                mostPopularPenguin = penguin.getKey();
            }
        }

        System.out.println(mostPopularPenguin);
        scanner.close();
    }
}
