public class Scope {
    static int globalValue = 10;

    public static void main(String[] args) {
        int localValue = 20;

        System.out.println("Global value: " + globalValue);
        System.out.println("Local value: " + localValue);
    }
}
