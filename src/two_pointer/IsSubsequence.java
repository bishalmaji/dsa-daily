// Problem: isSubsequence
// Platform: LeetCode
// Approach: Two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Input: s = "abc", t = "ahbgdc"
// Output: true


package two_pointer;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int pS = 0, pT = 0;

        while (pS < s.length() && pT < t.length()) {
            if (s.charAt(pS) == t.charAt(pT)) {
                pS++;
            }
            pT++;
        }

        return pS == s.length();
    }
}
