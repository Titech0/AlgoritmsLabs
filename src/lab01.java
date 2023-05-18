package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class lab01 {
	public static void main (String[] args) {
		final int SIZE = 100000;
		final int INSERTIONS_COUNT = 1000;

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		System.out.println("Кількість елементів у списку: " + SIZE);
		System.out.println("Число введених елементів: " + INSERTIONS_COUNT);
		
		// Заповнення масиву
		ListSpeedComparator.fill(arrayList, SIZE, "ArrayList");
		ListSpeedComparator.fill(linkedList, SIZE, "LinkedList");

		// Random Access (доступ за індексом)
		ListSpeedComparator.randomAccess(arrayList, SIZE, "ArrayList");
		ListSpeedComparator.randomAccess(linkedList, SIZE, "LinkedList");

		// Sequential Access (доступ по ітератору)
		ListSpeedComparator.sequentialAccess(arrayList, "ArrayList");
		ListSpeedComparator.sequentialAccess(linkedList, "LinkedList");

		// Вставка на початок списку
		ListSpeedComparator.addToStart(arrayList, INSERTIONS_COUNT, "ArrayList");
		ListSpeedComparator.addToStart(linkedList, INSERTIONS_COUNT, "LinkedList");

		// Вставка у кінець списку
		ListSpeedComparator.addToEnd(arrayList, INSERTIONS_COUNT, "ArrayList");
		ListSpeedComparator.addToEnd(linkedList, INSERTIONS_COUNT, "LinkedList");

		// Вставка до середини списку
		ListSpeedComparator.addToMiddle(arrayList, INSERTIONS_COUNT, "ArrayList");
		ListSpeedComparator.addToMiddle(linkedList, INSERTIONS_COUNT, "LinkedList");
	}
}
