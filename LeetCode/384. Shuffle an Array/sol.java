class Solution {
    // Time Comlexity: O(n).
    // Space Complexity: O(n).
    
    private int[] nums;
    private int[] newNums;
    
    public Solution(int[] nums) {
        this.nums = nums;
        this.newNums = nums.clone();
    }
    
    public int[] reset() {
        return this.nums;
    }
    
    public int[] shuffle() {
        for(int i = 0 ; i < this.nums.length ; i++){
            swap(i, generateRandom(0, this.nums.length - 1));
        }
        
        return this.newNums;
    }
    
    private void swap(int i, int j){
        int temp = this.newNums[i];
        this.newNums[i] = newNums[j];
        newNums[j] = temp;
    }
    
    private int generateRandom(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */