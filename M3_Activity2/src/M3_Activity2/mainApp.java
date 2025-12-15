package M3_Activity2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class mainApp {

    // Print the menu
    private static void printMenu() {
        System.out.println("\nSelect an option:");
        System.out.println("1. Search a product");
        System.out.println("2. Add a product");
        System.out.println("3. Print all products and count");
        System.out.println("4. Exit");
        System.out.print("Enter choice (1-4): ");
    }

    // Case-insensitive search in a set of Strings
    private static boolean containsIgnoreCase(Set<String> set, String target) {
        for (String s : set) {
            if (s.equalsIgnoreCase(target)) {
                return true;
            }
        }
        return false;
    }

    // Add product (prevent duplicates ignoring case)
    private static boolean addProduct(Set<String> products, String newProduct) {
        // Avoid null/blank entries
        if (newProduct == null || newProduct.trim().isEmpty()) {
            return false;
        }

        // Check case-insensitive existence
        if (containsIgnoreCase(products, newProduct)) {
            return false; // already exists in some case form
        }

        // Normalize: store as Title Case (optional convention)
        String normalized = toTitleCase(newProduct.trim());
        return products.add(normalized);
    }

    // Utility: title-case a simple word (Laptop -> Laptop, wEbCam -> Webcam)
    private static String toTitleCase(String s) {
        if (s.isEmpty()) return s;
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }

    // Print all products with count
    private static void printAll(Set<String> products) {
        System.out.println("\nProducts:");
        System.out.println("---------");
        if (products.isEmpty()) {
            System.out.println("(no products)");
        } else {
            int i = 1;
            for (String p : products) {
                System.out.printf("%d. %s%n", i++, p);
            }
        }
        System.out.println("Total count: " + products.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Create a HashSet of Products with 5 initial data
        Set<String> products = new HashSet<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");

        System.out.println("=== M3_ACTIVITY2: Practice Set Operations ===");

        // 2) Display the menu repeatedly until the user chooses to exit
        boolean running = true;
        while (running) {
            printMenu();

            String input = scanner.nextLine().trim();
            int choice;

            // Validate numeric choice
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 4.");
                continue;
            }

            switch (choice) {
                case 1: // Search
                    System.out.print("Enter product name to search: ");
                    String searchName = scanner.nextLine().trim();
                    boolean found = containsIgnoreCase(products, searchName);
                    System.out.println(found
                            ? "'" + searchName + "' is in the product set."
                            : "'" + searchName + "' was NOT found.");
                    break;

                case 2: // Add
                    System.out.print("Enter product name to add: ");
                    String newProduct = scanner.nextLine().trim();
                    boolean added = addProduct(products, newProduct);
                    if (added) {
                        System.out.println("'" + toTitleCase(newProduct) + "' added successfully.");
                    } else {
                        System.out.println("Could not add. It may already exist or be invalid.");
                    }
                    break;

                case 3: // Print all and count
                    printAll(products);
                    break;

                case 4: // Exit
                    running = false;
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-4.");
            }
        }

        scanner.close();
    }
}
