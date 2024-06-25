import java.util.Scanner;

public class factRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Inner class to handle recursion
            class Factorial {
                long compute(int n) {
                    if (n == 0) {
                        return 1; // Base case: factorial of 0 is 1
                    } else {
                        return n * compute(n - 1); // Recursive case
                    }
                }
            }
            Factorial factorial = new Factorial();
            long result = factorial.compute(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
    }
}
