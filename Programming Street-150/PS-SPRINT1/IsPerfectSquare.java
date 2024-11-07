
import java.util.Scanner;
public class IsPerfectSquare{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a perfect square
        boolean isPerfectSquare = checkPerfectSquare(number);
        
        // Output the result
        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is a perfect square
    public static boolean checkPerfectSquare(int num) {
        if (num < 0) {
            return false; // Negative numbers cannot be perfect squares
        }
        
        int sqrt = (int) Math.sqrt(num); // Find the integer square root
        return (sqrt * sqrt) == num; // Check if the square of sqrt equals the original number
    }
}

