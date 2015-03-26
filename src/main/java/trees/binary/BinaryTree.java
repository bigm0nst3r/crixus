package trees.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Mar 21, 2015
 */
public class BinaryTree<Integer> {


  private Node<Integer> root;

  public BinaryTree(int rootdata) {
    this.root = new Node(rootdata);
  }


  public void add(Node parent, boolean left, int data) {
    if (left) {
      parent.setLeft(new Node(data));
    } else {
      parent.setRight(new Node(data));
    }
  }


  public boolean checkIfSumPropHolds() {
    List<Boolean> truth = new ArrayList<>();
    _checkIfSumPropHolds(root, truth);
    return true;
  }

  private void _checkIfSumPropHolds(Node<Integer> root, List<Boolean> truth) {

    Integer rootData = root.getData();
    Integer dataL = null;
    Integer dataR = null;
    if(root.getLeft()!=null || root.getRight()!=null) {
      if (root.getLeft() != null) {
        dataL = (Integer) root.getLeft().getData();
        _checkIfSumPropHolds(root.getLeft(), truth);
      }
      if (root.getRight() != null) {
        dataR = (Integer) root.getRight().getData();
        _checkIfSumPropHolds(root.getRight(), truth);
      }



//      if(rootData != (dataL + dataR)){
//        return;
//      }

//      truth.add(rootData == (dataL + dataR));
    }
  }


  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }
}


