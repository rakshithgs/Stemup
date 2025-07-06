package Day3;

import java.util.Scanner;
public class Day3_9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scanner.nextLine();

    int count = 0;
    for (char c : str.toCharArray()) {
      if (c == 'a' || c == 'A') {
        count++;
      }
    }

    System.out.println("The letter 'a' or 'A' appears " + count + " times.");

    scanner.close();
  }
}


