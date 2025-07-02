package Day3;

import java.util.Random;
import java.util.Scanner;
public class day3_5 {
  public static void main(String[] args) {
    Random random = new Random();
    int numberToGuess = random.nextInt(10) + 1;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Guess a number between 1 and 10: ");
      int guess = scanner.nextInt();

      if (guess < numberToGuess) {
        System.out.println("Too low!");
      } else if (guess > numberToGuess) {
        System.out.println("Too high!");
      } else {
        System.out.println("Congratulations! You guessed it!");
        break;
      }
    }

    scanner.close();
  }
}

