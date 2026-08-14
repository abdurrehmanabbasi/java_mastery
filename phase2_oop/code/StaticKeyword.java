class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Total objects: " + count);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        Counter.displayCount();
    }
}
