class MyQueue {
    
    Stack<Integer> pushS = new Stack<>() ;
    Stack<Integer> popS = new Stack<>() ;


    public MyQueue() {
        
    }
    
    private void convToPopS(){
        int s = pushS.size() ;
        
        for(int i = 0 ; i < s ; i++){
            int e = pushS.pop();
            popS.push(e) ;
        }
    }
    
    public void push(int x) {
        pushS.push(x) ;
    }
    
    public int pop() {
        if(popS.isEmpty()){
            convToPopS() ;
        }
        
        return popS.pop() ;
    }
    
    public int peek() {
       
        if(popS.isEmpty()){
            convToPopS() ;
        }
        
        return popS.peek() ;
        
        
    }
    
    public boolean empty() {
        return pushS.isEmpty() && popS.isEmpty() ;
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