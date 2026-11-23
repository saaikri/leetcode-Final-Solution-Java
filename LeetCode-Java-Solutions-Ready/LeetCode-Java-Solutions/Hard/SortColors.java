// LeetCode 75 - Sort Colors
// Approach: Use three pointers to place 0s first, 2s last, and keep 1s in the middle.

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}

// Time Complexity: O(n) - each element is handled in one pass.
// Space Complexity: O(1) - sorting is done in the same array.
