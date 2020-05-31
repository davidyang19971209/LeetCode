package 栈实现队列232;

/* 队列的特点：先进先出 fifo （后端入队，前端出队）
 * 栈的特点：现金后出 lsfo （后端入栈，前端出栈）
 *
 * 
 方法1，用辅助栈，一个永远为空，入栈是，将s1所有的东西都push到s2，加上x，再将s2的push回来
 这样的话，s1就相当于按queue的顺序存储的，可以直接用Pop弹出
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
