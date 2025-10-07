public class Solution {
    public int HIndex(int[] citations) {
        // Time Complexity: O(nlogn).
        // Space Complexity: O(n).
        int[] arr = QuickSort(citations);
        int hIndex = 0;
        for(int i = arr.Length-1 ; i >=0 ; i--)
        {
            if(hIndex+1 <= arr[i])
                hIndex += 1;
            else
                break;
        }
        return hIndex;
        
    }

    public int[] QuickSort(int[] array)
    {
        if(array.Length < 2)
        {
            return array;
        }
        
        // Select the middle element as the pivot
        int pivotIndex = array.Length / 2;
        int pivot = array[pivotIndex];
        int[] left = array.Where(x => x < pivot).ToArray();
        int[] middle = array.Where(x => x == pivot).ToArray();
        int[] right = array.Where(x => x > pivot).ToArray();

        left = QuickSort(left);
        right = QuickSort(right);

        return left.Concat(middle).Concat(right).ToArray();
    }
}