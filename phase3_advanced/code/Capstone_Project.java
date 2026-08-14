import java.util.*;

public class Capstone_Project {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Ali", 88);
        studentMarks.put("Ayesha", 92);
        studentMarks.put("Hassan", 90);

        System.out.println("Student marks:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
