// LeetCode 35 - Search Insert Position
// Approach: Binary search; when the target is missing, left is its insert position.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}

// Time Complexity: O(log n) - the search range is halved each step.
// Space Complexity: O(1) - only a few variables are used.
