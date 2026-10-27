class Solution {
    public int maxProfit(int[] prices) {
        int low = 0;
        int maxProfit = 0;

    for(int high = 1; high < prices.length; high++){

    if(prices[low] > prices[high]){
        low++;
    } else {
        maxProfit += prices[high] - prices[low];
        low++;
    }
    }
      
    return maxProfit;
    }
    
}