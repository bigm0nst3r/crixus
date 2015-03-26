package geeks4geeks.linkedlist;

/**
 * @author Sreejith S
 * @since Mar 10, 2015
 */
public class SinglePtrList {

  private SinglePtrNode root;


  public SinglePtrList(SinglePtrNode root) {
    this.root = root;
  }

  public SinglePtrList add(SinglePtrNode node) {
    SinglePtrNode temp = root;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(node);
    return this;
  }

  public SinglePtrList add(int data) {
    SinglePtrNode temp = root;
    while (temp.getNext() != null) {
      temp = temp.getNext();
    }
    temp.setNext(new SinglePtrNode(data));
    return this;
  }

  public void alter() {

    SinglePtrNode oddtmp = root;
    SinglePtrNode eventmp = null;


    while (oddtmp != null) {
      if(eventmp == null){
        eventmp = oddtmp.getNext();
      } else{
        eventmp.setNext(oddtmp.getNext());
        eventmp = oddtmp.getNext();
      }

      if(oddtmp.getNext() != null && oddtmp.getNext().getNext() != null) {
        oddtmp.setNext(oddtmp.getNext().getNext());
        oddtmp = oddtmp.getNext().getNext();
      } else{
        oddtmp = null;
      }
    }

    System.out.println("!!!!!!!");

  }
}
