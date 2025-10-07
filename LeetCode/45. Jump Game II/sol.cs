public class Solution {
    public int Jump(int[] nums) {
        // 2 3 1 1 4
        // 2 3 0 1 4
        // 2 1 2 1 0 4
        // 1 0 1
        // 0
        // 1 0

        // 2 3 1 1 4 1
        // 2
        //   4 3
        //       4 8 6

        // Greedy with Sliding window
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        int n = nums.Length;
        int jumpCount = 0, right = 0, left = 0, maxReach = 0;
        while(right < n-1)
        {
            for(int i = left; i <= right ; i++)
            {
                maxReach = Math.Max(maxReach, nums[i]+i);
            }
            left = right+1;
            right = maxReach;
            jumpCount += 1;
        }

        return jumpCount;
    }
}