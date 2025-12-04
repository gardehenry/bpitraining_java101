package act8_Henry;

public class car {
    // these are attributes
    String brand;
    String model;
    int year;

    // these are no-argument constructor
    public car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // these are parameterized constructor
    public car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // these are method to display car details
    public void displayDetails() {
        System.out.println("Car Details: " + brand + " " + model + " (" + year + ")");
    }
}

