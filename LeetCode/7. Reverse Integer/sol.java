class Solution {
    public int reverse(int x) {
		
		// Hacky way because the long type is used here
		/*
        long result = 0;
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        
        while(x > 0){
            result *= 10;
            result += x%10;
            x /= 10;
        }
        if(result > Integer.MAX_VALUE)
            return 0;
        
        return (int) (isNegative ? -result : result);
		*/
		
		
		// Correct way
		
		int pop, result = 0;
        while(x != 0){
            pop = x%10;
            x /= 10;
            /*
            maximum value for 32-bit is 2147483647 so when rev== INT_MAX/10 i.e rev= 214748364 and in case pop is 8 next rev value will be 2147483648 (as rev *10+ pop) which will overflow,
			same is the case for INT_MIN as minimum value for 32-bit is -2147483648 i.e pop can't be less -8
            */
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result*10 + pop;
        }
        return result;
    }
}