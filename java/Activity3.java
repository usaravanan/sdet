package activities;

import java.util.*;

public class Activity3 {

    public void listStringExamples() {
        List<String> cars = new ArrayList<>();
        cars.add("Skoda");
        cars.add("Icon");
        cars.add("i10");
        System.out.println(cars);
        cars.add(1, "Swift");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        System.out.println("Cars Contain Icon: "+cars.contains("Icon"));
        System.out.println("Cars count "+cars.size());
        for(String car : cars) {
            System.out.println("car name "+car);
        }
    }

    public void listCarExamples() {
        Car car = null;
        List<Car> cars = new ArrayList<>();
        car = new Car("Scoda", "Luxuary", 180, true);
        cars.add(car);

        car = new Car("Icon", "Basic", 160, false);
        cars.add(car);

        System.out.println(cars);
        car = new Car("i10", "Basic", 160, false);
        cars.add(car);
        System.out.println(cars);
        cars.remove(2);
        System.out.println(cars);
        System.out.println("Cars count "+cars.size());
        for(Car carObj : cars) {
            System.out.println("car "+carObj.printDetails());
        }
    }

    public void setExamples() {
        Set<String> cars = new HashSet<>();
        cars.add("Skoda");
        cars.add("Icon");
        cars.add("i10");
        cars.add("i10");
        System.out.println(cars);
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);
        System.out.println("Cars Contain Icon: "+cars.contains("Icon"));
        System.out.println("Cars count "+cars.size());
        for(String car : cars) {
            System.out.println("car name "+car);
        }
    }

    public void mapExamples() {
        Map<String, String> carMap = new HashMap<>();
        carMap.put("car1", "Skoda");
        carMap.put("car2", "Icon");
        carMap.put("car3", "i10");
        System.out.println("Car Map "+carMap.values());
        System.out.println("Cars Contain Icon: "+carMap.containsValue("Icon"));
        System.out.println("Cars count "+carMap.size());
        System.out.println("Car1 is "+carMap.get("car1"));
        carMap.remove("car1");
        System.out.println("Car Map "+carMap.values());
        for(String key : carMap.keySet()) {
            System.out.println("Car "+key+" value is "+carMap.get(key));
        }
    }
    public static void main(String args[]) {
        Activity3 activity3 = new Activity3();
        activity3.listStringExamples();
        activity3.listCarExamples();
        activity3.setExamples();
        activity3.mapExamples();
    }
}
