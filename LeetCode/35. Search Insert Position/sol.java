class Solution {
    public int searchInsert(int[] nums, int target) {
        // Use binary search
        // Time Complexity: O(log n).
        // Space Complexity: O(1).
        
        int end = nums.length-1;
        int start = 0;
        int mid = (start + end) / 2;
        
        if(target < nums[start])
            return start;
        else if(target > nums[end])
            return end+1;
        
        while(start < end){
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid;
            }
            else{
                return mid;
            }
            
            mid = (start + end) / 2;
        }
        
        return mid;
    }
}