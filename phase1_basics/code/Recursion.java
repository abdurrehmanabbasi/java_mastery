public class Recursion {
    /**
     * Calculates factorial of a given number with input validation.
     * @param n the number to calculate factorial for
     * @return factorial of n, or -1 if input is invalid
     */
    static int factorial(int n) {
        // Input validation
        if (n < 0) {
            System.out.println("Error: Factorial of negative numbers is undefined");
            return -1;
        }
        
        // Base case: 0! = 1 and 1! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Prevent integer overflow
        if (n > 20) {
            System.out.println("Error: Number too large for int factorial (causes overflow)");
            return -1;
        }
        
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factorial(5));
        System.out.println("Factorial of 0 = " + factorial(0));
        System.out.println("Factorial of 1 = " + factorial(1));
    }
}
