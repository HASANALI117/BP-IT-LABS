package unit4;

import java.util.Scanner;

public class luckynumber {
  /**
   * Example : Use of IF Statement
   * If the number entered by the user is equal to 7, they win a prize.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number;

    System.out.println("Please enter a number between 1 and 10");
    number = input.nextInt();

    if (number == 7) {
      System.out.println("You win today's grand prize!");
    } else
      System.out.println("You LOSE!");

    input.close();
  }
}
