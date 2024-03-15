class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] resultant = new int[m+n];
        for (int i = 0; i < m ; i++){
                resultant[i] = nums1[i];
        }
        for (int i = 0; i < n; i++){
            resultant[m+i] = nums2[i];
        }
        for(int i = 0; i<resultant.length; i++){
            for(int j = i; j < resultant.length; j++){
                if (resultant[j] < resultant[i]){
                    int temp = resultant[i];
                    resultant[i] = resultant[j];
                    resultant[j] = temp;
                }
            }
        }
        for (int i = 0; i < resultant.length ; i++){

        nums1[i] = resultant[i];
        }
    }
}