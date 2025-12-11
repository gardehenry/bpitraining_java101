package M2_Activity6;
/*
** This is a concrete class, it is a Vehicle and it is Refuelable
*/

public class Truck extends Vehicle implements Refuelable {

    public Truck(String brand, int wheels) {
        super(wheels, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine rumbles to life for " + getBrand() + ".");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the truck: " + getBrand() + ".");
    }

    @Override
    public void destroy() {
        System.out.println("Truck " + getBrand() + " is being dismantled.");
        super.destroy();
    }
}
