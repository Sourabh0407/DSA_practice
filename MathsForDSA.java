public class MathsForDSA
{
    // Question 1: Find the number is even or odd
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
    
    public static void main(String[] args) {
        int n = -1;
        System.out.println("Is " + n + " even? " + isEven(n));
    }
}