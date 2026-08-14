# Phase 3: Common Mistakes in Advanced Java

This file highlights mistakes that often appear when moving from beginner Java to advanced Java.

---

## 1. Using the wrong collection type

### Problem
You use `ArrayList` everywhere without understanding the purpose of `HashSet` or `HashMap`.

### Fix
Choose a collection based on behavior:
- `List` for ordered values
- `Set` for unique values
- `Map` for key-value mapping

---

## 2. Ignoring generics

### Problem
You use raw types like `ArrayList` without generics.

### Fix
Use `ArrayList<String>` instead of raw `ArrayList`.

---

## 3. Not handling file errors properly

### Problem
You assume the file always exists or is writable.

### Fix
Use `try-catch` and validate file access before reading or writing.

---

## 4. Catching exceptions too broadly

### Problem
You catch `Exception` for everything and hide the real problem.

### Fix
Catch the most specific exception that matches the problem.

---

## 5. Writing stream code without understanding the data flow

### Problem
You use streams but do not know what they are doing.

### Fix
Learn the pipeline pattern: source -> filter -> map -> collect.

---

## 6. Using threads without knowing shared-state risks

### Problem
Multiple threads modify the same variable without synchronization.

### Fix
Understand concurrency risks and avoid unsafe shared state unless necessary.

---

## 7. Thinking JDBC is only about connection strings

### Problem
You treat JDBC as just a connection and forget SQL logic.

### Fix
Learn how SQL statements, result sets, and database actions fit into the Java program.

---

## 8. Building projects without structure

### Problem
You write one large class with too many responsibilities.

### Fix
Separate logic into sensible classes and keep responsibilities clear.

---

## 9. Skipping practical project work

### Problem
You memorize theory but never build a complete application.

### Fix
Always combine concepts in a project to see how they work together.

---

## 10. Not thinking about maintainability

### Problem
Code works for a test case but is hard to extend.

### Fix
Write readable, modular code that is easy to improve later.

---

## Quick Advice

Advanced Java is about using the right tool for the right purpose. Learn the patterns, test your logic, and always connect theory to a real-world program.
