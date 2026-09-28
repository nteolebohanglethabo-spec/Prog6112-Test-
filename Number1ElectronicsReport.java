package com.mycompany.number1electronicsreport;

public class Number1ElectronicsReport {

    public static void main(String[] args) {
        
        // DECLARE SINGLE-DIMENSIONAL ARRAY FOR CITIES
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // DECLARE TWO-DIMENSIONAL ARRAY FOR SALES DATA
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };
        
        // Variables to track the highest sales city
        int maxSales = 0;
        String topCity = "";
        
        // 3. GENERATE THE REPORT
        
        // Header Section
        System.out.println("----------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("\tPS5\tXBOX\tSWITCH");
        
        // Sales Data Section
        // Loop through the cities (rows)
        for (int i = 0; i < cities.length; i++) {
            // Print the city name
            System.out.print(cities[i] + "\t");
            
            // Loop through the consoles (columns) for that city
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println(); // Move to next line after printing all consoles for a city
        }
        
        System.out.println("----------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("----------------------------------------------------------------------");
        
        // --- Totals Section ---
        // Loop through the cities again to calculate and print totals
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            
            // Calculate total for the current city
            for (int j = 0; j < sales[i].length; j++) {
                cityTotal += sales[i][j];
            }
            
            // Print the total for this city
            System.out.println(cities[i] + "" + cityTotal);
            
            // Check if this city has the most sales so far
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }
        
        // --- Top Sales Section ---
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("----------------------------------------------------------------------");
    }
}