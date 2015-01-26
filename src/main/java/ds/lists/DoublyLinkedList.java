package ds.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class DoublyLinkedList{

  List<Node> nodeHolder = new ArrayList<>();

  public void add(Node node){
    if(nodeHolder.size()==0){
      nodeHolder.add(node);
      node.setPrevious(null);
      node.setNext(null);
    } else {
      Node currentLast = nodeHolder.get(nodeHolder.size() - 1);
      currentLast.setNext(node);
      node.setPrevious(currentLast);
      nodeHolder.add(node);
    }

  }


  public void delete(Node deleteNode){

    deleteNode.getPrevious().setNext(deleteNode.getNext());
    deleteNode.getNext().setPrevious(deleteNode.getPrevious());

    nodeHolder.remove(deleteNode);

  }
}
