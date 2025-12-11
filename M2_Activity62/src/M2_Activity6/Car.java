package M2_Activity6;

/*
 ** This is a concrete class, it is a Vehicle and it is Refuelable
 */

public class Car extends Vehicle implements Refuelable {

    public Car(String brand) {
        super(4, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started for " + getBrand() + ".");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the car: " + getBrand() + ".");
    }

    @Override
    public void destroy() {
        System.out.println("Car " + getBrand() + " is being sent to the scrapyard.");
        super.destroy();
    }
}
