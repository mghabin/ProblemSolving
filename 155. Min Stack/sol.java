class MinStack {
    // One stack solution.
    // Time Complexity: O(1).
    // Space Complexity: O(n).
    // we store the min and the second minimum value in stack.
    
    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    
    public MinStack() {
        this.stack = new Stack<>();
    }
    
    public void push(int val) {
        if(val <= this.min){
            this.stack.push(this.min);
            this.min = val;
        }
        
        this.stack.push(val);
    }
    
    public void pop() {
        if(this.stack.peek() == this.min){ 
            this.stack.pop(); 
            this.min = this.stack.pop(); 
        }
        else{
            this.stack.pop();
        }
    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */