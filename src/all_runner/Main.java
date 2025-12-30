package all_runner;

import two_pointer.ValidPalindrome;

public class Main {

    public static void main(String[] args) {
        runPalindrome();
    }

    static void runPalindrome() {
        System.out.println(
            new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama")
        );
    }
}

