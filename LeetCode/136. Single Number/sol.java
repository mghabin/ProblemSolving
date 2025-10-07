class Solution {
    public int singleNumber(int[] nums) {
        // Time Complexity = O(nlogn) & Space Complexity = O(1).
        /*
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] != nums[i+1])
                return nums[i];
            else
                i++;
        }
        return nums[nums.length-1];
        */
        
        
        // Time Complexity = O(n) & Space Complexity = O(n).
        /*
        Map<Integer, Boolean> map = new HashMap();
        for(int num : nums){
            map.put(num, !map.getOrDefault(num, false));
        }
        
        for(Map.Entry<Integer, Boolean> entry: map.entrySet()){
            if(entry.getValue()){
                return entry.getKey();
            }
        }
        
        return Integer.MIN_VALUE;
        */
        
        
        // Time Complexity = O(n) & Space Complexity = O(1).
        int result = 0;
        for (int number : nums){
            result ^= number;
        }
        return result;

    }
}