import java.util.Scanner;
public class FibInRange{
    public static long fib(long position){
        if(position == 0 || position == 1){
            return position;
        }
        long a = 0;
        long b = 1;
        long fib = 0;
        for(long i=2; i<=position; i++){
            fib  = a+b;
            a = b;
            b = fib;
            }

            return fib;
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Position: ");
            long n = sc.nextLong();
            long result = fib(n);
            System.out.println("The number in position "+n+" is "+ result);
            sc.close();
        }
    }

    
