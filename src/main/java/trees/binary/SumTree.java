package trees.binary;

/**
 * @author Sreejith S
 * @since Mar 21, 2015
 */
public class SumTree {

  public static void main(String[] args) {

    BinaryTree binaryTree = new BinaryTree(10);

    binaryTree.getRoot().setLeft(new Node(8));
    binaryTree.getRoot().setRight(new Node(2));
    binaryTree.getRoot().getRight().setLeft(new Node(2));


    binaryTree.getRoot().getLeft().setLeft(new Node(3));
    binaryTree.getRoot().getLeft().setRight(new Node(5));

    binaryTree.checkIfSumPropHolds();


  }

}
