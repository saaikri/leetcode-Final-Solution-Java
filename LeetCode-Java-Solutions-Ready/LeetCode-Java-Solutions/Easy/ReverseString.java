// LeetCode 344 - Reverse String
// Approach: Swap characters from both ends and move towards the middle.

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

// Time Complexity: O(n) - about half of the array is visited for swaps.
// Space Complexity: O(1) - the array is changed in place.
