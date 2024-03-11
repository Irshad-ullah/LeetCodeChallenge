class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];


       prefixProduct[0] = 1;
       for(int i = 1; i < nums.length; i++){
           prefixProduct[i] = prefixProduct[i-1] * nums[i-1];
       }

       suffixProduct[nums.length-1] = 1;
       for(int j = nums.length-2; j >= 0; j--){
           suffixProduct[j] = suffixProduct[j+1] * nums[j+1];
       }

       for (int k = 0; k < nums.length; k++){
           answer[k] = prefixProduct[k] * suffixProduct[k];
       }
       return answer;
    }
}