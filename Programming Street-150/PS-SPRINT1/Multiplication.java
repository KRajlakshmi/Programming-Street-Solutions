import java.util.Scanner;
public class Multiplication{
    static void multiply(int n, int range){
        for(int i=1; i<= range; i++){
            System.out.println(n+" * " +i+ " = "+i*n);
        }
    }

    public static void main(String[] args) {
        int n;
        int range;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        n = sc.nextInt();
        System.out.print("Enter range :");
        range = sc.nextInt();
        multiply(n, range);

    }
}