class Solution {
    public String intToRoman(int num) {
        // Time Complexity:
        // It is O(n) for very big number n you would need n/1000. O(n/1000) = O(n). 
        // Also mind that this should be considered exponential, as n can be encoded
        // by O(log n) bits. For a finite set of inputs it would obviously be O(1).
        // Space Complexity: O(1).
        
        String[] numerals = new String[] {
            "M", "CM", "D", "CD", "C", "XC", 
            "L", "XL", "X", "IX", "V", "IV", "I" };
        
        int[] values = new int[] {
            1000, 900, 500, 400, 100, 
            90, 50, 40, 10, 9, 5, 4, 1 };
        
        String result = "";
        
        int i = 0;
        while(num > 0){
            if(num - values[i] >= 0){
                result += numerals[i];
                num -= values[i];
            }
            else{
                i++;
            }
        }
        
        return result;
    }
}