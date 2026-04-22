public class MathsForDSA
{
    // Question 1: Find the number is even or odd
    public static boolean isEven(int n) {
        return (n & 1) == 0;
    }
    

    //Question 2: Find unique number in an array where every element is present twice except one
    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique ^= num; // XOR operation
        }
        return unique;
    }   
    
    public static void main(String[] args) {
        // Test for Question 1
        int n = -1;
        System.out.println("Is " + n + " even? " + isEven(n));
        
        // Test for Question 2
        int[] arr = {9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9};
        System.out.println("Unique number in the array is: " + findUnique(arr));
    }
}