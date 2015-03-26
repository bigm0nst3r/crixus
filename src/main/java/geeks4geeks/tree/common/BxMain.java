package geeks4geeks.tree.common;

/**
 * @author Sreejith S
 * @since Mar 14, 2015
 */
public class BxMain {

  public static void main(String[] args) {

    Node root = new Node(5);
    BxTree tree = new BxTree(root);

    Node _node1L = new Node(1);
    Node _node1R = new Node(2);
    tree.add(root, true, _node1L);
    tree.add(root, false, _node1R);


    Node _node2L = new Node(0);
    Node _node22L = new Node(3);
    tree.add(_node1L, true, _node2L);

    tree.add(_node1R, true, _node22L);

    System.out.println("!!");
  }

}
