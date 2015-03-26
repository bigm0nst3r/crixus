package geeks4geeks.problems.appointments;

/**
 * @author Sreejith S
 * @since Mar 14, 2015
 */
public class ConfictChecker {


  public static void main(String[] args) {

    Appointments appointments = new Appointments(1, 5);

    appointments.add(3, 7);
    appointments.add(2, 6);
    appointments.add(10, 15);
    appointments.add(5, 100);


  }

}
