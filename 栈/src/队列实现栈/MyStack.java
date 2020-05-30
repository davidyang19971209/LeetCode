package ����ʵ��ջ;

import java.util.LinkedList;

public class MyStack 
{	
	 LinkedList<Integer> queue1 = new LinkedList<>();
	 LinkedList<Integer> queue2 = new LinkedList<>();
	 public MyStack() 
	 {	
		 //list��һ���ӿڣ�Arraylist �̳в���ʵ���� List �����൱�ڶ�̬����arraylist���ݳ���list
	 }
	    
	    /** Push element x onto stack. */
	    public void push(int x) 
	    {
	    	if(queue1.isEmpty())
	    	{
	    		queue2.offer(x);
	    	}
	    	else
	    	{
	    		queue1.offer(x);
	    	}
	    }
	    
	    /** Removes the element on top of the stack and returns that element. */
	    public int pop() 
	    {
	    	if(queue1.isEmpty())
	    	{
	    		while(queue2.size()>1)
	    		{
	    			queue1.offer(queue2.poll());
	    		}
	    		return queue2.poll();
	    	}
	    	else
	    	{
	    		while(queue1.size()>1)
	    		{
	    			queue2.offer(queue1.poll());
	    		}
	    		return queue1.poll();
	    	}
	    }
	    
	    /** Get the top element. */
	    public int top() {
	    	
	    	int top = 0;
	    	if(queue1.isEmpty())
	    	{
	    		while(queue2.size()>1)
	    		{
	    			queue1.offer(queue2.poll());
	    		}
	    		top = queue2.poll();
	    		queue1.offer(queue2.poll());
	    	}
	    	else
	    	{
	    		while(queue1.size()>1)
	    		{
	    			queue2.offer(queue1.poll());
	    		}
	    		top = queue1.poll();
	    		queue2.offer(queue1.poll());
	    	}
	    	return top;
	    }
	    
	    /** Returns whether the stack is empty. */
	    public boolean empty() {
	    	
	    	return queue1.isEmpty()&&queue2.isEmpty();
	    }
}
