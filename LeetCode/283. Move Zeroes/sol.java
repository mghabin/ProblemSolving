class Solution {
    public void moveZeroes(int[] nums) {
        // Use two pointer approach
        // Time Complexity: O(n).
        // Space Commplexity: O(1).
        
        int i, j = 0;
        int tmp;
        for(i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
    }
}