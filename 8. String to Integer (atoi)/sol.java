// wrong solution because there is a case (+-42) --> this sol will return (-42) but they expect to return 0
// the correct solution is below
class Solution {
    public int myAtoi(String s) {
        char sign = '+';
        int i, number = 0;
        boolean flag = true;
        for(i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            
            if(s.charAt(i) == '-' || s.charAt(i) == '+'){
                sign = s.charAt(i);
                continue;
            }
            
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            
            if((number > Integer.MAX_VALUE/10) || 
               (number == Integer.MAX_VALUE/10 && Character.getNumericValue(s.charAt(i)) > 7))
                return Integer.MAX_VALUE;
            
            if((number < Integer.MIN_VALUE/10) || 
               (number == Integer.MIN_VALUE/10 && Character.getNumericValue(s.charAt(i)) < -8))
                return Integer.MIN_VALUE;
            
            
            if(sign == '-'){
                number = number * 10 - Character.getNumericValue(s.charAt(i));
            }
            else{
                number = number * 10 + Character.getNumericValue(s.charAt(i));
            }
            
        }
        return number;
    }
}


// correct solution here
class Solution {
    public int myAtoi(String s) {
        char sign = '+';
        int i = 0, number = 0, n = s.length();
        
        while (i < n && s.charAt(i) == ' '){
            i++;
        }
        
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')){
            sign = s.charAt(i);
            i++;
        }
        
        while(i < n && Character.isDigit(s.charAt(i))){
            int value = Character.getNumericValue(s.charAt(i));
            if((number > Integer.MAX_VALUE/10) || 
               (number == Integer.MAX_VALUE/10 && value > 7))
                return sign == '+' ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            
            number = number * 10 + value;
            i++;
        }
        
        return sign == '+' ? number : number*-1;
    }
}