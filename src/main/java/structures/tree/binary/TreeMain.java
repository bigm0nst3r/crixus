package structures.tree.binary;

/**
 * @author Sreejith S
 * @since Feb 24, 2015
 */
public class TreeMain {

  public static void main(String[] args) {

    BTree tree = new BTree("ijk");
    tree.insert("def");
    tree.insert("xyz");
    tree.insert("abc");

    tree.inorder();
    System.out.println("========");
    tree.preorder();
    System.out.println("========");
    tree.postorder();

  }

}
