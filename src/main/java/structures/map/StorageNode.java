package structures.map;

/**
 * @author Sreejith S
 * @since Feb 22, 2015
 */
public class StorageNode<K, E> {

  private StorageNode next;
  private E data;
  private K key;


  public StorageNode(K key, E data) {
    this.data = data;
    this.key = key;
    this.next = null;
  }

  public K getKey() {
    return key;
  }

  public E getData() {
    return data;
  }

  public StorageNode getNext() {
    return next;
  }

  public void setNext(StorageNode next) {
    this.next = next;
  }
}
