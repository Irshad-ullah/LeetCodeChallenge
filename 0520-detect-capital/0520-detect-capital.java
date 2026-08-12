class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals = 0;
        for(char i: word.toCharArray()){
            if(Character.isUpperCase(i)){
                capitals++;
            }
        }
        return capitals== 0 || capitals == word.length() || (capitals == 1 && Character.isUpperCase(word.charAt(0)));
        
    }
}