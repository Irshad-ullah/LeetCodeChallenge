class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String formated = "";
        int dashes = 0;
        for (int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != '-'){
                if(formated.length() > 0 && (formated.length()-dashes) % k == 0  ){
                    formated = '-' + formated;
                    dashes++;
                }
               formated = s.charAt(i) >= 'a' && s.charAt(i) <= 'z'
                ? Character.toUpperCase(s.charAt(i)) + formated
                : s.charAt(i) + formated;
            }
        }
        return formated;
        
    }
}