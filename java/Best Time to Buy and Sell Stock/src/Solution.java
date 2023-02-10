public class Solution {

    public int maxProfit(int[] prices) {

        int indexLeft = 0;
        int indexRight = 1;
        int profit = 0;
        int maxProfit = 0;

        while (indexRight < prices.length) {
            if (prices[indexLeft] > prices[indexRight]) {
                indexLeft = indexRight;
                maxProfit = 0;
            } else {
                maxProfit = prices[indexRight] - prices[indexLeft];
                if (maxProfit > profit)
                    profit = maxProfit;
            }
            indexRight++;
        }
        return profit;
    }

    public static void main(String[] args) throws Exception {

        Solution sln = new Solution();
        int[] prices = { 2,4,1 }; // 2,4,1 //2,1,2,1,0,1,2
        System.out.println(sln.maxProfit(prices));
    }
}
