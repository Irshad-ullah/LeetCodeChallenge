class Solution {
    public boolean repeated(int[] arr, int num){
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public int[] findErrorNums(int[] nums) {
        int[] checked = new int[nums.length];
        int[] returningArr = new int[2];
        int normalSum = 0;
        int arrSum = 0;
        int repeatingValue = 0;
        for (int i = 0; i < nums.length; i++){
            normalSum += i+1;
            arrSum += nums[i];
            if(repeated(checked,nums[i])){
                repeatingValue = nums[i];
            }
            checked[i] = nums[i];

        }
        int diff = arrSum - normalSum;
        returningArr[0] = repeatingValue;
        returningArr[1] = repeatingValue - diff;
        return returningArr;
    }
}