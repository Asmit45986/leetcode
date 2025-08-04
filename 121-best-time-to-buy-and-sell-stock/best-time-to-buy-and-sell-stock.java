class Solution{

    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int a = prices[i] - buyprice;
                profit = Math.max(profit, a);
            } else {
                buyprice = prices[i];
            }

        }

        return profit;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] prices = {2, 1, 2, 10};
        int result = obj.maxProfit(prices);
        System.out.println(result);

    }
}
