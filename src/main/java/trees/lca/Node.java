package trees.lca;

/**
 * @author Sreejith S
 * @since Jan 22, 2015
 */
public class Node {

  private Node leftNode;
  private Node rightNode;
  private int data;

  public Node(int data) {
    this.data = data;
    this.leftNode = null;
    this.rightNode = null;
  }

  public Node getLeftNode() {
    return leftNode;
  }

  public void setLeftNode(Node leftNode) {
    this.leftNode = leftNode;
  }

  public Node getRightNode() {
    return rightNode;
  }

  public void setRightNode(Node rightNode) {
    this.rightNode = rightNode;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
