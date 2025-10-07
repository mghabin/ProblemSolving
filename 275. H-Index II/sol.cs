public class Solution {
    public int HIndex(int[] citations) {
        // Using Binary Search
        // Time Complexity: O(logn).
        // Space Complexity: O(1).

        int n = citations.Length;
        int left = 0, right = n - 1, hIndex = 0;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(citations[mid] >= n-mid)
            {
                hIndex = n-mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }

        return hIndex;
    }
}