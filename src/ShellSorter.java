package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class ShellSorter implements Sorter {

  public ArrayList<Integer> sort(ArrayList<Integer> input) {
    ArrayList<Integer> result = new ArrayList<>(input);
    int n = result.size();

    for (int k = n / 2; k > 0; k /= 2) {
      for (int i = k; i < n; i += 1) {
        int temp = result.get(i);
        int j;

        for (j = i; j >= k && result.get(j - k) > temp; j -= k) {
          result.set(j, result.get(j - k));
        }

        result.set(j, temp);
      }
    }

    return result;
  }
}
