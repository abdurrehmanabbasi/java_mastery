/**
 * Demonstrates classes and objects in Java.
 */
public class ClassesAndObjects {
    public static void main(String[] args) {
        Student s1 = new Student("Ali", 20);
        s1.display();
    }
}

/**
 * Represents a Student with name and age.
 */
class Student {
    private String name;      // Private field - proper encapsulation
    private int age;          // Private field - proper encapsulation

    /**
     * Constructor to initialize a student.
     * @param name the student's name
     * @param age the student's age
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Display student information.
     */
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
