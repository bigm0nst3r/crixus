package structures.tree;

/**
 * @author Sreejith S
 * @since Feb 22, 2015
 */
public class TreePgm {


  public static void main(String[] args) {

    Tree<Integer> tree = new Tree<>();

    Node rootNode = new Node(1);
    tree.addRoot(rootNode);

    Node firstChild = new Node(2);
    Node secondChild = new Node(3);

    tree.addChild(rootNode, firstChild);
    tree.addChild(rootNode, secondChild);
    tree.addChild(rootNode, new Node(4));
    tree.addChild(rootNode, new Node(5));

    tree.addChild(firstChild, new Node(6));
    tree.addChild(firstChild, new Node(7));

    System.out.println("!!!!!");


  }

}
