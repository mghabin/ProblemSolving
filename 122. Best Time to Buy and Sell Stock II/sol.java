class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int peak = 0;
        int valley = 0;
        int maxProfit = 0;
        while(i < prices.length - 1){
            
            while((i < prices.length - 1) && (prices[i] >= prices[i+1])){
                i++;
            }
            
            valley = prices[i];
            
            while((i < prices.length - 1) && (prices[i] <= prices[i+1])){
                i++;
            }
            
            peak = prices[i];
            
            maxProfit += peak - valley;
        }
        
        return maxProfit;
    }
}


class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}

