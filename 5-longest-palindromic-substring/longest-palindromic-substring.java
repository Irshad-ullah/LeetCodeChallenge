class Solution {
    public boolean isPalindrome(String s, int start , int end){
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public String longestPalindrome(String s) {
        int langestPalindrome = 0;
        int currPalindrome = 0;
        int startingIndex = 0;

        for (int i = 0; i < s.length(); i++){
            int n = s.length();
            while(!isPalindrome(s,i,s.lastIndexOf(s.charAt(i),n))){
                n = n-1;    
            }

            currPalindrome = s.lastIndexOf(s.charAt(i),n) - i + 1;
            if(currPalindrome > langestPalindrome ){
                langestPalindrome = currPalindrome;
                startingIndex = i;
            }
        }
    return s.substring(startingIndex , startingIndex + langestPalindrome);
    }
}