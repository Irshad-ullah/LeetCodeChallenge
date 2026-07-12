class Pair{
    int value;
    int index;
    Pair(int value , int index){
        this.value = value;
        this.index = index;
    }
    
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Pair highest = new Pair(temperatures[0],0);
       Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++){
            if(stack.empty() || stack.peek().value >= temperatures[i]){
                stack.push(new Pair(temperatures[i],i));
            }
            else {
                while(!stack.empty() && stack.peek().value < temperatures[i]){
                    Pair peek = stack.pop();
                    temperatures[peek.index] = i - peek.index;
                }
                if(temperatures[i] > highest.value){
                    highest.value = temperatures[i];
                    highest.index = i;
                }
                stack.push(new Pair(temperatures[i],i));
            }
        }
        while(!stack.empty()){
            Pair peek = stack.pop();
            temperatures[peek.index] = 0;
        }
        return temperatures;
    }
}