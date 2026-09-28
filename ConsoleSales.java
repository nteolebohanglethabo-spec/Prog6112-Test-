/*
 * Group ID: com.electronics
 * Package: com.electronics.consolesales
 */
package com.electronics.consolesales;

import java.util.Scanner;

// 1. The Interface
interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

// 2. The Abstract Class
abstract class Consoles implements IConsoles {
    // Variables to store data
    private final String consoleType;
    private final String storeName;
    private final int totalSales;

    // Constructor
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // Implement methods from IConsoles interface
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
    
    // Abstract method for printing report (to be implemented by subclass)
    public abstract void printReport();
}

// 3. The Subclass
class ConsoleSales extends Consoles {
    
    // Constructor accepting parameters
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Implementation of printReport method
    @Override
    public void printReport() {
        System.out.println("*****************************");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*****************************");
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }
}

// 4. The Main Application Class
public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display Menu
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.print("Enter choice: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String selectedType = "";

        // Determine type based on user input
        switch (choice) {
            case 1:
                selectedType = "PS5";
                break;
            case 2:
                selectedType = "XBOX";
                break;
            case 3:
                selectedType = "SWITCH";
                break;
            default:
                System.out.println("Invalid selection. Defaulting to PS5.");
                selectedType = "PS5";
        }

        // Get Store Name
        System.out.print("Enter the store name: ");
        String storeName = scanner.nextLine();

        // Get Total Sales
        System.out.print("Enter the total sales for " + selectedType + ": ");
        int totalSales = scanner.nextInt();

        // Instantiate the ConsoleSales class
        // Using the same values from the sample screenshot for testing
        // (In a real app, you would pass 'selectedType', 'storeName', 'totalSales')
        ConsoleSales sale = new ConsoleSales(selectedType, storeName, totalSales);

        // Call the printReport method
        sale.printReport();
        
        scanner.close();
    }
}