class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            nums[Math.abs(nums[i])-1] = - Math.abs(nums[Math.abs(nums[i]) -1]);
        }
        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                missing.add(i+1);
            }
        }
    return missing;
    }
}