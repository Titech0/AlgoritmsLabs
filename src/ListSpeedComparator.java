package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class ListSpeedComparator {
    private static final Random RANDOM = new Random();

    static void fill(List<Integer> list, int count, String listType) {
        long start = System.nanoTime();

        for (int i = 0; i < count; i++) {
          list.add(RANDOM.nextInt());
				}

        long end = System.nanoTime();
        System.out.println(String.format("Fill %s: %sms", listType, (end - start) / 1000000));
    }

    static void randomAccess(List<Integer> list, int size, String listType) {
        long start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            int randIndex = RANDOM.nextInt(size);
            int randNum = list.get(randIndex);
        }

        long end = System.nanoTime();
        System.out.println(String.format("Random access in %s: %sms", listType, (end - start) / 1000000));
    }

    static void sequentialAccess(List<Integer> list, String listType) {
        long start = System.nanoTime();

        for (int i : list) {
					i++;
				}

        long end = System.nanoTime();
        System.out.println(String.format("Sequential access in %s: %sms", listType, (end - start) / 1000000));
    }

    static void addToStart(List<Integer> list, int count, String listType) {
        long start = System.nanoTime();

        for (int i = 0; i < count; i++) {
					list.add(0, RANDOM.nextInt());
				}

        long end = System.nanoTime();
        System.out.println(String.format("Add to start of %s: %sms", listType, (end - start) / 1000000));
    }

    static void addToEnd(List<Integer> list, int count, String listType) {
        long start = System.nanoTime();

        for (int i = 0; i < count; i++) {
					list.add(RANDOM.nextInt());
				}

        long end = System.nanoTime();
        System.out.println(String.format("Add to end of %s: %sms", listType, (end - start) / 1000000));
    }

    static void addToMiddle(List<Integer> list, int count, String listType) {
        long start = System.nanoTime();

        for (int i = 0; i < count; i++) {
					list.add(list.size() / 2, RANDOM.nextInt());
				}
	
        long end = System.nanoTime();
        System.out.println(String.format("Add to middle of %s: %sms", listType, (end - start) / 1000000));
    }
}
