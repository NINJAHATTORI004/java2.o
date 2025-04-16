import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt(); // Declare and initialize n
        int result = factorial(n); // Call the factorial method
        System.out.println("Factorial of " + n + " is: " + result); // Print the result
    }
}