package geeks4geeks.linkedlist;

/**
 * @author Sreejith S
 * @since Mar 09, 2015
 */
public class CoordinateNode {


  private int x;
  private int y;
  private CoordinateNode next;


  public CoordinateNode(int x, int y) {
    this.x = x;
    this.y = y;
    this.next = null;
  }

  public CoordinateNode(int x, int y, CoordinateNode next) {
    this.x = x;
    this.y = y;
    this.next = next;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public CoordinateNode getNext() {
    return next;
  }

  public void setNext(CoordinateNode next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
           "x=" + x +
           ", y=" + y +
           '}';
  }
}
