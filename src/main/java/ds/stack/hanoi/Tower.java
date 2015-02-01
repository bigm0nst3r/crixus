package ds.stack.hanoi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Jan 26, 2015
 */
public class Tower {

  public List<Ring> holder;

  public Tower() {
    this.holder = new ArrayList<>();
  }


  public void addRing(Ring ring) throws UnsupportedOperationException {
    if (holder.size() == 0) {
      holder.add(ring);
    } else {
      Ring currentTopRing = holder.get(holder.size() - 1);
      if (currentTopRing.getSize() > ring.getSize()) {
        holder.add(ring);
        return;
      } else {
        throw new UnsupportedOperationException("Cannot be put on this tower");
      }
    }
  }

  public void removeRing() {
    if(!holder.isEmpty()) {
      holder.remove(holder.get(holder.size() - 1));
    }
  }

  public Ring getTopRing() {
    if (holder.isEmpty()) {
      return null;
    }
    return holder.get(holder.size() - 1);
  }

  public int getNumberOfRings() {
    return holder.size();
  }

}
