package structures;

/**
 * @author Sreejith S
 * @since Feb 19, 2015
 */
public class NodeList<E> {

  Node rootNode = null;

  private void createRoot(E e) {
    rootNode = new Node(e);
    rootNode.setLeft(null);
    rootNode.setRight(null);
  }


  public void add(E e) {

    if (rootNode == null) {
      createRoot(e);
    } else {
      Node node = new Node(e);

      Node temp = rootNode;
      while (temp.getRight() != null) {
        temp = temp.getRight();
      }
      temp.setRight(node);
      node.setLeft(temp);
    }
  }


  public Node get(int index) {
    if (rootNode == null) {
      return null;
    }

    int i = 0;
    Node temp = rootNode;
    while (temp != null) {
      if (i == index) {
        break;
      }
      temp = temp.getRight();
      i++;
    }
    return temp;
  }

  /**
   * O(n) search
   * @param data
   * @return
   */
  public int search(E data) {
    Node temp = rootNode;
    int i = 0;
    while (temp.getRight() != null) {
      if (temp.getData().equals(data)) {
        return i;
      }
      i++;
      temp = temp.getRight();
    }
    return -1;
  }


  public void delete(Node node){
    if(node != null){
      if(node.getLeft() != null && node.getRight()!= null){
        node.getLeft().setRight(node.getRight());
        node.getRight().setLeft(node.getLeft());
        node = null;
      }
    }
  }

  public void print() {
    Node temp = rootNode;
    while(temp != null){
      System.out.print(temp.getData() + " ");
      temp = temp.getRight();
    }
  }
}
