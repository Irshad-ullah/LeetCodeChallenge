class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        boolean matched = false;
        int n = s.length();
        for (int i = 0; i < n; i++){
            matched = true;
            for (int j = 0; j < n; j++){
                if(s.charAt((i+j)%n) != goal.charAt(j)){
                    matched = false;
                }
            }
            if(matched){
                return matched;
            }
        }

        return matched;
        
    }
}