import java.util.*;
public class DivisorsOfNum
{
    public static List<Integer> totalDivisors(int num){
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=num; i++){
            if(num%i ==0){
                numbers.add(i);
            }
        }
        return numbers;
    }
	public static void main(String[] args) {
		int num;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number : ");
		num = sc.nextInt();
		List<Integer> divisors = totalDivisors(num);
		System.out.println(divisors);
	}
}