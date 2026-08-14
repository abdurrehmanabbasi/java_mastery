import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ayesha");
        names.add("Hassan");

        System.out.println("Total names: " + names.size());
        
        // Safe iteration with null and empty checks
        if (names != null && !names.isEmpty()) {
            System.out.println("Names in collection:");
            for (String name : names) {
                if (name != null) {
                    System.out.println("  - " + name);
                }
            }
        } else {
            System.out.println("No names available");
        }
    }
}
