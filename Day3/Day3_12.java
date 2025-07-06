import java.util.Scanner;
public class Day3_12 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter number " + (i + 1) + ": ");
      int num = scanner.nextInt();

      if (num < 0) {
        continue;
      }

      sum += num;
    }

    System.out.println("Sum of non-negative numbers: " + sum);

    scanner.close();
  }
}
 

