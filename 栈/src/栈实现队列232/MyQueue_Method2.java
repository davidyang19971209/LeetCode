package 栈实现队列232;
/*
 * 方法2， 同时使用两个栈
 * Push是进入S1，Pop时将S1中的东西都push进s2，这也s2就相当于时一个queue，不空时就从s2 pop
 * 否则需要再次将s1的元素全部Push进s2中
 */

import java.util.Stack;

public class MyQueue_Method2 
{	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	private int front;
	 public MyQueue_Method2() 
	 {

	 }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) 
	    {
	    	if(s1.isEmpty())
	    	{
	    		front = x;
	    	}
	    	s1.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() 
	    {
	    	if(s2.isEmpty())
	    	{
	    		while(!s1.isEmpty())
	    		{
	    			s2.push(s1.pop());
	    		}
	    	}
	    	
	    	return s2.pop();
	    }
	    
	    /** Get the front element. */
	    public int peek() 
	    {
	    	if(s2.isEmpty())
	    	{
	    		return front;
	    	}
	    	else
	    	{
	    		return s2.peek();
	    	}

	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() 
	    {
	    	return s1.isEmpty()&&s2.isEmpty();

	    }

}
