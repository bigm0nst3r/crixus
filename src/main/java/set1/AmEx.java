package set1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 19, 2015
 */
public class AmEx<E> {


  List<E> holder = new ArrayList<E>();
  boolean reversed = false;

  public void add(E elt){
    if(reversed){
      holder.add(0,elt);
    }  else {
      holder.add(elt);
    }
  }


  public void delete(E elt){
    holder.remove(elt);
  }


  public void reverse(){
    reversed = !reversed;
  }


  public E get(int i){
    if(reversed){
      i = holder.size()-1 - i;
    }
    return holder.get(i);
  }


}
