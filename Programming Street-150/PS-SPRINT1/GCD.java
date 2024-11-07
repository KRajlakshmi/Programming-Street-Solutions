import java.util.Scanner;
public class GCD{
    public static int CalGCD(int a, int b){
        int i;
        if(a < b){
            i=a;
        }
        i=b;
//take an example of 20, 30, 10 will be GCD
        for( i=i; i> 1; i--){
            if(a % i == 0 &&  b % i == 0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("GCD of " + c + " and " + d + " is "+ CalGCD(c, d));
        sc.close();

        
    }
}