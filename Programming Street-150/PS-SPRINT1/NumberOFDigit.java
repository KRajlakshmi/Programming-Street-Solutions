import java.util.Scanner;
public class NumberOFDigit{
    static int CountNumber(int n){
        int count = 0;
        while (n != 0) {
            n = n/10;
            count++;
            
        }
        return count;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        System.out.println("Number of digits in the number is: "+CountNumber(n));
    }
}