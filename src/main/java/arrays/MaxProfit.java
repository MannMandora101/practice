package arrays;

class MaxProfit {
    public int maxProfit(int[] prices) {
        int minsoFar = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minsoFar = Math.min(minsoFar, prices[i]);
            int profit = prices[i] - minsoFar;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String args[]) {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}