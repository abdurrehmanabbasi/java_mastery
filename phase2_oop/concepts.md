# Phase 2: OOP and Java Core Concepts

This phase turns Java from a syntax-based language into an object-oriented design language. The main idea is not just to write code, but to model real-world problems using classes, objects, behavior, and relationships.

## 1. Why OOP matters

Object-oriented programming helps you organize large programs into manageable parts. Instead of writing one long procedural block, you split functionality into objects that represent real-world entities such as a `Student`, `BankAccount`, `Car`, or `Employee`.

Benefits of OOP:

- code reuse
- easier maintenance
- better organization
- faster collaboration in teams
- better modeling of real-world systems

---

## 2. Class and object

A class is a blueprint. An object is a real instance created from that blueprint.

```java
class Student {
    String name;
    int marks;

    void display() {
        System.out.println(name + " : " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aisha";
        s1.marks = 92;
        s1.display();
    }
}
```

### Key points

- A class defines structure and behavior
- An object stores actual values
- Multiple objects can be created from one class

---

## 3. Attributes and methods

Attributes are data stored in an object. Methods define the actions the object can perform.

Example:

```java
class Car {
    String brand;
    int speed;

    void accelerate() {
        speed += 10;
    }
}
```

This shows how object state and methods are connected. A car has data like `brand` and `speed`, and methods like `accelerate()`.

---

## 4. Constructors

A constructor is a special method used to initialize an object when it is created. It has the same name as the class and no return type.

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
```

### Why constructors matter

- they initialize values automatically
- they make object creation cleaner
- they reduce the chance of uninitialized data

### Default constructor

If you do not write any constructor, Java provides a default one.

---

## 5. `this` keyword

The `this` keyword refers to the current instance of the class.

```java
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}
```

It is useful when parameter names and instance variables have the same name. Without `this`, Java may be confused.

---

## 6. `static` keyword

A static member belongs to the class, not to each object.

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
```

### Static variables

- shared among all objects of the class
- memory is allocated once

### Static methods

- can be called without creating an object
- common use: utility methods like `Math.sqrt()`

Important: static methods cannot directly access instance variables unless they create an object.

---

## 7. Encapsulation

Encapsulation means hiding internal data and exposing only necessary methods.

```java
class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

### Why it is important

- protects data
- prevents invalid values
- improves maintainability
- supports controlled access using getters and setters

---

## 8. Inheritance

Inheritance allows one class to inherit properties and behavior from another class.

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

### Benefits

- code reuse
- cleaner class hierarchy
- polymorphic behavior

### Parent and child classes

- parent/super class: base class
- child/sub class: derived class

---

## 9. Polymorphism

Polymorphism means the same action can behave differently depending on the object.

```java
class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
```

### Types of polymorphism

- compile-time polymorphism: method overloading
- runtime polymorphism: method overriding

### Why it matters

It is the foundation of flexible and extensible design in large systems.

---

## 10. Method overloading and overriding

### Overloading
Same method name, different parameters.

```java
int add(int a, int b)
int add(int a, int b, int c)
```

### Overriding
Child class provides a specific implementation of a method already defined in the parent class.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
```

---

## 11. Abstraction

Abstraction hides implementation details and focuses only on essential behavior.

```java
abstract class Vehicle {
    abstract void start();
}
```

### Why use abstraction

- reduces complexity
- forces a design structure
- lets you define common behavior without full implementation

---

## 12. Interface

An interface is a completely abstract contract that defines methods a class must implement.

```java
interface Printable {
    void print();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing");
    }
}
```

### Interface advantages

- multiple inheritance support in Java
- decoupling of design from implementation
- standardization across classes

---

## 13. Packages

Packages organize related classes together.

```java
package mypackage;
```

### Why packages matter

- avoid naming conflicts
- organize project structure
- improve modularity

---

## 14. Exception handling

Exceptions are unexpected runtime errors such as division by zero or invalid input.

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Cleanup completed");
}
```

### Main keywords

- `try`: code that may fail
- `catch`: handles the error
- `finally`: always runs
- `throw`: manually throws an exception
- `throws`: declares possible exceptions

---

## 15. Collections framework

Collections are used to store and manage groups of data.

### Common types

- `List`: ordered collection, allows duplicates
- `Set`: unique elements only
- `Map`: key-value pairs

Examples:

```java
ArrayList<String> names = new ArrayList<>();
HashSet<Integer> uniqueNumbers = new HashSet<>();
HashMap<String, Integer> marks = new HashMap<>();
```

### Why collections are important

Most real applications work with many objects, and collections provide flexible data storage solutions.

---

## 16. Scanner input

The `Scanner` class is used to read user input from the keyboard.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = sc.nextLine();
```

This is essential for interactive Java programs.

---

## 17. Interview focus for Phase 2

Interviewers usually test conceptual clarity, not only syntax. They often ask:

- What is the difference between class and object?
- Why is encapsulation useful?
- What is method overriding?
- How is polymorphism different from overloading?
- Why is abstraction important?
- What is the difference between abstract class and interface?

---

## 18. Practical mindset

OOP is not just about writing classes; it is about designing systems. A good Java developer models data and behavior around real-world entities and writes code that is reusable, maintainable, and scalable.
