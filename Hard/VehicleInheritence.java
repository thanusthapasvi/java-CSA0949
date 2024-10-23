package Hard;

class Vehicle {
    String licensePlate;
    String owner;

    Vehicle(String licensePlate, String owner) {
        this.licensePlate = licensePlate;
        this.owner = owner;
    }

    void displayDetails() {
        System.out.println("License Plate: " + licensePlate + ", Owner: " + owner);
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String licensePlate, String owner, int numDoors) {
        super(licensePlate, owner);
        this.numDoors = numDoors;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(String licensePlate, String owner, int loadCapacity) {
        super(licensePlate, owner);
        this.loadCapacity = loadCapacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " kg");
    }
}

class Motorcycle extends Vehicle {
    int engineCapacity;

    Motorcycle(String licensePlate, String owner, int engineCapacity) {
        super(licensePlate, owner);
        this.engineCapacity = engineCapacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

public class VehicleInheritence {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "John", 4);
        Truck truck = new Truck("XYZ456", "Alice", 5000);
        Motorcycle bike = new Motorcycle("LMN789", "Bob", 150);

        car.displayDetails();
        truck.displayDetails();
        bike.displayDetails();
    }
}
