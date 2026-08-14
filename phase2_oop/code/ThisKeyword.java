public class ThisKeyword {
    public static void main(String[] args) {
        Employee e = new Employee("Hassan");
        e.show();
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Employee name: " + this.name);
    }
}
