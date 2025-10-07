class Solution {
    public int romanToInt(String s) {
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>(){
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };
        
        int count = 0;
        for(int i = 0 ; i < n-1 ; i++){
            int x = map.get(s.charAt(i));
            int y = map.get(s.charAt(i+1));
            
            if(x >= y)
                count += x;
            else
                count -= x;
        }
        
        return count + map.get(s.charAt(n-1));
    }
}