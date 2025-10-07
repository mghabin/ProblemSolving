class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Time Complexity = O(n^2) & Space Complexity = O(1).
        /*
        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j])
                    return true;
            }
        }
        return false;
        */
        
        
        // Time Complexity = O(nlogn) & Space Complexity = O(1).
        /*
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
        */
        
        
        // Time Complexity = O(n) & Space Complexity = O(n).
        HashSet<Integer> hash = new HashSet<>();
        for(int i : nums){
            if(hash.contains(i))
                return true;
            else
                hash.add(i);
        }
        return false;
    }
}