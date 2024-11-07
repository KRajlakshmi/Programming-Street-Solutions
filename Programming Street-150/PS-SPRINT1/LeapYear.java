import java.util.*;
class LeapYear{
    public static boolean isLeapYear(int year){
        if ( year % 4 == 0){
            if( year % 100 == 0){
                return (year% 400 ==0);
            }else{
                return true;
            }
            
        } else{
            return false;

        }

        }
    

        

    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year:");
    int year = sc.nextInt();
    if(isLeapYear(year)){
        System.out.println(year + " is a leap year");
    } else {
        System.out.println(year + " is not a leap year");
    }

}
}