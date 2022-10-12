class MinStack {
public:
        stack<int>st,min;
    MinStack() {
        
    }
    
    void push(int val) {
            
        if( min.empty() || val<=min.top() ) 
                min.push(val);
            
            st.push(val);
    }
    
    void pop() {
            
        if(st.top() == min.top()) //if val from st is same as the minimalist from min stack so pop from min too 
                min.pop();
            
            st.pop();
    }
    
    int top() {
        return st.top();
    }
    
    int getMin() {
        return min.top();       
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */