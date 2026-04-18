class MinStack {

    Stack<Integer> st ;
    int min2 = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        min2 = Math.min(min2,val);
        st.push(val);
        
    }
    
    public void pop() {
        if(min2==st.peek())
        {
            st.pop();
            Stack<Integer> m = new Stack<>();
            int min = Integer.MAX_VALUE;
            while(!st.isEmpty())
            {
                min = Math.min(min,st.peek());
                m.push(st.peek());
                st.pop();
            }

            while(!m.isEmpty())
            {
                st.push(m.peek());
                m.pop();
            }
            min2 = min;
        }
        else
            st.pop();
        
    }
    
    public int top() {

        return st.peek();
        
    }
    
    public int getMin() {
        

        return min2;
        
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