package set2;

/**
 * @author Sreejith S
 * @since Jan 22, 2015
 */
public class Mergesort {


  public static void main(String[] args) {

    int[] input = getArray();
    int[] sorted = new int[input.length];

    mergeSort(input, sorted, 0, input.length);


  }

  private static void mergeSort(int[] input, int[] sortedOp, int left, int right) {

    if (left < right) {
      int center = (left + right) / 2;
      mergeSort(input, sortedOp, 0, center);
      mergeSort(input, sortedOp, center + 1, right);
      merge(input, sortedOp, left, center + 1, right);
    }
  }

  private static void merge(int[] input, int[] sortedOp, int firstStart, int nextStart,
                            int rightEnd) {

  }


  private static int[] getArray() {
    int[] test = new int[8];
    test[0] = 85;
    test[1] = 24;
    test[2] = 63;
    test[3] = 45;
    test[4] = 17;
    test[5] = 31;
    test[6] = 96;
    test[7] = 50;
    return test;
  }


}
