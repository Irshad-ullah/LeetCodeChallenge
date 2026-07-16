class Solution {
    public String compare(String first , String second){
        String common= "";
       if(first.length() > second.length()){
        for (int i = 0; i < second.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                return common;
            }
            common += first.charAt(i);
        }
       }else{
        for (int i = 0; i < first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                return common;
            }
            common += first.charAt(i);
        }
       }
       return common;
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1 ) return strs[0];

        String common = compare(strs[0],strs[1]);
        for(int i = 2 ;i < strs.length; i++){
            common = compare(common, strs[i]);
        }

        return common;
    }
}