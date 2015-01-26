package ds.lists;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class Linked {

  public static void main(String[] args) {

    Node n1 = new Node(10);

    DoublyLinkedList list= new DoublyLinkedList();
    list.add(n1);
    list.add(new Node(11));
    list.add(new Node(12));
    Node thirteen = new Node(13);
    list.add(thirteen);
    list.add(new Node(14));


    list.delete(thirteen);

    System.out.printf("%%");



  }


}
