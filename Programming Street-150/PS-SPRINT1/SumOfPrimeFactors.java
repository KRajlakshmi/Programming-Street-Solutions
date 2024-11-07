import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class SumOfPrimeFactors{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int result = sumOfPrimeFactors(number);
        System.out.println("The sum of the prime factors is: " + result);
    }
    

    public static int sumOfPrimeFactors(int number){
        Set<Integer> primeFactors = new HashSet<>();
        int sum = 0;
        //check for factor 2 first to handle even numbers
        while(number % 2 == 0){
            primeFactors.add(2);
            number /= 2;
        }

        //check for odd factor from 3 upto the square root of the number

        for(int i=3; i<= Math.sqrt(number); i += 2){
            while(number % i ==0){
                primeFactors.add(i);
                number /= i;
            }
        }
        //if number is a prime number greater than 2
        if(number > 2){
            primeFactors.add(number);
    }

    //sum up all unique prime factors 
    for(int factor : primeFactors){
        sum += factor;
        }
        return sum;
    }
}