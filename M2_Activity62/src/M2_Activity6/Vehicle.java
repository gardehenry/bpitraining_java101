package M2_Activity6;
/*
** This an abstract class with attributes
** - numberOfWheels
** - brand
** and methods
** - a concrete method destroy()
** - an abstract method startEngine()
*/

public abstract class Vehicle {
    private final int numberOfWheels;
    private final String brand;

    protected Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void startEngine();

    public void destroy() {
        System.out.println("Destroying vehicle: " + brand + " (" + numberOfWheels + " wheels).");
    }
}
