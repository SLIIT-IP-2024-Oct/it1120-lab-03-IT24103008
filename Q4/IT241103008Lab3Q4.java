import java.util.Scanner;
 
        public class IT241103008Lab3Q4  {
          public static void main(String[] args) {

     // create a scanner object to take input 
        Scanner scanner = new Scanner(System.in); 

    // prompt user to enter the five digit number
      System.out.print(" Enter a five digit number :");
          int number = scanner.nextInt();

   // check if the the input is a five digit number
      if (number<10000 || number>99999) {
        System.out.print(" Please enter a valid five digit number");
   } else { 

    int firstDigit = number/10000;
    int secondDigit= (number/1000)% 10;
    int thirdDigit = (number/100)%10;
    int fourthDigit = (number/10)%10;
    int fifthDigit = number%10;

    // print the results
    System.out.println(firstDigit +" "+ secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
   }
    
   scanner.close();
   }
}
   