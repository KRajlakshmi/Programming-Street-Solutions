import java.util.Scanner;

public class SumOdd{
     public static int Sum(int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            if(i%2 == 1){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        start =sc.nextInt();
        end = sc.nextInt();
        
        System.out.println("The sum of Odd numbers between "+ start +" and "+ end +" :"+Sum(start,end));
    }
}