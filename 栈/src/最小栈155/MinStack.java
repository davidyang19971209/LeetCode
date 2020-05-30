package 最小栈155;
/**
 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) —— 将元素 x 推入栈中。
pop() —— 删除栈顶的元素。
top() —— 获取栈顶元素。
getMin() —— 检索栈中的最小元素。

 */

/*
 借用一个辅助栈 min_stack,用于存放 stack中的最小值
 
push()方法： 每当push()新值进来时，如果 小于等于 min_stack栈顶值，则一起push()到min_stack，即更新了栈顶最小值；

pop()方法： 判断将pop()出去的元素值是否是min_stack栈顶元素值（即最小值），如果是则将min_stack栈顶元素一起pop()，这样可以保证min_stack栈顶元素始终是stack中的最小值。

getMin()方法： 返回min_stack栈顶即可。


 */


import java.util.Stack;

public class MinStack 
{	
	private Stack<Integer> stack;
	private Stack<Integer> min_stack;

    public MinStack() 
    {
    	stack = new Stack<Integer>();
    	min_stack = new Stack<Integer>();
    }
    
    public void push(int x) {
    	
    	stack.push(x);
    	if (min_stack.isEmpty()||x<=min_stack.peek())
    	{
    		min_stack.push(x);
    	}

    }
    
    public void pop() 
    {
    	if(stack.pop().equals(min_stack.peek()))
    	{
    		min_stack.pop();
    	}
    	
    }
    
    public int top() {
    	return stack.peek();
    }
    
    public int getMin() {
    	return min_stack.peek();
    }
}
