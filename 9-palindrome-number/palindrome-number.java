class Solution {
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        String s2 = "";
        for (int i = s1.length()-1; i >= 0; i--){
            s2 = s2.concat(Character.toString(s1.charAt(i)));
        }
        return s2.equals(s1);
    }
}