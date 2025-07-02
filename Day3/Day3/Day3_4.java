package Day3;

import java.util.Scanner;
public class Day3_4 {
   
     public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int total = 0;

    while (true) {
      System.out.print("Enter a number (0 to stop): ");
      int num = scanner.nextInt();

      if (num == 0) {
        break;
      }

      total += num;
    }

    System.out.println("Total: " + total);

    scanner.close();
  }
}

 

