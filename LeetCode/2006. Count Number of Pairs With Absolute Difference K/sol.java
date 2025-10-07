class Solution {
    public int countKDifference(int[] nums, int k) {
        // Brute force approach.
        // Time Complexity: O(n^2).
        // Space Complexity: O(1).
        /*
        int res = 0;
        
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(Math.abs(nums[i] - nums[j]) == k){
                    res++;
                }       
            }
        }
        
        return res;
        */
        
        // Using hashmap approach.
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
			count += map.getOrDefault(i - k, 0) + map.getOrDefault(i + k, 0);
        }
        
        return count;
        
    }
}