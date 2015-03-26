package callback;

/**
 * @author Sreejith S
 * @since Mar 20, 2015
 */
public class SampleEvent implements InterestingEvent {

  private EventNotifier eventNotifier;


  private SampleEvent() {
    eventNotifier = new EventNotifier(this);
  }

  @Override
  public void event() {
    System.out.println("booo");
  }

}
