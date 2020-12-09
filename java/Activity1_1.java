package activities;

public class Activity1_1 {
    public static void main(String args[]) {
        Car car = new Car("Scoda", "Luxuary", 180, true);
        System.out.println(car.printDetails());

        car = new Car();
        car.setName("Icon");
        car.setType("Basic");
        car.setMaxSpeed(160);
        car.setAutomatic(false);
        System.out.println(car.printDetails());
    }
}
