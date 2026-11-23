// LeetCode 1470 - Shuffle the Array
// Approach: Copy one element from the first half and then one from the second half.

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            result[index + 1] = nums[i + n];
            index += 2;
        }

        return result;
    }
}

// Time Complexity: O(n) - each pair is copied once.
// Space Complexity: O(n) - a new result array is created.
