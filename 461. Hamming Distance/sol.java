class Solution {
    public int hammingDistance(int x, int y) {
        // Do xor operation to keep the difference digits as '1' bits, 
        // then count it using Brian Kernighan Algorithm.
        // Time Complexity: O(m) where m is the number of '1' bits in n.
        // Space Complexity: O(1).
        
        int z = x^y;
        int count = 0;
        while(z != 0){
            z &= (z-1);
            count++;
        }
        
        return count;
    }
}