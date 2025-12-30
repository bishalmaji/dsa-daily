// package two_pointer;

// public class ValidPalindrome {

//     public boolean isPalindrome(String s) {
//         String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

//         int l = 0, r = t.length() - 1;
//         while (l < r) {
//             if (t.charAt(l) != t.charAt(r)) return false;
//             l++;
//             r--;
//         }
//         return true;
//     }
// }


package two_pointer;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) !=
                Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
