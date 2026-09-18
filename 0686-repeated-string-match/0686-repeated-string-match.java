class Solution {
    public boolean possible(String a , String b){
        for(char c : b.toCharArray()){
            if (a.indexOf(c) < 0){
                return false;
            }
        }
        return true;
    }
    public int repeatedStringMatch(String a, String b) {
        if(!possible(a,b)) return -1;
        int repeats = 1;
        String repeated = a;
        while(!repeated.contains(b) && (repeated.length() < 2*b.length() || repeats < 2)){
            repeated = repeated+a;
            repeats++;
        }
        return repeated.contains(b) ? repeats: -1;
    }
}