

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    

    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            int popped = s1.pop();
            s2.push(popped);
        }
        s1.push(x);
        while(!s2.isEmpty()){
            int popped = s2.pop();
            s1.push(popped);
        }

    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */