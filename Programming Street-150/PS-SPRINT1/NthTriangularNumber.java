public class NthTriangularNumber{
    public static int findNthTriangularNumber(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        int n = 4;
        int result = findNthTriangularNumber(n);
        System.out.println("The " + n + "th triangular number is: " + result);
    }
}