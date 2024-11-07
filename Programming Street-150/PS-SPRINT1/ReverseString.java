import java.util.*;
public class ReverseString{
    public static void main(String args[]){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:- ");
        str = sc.nextLine();
        for(int i=str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }

    }
}