import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Ali", 21);
        ages.put("Ayesha", 23);
        ages.put("Hassan", 20);

        System.out.println(ages.get("Ali"));
        System.out.println(ages);
    }
}
