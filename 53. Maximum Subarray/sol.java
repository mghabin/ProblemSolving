class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        /*
        int maxSum = Integer.MIN_VALUE, sum = 0;
        int start = 0, end = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            
            if(sum > maxSum){
                maxSum = sum;
                end = i;
            }
            
            if(sum < 0){
                sum = 0;
                start = i+1;
            }
            
        }
        
        return maxSum;
        */
        
        
        // Dynamic Programming Approach
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        int n = nums.length;
        int[] sum = new int[n];
        int[] opt = new int[n];
        
        sum[0] = nums[0];
        opt[0] = nums[0];
        
        for (int i = 1; i < n; ++i) {
            sum[i] = Math.max(sum[i - 1] + nums[i], nums[i]);
            opt[i] = Math.max(opt[i - 1], sum[i]);
        }
        
        return opt[n - 1];
        */
        
        
        // Dynamic Programming Approach (optimize space)
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int n = nums.length;
        int sum = nums[0];
        int opt = nums[0];
        for (int i = 1; i < n; ++i) {
            sum = Math.max(sum + nums[i], nums[i]);
            opt = Math.max(opt, sum);
        }
        
        return opt;
    }
}