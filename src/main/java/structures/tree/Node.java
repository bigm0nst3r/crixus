package structures.tree;

import java.util.Arrays;

/**
 * @author Sreejith S
 * @since Feb 22, 2015
 */
public class Node<E> {


  private E data;
  private Node<E>[] children;
  int childCount;
  private int INITIAL_CAPACITY = 2;

  public Node(E data) {
    this.data = data;
    this.children = new Node[INITIAL_CAPACITY];
    this.childCount = 0;
  }


  public void addChild(Node childNode) {
    if (childCount == INITIAL_CAPACITY) {
      INITIAL_CAPACITY *= 2;
      Node<E>[] newChildrenArray = new Node[INITIAL_CAPACITY];
      System.arraycopy(children, 0, newChildrenArray, 0, childCount);
      children = newChildrenArray;
    }
    children[childCount] = childNode;
    childCount++;
  }


  public Node<E>[] getChildren() {
    return children;
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

    if (!Arrays.equals(children, node.children)) {
      return false;
    }
    if (data != null ? !data.equals(node.data) : node.data != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = data != null ? data.hashCode() : 0;
    result = 31 * result + (children != null ? Arrays.hashCode(children) : 0);
    return result;
  }
}