import java.util.Scanner;
public class Anagram{
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
    }
    for(int i=0; i<str1.length(); i++){
        for(int j=0; j<str2.length(); j++){
            if(str1.charAt(i) == str2.charAt(j)){
                return true;
        }
    }
    
}
return false;
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("Enter string1: ");
String str1 = sc.nextLine();
System.out.print("Enter string2: ");
String str2 = sc.nextLine();
System.out.println(isAnagram(str1, str2));
}
}