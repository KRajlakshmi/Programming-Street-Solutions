import java.util.Scanner;
public class Palindrome{
    public static boolean palindrome(String str){
        for(int i=0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
String str;
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string to check Palindrome : ");
str = sc.nextLine();
if(palindrome(str)){
        System.out.println( str +" is Palindrome");
    }else{
        System.out.println(str +" is not palindrome");
}
    
}
}