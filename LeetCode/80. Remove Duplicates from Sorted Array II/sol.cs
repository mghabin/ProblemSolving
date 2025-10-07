public class Solution {
    public int RemoveDuplicates(int[] nums) {
        // Two Pointers
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        if(nums.Length == 1)
        {
            return nums.Length;
        }
        
        int i = 2;
        for(int j = 2 ; j < nums.Length ; j++)
        {
            if(nums[j] != nums[i-2])
            {
                nums[i++] = nums[j];
            }
        }

        return i;
    }
}