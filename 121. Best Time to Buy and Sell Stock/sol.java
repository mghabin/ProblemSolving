class Solution {
    public int maxProfit(int[] prices) {
        // Time Complexity: O(n).
        // Space Complexity: O(1).
        
        int n = prices.length;
        
        if(n == 0)
            return 0;
        
        int min = prices[0], maxProfit = 0;
        
        for(int i = 1 ; i < n ; i++){
            if(prices[i] < min)
                min = prices[i];
            else if(prices[i] - min > maxProfit)
                maxProfit = prices[i] - min;
        }
        
        return maxProfit;
    }
}