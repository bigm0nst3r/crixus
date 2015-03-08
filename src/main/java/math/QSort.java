package math;

/**
 * @author Sreejith S
 * @since Feb 25, 2015
 */
public class QSort {

  public static void main(String[] args) {

    int[] inp = getArray();
    qsort(inp, 0, inp.length - 1);

    for (int i : inp) {
      System.out.print(i + "  ");
    }


  }

  private static void qsort(int[] inp, int firstIndex, int lastIndex) {
    if (firstIndex < lastIndex) {
      int pivotIndex = partition(inp, firstIndex, lastIndex);
      qsort(inp, firstIndex, pivotIndex - 1);
      qsort(inp, pivotIndex + 1, lastIndex);
    }

  }

  private static int partition(int[] inp, int firstIndex, int lastIndex) {
    int pivotIndex = lastIndex;
    int pivot = inp[pivotIndex];

    int storeIndex = firstIndex;
    int temp;

    /**
     * Compare numbers from first index to last index with
     * pivot. If number is less than pivot swap it with the
     * number at index 'storeIndex' (a moving index). By the
     * end the number till the storeIndex will have numbers
     * lesser than pivot.
     *
     * Now swap pivot and the number in storeIndex
     *
     */
    for (int i = firstIndex; i < lastIndex; i++) {
      if (inp[i] < pivot) {
        temp = inp[storeIndex];
        inp[storeIndex] = inp[i];
        inp[i] = temp;
        storeIndex += 1;
      }
    }

    temp = inp[storeIndex];
    inp[storeIndex] = inp[lastIndex];
    inp[lastIndex] = temp;
    return storeIndex;
  }

  private static int[] getArray() {
    int[] input = new int[9];
    input[0] = 3;
    input[1] = 7;
    input[2] = 8;
    input[3] = 5;
    input[4] = 2;
    input[5] = 1;
    input[6] = 9;
    input[7] = 5;
    input[8] = 4;
    return input;
  }


}
