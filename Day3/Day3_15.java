import java.util.Scanner;
public class Day3_15 {
   
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter height: ");
    int height = scanner.nextInt();

    for (int i = 0; i < height; i++) {
      // Print spaces for centering
      for (int j = 0; j < height - i - 1; j++) {
        System.out.print(" ");
      }
      // Print asterisks
      for (int k = 0; k <= i; k++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    scanner.close();
  }
}

