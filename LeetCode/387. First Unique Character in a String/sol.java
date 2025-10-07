class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int i;
        for(i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0) + 1);
        }
        
        for(i = 0 ; i < s.length() ; i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}