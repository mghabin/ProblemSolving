public class Solution {
    public int MaxProfit(int[] prices) {
        // Sell a stock immediately when you find larger value.
        // Time Complexity: O(n).
        // Space Complexity: O(1).

        int min = prices[0], maxProfit = 0;
        for(int i = 1 ; i < prices.Length ; i++)
        {
            if(prices[i] < min)
            {
                min = prices[i];
            }
            else
            {
                maxProfit += prices[i]- min;
                min = prices[i];
            }
        }

        return maxProfit;
    }
}