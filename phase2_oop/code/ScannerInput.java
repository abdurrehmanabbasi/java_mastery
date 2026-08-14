import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Get name input
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            // Get age input with validation
            int age = 0;
            boolean validInput = false;
            
            while (!validInput) {
                System.out.print("Enter your age: ");
                try {
                    age = sc.nextInt();
                    
                    if (age < 0) {
                        System.out.println("Age cannot be negative. Please try again.");
                    } else if (age > 150) {
                        System.out.println("Age seems unrealistic. Please enter a valid age.");
                    } else {
                        validInput = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a number.");
                    sc.nextLine();  // Clear the invalid input from buffer
                }
            }

            // Display results
            System.out.println("\n--- Your Information ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            
        } // Scanner automatically closed here
    }
}
