import java.util.*;
public class SortArr{
    public static void main(String args[]){
        int arr[] = {5, 2, 8, 1, 9};
        int n = arr.length;
       Arrays.sort(arr);        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

    }

}