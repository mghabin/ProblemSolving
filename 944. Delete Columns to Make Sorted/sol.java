class Solution {
    public int minDeletionSize(String[] strs) {
        // Iterative approach.
        // Time Complexity: O(n*k) where k is characters and n strings.
        // Space Complexity: O(1).
        
        int count = 0;
        for(int column = 0 ; column < strs[0].length() ; column++){
            for(int row = 0 ; row < strs.length - 1 ; row++){
                if(strs[row].charAt(column) > strs[row+1].charAt(column)){
                    count++;
                    break;
                }
            }
        }

        return count;
        
    }
}