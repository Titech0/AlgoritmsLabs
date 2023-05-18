package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class QuickSorter implements Sorter {

  public ArrayList<Integer> sort(ArrayList<Integer> input) {
    ArrayList<Integer> result = new ArrayList<>(input);

    quickSort(result, 0, result.size() - 1);
    return result;
  }

  void quickSort(ArrayList<Integer> arr, int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);

      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  int partition(ArrayList<Integer> arr, int low, int high) {
    int pivot = arr.get(high);
    int i = low - 1;

    for (int j = low; j <= high - 1; j++) {
      if (arr.get(j) < pivot) {
        i++;
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
      }
    }
    int temp = arr.get(i + 1);

    arr.set(i + 1, arr.get(high));
    arr.set(high, temp);

    return i + 1;
  }
}
