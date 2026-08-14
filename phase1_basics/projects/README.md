# Phase 1 Projects

Build these mini-projects to consolidate your learning. Each project uses multiple concepts from Phase 1.

---

## Project 1: Simple Calculator

**Goal:** Create a calculator that performs basic arithmetic operations.

**Requirements:**
- Accept two numbers from the user (use hardcoded values initially)
- Accept an operator (+, -, *, /)
- Perform the calculation using methods
- Display the result

**Concepts used:**
- Variables
- Methods
- Conditionals (switch statement)
- Type casting (if needed)

**Starter template:**
```java
public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    // Add multiply and divide methods...

    public static void main(String[] args) {
        // Your code here
    }
}
```

---

## Project 2: Grade Checker

**Goal:** Create a program that assigns grades based on marks.

**Requirements:**
- Accept marks for a student (0-100)
- Assign grade based on:
  - 90-100: A
  - 80-89: B
  - 70-79: C
  - 60-69: D
  - Below 60: F
- Display the grade and feedback

**Concepts used:**
- Variables
- Conditionals (if-else or switch)
- Logical operators
- Methods

**Starter template:**
```java
public class GradeChecker {
    static char getGrade(int marks) {
        // Your logic here
        return 'A';
    }

    public static void main(String[] args) {
        // Test with different marks
    }
}
```

---

## Project 3: Number Utility

**Goal:** Create utility methods to check properties of numbers.

**Requirements:**
- Check if a number is prime
- Check if a number is palindrome
- Calculate factorial of a number
- Find sum of digits
- Display results for multiple numbers

**Concepts used:**
- Loops
- Methods
- Recursion (for factorial)
- Conditionals

**Starter template:**
```java
public class NumberUtility {
    static boolean isPrime(int num) {
        // Check if prime
        return true;
    }

    static boolean isPalindrome(int num) {
        // Check if palindrome
        return true;
    }

    static int factorial(int n) {
        // Use recursion
        return 1;
    }

    public static void main(String[] args) {
        // Test these methods
    }
}
```

---

## Project 4: Array Utility

**Goal:** Create utility methods to work with arrays.

**Requirements:**
- Calculate sum of all elements
- Calculate average of elements
- Find maximum element
- Find minimum element
- Search for an element
- Display results

**Concepts used:**
- Arrays
- Loops
- Methods
- Conditionals

**Starter template:**
```java
public class ArrayUtility {
    static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // Calculate sum
        }
        return sum;
    }

    static double findAverage(int[] arr) {
        // Find average
        return 0.0;
    }

    static int findMax(int[] arr) {
        // Find maximum
        return 0;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        // Test all methods
    }
}
```

---

## Project 5: Fibonacci Sequence

**Goal:** Generate and display Fibonacci numbers using recursion and loops.

**Requirements:**
- Method 1: Generate using recursion
- Method 2: Generate using loops
- Print first N Fibonacci numbers
- Handle edge cases (N <= 0)

**Concepts used:**
- Recursion (with base case)
- Loops
- Methods
- Conditionals

**Starter template:**
```java
public class Fibonacci {
    // Using recursion
    static int fibRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Using loops (more efficient)
    static void fibLoop(int count) {
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        // Test both methods
    }
}
```

---

## 🎯 Project Submission Checklist

For each project, ensure:

- [ ] Code compiles without errors
- [ ] All methods are properly named
- [ ] Code is readable with comments
- [ ] Edge cases are handled
- [ ] Program runs and produces correct output
- [ ] You understand every line of your code

---

## 💡 Tips for Success

1. **Start simple** - Write basic version first, then add features
2. **Test thoroughly** - Test with different inputs
3. **Use meaningful names** - Variable and method names should explain purpose
4. **Comment your code** - Explain the logic, not the obvious
5. **Debug step by step** - Use print statements to trace execution

---

## 🚀 Bonus Challenges

Once you complete all 5 projects, try these:

- **Project 1+**: Accept user input using Scanner class
- **Project 2+**: Store multiple students' data using arrays
- **Project 3+**: Check all properties for numbers in a range
- **Project 4+**: Sort array elements
- **Project 5+**: Find Fibonacci numbers up to a given value

---

## ✅ Next Steps

After completing these projects:
1. Review [questions_answers.md](../questions_answers.md)
2. Go through all code examples in [code/](../code/) folder
3. Practice by modifying existing code
4. Move to **Phase 2: OOP and Java Core Concepts**
