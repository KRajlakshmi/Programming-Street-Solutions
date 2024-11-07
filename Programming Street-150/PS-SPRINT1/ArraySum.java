import java.util.*;
public class ArraySum{
    public static void main(String args[]){
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of the array elements is: "+sum);
    }
}