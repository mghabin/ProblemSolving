public class Solution {
    public int RemoveDuplicates(int[] nums) {
        // Two Pointers
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        int i = 0, j = 1, n = nums.Length;
        if(n == 1)
        {
            return n;
        }

        while(j < n)
        {
            if(nums[i] == nums[j])
            {
                j++;
            }
            else
            {
                nums[++i] = nums[j++];
            }
        }

        return i+1;
    }
}