public class Solution {
    public bool CanJump(int[] nums) {
        // 2 3 1 0 4
        // 1 2 3 0 1
        // 1 1 0 3 1
        // 0
        // 0 1 2
        // 1 0 2
        // 1 1
        
        // 2 3 1 0 4 1
        // 2
        //   4
        //     4
        //.      4
        //.        8
        // max(nums[i] + i, maxReach) maxReach>= n, maxReach<=i -> false

        // Greedy
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        int n = nums.Length;
        int maxReach = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(maxReach >= n-1)
                return true;
            
            maxReach = Math.Max(maxReach, nums[i]+i);

            if(maxReach <= i)
            {
                return false;
            }
        }

        return false;
     }
}