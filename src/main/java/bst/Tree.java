package bst;

/**
 * @author Sreejith S
 * @since Jan 25, 2015
 */
public class Tree {


  int count = 0;
  Node rootNode;

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
        if (parentNode.getLeft() == null) {
          parentNode.setLeft(input);
          count++;
        } else {
          insert(parentNode.getLeft(), input);
        }
      } else {
        if (parentNode.getRight() == null) {
          parentNode.setRight(input);
          count++;
        } else {
          insert(parentNode.getRight(), input);
        }
      }

    }
    return;
  }
}
