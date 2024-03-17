class Solution {
    public int[] twoSum(int[] nums, int target) {
     int[] indexes = new int[2];
     boolean found = false;
     for ( int i = 0; i< nums.length ; i++){
        indexes[0] = i;
        for(int j = i+1; j < nums.length ; j++){
            if ((nums[i] + nums[j]) == target){
                indexes[1] = j;
                found = true;
                break;
            }
        }
        if (found){
            break;
        }
     }   
     return indexes;
    }
}