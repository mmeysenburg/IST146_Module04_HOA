/**
 * Tortoise class
 * inherits from abstract Racer class
 * Anderson, Franceschi
 *
 * Adapted for console environment.
 * Meysenburg 2021
 */

public class Tortoise extends Racer {
  private int speed;

  /**
   * Default Constructor: calls Racer default constructor
   */
  public Tortoise() {
    super();

    // percentage of time (between 90 - 99%) that this tortoise moves each turn
    speed = rand.nextInt(10) + 90;
  }

  /**
   * Constructor
   *    @param ID  racer Id, passed to Racer constructor
   *    @param x   x position, passed to Racer constructor
   *    @param racerNum racer's number in the race
   */
  public Tortoise(String ID, int x, int racerNum) {
    super(ID, x, racerNum);

    // percentage of time (between 90 - 99%) that this tortoise moves each turn
    speed = rand.nextInt(10) + 90;
  }

  /**
   * move:  calculates the new x position for the racer
   *   Tortoise move characteristics: "slow & steady wins the race"
   *      increment x by 1 most of the time
   */
  @Override
  public void move() {
    int move = rand.nextInt(100) + 1;
    if (move < speed)
      setX(getX() + 1);
  }

  @Override
  public String toString() {
    return "Tortoise, Racer #" + getRacerNum();
  }

  @Override
  public char getRacerIcon() {
    return 'T';
  }
}