import java.util.Stack;
class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int front;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(s1.isEmpty()){
            front =x;
        }
        s1.push(x);
        }
    
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            
        }
       int a= s2.pop();
       return a;
    }
    
    /** Get the front element. */
    public int peek() {
       if(s2.isEmpty()){
           return front;
       } 
       return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 