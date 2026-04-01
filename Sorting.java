import java.util.*;
public class Sorting{

    //-------------------------------------------------------------------------
    // Bubble Sort
    //-------------------------------------------------------------------------
    public static void BubbleSort(int[] array)
    {
        int nbArray = array.length;
        boolean isSwapped = false;
        for(int i = 0; i < nbArray; ++i)
        {
            isSwapped = false;
            for(int j = 1; j < nbArray; ++j)
            {
                if(array[j-1] > array[j])
                {
                    //swap
                    int buffer = array[j-1];
                    array[j-1] = array[j];
                    array[j] = buffer;

                    isSwapped = true;
                }
            }

            if(!isSwapped)
            {
                break;
            }
        }
    }

    //-------------------------------------------------------------------------
    // Selection Sort
    //-------------------------------------------------------------------------
    public static void SelectionSort(int[] array)
    {
        int nbArray = array.length;
        for(int i=0; i < nbArray; ++i)
        {
            int lastIndex = nbArray - i - 1;
            int maxIndex = getMaxIndex(array, 0, lastIndex);
            swap(array, maxIndex, lastIndex);
        }
    }

    //-------------------------------------------------------------------------
    // Insertion Sort
    //-------------------------------------------------------------------------
    public static void InsertionSort(int[] array)
    {
        int nbArray = array.length;
        for(int i=0; i< nbArray - 1; ++i)
        {
            for(int j = i+1; j>0; --j)
            {
                if(array[j] < array[j - 1])
                {
                    swap(array, j , j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    //-------------------------------------------------------------------------
    // Cyclic Sort
    // Conditions : 
    //      array should be in range of 1 to n
    //-------------------------------------------------------------------------
    public static void CyclicSort(int[] array)
    {
        int nbArray = array.length;

        for(int i = 0; i < nbArray; ++i)
        {
            while(array[i] != i+1)
            {
                swap(array, i, array[i] - 1);
            }
        }

       /*
         Approach 2

         int nbArray = array.length;
         int i = 0;
         
         while(i < nbArray)
         {
            int correct  = array[i] - 1;
            if(array[i] != array[correct])
            {
                swap(array, i, correct);
            }
            else
            {
                ++i;
            }
         }

        
        */
    }


    static int getMaxIndex(int[] array, int start, int end)
    {
        int max = array[start];
        int maxIndex = start;

        for(int i = start+1; i<=end; ++i)
        {
            if(array[i] > max)
            {
                max = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args)
    {
        // // Bubble sort cases
        // System.out.println("Bubble Sort...................");
        // int[] array = {8,7,6,5,4,3,2,1};
        // Sorting.BubbleSort(array);
        // System.out.println(Arrays.toString(array));

        // int[] array2 = {8,-7,6,-5,0,4,-3,2,-1};
        // Sorting.BubbleSort(array2);
        // System.out.println(Arrays.toString(array2));

        // int[] array3 = {8};
        // Sorting.BubbleSort(array3);
        // System.out.println(Arrays.toString(array3));

        // int[] array4 = {};
        // Sorting.BubbleSort(array4);
        // System.out.println(Arrays.toString(array4));

        // System.out.println("------------------------------");


        // // Selection sort cases
        // System.out.println("Selection Sort................");
        // int[] array={5,4,3,2,1};
        // SelectionSort(array);
        // System.out.println(Arrays.toString(array));

        // int[] array2={1,2,3,4,5,6};
        // SelectionSort(array2);
        // System.out.println(Arrays.toString(array2));

        // int[] array3={-3, 5, -6, 2, 0, -1, 10};
        // SelectionSort(array3);
        // System.out.println(Arrays.toString(array3));

        // int[] array4={5};
        // SelectionSort(array4);
        // System.out.println(Arrays.toString(array4));

        // int[] array5={};
        // SelectionSort(array5);
        // System.out.println(Arrays.toString(array5));

        // System.out.println("------------------------------");



        // InsertionSort sort cases
        // System.out.println("Insertion Sort................");
        // int[] array={5,4,3,2,1};
        // InsertionSort(array);
        // System.out.println(Arrays.toString(array));

        // int[] array2={1,2,3,4,5,6};
        // InsertionSort(array2);
        // System.out.println(Arrays.toString(array2));

        // int[] array3={-3, 5, -6, 2, 0, -1, 10};
        // InsertionSort(array3);
        // System.out.println(Arrays.toString(array3));

        // int[] array4={5};
        // InsertionSort(array4);
        // System.out.println(Arrays.toString(array4));

        // int[] array5={};
        // InsertionSort(array5);
        // System.out.println(Arrays.toString(array5));

        // System.out.println("------------------------------");


        System.out.println("Cyclic Sort................");
        int[] array={5,4,3,2,1};
        CyclicSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2={1,2,3,4,5,6};
        CyclicSort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3={3,5,2,1,4};
        CyclicSort(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4={1};
        CyclicSort(array4);
        System.out.println(Arrays.toString(array4));

        int[] array5={};
        CyclicSort(array5);
        System.out.println(Arrays.toString(array5));

        
      

        System.out.println("CyclicSort Questions......");

        //Q1
        System.out.println("LeetCode 268. Missing Number");
        int[] array6={1,2,3,4,5,6,7,0};
        int missingNumber = CyclicSortQuestions.missingNumber(array6);
        System.out.println(Arrays.toString(array6)+" Missing num : "+missingNumber);

        int[] array7={1,2,3,4,5,6,7};
        int missingNumber2 = CyclicSortQuestions.missingNumber(array7);
        System.out.println(Arrays.toString(array7)+" Missing num : "+missingNumber2);

        int[] array8={4,3,2,7,8,2,3,1,0};
        int missingNumber3 = CyclicSortQuestions.missingNumber(array8);
        System.out.println(Arrays.toString(array8)+" Missing num : "+missingNumber3);
        
        System.out.println("------------------------------");

    }
}

class CyclicSortQuestions
{
    //-------------------------------------------------------------------------
    // Leetcode 268 :https://leetcode.com/problems/missing-number/description/
    // Given an array nums containing n distinct numbers in the range [0, n], 
    // return the only number in the range that is missing from the array.
    //
    //Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
    //-------------------------------------------------------------------------
    public static int missingNumber(int[] nums) {

        int nbNums = nums.length;

        int i=0;
        
        while(i < nbNums)
        {
            if(nums[i] < nbNums && nums[i] != nums[nums[i]])
            {
                swap(nums, i, nums[i]);
            }
            else 
                ++i;
        }

        for( int j = 0; j<nbNums; ++j)
        {
            if(nums[j] != j)
                return j;
        }
        return nbNums;

        // Tried binary search, but fails if 0 is missing
        // int ans = nbNums;
        // int s = 0; 
        // int e = nbNums - 1;
        // while(s <= e)
        // {
        //     int mid = (s + e)/2;
        //     if(nums[mid] != mid)
        //     {
        //         ans = mid;
        //         e = mid-1;
        //     }
        //     else
        //     {
        //         s = mid+1;
        //     }
        // }
        //return ans;
    }

    //-------------------------------------------------------------------------
    // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    // Leetcode 448. Find All Numbers Disappeared in an Array
    // Given an array nums of n integers where nums[i] is in the range [1, n], 
    // return an array of all the integers in the range [1, n] that do not appear in nums.
    // Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
    //-------------------------------------------------------------------------
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        int nbNums = nums.length;

        // Sort the array
        int i = 0;
        while(i < nbNums)
        {
            // if(nums[i] != nums[nums[i]-1])
            // {
            //     swap(nums, i, nums[i]-1);
            // }
            // else{
            //     ++i;
            // }
            int correct  = nums[i] - 1;
            if(nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else
            {
                ++i;
            }
        }
        System.out.println(Arrays.toString(nums));

        /// Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for(int j=0; j<nbNums; ++j)
        {
            if(nums[j] != j+1)
            {
                ans.add(j+1);
            }
        }

        return ans;
    }
    static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}