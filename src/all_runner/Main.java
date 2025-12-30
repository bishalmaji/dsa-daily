package all_runner;

import java.util.*;
import two_pointer.IsSubsequence;
import two_pointer.TwoSum2;
import two_pointer.ValidPalindrome;



public class Main {

    public static void main(String[] args) {
        // runPalindrome();
        // runIsSubsequence();
        runTwoSum2();
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

      static void runTwoSum2() {
        int arr[] ={2,7,11,15};
        System.out.println(
            Arrays.toString(new TwoSum2().twoSum(arr,9))
        );
    }
}

