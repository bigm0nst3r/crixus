package structures.tree;

/**
 * @author Sreejith S
 * @since Feb 22, 2015
 */
public class Tree<E> {

  private Node<E> rootNode;

  public void addRoot(Node node) {
    if (this.rootNode == null) {
      rootNode = node;
    }
  }


  public boolean addChild(Node<E> parent, Node<E> child) {
    if (rootNode == null) {
      return false;
    }
    if (find(rootNode, parent)) {
      parent.addChild(child);
      return true;
    }
    return false;
  }

  private boolean find(Node<E> parent, Node<E> searchNode) {
    if (parent.equals(searchNode)) {
      return true;
    } else {
      Node<E>[] children = parent.getChildren();

      if (children != null) {
        for (Node<E> child : children) {
          if (find(child, searchNode)) {
            return true;
          }
        }
      }

      return false;
    }
  }
}
