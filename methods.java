import java.util.Scanner;

public class methods {
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error! Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double addtion = add(num1, num2);
        
        double subtraction = subtract(num1, num2);
             
        double multiplication = multiply(num1, num2);
          
        double divideresult = divide(num1, num2);
                
        System.out.println("Addition of the two numbers is: " + addtion);
        System.out.println("subtraction of the two numbers is: " + subtraction);
        System.out.println("multiplication of the two numbers is: " + multiplication);
        System.out.println("division of the two number is: 3" + divideresult);
    }
}