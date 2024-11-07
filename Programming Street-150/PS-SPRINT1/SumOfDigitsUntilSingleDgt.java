import java.util.Scanner;

public class SumOfDigitsUntilSingleDgt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Call the method to calculate the single digit sum
        int result = sumOfDigitsUntilSingleDigit(number);
        
        // Output the result
        System.out.println("The single digit sum is: " + result);
    }
    
    // Method to calculate the sum of digits until a single digit is obtained
    public static int sumOfDigitsUntilSingleDigit(int number) {
        while (number >= 10) { // Continue until the number is a single digit
            number = sumOfDigits(number); // Sum the digits
        }
        return number; // Return the single digit result
    }
    
    // Helper method to sum the digits of a number
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to sum
            number /= 10; // Remove the last digit
        }
        return sum; // Return the sum of digits
    }
}
