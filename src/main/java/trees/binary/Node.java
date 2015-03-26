package trees.binary;

/**
 * @author Sreejith S
 * @since Mar 21, 2015
 */
public class Node<E> {

  private E data;
  private Node left;
  private Node right;


  public Node(E data) {
    this.data = data;
    this.left = this.right = null;
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
