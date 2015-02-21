package structures;

/**
 * @author Sreejith S
 * @since Feb 19, 2015
 */
public class LMain {


  public static void main(String[] args) {

    NodeList<Integer> nodeList = new NodeList<>();

    nodeList.add(10);
    nodeList.add(20);
    nodeList.add(30);
    nodeList.add(40);


    nodeList.print();

    /**
     * Linked List search
     */
    int data = 30;
    int searchIndex = nodeList.search(data);
    System.out.println(searchIndex);

    /**
     * Deleting from middle
     */
    Node node1 = nodeList.get(1);
    nodeList.delete(node1);
    nodeList.print();

  }


}
