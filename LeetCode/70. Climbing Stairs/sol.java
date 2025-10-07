class Solution {
    public int climbStairs(int n) {
        // Dynamic Programming approach
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int previous1 = 1, previous2 = 1;
        
        for(int i = 2 ; i <= n ; i++){
            int current = previous1 + previous2;
            previous2 = previous1;
            previous1 = current;
        }
        
        return previous1;
    }
}