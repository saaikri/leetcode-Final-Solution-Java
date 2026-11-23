// LeetCode 709 - To Lower Case
// Approach: Convert each character using Character.toLowerCase().

class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(Character.toLowerCase(s.charAt(i)));
        }

        return result.toString();
    }
}

// Time Complexity: O(n) - each character is processed once.
// Space Complexity: O(n) - the result string is built separately.
