// LeetCode 1 - Two Sum
// Approach: Check pairs one by one until their sum matches the target.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[0];
    }
}

// Time Complexity: O(n^2) - pairs are checked using nested loops.
// Space Complexity: O(1) - excluding the small returned answer.
