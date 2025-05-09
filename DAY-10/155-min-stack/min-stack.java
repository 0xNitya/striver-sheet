import java.util.Stack;

class MinStack {

    private Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if (stack.isEmpty())
            stack.push(new int[] {val, val});
        else
            stack.push(new int[] {val, Math.min(val, stack.peek()[1])});
    }

    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}
