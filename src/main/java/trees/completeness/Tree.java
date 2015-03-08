package trees.completeness;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class Tree {


  int count = 0;
  Node rootNode;
  int sum = 0;

  public void insert(int[] input) {
    for (int data : input) {
      insert(rootNode, new Node(data));
    }

  }

  public void insert(Node parentNode, Node input) {
    if (this.rootNode == null) {
      this.rootNode = input;
      return;
    } else {
      if (input.getData() < parentNode.getData()) {
        if (parentNode.getLeftNode() == null) {
          parentNode.setLeftNode(input);
          count++;
        } else {
          insert(parentNode.getLeftNode(), input);
        }
      } else {
        if (parentNode.getRightNode() == null) {
          parentNode.setRightNode(input);
          count++;
        } else {
          insert(parentNode.getRightNode(), input);
        }
      }

    }
    return;
  }


  public void prefix() {
    _prefix(rootNode);
  }

  private void _prefix(Node node) {
    if (node != null) {
      if (node.getLeftNode() != null) {
        _prefix(node.getLeftNode());
      }
      System.out.println(node.getData());
      if (node.getRightNode() != null) {
        _prefix(node.getRightNode());
      }
    }
  }

  public Integer leftSum() {
    if (rootNode.getLeftNode() != null) {
      _leftSum(rootNode.getLeftNode());
    }
    return sum;
  }

  private void _leftSum(Node node) {
    if (node.getLeftNode() == null && node.getRightNode() == null) {
      sum += node.getData();
    } else {
      if(node.getLeftNode() != null){
        _leftSum(node.getLeftNode());
      }

      if(node.getRightNode() != null){
        _leftSum(node.getRightNode());
      }

    }
  }
}
