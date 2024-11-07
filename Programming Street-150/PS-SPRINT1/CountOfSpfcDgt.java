import java.util.Scanner;
public class CountOfSpfcDgt
{
    public static int CountOfSpfcDgt(int number, int n){
        int count =0;
        
        while(number > 0){
            int digit = number % 10;
            if(digit == n)
            count++;
            
            number = number / 10;
        }
        return count++;
    }
	public static void main(String[] args) {
		int number;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number :");
		number = sc.nextInt();
		System.out.print("Enter the digit to be counted :");
		int n = sc.nextInt();
		System.out.println("The count of that number is : "+CountOfSpfcDgt(number, n));
	}
}