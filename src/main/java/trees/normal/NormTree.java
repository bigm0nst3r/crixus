package trees.normal;

import java.util.List;

/**
 * @author Sreejith S
 * @since Mar 21, 2015
 */
public class NormTree {


  private Node rootNode;

  NormTree(Node root) {
    this.rootNode = root;
  }


  public void addChildren(Node parent, List<Node> children) {
    //check if parent is a valid node
    parent.setChildren(children);
  }




}
