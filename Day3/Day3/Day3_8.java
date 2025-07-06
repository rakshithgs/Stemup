package Day3;

import java.util.Scanner;
public class Day3_8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a non-negative integer: ");
    int n = scanner.nextInt();

    if (n < 0) {
      System.out.println("Error: Factorial is not defined for negative numbers.");
    } else {
      long factorial = calculateFactorial(n);
      System.out.println(n + "! = " + factorial);
    }

    scanner.close();
  }

  public static long calculateFactorial(int n) {
    if (n == 0 || n == 1) {
      return 1; // base case: 0! = 1! = 1
    } else {
      long result = 1;
      for (int i = 2; i <= n; i++) {
        result *= i;
      }
      return result;
    }
  }
}

