import java.util.Scanner;

public class SumOfDigit{
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        n = sc.nextInt();
        while(n != 0){
             sum += n % 10;
             n = n/10;
        }
        System.out.println("Sum of digit is : "+sum);

    }
}