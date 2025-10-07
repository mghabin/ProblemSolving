class Solution {
    public int[] buildArray(int[] nums) {
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        
        int[] ans = new int[nums.length];
        
        for(int i = 0 ; i < ans.length ; i++){
            ans[i] = nums[nums[i]];
        }
        
        return ans;
    }
}