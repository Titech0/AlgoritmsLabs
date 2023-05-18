package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class MergeSorter implements Sorter {

  public ArrayList<Integer> sort(ArrayList<Integer> input) {
    if (input.size() <= 1) {
      return input;
    }

    int mid = input.size() / 2;
    ArrayList<Integer> left = new ArrayList<>(input.subList(0, mid));
    ArrayList<Integer> right = new ArrayList<>(
      input.subList(mid, input.size())
    );

    return merge(sort(left), sort(right));
  }

  private ArrayList<Integer> merge(
    ArrayList<Integer> left,
    ArrayList<Integer> right
  ) {
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0, j = 0;

    while (i < left.size() && j < right.size()) {
      if (left.get(i) < right.get(j)) {
        result.add(left.get(i++));
      } else {
        result.add(right.get(j++));
      }
    }

    result.addAll(left.subList(i, left.size()));
    result.addAll(right.subList(j, right.size()));

    return result;
  }
}
