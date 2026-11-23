// LeetCode 121 - Best Time to Buy and Sell Stock
// Approach: Keep track of the lowest price seen and the best profit so far.

class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = prices[0];
        int bestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
            } else {
                int profit = prices[i] - lowestPrice;
                if (profit > bestProfit) {
                    bestProfit = profit;
                }
            }
        }

        return bestProfit;
    }
}

// Time Complexity: O(n) - prices are checked once.
// Space Complexity: O(1) - only two main variables are maintained.
