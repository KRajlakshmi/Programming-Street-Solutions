import java.util.Scanner;

public class ArmstrongNumbersInRange {
    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = 0;

        // Find the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // Compute the sum of powers of its digits
        while (originalNum != 0) {
            int digit = originalNum % 10;
            result += Math.pow(digit, n);
            originalNum /= 10;
        }

        // Return true if the number is an Armstrong number
        return result == num;
    }

    // Main function to find Armstrong numbers in the given range
    public static void findArmstrongInRange(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main method to get user input and execute the program
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        // Find and print Armstrong numbers
        findArmstrongInRange(start, end);
        
        sc.close();
    }
}
