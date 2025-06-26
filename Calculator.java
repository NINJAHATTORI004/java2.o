import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is: " + (a + b));
        System.out.println("Difference is: " + (a - b));
        System.out.println("Product is: " + (a * b));
        if (b != 0) {
            System.out.println("Quotient is: " + (a / b));
            System.out.println("Remainder is: " + (a % b));
        } else {
            System.out.println("Quotient is: Undefined (division by zero)");
            System.out.println("Remainder is: Undefined (division by zero)");
        }
        System.out.println("Increment of a (post-increment): " + (a++));
        System.out.println("Value of a after post-increment: " + a);
        System.out.println("Decrement of b (pre-decrement): " + (--b));
        System.out.println("Value of b after pre-decrement: " + b);
        System.out.println("Increment of a (post-increment): " + (a++));
        System.out.println("Value of a after post-increment: " + a);
        System.out.println("Decrement of b (post-decrement): " + (b--));
        System.out.println("Value of b after post-decrement: " + b);
    }
}


	

		



