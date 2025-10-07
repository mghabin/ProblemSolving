class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window approach
        // Time Complexity: O(n).
        // Space Complexity: O(min(length of charset, length of string)) .
        
        int start = 0;
        int length = s.length();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int end = 0 ; end < length ; end++){
            char c = s.charAt(end);
            if(map.containsKey(c)){
                start = Math.max(map.get(c), start);
            }
            
            map.put(c, end + 1);
            count = Math.max((end - start + 1), count);
        }
        
        return count;
    }
}