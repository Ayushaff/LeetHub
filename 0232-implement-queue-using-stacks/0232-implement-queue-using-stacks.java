class MyQueue {
//tc O(1) amortized sc O(2N)
    public MyQueue() {
        
    }
    private Stack<Integer> out= new Stack<>();
    private Stack<Integer> in= new Stack<>();

    public void push(int x) {//O(1)
        //1 step
        //so push x into a stack name as input
        in.push(x);
    }
    
    public int pop() {//O(1) 
        //3 if output aint empty
        //output.pop();
        //else every material from input to output stack 
        //then output.peek();
        /*if(!out.isEmpty())
            peek();
            else{
                while(!in.isEmpty()){
                out.push(in.peek());
                in.pop();
                }
            }
             return out.peek();
             */
              peek();
            int val=out.peek();
            out.pop();
             return val;
    }
    
    public int peek() {//O(N)
        //2 step if output stack aint empty 
        //return output.peek();
        //else every material from input to output stack 
        //then output.peek();
        if(!out.isEmpty())
            return out.peek();
            else{
                while(!in.isEmpty()){
                    out.push(in.peek());
                    in.pop();
                }
            }
            return out.peek();
    }
    
    public boolean empty() {
        return in.isEmpty() && out.isEmpty();
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