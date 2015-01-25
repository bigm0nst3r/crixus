package trees.lca;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 22, 2015
 */
public class NodeMain {

  public static void main(String[] args) {

    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);
    Node n6 = new Node(6);
    Node n7 = new Node(7);

    n1.setLeftNode(n2);
    n1.setRightNode(n3);

    n2.setLeftNode(n4);
    n2.setRightNode(n5);

    n3.setLeftNode(n6);
    n3.setRightNode(n7);

    // find lca of

    ArrayList<Node> path1 = new ArrayList<>();
    findPath(n1, new Node(9), path1);
    ArrayList<Node> path2 = new ArrayList<>();
    findPath(n1, n3, path2);

    Node lca = findLCA(path1, path2);
    System.out.println(lca);

  }

  private static Node findLCA(ArrayList<Node> path1, ArrayList<Node> path2) {

    int min = path1.size();
    if(min < path2.size()){
      min = path2.size();
    }

    for (int i = 0; i < min; i++) {
      if(!path1.get(i).equals(path2.get(i))){
        return path1.get(i-1);
      }
    }

    return null;
  }

  private static boolean findPath(Node root, Node toFind, ArrayList<Node> path) {
    if (root == null) {
      return false;
    }

    path.add(root);

    if(root == toFind){
      return true;
    }

    if (root.getLeftNode() != null && findPath(root.getLeftNode(), toFind, path)
        || root.getRightNode() != null && findPath(root.getRightNode(), toFind, path)) {
      return true;
    }

    path.remove(root);
    return false;


  }

}
