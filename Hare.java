/**
 * Hare class
 * inherits from abstract Racer class
 * Anderson, Franceschi
 *
 * Adapted for console environment.
 * Meysenburg 2021
 */

public class Hare extends Racer {

  /**
   * Default Constructor: calls Racer default constructor
   */
  public Hare() { super(); }

  /**
   * Constructor
   *    @param ID   racer Id, passed to Racer constructor
   *    @param x    x position, passed to Racer constructor
   *    @param racerNum racer's number in the race
   */
  public Hare(String ID, int x, int racerNum) { super(ID, x, racerNum); }

  /**
   * move:  calculates the new x position for the racer
   *   generates random number between 1 & 10
   *          for 1 - 6,  no change to x position; Hare sleeps
   *          when x is < 100, for 7-10 move 4
   *          when x >= 100, for 9-10, move 4
   */
  @Override
  public void move() {
    
    int move = rand.nextInt(10) + 1;

    if (getX() < 100) {
      if (move > 6)
        setX(getX() + 4);
    } else {
      if (move > 8)
        setX(getX() + 4);
    }
  }

  @Override
  public String toString() {
    return "Hare, Racer #" + getRacerNum();
  }

  @Override
  public char getRacerIcon() {
    return 'H';
  }
}