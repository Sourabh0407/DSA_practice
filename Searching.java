class BinarySearchQuestions
{
    //-------------------------------------------------------------------------
    //  Find the ceiling number from sorted array.
    // 
    // @param array : Sorted array
    // @param target : target to find from array
    // @param isAssending : Sorting order (true->Assending, false->Descending)
    // @return int : Ceiling number from array
    //-------------------------------------------------------------------------
    static public int FindCeilingNumber(final int[]  array, final int target, final boolean isAssending)
    {
        if(array == null)
            return -1;

        int n = array.length;

        int start = 0;
        int end = n - 1;
        if(isAssending)
        {
            while(start <= end)
            {
                int mid = start + (end - start) / 2;

                if(array[mid] == target)
                {
                    return array[mid];
                }
                else if(array[mid] > target)
                {
                    end = mid - 1;
                }
                else if(array[mid] < target)
                {
                    start = mid + 1;
                }
            }

            return array[end];
        }
        else 
        {
            while(start <= end)
            {
                int mid = start + (end - start) / 2;

                if(array[mid] == target)
                {
                    return array[mid];
                }
                else if(array[mid] > target)
                {
                    start = mid + 1;
                }
                else if(array[mid] < target)
                {
                    
                    end = mid - 1;
                }
            }
            
            // System.out.println("start :"+start);
            // System.out.println("mid :"+array[mid%n]);
            // System.out.println("end :"+array[end%n]);
            return array[start];
        }
    }
}

public class Searching 
{

    // Linear Search Algorithm...
    // This function searches and returns the index of targetElement if present in array.
    // @returns int  : index :if target founds
    //                  -1 : if target not found
    static int linearSearch(final int[] array, final int targetElement)
    {
        int arrayLength = array.length;
        if(arrayLength == 0)
            return -1;

        for(int index = 0; index < arrayLength; ++index)
        {
            if(array[index] == targetElement)
                return index;
        }

        // In case element not present in array
        return -1;
        
    }

    // Linear Search Algorithm...   for 2D array
    static int[] linearSearch(int[][] array, final int targetElement)
    {
        int arrayRows = array.length;
        if(arrayRows == 0)
            return new int[]{-1,-1};

        for(int iRow = 0; iRow < arrayRows; ++iRow)
        {
            for(int iCol = 0; iCol < array[iRow].length; ++iCol)
            {
                if(array[iRow][iCol] == targetElement)
                {
                    return new int[]{iRow, iCol};
                }
            }
        }


        return new int[]{-1,-1};
    }

    // Binary Search Algorithm...
    // This function searches and returns the index of targetElement if present in array.
    // @returns int  : index :if target founds
    //                  -1 : if target not found
    // Array is assending order
    static public int binarySearch(final int[] array, final int target)
    {
        if(array == null || array.length == 0)
            return -1;

        int start = 0;
        int end = array.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(array[mid] == target)
            {
                return mid;
            }
            else if(array[mid] > target)
            {
                end = mid+1;
            }
            else if(array[mid] < target)
            {
                start = mid+1;
            }
        }
        return -1;
    }


    // Binary Search Algorithm...
    // This function searches and returns the index of targetElement if present in array.
    // @returns int : index of target element
    //                    -1 if target not found
    // Here we dont know array is sorted in wich order
    static public int binarySearchUnknownOrder(final int[] array, final int target)
    {
        if(array == null || array.length == 0)
            return -1;
        
        boolean isAssending = false;
        if(array[0] < array[array.length-1])
            isAssending = true;

        int start = 0;
        int end = array.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(array[mid] == target)
                return mid;

            if(isAssending)
            {
                if(array[mid] < target)
                {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(array[mid] < target)
                {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }


    static public int findCeilingNumberOfTarget(final int[] array, final int target)
    {
        if(array == null)
            return -1;

        int n = array.length;
        int ans = -1;

        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex <= endIndex)
         {
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if(array[midIndex] == target)
            {
                ans = array[midIndex];
                break;
            }

            else if(array[midIndex] > target)
            {
               ans = array[midIndex];
               endIndex = midIndex - 1;
            }
            else 
            {
                startIndex = midIndex + 1;
            }
         }
         return ans;
    }

    public static void main(String[] args)
    {
        // 1D linear search
        // int[] array = {1,2,3,4,5,6,7,8,9};
        // System.out.println(linearSearch(array, 9));


        // int[][] array2D = {
        //     {1,2,3,4,5},
        //     {7,8,9},
        //     {256},
        //     {92,89,72,63,58,45,33}
        // };
        // int[] elementIndex = linearSearch(array2D, 89);
        // System.out.println(elementIndex[0] + "," + elementIndex[1]);


        // System.out.println(binarySearch(array, 9));
        

        // int[] array2 = {92,89,72,63,58,45,33};
        // System.out.println(binarySearchUnknownOrder(array2, 92));

        int[] array = {2,3,5,6,9,14,16,19};
        System.out.println(findCeilingNumberOfTarget(array, 15));
        System.out.println(findCeilingNumberOfTarget(array, 5));
        System.out.println(findCeilingNumberOfTarget(array, 4));


        System.out.println(BinarySearchQuestions.FindCeilingNumber(array, 15, true));

        int[] array2 = {23,17,15,13,9,5,4,1};
        System.out.println(BinarySearchQuestions.FindCeilingNumber(array, 15, false));
    }
}

