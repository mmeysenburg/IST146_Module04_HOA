import java.util.Random;
/**
 * Racer class
 * abstract class intended for racer hierarchy
 * Anderson. Franceschi
 *
 * Adapted for console environment.
 * Meysenburg 2021
 */

public abstract class Racer {
  private String ID;    // racer ID
  private int x;        // x position
  private int racerNum; // which racer am I?

  /** PRNG for moving racers */
  protected static Random rand = new Random();

  /**
   * default constructor
   *    Sets ID to blank
   */
  public Racer() { ID = ""; }

  /**
   * constructor
   *    @param ID   racer ID
   *    @param x    x position
   *    @param racerNum racer's number in the race
   */
  public Racer(String ID, int x, int racerNum) {
    this.ID = ID;
    this.x = x;
    this.racerNum = racerNum;
  }

  /**
   * accessor for ID
   *   @return ID
   */
  public String getID() { return ID; }

  /**
   * accessor for x
   *   @return current x value
   */
  public int getX() { return x; }

  /**
   * accessor for racerNum
   *   @return racer's number in the race
   */
  public int getRacerNum() { return racerNum; }

  /**
   * mutator for x
   *   @param  x new value for x
   *   @return a reference to this object
   */
  public Racer setX(int x) {
    this.x = x;
    return this;
  }

  /**
   * abstract method for Racer's move
   */
  public abstract void move();

  /**
   * abstract method for Racer's race icon.
   */

  public abstract char getRacerIcon();
}
