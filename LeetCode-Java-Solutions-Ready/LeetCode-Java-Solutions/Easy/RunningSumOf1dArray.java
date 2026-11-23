// LeetCode 1480 - Running Sum of 1d Array
// Approach: Keep adding the current value to the previous sum.

class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}

// Time Complexity: O(n) - we visit each element once.
// Space Complexity: O(1) - the input array is updated directly.
