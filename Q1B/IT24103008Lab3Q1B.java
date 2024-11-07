import java.util.Scanner;

      public class IT24103008Lab3Q1B {
         public static void main (String[]args) {
     
      //Creat a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

      // Prompt the user to enter the price per kg
       System.out.print("Enter the price of 1kg of rice:");
          double priePerKg = scanner.nextDouble();
 
     // Promt to user to enter the quantity
       System.out.print("Enter the nummber of kilograms you want to by:");
         double quantityKg = scanner.nextDouble();

    // Calculate the total price before discount
        double totalPrice = pricePerKg * quantity;

    // Calculate the discount
        double discount = totalPrice* 0.10;

    // Calculate the final price
        double finalPrice = totalPrice-discount;

    // Display the results
      System.out.println("The total amount with 10% dicount is:"+ finalPrice);

    //close the scanner
       scanner.close();
    }
}