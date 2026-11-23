// LeetCode 704 - Binary Search
// Approach: Check the middle element and reduce the search range each time.

class Solution {
    public int search(int[] nums, int target) {
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

        return -1;
    }
}

// Time Complexity: O(log n) - the search range is halved each step.
// Space Complexity: O(1) - only pointer variables are used.
