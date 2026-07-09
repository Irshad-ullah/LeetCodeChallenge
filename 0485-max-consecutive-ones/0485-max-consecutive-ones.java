class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(nums[i]== 0){
                if (sum > maxSum){
                    maxSum = sum;
                }
                sum = 0;
            }
        }
        if (sum > maxSum){
            maxSum = sum;
        }
        return maxSum;
    }
}