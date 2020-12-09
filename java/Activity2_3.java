package activities;

public class Activity2_3 {
    public String printDetails() {
        return "Nothing to Print";
    }
    public String printDetails(String name) {
        return "Name: " + name;
    }
    public String printDetails(String name, int age) {
        return "Name: " + name + ", age: " + age;
    }
    public static void main(String args[]) {
        Activity2_3 activity = new Activity2_3();
        System.out.println(activity.printDetails());
        System.out.println(activity.printDetails("Saro"));
        System.out.println(activity.printDetails("Saro", 35));
    }
}
