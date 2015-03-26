package geeks4geeks.linkedlist;

/**
 * @author Sreejith S
 * @since Mar 09, 2015
 */
public class LineListMain {

  public static void main(String[] args) {

    LineList
        lineList =
        new LineList(new CoordinateNode(0, 10)).addPoint(1, 10).addPoint(5, 10).addPoint(7, 10).addPoint(7, 5)
            .addPoint(20, 5).addPoint(40, 5);


    lineList.keepOnlyEdges();

    lineList.print();
  }

}
