import java.util.Scanner;
public class Day3_14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter height: ");
    int height = scanner.nextInt();

    for (int i = 1; i <= height; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    scanner.close();
  }
}


