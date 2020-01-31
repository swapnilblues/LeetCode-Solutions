class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0, min, max;
        if (prices.length == 0) {
            return 0;
        }

        for (int i = 0; i < prices.length - 1; i++) {
            min = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                max = prices[j];
                if (profit < (max - min)) {
                    profit = max - min;
                }
            }
        }

        return profit;
    }
}