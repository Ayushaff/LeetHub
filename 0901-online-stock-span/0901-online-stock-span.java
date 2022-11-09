class StockSpanner {
    
static class Node{
    
    int price,span;
    public Node(int p,int s){
        this.price=p;
        this.span=s;
        
    }
}
    Stack<Node>st;
    
    public StockSpanner() {
        st=new Stack<>();
    }
    
    public int next(int price) {
        int count=0;
        while(!st.isEmpty() && st.peek().price<=price)
        {
            count+=st.peek().span;
            st.pop();
        }
        count++;
        st.push(new Node(price,count));
        return count;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */