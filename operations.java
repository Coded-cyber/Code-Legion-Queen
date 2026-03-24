import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int num1=10;
        double num2=2.4;
        System.out.println("Addition:" +(num1 + num2));
        System.out.println("Subtraction:" +(num1 - num2));
        System.out.println("Multiplication:" +(num1 * num2));
        System.out.println("Division:" +(num1 / num2));
        
        //BONUS//
       Scanner scanner = new Scanner(System.in);
System.out.println("Enter the length");
double length = scanner.nextDouble();
System.out.println("Enter the width");
double width = scanner.nextDouble();
double area = length * width;
System.out.println("The area of the rectangle is: " + area);
    }
}