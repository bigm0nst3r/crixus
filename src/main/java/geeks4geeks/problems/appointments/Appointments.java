package geeks4geeks.problems.appointments;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sreejith S
 * @since Mar 14, 2015
 */
public class Appointments {


  private List<Event> appointmentList;

  public Appointments(int start, int end) {
    this.appointmentList = new ArrayList<>();
    addTimeToList(start, end);
  }

  public void add(int start, int end) {
    addTimeToList(start, end);
  }


  public List<String> checkConficts(){
    /**
     * Check if first_tmp > first and last_tmp < last
     */
    return null;
  }

  private void addTimeToList(int start, int end) {
    Event appointment = new Event(start, end);
    appointmentList.add(appointment);
  }
}
