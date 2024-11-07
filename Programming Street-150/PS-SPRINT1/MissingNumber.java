import java.util.*;
public class MissingNumber{

    public static int MissingNum(int nums[]){
        int sum = 0;
        for(int i=0; i< nums.length; i++){
            sum +=nums[i];
        }
        int actualSum = (nums.length*(nums.length+1))/2;
        int MissingNum = actualSum -sum;
        return Math.abs(MissingNum);
    }


    public static void main(String[] args) {
     int nums[]={9, 4, 5, 1, 0,3,6, 7, 2};
     System.out.println(MissingNum(nums));
    }
}