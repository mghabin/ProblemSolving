class Solution {
    public boolean isPalindrome(int x) {
        // Reverse number until half and compare it with original.
        // Time Complexity: O(log10(n)).
        // Space Complexity: O(1).
        
        if(x < 0 || (x % 10 == 0 && x != 0))
            return false;
        
        int reversed = 0;
        
        while(x > reversed){
            reversed = reversed*10 + x%10;
            x /= 10;
        }
        
        return x == reversed || x == reversed/10;
    }
}