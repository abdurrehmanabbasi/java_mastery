public class Strings {
    public static void main(String[] args) {
        String name = "Java";
        String message = "Programming";

        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Concatenation: " + name.concat(" " + message));
        System.out.println("Substring: " + "abcdef".substring(1, 4));
    }
}
