package geeks4geeks.linkedlist.segregate;

/**
 * @author Sreejith S
 * @since Mar 10, 2015
 */
public class LinkedList {

  private Node root;

  public LinkedList(Node root) {
    this.root = root;
  }

  public LinkedList add(int data) {
    Node temp = root;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(new Node(data));
    return this;
  }

  public void reverse() {
    Node currentNode = root;
    Node prevNode = null;

    while(currentNode!=null){
      Node nextNode = currentNode.getNext();
      currentNode.setNext(prevNode);
      prevNode = currentNode;
      currentNode = nextNode;
    }
    root = prevNode;
  }



}
