package geeks4geeks.tree.common;

/**
 * @author Sreejith S
 * @since Mar 14, 2015
 */
public class Node {


  private int data;
  private Node left;
  private Node right;

  Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Node node = (Node) o;

    if (data != node.data) {
      return false;
    }
    if (left != null ? !left.equals(node.left) : node.left != null) {
      return false;
    }
    if (right != null ? !right.equals(node.right) : node.right != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = data;
    result = 31 * result + (left != null ? left.hashCode() : 0);
    result = 31 * result + (right != null ? right.hashCode() : 0);
    return result;
  }
}
