interface Printable {
    void print();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Printable p = new Printer();
        p.print();
    }
}
