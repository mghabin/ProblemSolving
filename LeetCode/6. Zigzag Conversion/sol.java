class Solution {
    public String convert(String s, int numRows) {
        // Visit each character once and add it.
        // Time Complexity: O(n) where n is the length of string.
        // Space Complexity: O(1).

        if (numRows == 1) return s;

        StringBuilder ret = new StringBuilder();
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        
        return ret.toString();
    }
}