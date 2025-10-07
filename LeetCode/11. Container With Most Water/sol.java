class Solution {
    public int maxArea(int[] height) {
        // Brute force approach.
        // Time Complexity: O(n^2).
        // Space Complexity: O(1).
        /*
        int max = 0;
        int n = height.length;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int amount = (j-i) * Math.min(height[i], height[j]);
                if(amount > max)
                    max = amount;
            }
        }
        
        return max;
        */
        
        // Two pointer approach.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int max = 0;
        int n = height.length;
        int left = 0, right = n - 1;
        
        while(left != right){
            int amount = (right-left) * Math.min(height[left], height[right]);
            if(amount > max)
                max = amount;
            
            if(height[left] > height[right])
                right--;
            else
                left++;
            
        }
        
        return max;
        
    }
}