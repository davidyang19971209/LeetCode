package ջ����Сֵ;
/**
 * �����һ��ջ�����˳���ջ֧�ֵ�pop��push�������⣬��֧��min�������ú�������ջԪ���е���Сֵ��ִ��push��pop��min������ʱ�临�Ӷȱ���ΪO(1)��



��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/min-stack-lcci
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
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
