import java.util.*;
public class Sorting{

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
        // Bubble sort cases
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


        // Selection sort cases
        int[] array={5,4,3,2,1};
        SelectionSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2={1,2,3,4,5,6};
        SelectionSort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3={-3, 5, -6, 2, 0, -1, 10};
        SelectionSort(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4={5};
        SelectionSort(array4);
        System.out.println(Arrays.toString(array4));

        int[] array5={};
        SelectionSort(array5);
        System.out.println(Arrays.toString(array5));

    }
}