package activities;

public class Car {
    private String name;
    private String type;
    private int maxSpeed;
    private boolean isAutomatic;

    public Car() {

    }

    Car(String name, String type, int maxSpeed, boolean isAutomatic) {
        this.name = name;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.isAutomatic = isAutomatic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String printDetails() {
        return "Name: " + name + ", type: " + type + ", max speed: " + maxSpeed + ", is Automatic: " + isAutomatic;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", isAutomatic=" + isAutomatic +
                '}';
    }
}
