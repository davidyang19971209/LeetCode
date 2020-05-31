package ջʵ�ֶ���232;
/*
 * ����2�� ͬʱʹ������ջ
 * Push�ǽ���S1��Popʱ��S1�еĶ�����push��s2����Ҳs2���൱��ʱһ��queue������ʱ�ʹ�s2 pop
 * ������Ҫ�ٴν�s1��Ԫ��ȫ��Push��s2��
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
