package bst;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class BSTMain {


  public static void main(String[] args) {

    int[] input = new int[10];
    input[0]=8;
    input[1]=10;
    input[2]=3;
    input[3]=1;
    input[4]=6;
    input[5]=4;
    input[6]=7;
    input[7]=14;
    input[8]=13;

    Tree bst = new Tree();
    bst.insert(input);



  }

}
