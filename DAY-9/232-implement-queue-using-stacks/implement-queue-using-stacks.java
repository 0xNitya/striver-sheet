class MyQueue {

    public MyQueue() {
        
    }
    
    public void push(int x) {
        ip.push(x);
        
    }
    
    public int pop() {
        peek();
        return op.pop();
    }
    
    public int peek() {
        //copy krne ka sare ip to op reverse me then top of op return
        if(op.isEmpty())
        {
            while(!ip.isEmpty()){
                op.push(ip.pop());
            }
        }
        return op.peek();
        
    }
    
    public boolean empty() {
        return ip.isEmpty() && op.isEmpty();
        
    }

    public Deque<Integer> ip=new ArrayDeque<>();
    public Deque<Integer> op=new ArrayDeque<>();
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */