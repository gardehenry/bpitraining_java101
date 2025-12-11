package M2_Activity6;

/*
 ** Main Application for Exercise 2
 */
public class Exercise2 {

	public static void main(String[] args){
        // instantiate Car and Truck
    	Car car = new Car("Toyota");
		Truck truck = new Truck("Honda", 18);

        // call their methods (inherited/implemented)
        car.startEngine();
        car.refuel();

        truck.startEngine();
        truck.refuel();

        // call destroy via the single-parameter method
        destroyVehicle(car);
        destroyVehicle(truck);
    }
    
    // Requirement #5: a method that takes ONE parameter (either Car or Truck) and calls destroy()
    public static void destroyVehicle(Vehicle v) {
        v.destroy();
    }
}

