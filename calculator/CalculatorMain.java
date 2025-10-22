 import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("---- Enhanced Calculator ----");
        System.out.println("Select operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulus (%)");
        System.out.println("6. Power (^)");
        System.out.println("7. Square Root (√)");
        System.out.println("8. Factorial (!)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double num1 = 0, num2 = 0, result = 0;
        int intNum;

        switch (choice) {
            case 1: // Addition
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = calc.add(num1, num2);
                break;
            case 2: // Subtraction
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = calc.subtract(num1, num2);
                break;
            case 3: // Multiplication
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = calc.multiply(num1, num2);
                break;
            case 4: // Division
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = calc.divide(num1, num2);
                break;
            case 5: // Modulus
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = calc.modulus(num1, num2);
                break;
            case 6: // Power
                System.out.print("Enter base number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter exponent: ");
                num2 = sc.nextDouble();
                result = calc.power(num1, num2);
                break;
            case 7: // Square Root
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                result = calc.sqrt(num1);
                break;
            case 8: // Factorial
                System.out.print("Enter an integer: ");
                intNum = sc.nextInt();
                long factResult = calc.factorial(intNum);
                if (factResult != -1) {
                    System.out.println("Result: " + factResult);
                }
                sc.close();
                return;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
