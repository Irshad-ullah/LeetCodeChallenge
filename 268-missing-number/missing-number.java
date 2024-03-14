class Solution {
    public int missingNumber(int[] nums) {
        int requiredSum=0;
        int Sum=0;
        for(int i = 0; i < nums.length; i++){
            Sum += nums[i];
            requiredSum += i+1; 
        }
        return requiredSum - Sum;
    }
}