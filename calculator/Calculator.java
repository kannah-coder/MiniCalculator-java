 
public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    // Modulus (remainder)
    public double modulus(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a % b;
    }

    // Power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square root
    public double sqrt(double a) {
        if (a < 0) {
            System.out.println("Error: Cannot calculate square root of negative number!");
            return 0;
        }
        return Math.sqrt(a);
    }

    // Factorial (for integer values only)
    public long factorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial of negative number is undefined!");
            return -1;
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
