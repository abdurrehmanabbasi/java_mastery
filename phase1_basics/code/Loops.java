public class Loops {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("Break and Continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }
    }
}
