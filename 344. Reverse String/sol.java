class Solution {
    public void reverseString(char[] s) {
        // Two pointer approach.
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        /*
        int i, n = s.length;
        char tmp;
        for(i = 0 ; i < n/2 ; i++){
            tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
        */
        
        // Recursive approach.
        // Time Complexity: O(n).
        // Space Complexity: O(n).
        
        reverseHelper(0, s);
    }
    
    public void reverseHelper(int index, char[] s){
        if(s == null || index >= s.length/2){
            return;
        }
        
        char tmp = s[index];
        s[index] = s[s.length-1-index];
        s[s.length-1-index] = tmp;
        
        reverseHelper(index+1, s);
    }
}