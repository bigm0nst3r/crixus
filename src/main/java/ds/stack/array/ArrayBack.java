package ds.stack.array;

/**
 * @author Sreejith S
 * @since Feb 02, 2015
 */
public class ArrayBack {


  private int INITIAL_CAPACITY = 10;
  private int[] stackArray;
  private int stackTopIndex;


  public ArrayBack() {
    this.stackArray = new int[INITIAL_CAPACITY];
    this.stackTopIndex = 0;
  }

  public void push(int data){
    if(stackArray.length <= INITIAL_CAPACITY) {
      stackArray[stackTopIndex++] = data;
    }
  }

  public int pop(){
    if(stackTopIndex>=0) {
      stackTopIndex--;
      return stackArray[stackTopIndex];
    }
    return -99999;
  }

}
