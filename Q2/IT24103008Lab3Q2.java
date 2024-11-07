import java.util.Scanner;
   
        public class IT24103008Lab3Q2  {
           public  static void main(String[] args) {

            // Create a scanner object to take input from user
                Scanner scanner = new Scanner(System.in);
                
           // promp user to enter the monthly salary
              System.out.print("Enter your monthly salary:");
               double monthlySalary= scanner.nextDouble();

           // promt user to enter the number of OT hours
             System.out.print("Enter the number of overtime hours:");
              double overtimeHours = scanner.nextDouble();

           // prompt user to enter the overtime hourly rate
            System.out.print("Enter the overtime hourly rate:");
              double overtimeRate= scanner.nextDouble();

        // Calculate the overtime salary
            double overtimePay = overtimeHours*overtimeRate;

       // Calculate the total salary
           double totalSalary =  monthlySalary+ overtimePay;

       // Display the total salary
        System.out.println(" Total salary includig OT is:"+ totalSalary);
  
      // close the scanner 
        scanner. close();
     }
}