package ɾ������������1021;

import java.util.Stack;
/*
 * ˼·��������ƥ�����ƣ�����ջ ����ջ�����ջΪ�գ�˵�������� ԭ����������ͨ����¼�µ�λ��
 * ��ԭ���ó���������Ҫע������õ���stringbuilder
 */


public class Solution 
{	
    public String removeOuterParentheses(String S) 
    {	
    	StringBuilder ans = new StringBuilder();
    	Stack<Character> stack = new Stack<>();
    	
    	int start = 0;
    	int end = 0;
    	
    	for(char c: S.toCharArray())
    	{
    		if(c =='(')
    		{
    			stack.push(c);
    			end++;
    		}
    		
    		if(c==')')
    		{
    			end++;
    			stack.pop();
    			
    			if(stack.isEmpty())
    			{
    				ans.append(S.subSequence(start+1, end-1));
    				start = end;
    			}
    		}
    	}
    	
    	return ans.toString();
    }

}
