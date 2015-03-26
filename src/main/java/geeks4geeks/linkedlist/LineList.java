package geeks4geeks.linkedlist;

/**
 * @author Sreejith S
 * @since Mar 09, 2015
 */
public class LineList {


  private CoordinateNode root;

  public LineList(CoordinateNode root) {
    this.root = root;
  }


  public LineList addPoint(int x, int y) {

    CoordinateNode temp = root;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }

    temp.setNext(new CoordinateNode(x, y));
    return this;
  }


  public void keepOnlyEdges() {
    CoordinateNode temp = root;
    CoordinateNode startPoint = root;
    boolean xIncrementing = true;

    while (temp.getNext() != null) {

      if (xIncrementing) {
        if (temp.getY() != temp.getNext().getY()) {
          breakLine(startPoint, temp);
          startPoint = temp;
          xIncrementing = false;
        }
      } else {
        if (temp.getX() != temp.getNext().getX()) {
          breakLine(startPoint, temp);
          startPoint = temp;
          xIncrementing = true;
        }
      }

      temp = temp.getNext();
    }

    breakLine(startPoint, temp);
  }

  private void breakLine(CoordinateNode startPoint, CoordinateNode next) {
    startPoint.setNext(next);
  }

  public void print() {
    CoordinateNode temp = root;
    while (temp.getNext() != null) {
      System.out.println(temp);
      temp = temp.getNext();
    }
    System.out.println(temp);
  }
}
