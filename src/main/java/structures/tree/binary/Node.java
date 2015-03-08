package structures.tree.binary;

/**
 * @author Sreejith S
 * @since Feb 24, 2015
 */
public class Node<E extends Comparable> {

  private E data;
  private Node left;
  private Node right;


  public Node(E data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }

  public E getData() {
    return data;
  }

  public void setData(E data) {
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
