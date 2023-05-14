/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
*/
class Solution {
    public int[] runningSum(int[] nums) {
        int result[] = new int [nums.length]; 
        result[0] = nums[0];
        for(int i=0; i<nums.length-1; i++){
            result[i+1]  = result[i] + nums[i+1];
            // System.out.println(result);
        }
        return result;
    }
}
