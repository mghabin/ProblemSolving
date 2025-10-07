class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        int i;
        for (i = 0 ; i < nums.length ; i++){
            int key = target - nums[i];
            if(hash.containsKey(key)){
                arr[0] = hash.get(key); 
                arr[1] = i;
                return arr;
            }
            hash.put(nums[i], i);
        }
        return arr;
    }
}