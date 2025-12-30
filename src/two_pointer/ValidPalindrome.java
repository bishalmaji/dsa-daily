// Problem: Valid Palindrome
// Platform: LeetCode
// Approach: Two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

package two_pointer;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0, r = t.length() - 1;
        while (l < r) {
            if (t.charAt(l) != t.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
