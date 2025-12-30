// Problem: Two Sum II - Input Array Is Sorted
// Platform: LeetCode
// Approach: Two pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].


package two_pointer;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp=numbers.length-1;
        int result[]={-1,-1};
     
        while(rp>lp){
            if(numbers[rp]+numbers[lp]==target){
                result[0]=lp+1;
                result[1]=rp+1;
                return result;
            }else if(numbers[rp]+numbers[lp]>target){
                rp--;
            }else{
                lp++;
            }
            
        }
        return result;
    }
}
