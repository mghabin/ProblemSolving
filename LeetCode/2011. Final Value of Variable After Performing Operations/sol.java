class Solution {
    public int finalValueAfterOperations(String[] operations) {
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int x = 0;
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("X++") || operations[i].equals("++X"))
                x++;
            else if(operations[i].equals("X--") || operations[i].equals("--X"))
                x--;
        }
        
        return x;
    }
}