class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        if(q.size()>1){
            int n=q.size();
            for(int i=0;i<n-1;i++)
            q.offer(q.poll());
        }
    }
    
    public int pop() {
       return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(!q.isEmpty()){
            return false;
        }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */