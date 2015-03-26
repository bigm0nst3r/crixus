package structures.tree.binary;

import java.util.List;

/**
 * @author Sreejith S
 * @since Feb 24, 2015
 */
public class TreeMain {

  public static void main(String[] args) {

    BTree tree = new BTree(20);
    tree.insert(8);
    tree.insert(22);
    tree.insert(4);
    tree.insert(12);
    tree.insert(10);
    tree.insert(14);

    List allPaths = tree.findAllPaths();

    System.out.println(allPaths);


  }

}
