import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SumOfPrimeNumberInRange{
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int CalNumberInRange(int start, int end){
        int sum = 0;
        for(int i= start; i<=end; i++){
            if(isPrime(i)){
               sum += i;
            }
        }
        return sum;
        
    }
   
    public static void main(String args[]){
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        start = sc.nextInt();
        end = sc.nextInt();
        int result = CalNumberInRange(start, end);
        System.out.println("Sum of Prime numbers between " + start + " and "+ end+ " are :"+ result);


    }
}