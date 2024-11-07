import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersInRange{

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

    public static List<Integer> NumberInRange(int start, int end){
        List<Integer> primeNumbers = new ArrayList<>();
       
        for(int i= start; i<=end; i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
        
    }
   
    public static void main(String args[]){
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        start = sc.nextInt();
        end = sc.nextInt();
        List<Integer> primeNumbers = NumberInRange(start, end);
        System.out.println("Prime numbers between " + start + " and "+ end+ " are :"+ primeNumbers);


    }
}