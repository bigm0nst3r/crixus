package structures;

/**
 * @author Sreejith S
 * @since Feb 19, 2015
 */
public class Node<E> {

  E data;
  Node left;
  Node right;

  public Node(E e) {
    data = e;
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
