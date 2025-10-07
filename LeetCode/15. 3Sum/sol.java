class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Time Complexity: O(n^2).
        // Space Complexity: O(1).
        
        Set<List<Integer>> hashSet = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(hashSet);
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i < nums.length - 2 ; i++){
            
            int j = i+1, k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    hashSet.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } 
                else if(sum > 0) k--;
                else if(sum < 0) j++;
            }
        }
        
        return new ArrayList<>(hashSet);
    }
}