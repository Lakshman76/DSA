// Question link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// solution - 

class Solution {
    public int maxProfit(int[] prices) {

        // 1st approach
        // int maxm = 0;
        // for(int i=0; i<prices.length-1; i++){
        //     for(int j=i+1; j<prices.length; j++){
        //         maxm = Math.max(maxm, prices[j]-prices[i]);
        //     }
        // }
        // return maxm;

        // 2nd approach

        // int min = prices[0];
        // int result = 0;
        // for(int i=1; i<prices.length; i++){
        //     result = Math.max(result, prices[i]-min);
        //     min = Math.min(min, prices[i]);
        // }
        // return result;

        // 3rd approach 
        
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}