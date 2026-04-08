import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}