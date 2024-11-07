import java.util.Scanner;

public class PerfectNumber{

    public static boolean isPerfect(int n) {
        if(n <= 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
                }
            }
            return sum == n;
}

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        n = sc.nextInt();
        if (isPerfect(n)) {
            System.out.println(n + " is a perfect number");
    }else{
        System.out.println(n + " is not a perfect number");
    }
}
}