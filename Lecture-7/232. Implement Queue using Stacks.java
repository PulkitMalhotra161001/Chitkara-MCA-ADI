class MyQueue {
    Stack<Integer> st1, st2;
    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            int pop = st1.pop();
            st2.push(pop);
        }
        int ans = st2.pop();
        while(!st2.isEmpty()){
            int pop = st2.pop();
            st1.push(pop);
        }
        return ans;
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            int pop = st1.pop();
            st2.push(pop);
        }
        int ans = st2.peek();
        while(!st2.isEmpty()){
            int pop = st2.pop();
            st1.push(pop);
        }
        return ans;
    }
    
    public boolean empty() {
        return st1.isEmpty();
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
