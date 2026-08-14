# Phase 2: Common Mistakes in OOP

This file highlights the most common errors students make while learning object-oriented Java.

---

## 1. Confusing class and object

### Wrong idea
A class is an object.

### Correct idea
- A class is a blueprint
- An object is an instance created from that blueprint

```java
class Car {
    String model;
}

Car myCar = new Car();
```

---

## 2. Forgetting to initialize objects properly

### Problem
You create an object but do not set its required values.

### Fix
Use a constructor to initialize attributes when the object is created.

---

## 3. Using `this` incorrectly

### Problem
You do not distinguish between instance variables and parameters.

### Fix
Use `this.name = name;` when both names are same.

---

## 4. Using static when you need instance data

### Problem
A variable should be unique per object, but you make it static.

### Fix
Use `static` only for shared class-level values, not object-specific state.

---

## 5. Exposing everything publicly

### Problem
You make class fields public and allow outside code to modify them directly.

### Fix
Use `private` fields and public getter/setter methods.

---

## 6. Ignoring inheritance rules

### Problem
You inherit without understanding the parent-child relationship.

### Fix
Use inheritance only when there is a real `is-a` relationship.

---

## 7. Overriding incorrectly

### Problem
Method signatures do not match the parent method.

### Fix
The return type, method name, and parameters must match during overriding.

---

## 8. Using abstraction without a clear purpose

### Problem
You create abstract classes unnecessarily.

### Fix
Use abstraction when multiple classes share a common design but have different implementations.

---

## 9. Using interfaces when a class is enough

### Problem
You create interfaces too early and complicate the design.

### Fix
Use interfaces when behavior should be shared across unrelated classes.

---

## 10. Not handling exceptions

### Problem
You ignore runtime errors and let the program crash.

### Fix
Use `try-catch` blocks to recover or display a safe message.

---

## 11. Misusing collections

### Problem
You store everything in arrays even when collections are better.

### Fix
Use `ArrayList` for ordered dynamic data, `HashSet` for unique values, and `HashMap` for key-value pairs.

---

## 12. Not understanding `final` and access modifiers

### Problem
You do not know how to restrict access or prevent modification.

### Fix
Learn `public`, `private`, `protected`, and `final` as part of class design.

---

## 13. Writing classes that do too much

### Problem
A class handles everything instead of focusing on one responsibility.

### Fix
Keep classes focused and modular.

---

## 14. Calling methods without understanding object state

### Problem
You call methods on objects without checking the current values.

### Fix
Understand the object’s state before invoking behavior.

---

## 15. Skipping practice with real examples

### Problem
You memorize the theory but do not write code.

### Fix
Always practice implementing classes and projects in Java.

---

## Quick Advice

OOP is not just syntax; it is design thinking. Think in terms of:

- what objects exist
- what their state is
- what behavior they have
- how they communicate with each other
