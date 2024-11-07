
import java.util.Arrays;

public class Median{
    public static double findMedian(int[] arr, int n){
        Arrays.sort(arr);
        if(n%2 != 0 ){
            return (double) arr[n/2];
        }else{
            return (double) (arr[(n-1)/2] + arr[n/2])/2.0;
        }
    }

    public static void main(String args[]){
        int[] arr = {1, 3, 4};
        int n = arr.length;
        System.out.println("Median is " + findMedian(arr, n));
    }
}