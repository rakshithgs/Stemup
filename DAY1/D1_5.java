import java.util.Scanner;


public class D1_5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    if (num1 > num2) {
      System.out.println(num1 + " is greater than " + num2);
    } else if (num1 < num2) {
      System.out.println(num2 + " is greater than " + num1);
    } else {
      System.out.println(num1 + " and " + num2 + " are equal");
    }

    scanner.close();
  }
}
  
