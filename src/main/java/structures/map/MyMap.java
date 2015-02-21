package structures.map;

/**
 * @author Sreejith S
 * @since Feb 20, 2015
 */
public class MyMap implements IMap<Integer, String> {

  StorageNode[] init;

  public MyMap() {
    init = new StorageNode[10];
  }

  @Override
  public void put(Integer key, String value) {
    int location = hash(key);
    StorageNode node = new StorageNode(key, value);
    if(init[location] == null){
      init[location] = node;
    } else {
      StorageNode rootNode = init[location];
      StorageNode temp = rootNode;
      while(temp.getNext() != null){
        temp = temp.getNext();
      }
      temp.setNext(node);
    }
  }


  @Override
  public String get(Integer key) {
    int hashKey = hash(key);
    StorageNode node = init[hashKey];
    if(node.getNext() == null){
      return String.valueOf(node.getData());
    }

    while(node != null){
      if(node.getKey().equals(key)){
        return String.valueOf(node.getData());
      }
      node = node.getNext();
    }

    return null;
  }

  private int hash(Integer key) {
    return key % 10;
  }


}
