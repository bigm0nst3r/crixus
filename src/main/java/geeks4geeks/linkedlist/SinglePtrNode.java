package geeks4geeks.linkedlist;

/**
 * @author Sreejith S
 * @since Mar 10, 2015
 */
public class SinglePtrNode {

  private int data;
  private SinglePtrNode next;


  public SinglePtrNode(int data) {
    this.data = data;
    this.next = null;
  }

  public SinglePtrNode(int data, SinglePtrNode next) {
    this.data = data;
    this.next = next;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public SinglePtrNode getNext() {
    return next;
  }

  public void setNext(SinglePtrNode next) {
    this.next = next;
  }
}
