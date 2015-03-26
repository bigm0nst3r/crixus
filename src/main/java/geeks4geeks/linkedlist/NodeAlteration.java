package geeks4geeks.linkedlist;

/**
 * @author Sreejith S
 * @since Mar 10, 2015
 */
public class NodeAlteration {

  public static void main(String[] args) {

    SinglePtrList list = new SinglePtrList(new SinglePtrNode(1));
    list.add(2).add(4).add(5).add(6);

    list.alter();

  }

}
