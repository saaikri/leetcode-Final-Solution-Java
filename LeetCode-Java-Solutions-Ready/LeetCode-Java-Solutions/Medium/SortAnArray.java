// LeetCode 912 - Sort an Array
// Approach: Use Java's built-in sorting method for integer arrays.

import java.util.Arrays;

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
}

// Time Complexity: O(n log n) - standard comparison sorting performance.
// Space Complexity: Depends on the library implementation; do not assume O(1).
