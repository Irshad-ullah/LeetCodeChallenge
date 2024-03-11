class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        boolean found = false;
        for (i = 0; i < nums.length; i++){
            found = false;
            for (int j = 0; j < nums.length; j++){            
                if(nums[j] == nums[i] && j != i){
                    found = true;
                    break;
                }
            }   
            if(!found){    
                break;
            }
        }
        return nums[i];
    }
}