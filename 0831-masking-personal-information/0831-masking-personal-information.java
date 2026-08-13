class Solution {
    public String maskEmail(String s){
        StringBuilder masked = new StringBuilder();

        masked.append( Character.isUpperCase(s.charAt(0)) ? Character.toLowerCase(s.charAt(0)): s.charAt(0));
        masked.append("*****");
        boolean found = false;
        for(int i = 1; i < s.length() - 1; i++){
            if(s.charAt(i+1) == '@'  || found){
                found = true;
                masked.append( Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)): s.charAt(i));
            }
        } 
        masked.append(Character.toLowerCase((s.charAt(s.length()-1))));
        return masked.toString();

    }
    public String maskPhone(String s){
        StringBuilder pure = new StringBuilder();
        StringBuilder masked = new StringBuilder();
        for ( int i = s.length() - 1 ; i >= 0 ; i--){
            if(s.charAt(i) !='+' && s.charAt(i) !='-'  && s.charAt(i) !='('  && s.charAt(i) !=')' && s.charAt(i) !=' '){
                pure.append(s.charAt(i));
            }
        }
        System.out.println(pure.toString());
        masked.append(pure.substring(0,4));
        masked.append("-***-***");
        int pureLength = pure.length();
        if(pureLength > 10){
            masked.append('-');
        }
        while(pureLength>10 ){
            masked.append('*');
            pureLength--;
        }
        if(masked.length()>12){
            masked.append('+');
        }

        return masked.reverse().toString();
    }
    public String maskPII(String s) {
        if(s.charAt(0) >= 'A' && s.charAt(0) <= 'z'){
            return maskEmail(s);
        }
        return maskPhone(s);
    }
}