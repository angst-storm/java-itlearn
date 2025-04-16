package lab3;

import java.util.HashMap;
import java.util.Map;

public class Ex5HashMapProcessor {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Яблоко");
        map.put(6, "Банан");
        map.put(3, "Вишня");
        map.put(8, "Апельсин");
        map.put(0, "Ель");
        map.put(4, "Финик");
        map.put(7, "Грейпфрут");
        map.put(2, "Ананас");
        map.put(9, "Киви");
        map.put(5, "Лайм");

        System.out.println("\nСтроки с ключом > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("  Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
            }
        }

        if (map.containsKey(0)) {
            System.out.println("\nЗначение для ключа 0: " + map.get(0));
        }

        long result = 1;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            String value = entry.getValue();
            if (value.length() > 5) {
                int key = entry.getKey();
                result = result * key;
            }
        }

        System.out.println("\nПроизведение ключей, где длина строки > 5: " + result);
    }
}
