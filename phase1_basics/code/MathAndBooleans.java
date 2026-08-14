public class MathAndBooleans {
    public static void main(String[] args) {
        System.out.println("Max: " + Math.max(10, 20));
        System.out.println("Min: " + Math.min(10, 20));
        System.out.println("Square root: " + Math.sqrt(25));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Random: " + Math.random());

        boolean pass = true;
        boolean fail = false;

        System.out.println("Pass && !fail: " + (pass && !fail));
        System.out.println("pass || fail: " + (pass || fail));
    }
}
