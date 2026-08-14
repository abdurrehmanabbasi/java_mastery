import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ayesha");

        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Ali");
        uniqueNames.add("Ali");
        uniqueNames.add("Ayesha");

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 90);
        scores.put("Ayesha", 95);

        System.out.println(names);
        System.out.println(uniqueNames);
        System.out.println(scores);
    }
}
