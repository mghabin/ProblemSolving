class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        int i;
        for(i = 0 ; i < nums1.length ; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }
            else{
                map.put(nums1[i], 1);
            }
        }
        
        for(i = 0 ; i < nums2.length ; i++){
            if(map.containsKey(nums2[i])){
                list.add(nums2[i]);
                if(map.get(nums2[i]) > 1){
                    map.put(nums2[i], map.get(nums2[i])-1);
                }
                else{
                    map.remove(nums2[i]);
                }
            }
        }
        
        int[] ret = new int[list.size()];
        for (i = 0 ; i < ret.length ; i++)
        {
            ret[i] = list.get(i).intValue();
        }
        return ret;
    }
}