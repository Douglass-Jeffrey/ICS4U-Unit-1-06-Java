/*
* This Program runs a diceroll where you it outputs a random number from a set 
* of numbers that you choose.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-25
* Class DiceGame.
*/

// Import the Scanner
import java.util.Scanner;  

public class DiceRoll {

  /**
   * This function recieves input from user and calls RollDie for the rolledInt.
   */
  public static void main(String[] args) {
    try {

      // Create scanner object
      Scanner scan = new Scanner(System.in);

      System.out.println("Insert the highest number on the die: ");
      int maxValue = scan.nextInt();

      // recieves information from RollDie.
      int convRoll = rollDie(maxValue);

      // Outputing the rolled number.
      System.out.println("Rolled number: " + convRoll);

    } catch (Exception e) {
      System.out.println("Invalid input");
    }
  }

  /**
   * Function gets random number.
   */
  static int rollDie(int maxValue) {
    final int rolledInt = (int) (Math.random() * maxValue + 1);
      
    return rolledInt;
  }
}
