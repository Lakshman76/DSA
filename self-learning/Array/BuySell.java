public class BuySell {
    
    public static int bestPrice(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0; // overall profit

        for (int i = 0; i < prices.length; i++) {
            int profit = 0; // today profit

            if (buyPrice < prices[i]) {
                profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(bestPrice(prices));
    }
}