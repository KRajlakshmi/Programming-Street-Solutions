import java.util.*;
public class SumOfFactNum{

static long fact(long n){
        
    if( n==0 || n ==1){
        return 1;
           }
           return n*fact(n-1);
           
}

    static long FactorialSum(long n){
        long result = fact(n);
        long sum = 0;
        
        while(result != 0 ){
            long digit=result %10;
            sum += digit;
            result = result/10;
        }
       return  sum;
    }
    

    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        System.out.println(FactorialSum(n));
    }
}