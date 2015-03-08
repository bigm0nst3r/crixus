package math;

/**
 * @author Sreejith S
 * @since Feb 26, 2015
 */
public class MSort {


  public static void main(String[] args) {
    int[] inp = getArray();

    mergeSort(inp, 0, inp.length - 1);


  }

  private static void mergeSort(int[] inp, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      int midIndex = (firstIndex + lastIndex) / 2;
      mergeSort(inp, firstIndex, midIndex);
      mergeSort(inp, midIndex + 1, lastIndex);
      merge(inp, firstIndex, midIndex, lastIndex);
    }
  }

  private static void merge(int[] inp, int firstIndex, int midIndex, int lastIndex) {

  }


  private static int[] getArray() {
    int[] input = new int[9];
    input[0] = 38;
    input[1] = 27;
    input[2] = 43;
    input[3] = 3;
    input[4] = 9;
    input[4] = 82;
    input[4] = 10;
    return input;
  }

}
