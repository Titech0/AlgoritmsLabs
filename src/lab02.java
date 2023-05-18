package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class lab02 {

  public static void main(String[] args) {
    Random random = new Random();

    for (int count : new int[] { 10, 1000, 10000, 100000 }) {
      ArrayList<Integer> input = generateRandomList(
        count,
        random.nextInt(count)
      );

      System.out.print("Unsorted: ");
      printFirstFiftyElements(input);
      System.out.println("Count: " + count);

      for (SortingType type : SortingType.values()) {
        Sorter sorter = getSorter(type);
        long start = System.currentTimeMillis();
        ArrayList<Integer> sorted = sorter.sort(input);
        long end = System.currentTimeMillis();

        System.out.println("\tSorting type: " + type);
        System.out.println("\tExecution time: " + (end - start) + " ms");
        System.out.print("\tSorted: ");
        printFirstFiftyElements(sorted);
      }
    }
  }

  private static ArrayList<Integer> generateRandomList(int count, int bound) {
    ArrayList<Integer> result = new ArrayList<>();
    Random random = new Random();

    for (int i = 0; i < count; ++i) {
      result.add(random.nextInt(bound));
    }

    return result;
  }

  private static Sorter getSorter(SortingType type) {
    switch (type) {
      case BUBBLE:
        return new BubbleSorter();
      case SHELL:
        return new ShellSorter();
      case MERGE:
        return new MergeSorter();
      case QUICK:
        return new QuickSorter();
      default:
        throw new IllegalArgumentException("Unsupported sorting type: " + type);
    }
  }

  private static void printFirstFiftyElements(ArrayList<Integer> arr) {
    if (arr.size() <= 50) {
      System.out.println(Arrays.toString(arr.toArray()));
    } else {
      for (int i = 0; i < 50; ++i) {
        System.out.print(arr.get(i) + (i == 49 ? "" : ", "));
      }

      System.out.println("...");
    }
  }
}
