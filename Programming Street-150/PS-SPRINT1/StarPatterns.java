import java.util.Scanner;

public class StarPatterns {

    public static void pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<n; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        pyramid(5);

    }

   
}