// LeetCode 1672 - Richest Customer Wealth
// Approach: Find the total money in each customer's account row.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int richest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int total = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }

            if (total > richest) {
                richest = total;
            }
        }

        return richest;
    }
}

// Time Complexity: O(m * n) - m rows and n columns are checked.
// Space Complexity: O(1) - only a few variables are used.
