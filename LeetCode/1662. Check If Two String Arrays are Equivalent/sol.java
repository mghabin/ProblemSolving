class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // Two pointer approach
        // Time Complexity: O(N * K) where N is the number of strings in the list and K is the maximum length of a string in it.
        // Space Complexity: O(1).
        
        int word1Pointer = 0, string1Pointer = 0;
        int word2Pointer = 0, string2Pointer = 0;
        
        while(word1Pointer < word1.length && word2Pointer < word2.length){
            if(word1[word1Pointer].charAt(string1Pointer++) != word2[word2Pointer].charAt(string2Pointer++)){
                return false;
            }
               
            
            if(string1Pointer == word1[word1Pointer].length()){
                word1Pointer++;
                string1Pointer = 0;
            }
            
            if(string2Pointer == word2[word2Pointer].length()){
                word2Pointer++;
                string2Pointer = 0;
            }
            
        }
        
        return word1Pointer == word1.length && word2Pointer == word2.length;
    }
}