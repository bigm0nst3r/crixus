package ds.lists;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class Node {

  private int data;
  private Node next;
  private Node previous;

  public Node(int data) {
    this.data = data;
    next = null;
    previous = null;
  }


  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getPrevious() {
    return previous;
  }

  public void setPrevious(Node previous) {
    this.previous = previous;
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
    if (next != null ? !next.equals(node.next) : node.next != null) {
      return false;
    }
    if (previous != null ? !previous.equals(node.previous) : node.previous != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = data;
    result = 31 * result + (next != null ? next.hashCode() : 0);
    result = 31 * result + (previous != null ? previous.hashCode() : 0);
    return result;
  }
}
