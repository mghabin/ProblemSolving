class Solution {
    public int missingNumber(int[] nums) {
        // Use Hashset
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        /*
        Set<Integer> hash = new HashSet<>();
        int length = nums.length;
        
        for(int i = 0 ; i < length ; i++){
            hash.add(nums[i]);
        }
        
        for(int i = 0 ; i < length ; i++){
            if(!hash.contains(i))
                return i;
        }
        
        return length;
        */
        
        // Use summation of series since each element is unique
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int length = nums.length;
        int sum = length;
        
        for(int i = 0 ; i < length ; i++){
            sum += i - nums[i];
        }
        
        return sum
    }
}