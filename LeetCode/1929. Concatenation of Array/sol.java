class Solution {
    public int[] getConcatenation(int[] nums) {
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        
        int n = nums.length;
        int[] ans = new int[2*n];
        
        for(int i = 0 ; i < n ; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        
        return ans;
    }
}