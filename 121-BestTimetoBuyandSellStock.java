class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0;
        for(int i = 1; i < prices.length; i++){
            int p = prices[i] - buy;
            if(p < 0)
                buy = prices[i];
            else 
                profit = Math.max(profit,p);
        }
        return profit;
    }
}
