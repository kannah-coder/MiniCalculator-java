import java.util.Scanner;
public class MenuCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false; // loop control

        while (!exit) {
            // Display menu
            System.out.println("\n--- Simple Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Check Even or Odd");
            System.out.println("6. power of n");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();
            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Sum = " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Difference = " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    System.out.println("Product = " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) { // using if
                        System.out.println("Quotient = " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    if (n % 2 == 0) { // using if
                        System.out.println(n + " is Even");
                    } else {
                        System.out.println(n + " is Odd");
                    }
                    break;

                case 6:
                    System.out.println("Enter the number :");
                    double n1=sc.nextDouble();
                    System.out.println("Enter the power n");
                    double n2=sc.nextDouble();
                    System.out.println(Math.pow(n1,n2));
                    break;

                case 7:
                    System.out.println("Exiting...");
                    exit = true; // breaks the loop
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
