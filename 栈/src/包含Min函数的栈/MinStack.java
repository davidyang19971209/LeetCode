package °üº¬Minº¯ÊýµÄÕ»;

import java.util.Stack;

public class MinStack {
	
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	
    public MinStack() {

    }
    
    public void push(int x) {
    	s1.push(x);
    	if(s2.isEmpty()||s2.peek()>=x)
    	{
    		s2.push(x);
    	}

    }
    
    public void pop() {
    	if(s1.pop().equals(s2.peek()))
    		s2.pop();
    }
    
    public int top() {
    	return s1.peek();
    }
    
    public int min() {
    	return s2.peek();
    }

}
