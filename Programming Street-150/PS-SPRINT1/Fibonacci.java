// ***************ITERATIVE METHOD********************
// import java.util.Scanner;
// public class Fibonacci{
//     public static void main(String[] args) {
//         int n1=0;
//         int n2=1;
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number :");
//         n = sc.nextInt();
       
//         System.out.print("Fibonacci series upto "+ n + " numbers :"+n1+" "+n2);
//         for(int i=2; i< n; i++){
//             int n3 = n2 + n1;
//             System.out.print(" "+n3);
//             n1=n2;
//             n2=n3;
//         }
//     }
// }

// ************RECURSIVE METHOD****************

import java.util.*;
public class Fibonacci{
    static int fib(int n){
        if(n <=1)
        return n;
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        int n=7;
        for(int i=0; i<n; i++){
            System.out.print(fib(i)+" ");
        }
       
    }
}