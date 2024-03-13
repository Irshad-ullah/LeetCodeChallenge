class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices.length;
        int sell = 0;
        int min = prices[0];
        int difference = 0;

            for (int i = 0; i < prices.length; i++){
                if (prices[i] < min){
                    min = prices[i];
                    buy  = i + 1;
                }
                if (prices[i]-min > difference){
                    difference = prices[i] - min;
                }
            }
        return difference;
    }
}