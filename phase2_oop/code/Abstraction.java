public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.stop();
    }
}

abstract class Vehicle {
    public abstract void start();

    public void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }
}
