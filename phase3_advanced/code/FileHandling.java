import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        // Use explicit path relative to project
        String filePath = "phase3_advanced/code/sample.txt";
        File file = new File(filePath);
        
        try {
            // Write to file using try-with-resources (auto-closes)
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Java file handling example\n");
                System.out.println("File written successfully");
            }

            // Read from file using try-with-resources (auto-closes)
            try (FileReader reader = new FileReader(file);
                 BufferedReader br = new BufferedReader(reader)) {
                String line;
                System.out.println("\nFile contents:");
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
