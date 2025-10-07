class Solution {
    public boolean wordPattern(String pattern, String s) {
        // Using HashMap.
        // Time Complexity: O(n) where n is the number of words in string s.
        // Space Complexity: O(n) where n is the number of entries.
        
        String[] words = s.split(" ");
        if(pattern.length() != words.length)
            return false;
        
        HashMap<Character,String> map = new HashMap<>();

        for(int i = 0 ; i < words.length ; i++){
            String word = words[i];
            Character ch = pattern.charAt(i);
            if((map.containsKey(ch) && !map.get(ch).equals(word)) || 
               (!map.containsKey(ch) && map.containsValue(word))){
               return false;
            }
            map.put(ch, word);
        }

        return true;
    }
}