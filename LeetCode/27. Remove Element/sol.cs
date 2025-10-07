public class Solution {
    public int RemoveElement(int[] nums, int val) {
        // Two pointer approach.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int i = 0;
        int n = nums.Length - 1;
        
        while (i <= n) {
            if (nums[i] == val) {
                nums[i] = nums[n--];
            } else {
                i++;
            }
        }
        
        return n + 1;
    }
}