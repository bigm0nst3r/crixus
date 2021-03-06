package trees.bst;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class Node {

  private int data;
  private Node left;
  private Node right;

  public Node(int digit) {
    this.data = digit;
    setLeft(null);
    setRight(null);
  }


  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }
}
