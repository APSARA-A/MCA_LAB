
abstract class Vehicle {
    String model;
    String company;

    
    Vehicle() {
        model = "Unknown";
        company = "Unknown";
    }

    
    Vehicle(String model, String company) {
        this.model = model;
        this.company = company;
    }

   
    abstract void display();
}


class Car extends Vehicle {
    int noOfDoors;
    String fuelType;

    
    Car(String model, String company, int noOfDoors, String fuelType) {
        super(model, company);
        this.noOfDoors = noOfDoors;
        this.fuelType = fuelType;
    }

   
    @Override
    void display() {
        System.out.println("---- Car Details ----");
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("No of Doors: " + noOfDoors);
        System.out.println("Fuel Type: " + fuelType);
    }
}


class Electric extends Car {
    int batteryCapacity;

    
    Electric(String model, String company, int noOfDoors, String fuelType, int batteryCapacity) {
        super(model, company, noOfDoors, fuelType);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding display()
    @Override
    void display() {
        System.out.println("---- Electric Car Details ----");
        System.out.println("Model: " + model);
        System.out.println("Company: " + company);
        System.out.println("No of Doors: " + noOfDoors);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Main class
public class cars {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Vehicle v;

        v = new Car("City", "Honda", 4, "Petrol");
        v.display();   

        System.out.println();

        v = new Electric("Model S", "Tesla", 4, "Electric", 100);
        v.display();   
    }
}
