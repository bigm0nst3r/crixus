package geeks4geeks.arrays;

/**
 * @author Sreejith S
 * @since Mar 22, 2015
 */
public class Mergesort {


  public static void main(String[] args) {
    int[] inp = getArray();
    mergesort(inp, 0, inp.length - 1);
    System.out.println("!");
  }

  private static void mergesort(int[] inp, int low, int high) {

    if (low < high) {
      // Get the index of the element which is in the middle
      int middle = low + (high - low) / 2;
      // Sort the left side of the array
      mergesort(inp, low, middle);
      // Sort the right side of the array
      mergesort(inp, middle + 1, high);
      // Combine them both
      merge(inp, low, middle, high);
    }
  }

  private static void merge(int[] inp, int low, int middle, int high) {

    int[] helper = new int[6];

    for (int i = low; i <= high; i++) {
      helper[i] = inp[i];
    }

    int i = low;
    int j = middle + 1;
    int k = low;

    while (i <= middle && j <= high) {
      if (helper[i] <= helper[j]) {
        inp[k] = helper[i];
        i++;
      } else {
        inp[k] = helper[j];
        j++;
      }
      k++;
    }

    while (i <= middle) {
      inp[k] = helper[i];
      k++;
      i++;
    }

  }


  public static int[] getArray() {
    int[] array = new int[6];
    array[0] = 6;
    array[1] = 2;
    array[2] = 1;
    array[3] = 4;
    array[4] = 9;
    return array;
  }
}
