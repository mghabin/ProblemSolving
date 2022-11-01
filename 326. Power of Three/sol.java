class Solution {
    public boolean isPowerOfThree(int n) {
        // Loop Iteration
        // Time Complexity: O(log⁡3 n).
        // Space Complexity: O(1).
        /*
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
        
        */
        
        // Integer Limitation Approach.
        // Time Complexity: O(1).
        // Space Complexity: O(1).
        
        /*
        * The max integer is: Integer.MAX_VALUE = 2147483647.
        * 3 ⌊log3 MaxInt⌋ = 3 ⌊19.56⌋ =3 ^ 19 = 1162261467.
        * Therefore, the possible values of n where we should return true are  
        * 3 ^ 0, 3 ^ 1 ...  3 ^ 19. Since 3 is a prime number, the only divisors 
        * of 3 ^ 19 are 3 ^ 0, 3 ^ 1 ... 3 ^ 19, therefore all we need to do 
        * is divide 3 ^ 19 by n. A remainder of 0 means n is a divisor of 
        * 3 ^ 19 and therefore a power of three.
        */
        return n > 0 && 1162261467 % n == 0;
    }
}