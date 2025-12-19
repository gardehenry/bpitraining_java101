package M3_Activity3;

import java.util.*;

public class mainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> products = new HashMap<>();

        // Initial 5 records
        products.put("Pikachu VMax", 1000.00);
        products.put("M Charizard EX", 5000.00);
        products.put("Umbreon VMax", 8300.00);
        products.put("Bubble Mew SIR", 2000.00);
        products.put("M Gardevoir", 1575.00);

        int choice;
        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Search a product");
            System.out.println("2. Add a product");
            System.out.println("3. Print all products and prices");
            System.out.println("4. Find the cheapest product");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine();
                    if (products.containsKey(searchName)) {
                        System.out.println(searchName + " costs Php " + products.get(searchName));
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to add: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double newPrice = scanner.nextDouble();
                    products.put(newName, newPrice);
                    System.out.println("Product added successfully.");
                    break;

                case 3:
                    System.out.println("Products and Prices:");
                    for (Map.Entry<String, Double> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + " - Php " + entry.getValue());
                    }
                    break;

                case 4:
                    String cheapestProduct = null;
                    double cheapestPrice = Double.MAX_VALUE;
                    for (Map.Entry<String, Double> entry : products.entrySet()) {
                        if (entry.getValue() < cheapestPrice) {
                            cheapestPrice = entry.getValue();
                            cheapestProduct = entry.getKey();
                        }
                    }
                    System.out.println("Cheapest product: " + cheapestProduct + " (Php " + cheapestPrice + ")");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
