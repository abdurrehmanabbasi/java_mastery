public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        double converted = num; // widening conversion

        double price = 9.99;
        int roundedPrice = (int) price; // narrowing conversion

        System.out.println("Widening: " + converted);
        System.out.println("Narrowing: " + roundedPrice);
    }
}
