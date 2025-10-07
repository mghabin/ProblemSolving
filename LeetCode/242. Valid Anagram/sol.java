class Solution {
    public boolean isAnagram(String s, String t) {
        // Approch 1: sort strings then compare them
        // Time Complexity: O(nlogn)
        
        if(s.length() != t.length())
            return false;
        
        char[] str1 = sortString(s);
        char[] str2 = sortString(t);
        
        for(int i = 0 ; i < str1.length ; i++)
            if(str1[i] != str2[i])
                return false;
        
        return true;
    }
    
    public char[] sortString(String input){
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return arr;
    }
}


class Solution {
    // it is assumed that the characters are stored using 8 bit and there can be 256 possible characters. 
    static int NO_OF_CHARS = 256;
    
    public boolean isAnagram(String s, String t) {
        // Approch 2: Count chars in each string and add them to count array
        // Time Complexity: O(n)
        
        if(s.length() != t.length())
            return false;
        
        int[] count = new int[NO_OF_CHARS];
        for(int i = 0 ; i < s.length() ; i++){
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        
        for(int i = 0 ; i < NO_OF_CHARS ; i++)
            if(count[i] != 0)
                return false;
        
        return true;
    }
}