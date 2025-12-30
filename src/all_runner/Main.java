package all_runner;

import two_pointer.IsSubsequence;
import two_pointer.ValidPalindrome;


public class Main {

    public static void main(String[] args) {
        // runPalindrome();
        runIsSubsequence();
    }

    static void runPalindrome() {
        System.out.println(
            new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")
        );
    }
    
    static void runIsSubsequence() {
        System.out.println(
            new IsSubsequence().isSubsequence("","ahbgdc")
        );
    }
}

