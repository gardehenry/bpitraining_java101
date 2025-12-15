package M3_Activity1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainApp {
	
	static String searchTerm1 = "";

    // Utility: Print list with a header
    private static void printList(String header, List<String> products) {
        System.out.println("\n" + header);
        System.out.println("-----------------------------");
        // Enhanced for-loop to print items with indexes
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, products.get(i));
        }
    }

    // Find using contains() (case-sensitive by default)
    private static boolean findWithContains(List<String> products, String targetName) {
    	if (products.contains(targetName) == Boolean.TRUE){
    		System.out.print("Product Found: " + searchTerm1);
    	} else {
            System.out.print("Product Not Found");
    	}
    	return products.contains(targetName);
        
    }

    public static void main(String[] args) {
        // 1) Create a List of Products with 5 records
        List<String> products = new ArrayList<>();
        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");

        // 2) Print all products
        printList("Initial product list", products);

        // 3) Add a new product (Webcam) and remove one product (Mouse)
        products.add("Webcam");
        boolean removed = products.remove("Mouse"); // removes the first occurrence of "Mouse"
        System.out.println("\nRemoved 'Mouse'? " + removed);

        printList("Updated product list after adding 'Webcam' and removing 'Mouse'", products);

        // 4) Find a product by name using two ways
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter product name to search: ");
        searchTerm1 = scanner.nextLine();

        // uses contains() method (case-sensitive)
        boolean foundContains = findWithContains(products, searchTerm1);
    }
}
