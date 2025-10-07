class Solution {
    public int removeElement(int[] nums, int val) {
        // Two pointer approach.
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        
        int i = 0;
        int n = nums.length;
        
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        
        return n;
    }
}