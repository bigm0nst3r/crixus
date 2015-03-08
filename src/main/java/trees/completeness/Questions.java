package trees.completeness;

/**
 * @author Sreejith S
 * @since Feb 26, 2015
 */
public class Questions {


  public static void main(String[] args) {

    int[] input = getInput();

    Tree bst = new Tree();
    bst.insert(input);
    /**
     * Sum of left leaves
     */

    bst.leftSum();

  }

  private static int[] getInput() {
    int[] input = new int[9];
    input[0] = 8;
    input[1] = 10;
    input[2] = 3;
    input[3] = 1;
    input[4] = 6;
    input[5] = 4;
    input[6] = 7;
    input[7] = 14;
    input[8] = 13;
    return input;
  }

}
