import java.util.Scanner;

public class Variables {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your height (in meters): ");
    double height = scanner.nextDouble();
    System.out.println("Your name is " + name + ", you " + age + " years old, and your height is " + height + " meters.");

    scanner.close();
  }
}