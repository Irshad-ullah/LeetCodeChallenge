class Solution {
    public int evaluate(char s){
        switch(s){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
                
        }
        return 0;
    }
    public int romanToInt(String s) {
        int num=0;
        for (int i = 0; i < s.length()-1; i++){
            if(evaluate(s.charAt(i)) < evaluate(s.charAt(i+1))){
                num += evaluate(s.charAt(i+1))-evaluate(s.charAt(i));
                i++;
            }
            else{
                num += evaluate(s.charAt(i));
            }
        }
        if(s.length() == 1){
            num += evaluate(s.charAt(0));
        }
        else if(evaluate(s.charAt(s.length()-2)) >= evaluate(s.charAt(s.length()-1)) ){
            num += evaluate(s.charAt(s.length()-1));
        }
        return num;
    }
}