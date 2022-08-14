class Solution {
    public void reverseString(char[] s) {
        int i, n = s.length;
        char tmp;
        for(i = 0 ; i < n/2 ; i++){
            tmp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = tmp;
        }
    }
}