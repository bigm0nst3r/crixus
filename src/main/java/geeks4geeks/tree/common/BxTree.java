package geeks4geeks.tree.common;

/**
 * @author Sreejith S
 * @since Mar 14, 2015
 */
public class BxTree {


  private Node root;

  public BxTree(int data) {
    this.root = new Node(data);
  }

  public BxTree(Node root) {
    this.root = root;
  }


  public void add(Node node, boolean isLeft, Node data) {
    Node _node = _checkNode(node, root);
    if (_node != null) {
      if (isLeft) {
        _node.setLeft(data);
      } else {
        _node.setRight(data);
      }
    }
  }


  private Node _checkNode(Node searchNode, Node node) {
    Node ans = null;
    if (node != null) {
      if (searchNode.equals(node)) {
        return searchNode;
      }
      if (node.getLeft() != null) {
        ans = _checkNode(searchNode, node.getLeft());
      }
      if (ans == null && node.getRight() != null) {
        ans = _checkNode(searchNode, node.getLeft());
      }
    }

    return ans;
  }

}
