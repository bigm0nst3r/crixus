package geeks4geeks.linkedlist.reverse;

/**
 * @author Sreejith S
 * @since Mar 10, 2015
 */
public class Node {


  private int data;
  private Node next;


  public Node(int data) {
    this.data = data;
  }


  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
