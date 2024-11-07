import java.util.Scanner;

public class IT24103008Lab3Q1A {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the price per kg
        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantityKg = scanner.nextDouble();
        
        // Calculate the total amount to pay
        double totalAmount = pricePerKg * quantityKg;
        
        // Display the total amount
        System.out.println("The total amount you have to pay is: " + totalAmount);
        
        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
