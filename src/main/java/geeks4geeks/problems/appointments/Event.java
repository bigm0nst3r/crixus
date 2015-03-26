package geeks4geeks.problems.appointments;

/**
 * @author Sreejith S
 * @since Mar 14, 2015
 */
public class Event {

  private int startTime;
  private int endTime;

  public Event(int startTime, int endTime) {
    this.startTime = startTime;
    this.endTime = endTime;
  }

  public int getStartTime() {
    return startTime;
  }

  public void setStartTime(int startTime) {
    this.startTime = startTime;
  }

  public int getEndTime() {
    return endTime;
  }

  public void setEndTime(int endTime) {
    this.endTime = endTime;
  }
}
