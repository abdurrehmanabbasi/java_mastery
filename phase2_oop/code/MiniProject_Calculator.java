import java.util.Scanner;

public class MiniProject_Calculator {
    public static void main(String[] args) {
        // Use try-with-resources to ensure Scanner is closed
        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            double a = input.nextDouble();

            System.out.print("Enter second number: ");
            double b = input.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char op = input.next().charAt(0);

            double result;

            switch (op) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero");
                        return;  // Scanner closes automatically now
                    }
                    result = a / b;
                    break;
                default:
                    System.out.println("Error: Invalid operator");
                    return;  // Scanner closes automatically now
            }

            System.out.println("Result: " + result);
            
        } // Scanner automatically closed here
    }
}
