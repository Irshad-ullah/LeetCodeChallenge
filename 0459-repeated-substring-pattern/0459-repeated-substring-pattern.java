class Solution {
       public static boolean repeatedSubstringPattern(String s) {
        if(s.length() <= 1) return false;
        StringBuilder result = new StringBuilder();
        String repeating = "";
        for ( int i = 0; i < s.length(); i++){
            result.append(s.charAt(i));
            if(s.length() >= 2*result.length() && s.length()%result.length() == 0 && s.substring(i+1, 2*result.length()).equals(result.toString()) ){
                repeating = result.toString();
            }

        }
        while (repeating.length() > 0 && result.length() >= repeating.length()){
             if(result.substring(0, repeating.length()).equals(repeating)){
                result.delete(0, repeating.length());
            }else{
                break;
            }
        }

        return result.isEmpty();
    }
}