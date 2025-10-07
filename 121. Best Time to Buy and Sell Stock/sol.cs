public class Solution {
    public int MaxProfit(int[] prices) {
        // Memorization of maxProfit.
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        if(prices.Length < 2)
        {
            return 0;
        }
        
        int minItem = prices[0], maxProfit = 0;
        for(int i = 1 ; i < prices.Length ; i++)
        {
            if(prices[i] < minItem)
            {
                minItem = prices[i];
            }
            else if((prices[i] - minItem) > maxProfit)
            {
                maxProfit = prices[i] - minItem;
            }
        }

        return maxProfit;
    }
}