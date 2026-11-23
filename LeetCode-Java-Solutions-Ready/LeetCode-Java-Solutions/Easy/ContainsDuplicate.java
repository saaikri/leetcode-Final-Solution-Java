// LeetCode 217 - Contains Duplicate
// Approach: Compare each element with the elements after it.

class Solution {
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

// Time Complexity: O(n^2) - in the worst case, pairs are compared.
// Space Complexity: O(1) - no extra data structure is used.
