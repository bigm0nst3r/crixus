package ds.stack;

import java.util.ArrayList;
import java.util.List;

import ds.lists.Node;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class St1 {

  List<Node> holder = new ArrayList<>();


  public void push(Node node) {
    holder.add(node);
  }

  public Node pop() {
    if (holder.size() > 0) {
      Node topNode = holder.get(holder.size() - 1);
      holder.remove(topNode);
      return topNode;
    }
    return null;
  }


}
