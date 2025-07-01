import java.util.Scanner;

public class D1_2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    String num1Str = scanner.next();

    System.out.print("Enter second number: ");
    String num2Str = scanner.next();

    int num1 = Integer.parseInt(num1Str);
    int num2 = Integer.parseInt(num2Str);

    int sum = num1 + num2;
    int difference = num1 - num2;
    int product = num1 * num2;

    System.out.println("Sum: " + sum);
    System.out.println("Difference: " + difference);
    System.out.println("Product: " + product);

    scanner.close();
  }
}

    
