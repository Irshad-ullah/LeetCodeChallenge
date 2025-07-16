class Solution {
public:


    bool isPresent(string s , char c){
        
        for(int i = 0; i < s.length() ; i++){
            if (s.at(i) == c){
                return true;
            }
        }
        return false;
    }

    int lengthOfLongestSubstring(string s) {
       int counter = 0;
       int maxCounter = 0;
       string currStr = "";
       char character;


       for (int i =0; i<s.length() ; i++) {
            character = s.at(i);
            if(isPresent(currStr , character)){
                maxCounter = maxCounter < counter ? counter : maxCounter;
                currStr = "";
                i = i-counter;
                counter = 0;
            }else {
                currStr = currStr + character;
                counter++;
            }
       }
       maxCounter = maxCounter < counter ? counter : maxCounter;

       return maxCounter;
    }
};