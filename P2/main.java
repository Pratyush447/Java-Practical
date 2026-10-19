class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(brand + " vehicle is starting.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int numberOfDoors) {
        super(brand);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.start();
        car.displayDetails();
    }
}


