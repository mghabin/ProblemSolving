class Solution {
    public int rob(int[] nums) {
        // Dynamic Programming
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        int n = nums.length;
        
        if(n == 1)
            return nums[0];
        
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2 ; i < n ; i++){
            dp[i] = Math.max(nums[i] + dp[i-2], dp[i-1]);
        }
        
        return dp[n-1];
        */
        
        // Dynamic Programming modified
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int dp2 = 0;
        int dp1 = 0;
        int tmp;
        for (int num :nums) {
            tmp = dp1;
            dp1 = Math.max(dp2 + num, dp1);
            dp2 = tmp;
        }
        
        return dp1;  
        
    }
}