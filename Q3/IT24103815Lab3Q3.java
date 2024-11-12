import java.util.Scanner;

public class IT24103815Lab3Q3 {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the rupee amount
        System.out.println("Enter the rupee amount:");
        
        // Input validation: check if the amount entered is a positive integer
        int amount = scanner.nextInt();
        
        if (amount < 1) {
            System.out.println("Please enter a valid positive amount.");
            scanner.close();
            return; // Exit the program if invalid input is given
        }

        
        int notes5000 = amount / 5000;
        amount %= 5000;

        int notes1000 = amount / 1000;
        amount %= 1000;

        int notes500 = amount / 500;
        amount %= 500;

        int notes200 = amount / 200;
        amount %= 200;

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        int notes20 = amount / 20;
        amount %= 20;

        int notes10 = amount / 10;
        amount %= 10;

        int coins5 = amount / 5;
        amount %= 5;

        int coins2 = amount / 2;
        amount %= 2;

        int coins1 = amount / 1;
        amount %= 1;

        // Print the number of each denomination
        System.out.println("5000 Notes - " + notes5000);
        System.out.println("1000 Notes - " + notes1000);
        System.out.println("500 Notes - " + notes500);
        System.out.println("200 Notes - " + notes200);
        System.out.println("100 Notes - " + notes100);
        System.out.println("50 Notes - " + notes50);
        System.out.println("20 Notes - " + notes20);
        System.out.println("10 Notes - " + notes10);
        System.out.println("5 coins - " + coins5);
        System.out.println("2 coins - " + coins2);
        System.out.println("1 coins - " + coins1);
        
        
        scanner.close();
    }
}
