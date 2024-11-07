import java.util.Scanner;
public class VowelConsonant{
    public static void main(String args[]){
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        s = sc.nextLine();
         s = s.toUpperCase();
         int i, v=0, c=0;
         for(i =0; i< s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                if(ch=='A' || ch == 'I'||ch =='E' || ch=='O' || ch=='U'){
                    v++;
                }else{c++;
                }
                
            }
         }
         System.out.println("Vowels are "+ v+" and Consonants are "+c);

    }
}