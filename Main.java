import java.util.Scanner;

/** 
 * Main class to run the Tortoise vs. Hare race.
 */
class Main {
  public static void main(String[] args) {
    PolymorphismController pc = new PolymorphismController();

    Scanner stdin = new Scanner(System.in);
    System.out.print("Add a t)ortoise, h)are, or r)un the race: ");
    String response = stdin.nextLine().toUpperCase();
    while(!response.equals("R")) {
      switch(response) {
        case "T":
          pc.addRacer('t');
          break;
        case "H":
          pc.addRacer('h');
          break;
        default:
          System.out.println("Please enter t, h, or r.");
      }
      System.out.print("Add a t)ortoise, h)are, or r)un the race: ");
      response = stdin.nextLine().toUpperCase();
    }

    pc.runRace();
  }
}