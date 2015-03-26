package trees.normal;

import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class Node {

  private int data;
  private List<Node> children;

  public Node(int digit) {
    this.data = digit;
    setChildren(null);
  }

  public void setChildren(List<Node> children) {
    this.children = children;
  }

  public List<Node> getChildren() {
    return children;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

}
