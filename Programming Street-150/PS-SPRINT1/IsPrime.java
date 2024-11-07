// import java.util.*;
// class IsPrime{
//     public static boolean isPrime(int num){
//         if(num <= 1) {
//             return false;
//         }
//         for(int i=2; i*i <=num; i++){
//             if(num % i == 0){
//                 return false;
//             }
//         }
//         return true;
//         }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         if(isPrime(num)){
//             System.out.println(num+" is a prime.");

//         }else{
//             System.out.println(num+" is not a prime.");
//         }
// }
// }

// 
import java.util.Scanner;
class primeNumber{
    public static boolean number(int n){
        if(n <=1){
            return false;
        }
        if(n == 2){
            return true;
        }   
        if(n % 2 == 0){
            return false;
        }
        int i;
       
            for( i=3; i<= Math.sqrt(i); i++){
                
                    if( n%i ==0){
                        return false;
                    }
            
        }
      return true;
}

public static void printNumbers(int n){
    for(int i=2; i<n; i++){
        if(number(i)){
            System.out.print(i+" ");
        }
    }
}

public static void main(String args[]){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    n = sc.nextInt();
    printNumbers(n);
  
}
}