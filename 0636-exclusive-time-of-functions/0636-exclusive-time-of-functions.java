class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stack = new Stack<>();
        int startTime = 0;
        int timeStamp;
        String event;
        int id;
        int[] arr = new int[n];
    
        for(int i = 0; i < logs.size(); i++){
            String[] parts = logs.get(i).split(":");
            id = Integer.parseInt(parts[0]);
            event = parts[1];
            timeStamp = Integer.parseInt(parts[2]);
            if (stack.size() == 0){
                stack.push(id);
                startTime = timeStamp;
            }
            else if(stack.peek() == id && "start".equals(event)){
                stack.push(id);
                arr[id] += timeStamp - startTime;
                startTime = timeStamp;
            }
            else if (stack.peek() != id ){
                arr[stack.peek()] += timeStamp - startTime;
                stack.push(id);
                startTime = timeStamp;
            }
            else{
                arr[id] += timeStamp - startTime + 1;
                stack.pop();
                startTime = timeStamp + 1;
            }
        } 
        return arr;   
    }
}