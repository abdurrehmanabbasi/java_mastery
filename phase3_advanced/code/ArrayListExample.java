import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("First value: " + fruits.get(0));
    }
}
