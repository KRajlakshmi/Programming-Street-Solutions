public class ModeOfArray{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 3, 3}; // Example array
        int mode = findMode(numbers);
        
        if (mode != Integer.MIN_VALUE) {
            System.out.println("The mode is: " + mode);
        } else {
            System.out.println("No unique mode found.");
        }
    }

    public static int findMode(int[] numbers) {
        int maxCount = 0;
        int mode = Integer.MIN_VALUE;

        // Outer loop to pick each element
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            // Inner loop to count occurrences of numbers[i]
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }

            // Update mode if the current count is greater than maxCount
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            } else if (count == maxCount && mode != numbers[i]) {
                // If another number has the same max count, reset mode to indicate no unique mode
                mode = Integer.MIN_VALUE;
            }
        }

        // If the mode is still Integer.MIN_VALUE, it means there was no unique mode
        return mode;
    }
}
