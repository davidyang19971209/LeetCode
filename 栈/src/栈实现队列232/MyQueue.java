package ջʵ�ֶ���232;

/* ���е��ص㣺�Ƚ��ȳ� fifo �������ӣ�ǰ�˳��ӣ�
 * ջ���ص㣺�ֽ��� lsfo �������ջ��ǰ�˳�ջ��
 *
 * 
 ����1���ø���ջ��һ����ԶΪ�գ���ջ�ǣ���s1���еĶ�����push��s2������x���ٽ�s2��push����
 �����Ļ���s1���൱�ڰ�queue��˳��洢�ģ�����ֱ����Pop����
 */



import java.util.Stack;

public class MyQueue 
{
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	private int front;
	
	public MyQueue() {

    }
    
    /** Push element x to the back of queue. */
    public void push(int x) 
    {
    	if(stack1.isEmpty())
    	{
    		front = x;
    	}
    	while(!stack1.isEmpty())
    	{
    		stack2.push(stack1.pop());
    	}
    	stack2.push(x);
    	while(!stack2.isEmpty())
    	{
    		stack1.push(stack2.pop());
    	}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() 
    {
    	int temp = stack1.pop();
    	
    	if(!stack1.isEmpty())
    	{
    		front = stack1.peek();
    	}
    	
    	return temp;
    }
    
    /** Get the front element. */
    public int peek() 
    {
    	return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return stack1.isEmpty();
    }

}
