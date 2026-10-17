class Solution {
    public int maxProfit(int[] prices) {
    int max = 0;
    int l = 0;
    int r = prices.length - 1;

    while (l < r){
    
    if( (prices[r] - prices[l]) > max){
        max = prices[r] - prices[l];
    } else if ((prices[r] - prices[l]) < max && prices[l] > prices[r]){
        l++;
    } else if ((prices[r] - prices[l]) < max && prices[l] < prices[r]){
        r--;
    } 
    r--;
    }

    return max;

    }
}
