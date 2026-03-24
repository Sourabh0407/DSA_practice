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


    public static void main(String[] args)
    {
        int[] array = {8,7,6,5,4,3,2,1};
        Sorting.BubbleSort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {8,-7,6,-5,0,4,-3,2,-1};
        Sorting.BubbleSort(array2);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {8};
        Sorting.BubbleSort(array3);
        System.out.println(Arrays.toString(array3));

        int[] array4 = {};
        Sorting.BubbleSort(array4);
        System.out.println(Arrays.toString(array4));

    }
}