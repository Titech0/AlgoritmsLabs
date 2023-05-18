package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class BubbleSorter implements Sorter {

  public ArrayList<Integer> sort(ArrayList<Integer> input) {
    ArrayList<Integer> result = new ArrayList<>(input);
    int n = result.size();

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (result.get(j) > result.get(j + 1)) {
          int temp = result.get(j);
          result.set(j, result.get(j + 1));
          result.set(j + 1, temp);
        }
      }
    }

    return result;
  }
}
