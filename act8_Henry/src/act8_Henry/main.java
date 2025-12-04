package act8_Henry;

public class main {
    public static void main(String[] args) {
        // initialize / instantiate first car using No-Args constructor
        car car1 = new car();
        car1.brand = "Nissan";
        car1.model = "Skyline GT-R";
        car1.year = 2002;

        // initialize / instantiate second car using Parameterized constructor
        car car2 = new car("Mazda", "RX-8", 2004);

        // Call the method to display details
        car1.displayDetails();
        car2.displayDetails();
    }
}

