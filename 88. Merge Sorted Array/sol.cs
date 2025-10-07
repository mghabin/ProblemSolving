public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        // Two pointer approach
        // Time Complexity: O(m+n).
        // Space Complexity: O(1).
        /*
        int index = m + n - 1;
        int current;
        m--;n--;
        while(n >= 0 || m >= 0){
            if(m < 0)
                current = nums2[n--];
            else if(n < 0)
                current = nums1[m--];
            else if(nums1[m] < nums2[n])
                current = nums2[n--];
            else
                current = nums1[m--];
            
            nums1[index--] = current;
        }
        */

        // Reverse Approach
        // Time Complexity: O(m+n).
        // Space Complexity: O(1).
        
        int index = m + n - 1;
        m--;n--;
        while(n >= 0){
            while(m >= 0 && nums1[m] >= nums2[n]){
                nums1[index--] = nums1[m--];
            }
            nums1[index--] = nums2[n--];
        }
    }
}