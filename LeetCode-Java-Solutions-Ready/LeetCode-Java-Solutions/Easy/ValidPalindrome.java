// LeetCode 125 - Valid Palindrome
// Approach: Use two pointers and skip characters that are not letters or digits.

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char first = Character.toLowerCase(s.charAt(left));
            char last = Character.toLowerCase(s.charAt(right));

            if (first != last) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}

// Time Complexity: O(n) - the two pointers move through the string.
// Space Complexity: O(1) - no extra string is created.
