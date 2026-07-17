class Solution {
    public int largestRectangleArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();

            int currentArea ;
        for(int i = 0; i<heights.length ; i++){
            while(!s.empty() && heights[s.peek()] > heights[i]){
                int popped = s.pop();
                if(s.empty()){
                    currentArea = heights[popped] * i;
                }else{
                    currentArea = heights[popped] * (i-(s.peek()+1));
                }
                max = Math.max(max,currentArea);
            }
            s.push(i);
        }
        while(!s.empty()){
            int popped = s.pop();
            if(s.empty()){
                    currentArea = heights[popped] * heights.length;
                }else{
                    currentArea = heights[popped] * (heights.length-(s.peek()+1));
                }
                max = Math.max(max,currentArea);
        }
        return max;

    }
}