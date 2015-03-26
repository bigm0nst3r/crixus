package callback;

/**
 * @author Sreejith S
 * @since Mar 20, 2015
 */
public class EventNotifier {

  private InterestingEvent ie;
  private boolean somethingHappend;

  public EventNotifier(InterestingEvent ie) {
    this.ie = ie;
    this.somethingHappend = false;
  }

  public void doWork() {
    if (somethingHappend) {
      ie.event();
    }
  }
}
