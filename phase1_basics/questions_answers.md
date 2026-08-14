# Phase 1: Java Basics Interview Questions and Answers

This file contains common interview questions asked from Java fundamentals.

## Basic Java questions

### 1. What is Java?
Java is a high-level, object-oriented, platform-independent programming language used for building desktop, web, and enterprise applications.

### 2. What is the difference between JDK, JRE, and JVM?
- JDK: Java Development Kit used to develop Java programs.
- JRE: Java Runtime Environment used to run Java programs.
- JVM: Java Virtual Machine executes Java bytecode.

### 3. Why is Java called platform independent?
Because Java source code is compiled into bytecode, and the JVM interprets or runs that bytecode on different platforms.

### 4. What is the `main` method in Java?
The `main` method is the entry point of a Java program. Execution starts from this method.

## Variables and data types

### 5. What is a variable?
A variable is a memory container that stores data during program execution.

### 6. What are primitive data types in Java?
The primitive data types are `byte`, `short`, `int`, `long`, `float`, `double`, `char`, and `boolean`.

### 7. What is type casting?
Type casting means converting one data type into another. Widening conversion is automatic, while narrowing conversion requires explicit casting.

## Operators and conditions

### 8. What is the difference between `=` and `==`?
`=` is assignment, while `==` is comparison.

### 9. What is the purpose of `if` and `switch`?
They are used for decision-making. `if` is used for conditional logic, while `switch` is suited for multiple fixed-value checks.

### 10. What is the difference between `break` and `continue`?
- `break` exits the loop completely.
- `continue` skips the current iteration and continues with the next one.

## Loops and arrays

### 11. What is the difference between `for` and `while` loops?
`for` is usually used when the number of iterations is known. `while` is used when the loop depends on a condition.

### 12. What is an array?
An array is a fixed-size collection of elements of the same type.

### 13. How do you access an array element?
Using index values such as `arr[0]`.

## Methods and recursion

### 14. What is a method in Java?
A method is a reusable block of code that performs a specific task.

### 15. What is method overloading?
Method overloading is when multiple methods share the same name but have different parameters.

### 16. What is recursion?
Recursion is when a method calls itself. A base case is required to stop the recursion.

### 17. Why can recursion cause stack overflow?
If the base case is missing or not reached, the function keeps calling itself and eventually overflows the stack memory.

## Short practice questions

- What is the difference between `int` and `double`?
- What happens if you cast a `double` to `int`?
- Why are strings immutable in Java?
- What is the role of `Math.random()`?
- What is the difference between `print()` and `println()`?

## Final interview tip

Focus on understanding logic, not memorizing syntax. Interviewers often ask to explain how code works and why a certain approach is used.
