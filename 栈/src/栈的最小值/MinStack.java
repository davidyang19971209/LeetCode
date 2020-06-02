package 栈的最小值;
/**
 * 请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。



来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/min-stack-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


import java.util.Stack;

public class MinStack {
	
	private Stack<Integer> s1 = new Stack<>();
	private Stack<Integer> s2 = new Stack<>();
	public MinStack()
	{
		
	}
	
	public void push(int x) {
		s1.push(x);
		
		if(!s2.isEmpty()&&s2.peek()<x)
		{
			s2.push(s2.peek());
		}
		else
		{
			s2.push(x);
		}
	}
	
	public void pop()
	{
		s1.pop();
		s2.pop();
	}
	
	public int top()
	{
		return s1.peek();
	}
	
	public int getMin()
	{
		return s2.peek();	
	}

}
