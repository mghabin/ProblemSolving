class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Time Complexity: O(log (m+n)).
        // Space Complexity: O(1).
        
        int m = nums1.length;
        int n = nums2.length;
        int half = (m + n)/2;
        
        int median1 = 0, median2 = 0;
        
        int i = 0, j = 0;
        for(int k = 0 ; k <= half ; k++){
            median1 = median2;
            
            if(i == m){
                median2 = nums2[j];
                j++;
            }
            else if(j == n){
                median2 = nums1[i];
                i++;
            }  
            else if(nums1[i] < nums2[j]){
                median2 = nums1[i];
                i++;
            }
            else{
                median2 = nums2[j];
                j++;
            }
            
        }
        
        if((m + n) % 2 != 0)
            return median2;
        
        return (median1 + median2) / 2.0;
    }
}