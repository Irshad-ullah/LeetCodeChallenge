class Solution {
    public boolean isPerfectSquare(int num) {
       boolean perfectSquare = false;
       for(int i = 1; Math.pow(i,2) <= num ; i++) {
        if (Math.pow(i,2) == num){
            perfectSquare = true;
        }
       }
       return perfectSquare; 
    }
}