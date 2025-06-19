package lab3;

import java.util.*;
import java.util.function.Function;

public class Variant14 {

    public static void main(String[] args) {
        long numElements = 14 * 100000L;
        long numLookups = 14 * 1000000L;

        ArrayList<Long> arrayList = new ArrayList<>();
        LinkedHashSet<Long> linkedHashSet = new LinkedHashSet<>();
        LinkedHashMap<Long, Long> linkedHashMap = new LinkedHashMap<>();

        System.out.println("Добавление в начало:");
        measure(i -> {
            arrayList.add(0, i);
            return null;
        }, numElements, "ArrayList");
        arrayList.clear();

        System.out.println("Добавление в середину:");
        measure(i -> {
            arrayList.add(arrayList.size() / 2, i);
            return null;
        }, numElements, "ArrayList");
        arrayList.clear();

        System.out.println("Добавление в конец:");
        measure(i -> {
            arrayList.add(i);
            return null;
        }, numElements, "ArrayList");
        measure(i -> {
            linkedHashSet.add(i);
            return null;
        }, numElements, "LinkedHashSet");
        measure(i -> {
            linkedHashMap.put(i, i);
            return null;
        }, numElements, "LinkedHashMap");

        System.out.println("Удаление из начала:");
        measure(i -> {
            arrayList.remove(0);
            return null;
        }, numElements, "ArrayList");

        System.out.println("Удаление из середины:");
        for (long i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        measure(i -> {
            arrayList.remove(arrayList.size() / 2);
            return null;
        }, numElements, "ArrayList");

        System.out.println("Удаление из конца:");

        for (long i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        measure(i -> {
            arrayList.remove(arrayList.size() - 1);
            return null;
        }, numElements, "ArrayList");
        measure(i -> {
            linkedHashSet.remove(i);
            return null;
        }, numElements, "LinkedHashSet");
        measure(i -> {
            linkedHashMap.remove(i);
            return null;
        }, numElements, "LinkedHashMap");

        System.out.println("Получение элемента по индексу:");
        for (long i = 0; i < numElements; i++) {
            arrayList.add(i);
        }
        measure(i -> {
            arrayList.get((int) (i % arrayList.size()));
            return null;
        }, numLookups, "ArrayList");
        for (long i = 0; i < numLookups; i++) {
            linkedHashMap.put(i, i);
        }
        measure(i -> {
            linkedHashMap.get(i);
            return null;
        }, numLookups, "LinkedHashMap");
    }

    private static void measure(Function<Long, Void> f, long repeatTimes, String name) {
        long start = System.currentTimeMillis();
        for (long i = 0; i < repeatTimes; i++) {
            f.apply(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(name + " = " + (end - start) + " ms");
    }
}
