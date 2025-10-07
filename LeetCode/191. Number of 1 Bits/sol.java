public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // Time Complexity: O(m) where m the number of last most significant '1' bit.
        // Space Complexity: O(1).
        /*
        long x = n;
        if(x < 0)
            x = (long)(Math.pow(2,32)) + x;
        
        int count = 0;
        while(x != 0){
            count += x%2;
            x /= 2;
        }
        
        return count;
        */
        
        
        // Using Brian Kernighan Algorithm.
        // Time Complexity: O(m) where m is the number of '1' bits in n.
        // Space Complexity: O(1).
        
        int count = 0;
        while(n != 0){
            n &= (n-1);
            count++;
        }
        
        return count;
    }
}