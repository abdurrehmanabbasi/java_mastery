# Phase 1: Common Mistakes Beginners Make

Learning Java is challenging. This document highlights mistakes beginners often make and how to avoid them.

---

## 🔴 Mistake 1: Confusing `=` with `==`

### What's wrong?
```java
if (x = 5) {  // ❌ WRONG
    System.out.println("x is 5");
}
```

### Why it's wrong
- `=` is **assignment** (sets a value)
- `==` is **comparison** (checks if equal)
- The code assigns 5 to x instead of checking

### Correct way
```java
if (x == 5) {  // ✅ CORRECT
    System.out.println("x is 5");
}
```

### Interview question
*"What's the difference between = and ==?"*

---

## 🔴 Mistake 2: Forgetting Semicolons

### What's wrong?
```java
int x = 10  // ❌ MISSING SEMICOLON
System.out.println(x);
```

### Why it's wrong
Java requires a semicolon at the end of each statement. Without it, the compiler reports a syntax error.

### Correct way
```java
int x = 10;  // ✅ CORRECT
System.out.println(x);
```

---

## 🔴 Mistake 3: Using Undefined Variables

### What's wrong?
```java
public class Test {
    public static void main(String[] args) {
        System.out.println(x);  // ❌ x doesn't exist
    }
}
```

### Why it's wrong
You're using a variable without declaring it first. Java has no idea what `x` is.

### Correct way
```java
public class Test {
    public static void main(String[] args) {
        int x = 5;  // ✅ Declare first
        System.out.println(x);
    }
}
```

---

## 🔴 Mistake 4: Infinite Loops

### What's wrong?
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    // ❌ Missing i++
}
```

### Why it's wrong
The condition `i <= 10` is always true because `i` never changes. The loop runs forever.

### Correct way
```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;  // ✅ Update the variable
}
```

### How to fix
- Always update the loop variable
- Check the condition logic

---

## 🔴 Mistake 5: Missing Base Case in Recursion

### What's wrong?
```java
static int factorial(int n) {
    return n * factorial(n - 1);  // ❌ No base case
}
```

### Why it's wrong
Without a base case, recursion never stops. Eventually, the program crashes with `StackOverflowError`.

### Correct way
```java
static int factorial(int n) {
    if (n == 1) return 1;  // ✅ Base case
    return n * factorial(n - 1);
}
```

### Remember
Every recursive method MUST have:
1. A base case (when to stop)
2. A recursive case (when to call itself)

---

## 🔴 Mistake 6: Off-by-One Errors in Arrays

### What's wrong?
```java
int[] arr = {10, 20, 30, 40, 50};
for (int i = 1; i <= arr.length; i++) {  // ❌ WRONG
    System.out.println(arr[i]);
}
```

### Why it's wrong
- Arrays are 0-indexed (start at 0)
- If `arr.length` is 5, valid indices are 0, 1, 2, 3, 4
- When `i = 5`, `arr[5]` doesn't exist
- This causes `ArrayIndexOutOfBoundsException`

### Correct way
```java
int[] arr = {10, 20, 30, 40, 50};
for (int i = 0; i < arr.length; i++) {  // ✅ CORRECT
    System.out.println(arr[i]);
}
```

### Or use enhanced for loop
```java
for (int num : arr) {  // ✅ No index needed
    System.out.println(num);
}
```

---

## 🔴 Mistake 7: Misunderstanding Method Overloading

### What's wrong?
```java
static void print(int x) {
    System.out.println("int: " + x);
}

static String print(int x) {  // ❌ WRONG
    return "int: " + x;
}
```

### Why it's wrong
Two methods with different return types but same name and parameters. Java can't decide which to call.

### Remember
Method overloading is determined by:
- ✅ Different number of parameters
- ✅ Different parameter types
- ✅ Different parameter order
- ❌ Different return type ALONE (not enough)

### Correct way
```java
static void print(int x) {
    System.out.println("int: " + x);
}

static void print(double x) {  // ✅ CORRECT
    System.out.println("double: " + x);
}
```

---

## 🔴 Mistake 8: Type Casting Data Loss

### What's wrong?
```java
double price = 99.99;
int rounded = (int) price;
System.out.println(rounded);  // Prints: 99 (data lost)
```

### Why it's wrong
Casting `double` to `int` truncates (removes) the decimal part. This can cause unexpected results.

### How to fix
- Be aware of data loss
- Use proper rounding if needed
- Understand what data type you need

### Better way
```java
double price = 99.99;
int rounded = Math.round((float) price);  // Rounds to nearest
System.out.println(rounded);  // Prints: 100
```

---

## 🔴 Mistake 9: Confusing Variable Scope

### What's wrong?
```java
public class Test {
    public static void main(String[] args) {
        if (true) {
            int x = 5;
        }
        System.out.println(x);  // ❌ x doesn't exist here
    }
}
```

### Why it's wrong
`x` is declared inside the `if` block, so it only exists there. Outside the block, Java doesn't know what `x` is.

### Correct way
```java
public class Test {
    public static void main(String[] args) {
        int x = 5;  // ✅ Declare outside
        if (true) {
            System.out.println(x);
        }
    }
}
```

### Remember
A variable exists only within the block (curly braces) where it's declared.

---

## 🔴 Mistake 10: Missing `break` in Switch

### What's wrong?
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
    case 2:
        System.out.println("Tuesday");  // ❌ Case 1 falls through
    case 3:
        System.out.println("Wednesday");  // ❌ Also prints
}
```

### Output
```
Tuesday
Wednesday
```

### Why it's wrong
Without `break`, execution continues to the next case (fallthrough).

### Correct way
```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;  // ✅ Stops here
    case 2:
        System.out.println("Tuesday");
        break;  // ✅ Stops here
    case 3:
        System.out.println("Wednesday");
        break;
}
```

### Exception
Sometimes fallthrough is intentional:
```java
switch (day) {
    case 1: case 2: case 3: case 4: case 5:
        System.out.println("Weekday");  // ✅ Intentional
        break;
}
```

---

## 🔴 Mistake 11: String Comparison with `==`

### What's wrong?
```java
String s1 = "Java";
String s2 = "Java";
if (s1 == s2) {  // ❌ Wrong (sometimes)
    System.out.println("Same");
}
```

### Why it's sometimes wrong
- `==` compares memory location (reference)
- Different String objects might have same content but different locations
- Not reliable for string comparison

### Correct way
```java
String s1 = "Java";
String s2 = "Java";
if (s1.equals(s2)) {  // ✅ CORRECT
    System.out.println("Same content");
}
```

### For case-insensitive comparison
```java
if (s1.equalsIgnoreCase(s2)) {
    System.out.println("Same (ignoring case)");
}
```

---

## 🔴 Mistake 12: Not Initializing Variables

### What's wrong?
```java
int x;
System.out.println(x);  // ❌ x has no value
```

### Why it's wrong
Java local variables must be initialized before use. You'll get a compilation error.

### Correct way
```java
int x = 0;  // ✅ Initialize with default value
System.out.println(x);
```

---

## 🔴 Mistake 13: Array vs ArrayList Confusion

### What's wrong?
```java
int[] arr = new int[5];
arr.add(10);  // ❌ Arrays don't have add() method
```

### Why it's wrong
- Arrays are fixed-size collections
- Arrays don't have methods like `add()`, `remove()`
- That's what `ArrayList` is for (later in Phase 3)

### Correct array way
```java
int[] arr = new int[5];
arr[0] = 10;  // ✅ Use index
```

---

## 🔴 Mistake 14: Wrong Loop Type for Condition

### What's wrong?
```java
for (int i = 0; i < 10; i++) {
    if (userInput == -1) break;  // Not ideal for unknown iterations
}
```

### Why it's suboptimal
- Use `for` when you know the number of iterations
- Use `while` when condition determines when to stop

### Better way
```java
while (userInput != -1) {
    // Process user input
}
```

---

## 🔴 Mistake 15: Trying to Modify Strings

### What's wrong?
```java
String s = "Java";
s[0] = 'X';  // ❌ Strings don't work like arrays
```

### Why it's wrong
- Strings are immutable in Java
- You cannot change individual characters

### Correct way
```java
String s = "Java";
s = "Xava";  // ✅ Create new string
```

### Or use StringBuilder
```java
StringBuilder sb = new StringBuilder("Java");
sb.setCharAt(0, 'X');  // ✅ Mutable
System.out.println(sb.toString());
```

---

## ✅ Prevention Strategies

1. **Test your code** - Run and check output
2. **Read compiler errors** - They tell you what's wrong
3. **Use meaningful names** - Makes code clearer
4. **Comment complex logic** - Helps you think through it
5. **Start simple** - Build up complexity gradually
6. **Debug step by step** - Use print statements
7. **Review others' code** - Learn from examples
8. **Practice regularly** - Mistakes teach you

---

## 🎯 When You Make a Mistake

1. **Read the error message** - It often tells you exactly what's wrong
2. **Identify the line** - Find where the error occurred
3. **Understand why** - Learn the rule you broke
4. **Fix it** - Correct the mistake
5. **Remember it** - Make a mental note to avoid it next time

---

## 💡 Quick Checklist Before Submission

- [ ] Code compiles without errors
- [ ] No semicolons missing
- [ ] All variables are declared
- [ ] No infinite loops
- [ ] Array indices are correct (0-based)
- [ ] Base cases in recursion
- [ ] Proper use of `break` in switches
- [ ] Correct comparison operators (== vs =)
- [ ] Strings compared with `.equals()`

---

## 📝 Reference

See [questions_answers.md](questions_answers.md) for related interview questions about common mistakes.