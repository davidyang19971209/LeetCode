package 删除最外层的括号1021;

import java.util.Stack;
/*
 * 思路，与括号匹配类似，（入栈 ）出栈，如果栈为空，说明遇到了 原语，这种情况下通过记录下的位置
 * 把原语拿出，这里书要注意的是用到了stringbuilder
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
