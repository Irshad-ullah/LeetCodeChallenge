class Solution {
    public int reverse(int x) {
        double y = 0;
        int value;
        boolean isNeg = x < 0;
        x= isNeg ? x*-1:x;
        while(x >= 10){
            value = x%10;
            x = x/10;
            y = y*10 + value;
        }
        y = y * 10 + x;
        y = isNeg ? y*-1 : y;

        if (y < Integer.MIN_VALUE || y > Integer.MAX_VALUE){
            return 0;
        }
        return (int)y;
        
    }
}