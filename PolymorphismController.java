import java.util.ArrayList;
import java.util.List;

/**
 * PolymorphismController class inspired by Anderson &
 * Franceschi, adopted for a console environment.
 *
 * Meysenbur 2021
 */
public class PolymorphismController {

  private final int START_LINE = 0;
  private final int FINISH_LINE = 79;

  private int racerNum = 0;

  private int raceStep = 0;

  /** List storing the racers in the race. */
  List<Racer> racerList;

  /**
   * Default constructor.
   */
  public PolymorphismController() { racerList = new ArrayList<>(); }

  /**
   * Add a racer (Tortoise or Hare) to the field, in
   * preparation for the start of the race.
   *
   * @param input Racer type entered by the user:
   * 't' / 'T' for Tortoise, 'h' / 'H' for Hare
   */
  public void addRacer(char input) {

    // TODO: write a switch statement here, according to
    // these instructions.
    //
    // if the input parameter is 'h' or 'H', add a Hare object to the 
    // ArrayList named racerList
    //    The API of the Hare constructor is:
    //      Hare( String ID, int x, int y )
    //    a sample call to the constructor is
    //      new Hare( "Hare", START_LINE, racerNum )
    //    where START_LINE is a constant local variable representing 
    //    the starting x position for the race and racerNum is an instance
    //    variable representing the racer's number in the race.
    //
    // if the input parameter is 't' or 'T', add a Tortoise object to the
    // racerList, in a manner similar to that described above for the Hare
    //
    // After adding a racer to the ArrayList racerList, add one to the 
    // racerNum variable.
    //
    // if input is anything other than 'T', 't', 'H' or 'h', do nothing 


  }

  /**
   * Helper method to determine if one of the racers has crossed the
   * finish line.
   *
   * @return Reference to the first racer in racerList to have an
   * x position greater than or equal to FINISH_LINE, or null if 
   * no one has crossed the line yet.
   */
  private Racer findWinner() {
    // TODO: write a for loop to see if any racer has
    // won the race. Iterate through racerList, and see if
    // any racer has crossed the finish line. Call the racer's
    // getX() method, and compare that value to the FINISH_LINE 
    // constant. If a racer has crossed the finish line, return 
    // a reference to the winning racer. If no one has won yet,
    // return null.
    Racer winner = null;


    return winner;
  }

  /**
   * Display the outer track boundary for the race.
   */
  private void displayBoundary() {
    for (int i = START_LINE; i <= FINISH_LINE; i++) {
      System.out.print("=");
    }
    System.out.println();
  }

  /**
   * Display the lane marker between racers.
   */
  private void displayLane() {
    for (int i = START_LINE; i <= FINISH_LINE; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  /**
   * Display a racer on the track.
   *
   * @param r Racer to display.
   */
  private void displayRacer(Racer r) {
    for (int i = START_LINE; i <= r.getX(); i++) {
      System.out.print(".");
    }
    System.out.println(r.getRacerIcon());
  }

  /**
   * Display the entire track and racers for one step in the race. 
   */
  private void displayTrack() {
    System.out.println("\n\nRace step: " + raceStep++);
    displayBoundary();
    int racerNum = 0;
    for (Racer r : racerList) {
      displayRacer(r);
      if (racerNum < racerList.size() - 1) {
        displayLane();
      }
    }
    displayBoundary();
  }

  /**
   * Run the race! 
   */
  public void runRace() {
    Racer winner = findWinner();
    while (winner == null) {
      for (Racer r : racerList) {
        r.move();
      } // for

      displayTrack();
      pause();
      winner = findWinner();
    } // while

    printWinner(winner);
  }

  /**
   * Pause for one second between each step of the race. 
   */
  private void pause() {
    try {
      Thread.sleep(1000);
    } catch(InterruptedException ie) {

    }
  }

  /**
   * Display the winner of the race.
   */
  private void printWinner(Racer winner) {
    System.out.println("\n\n\nTHE RACE IS OVER!");
    System.out.println("The winner is " + winner);
  }
}