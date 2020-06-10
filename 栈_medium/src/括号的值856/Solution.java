package ���ŵ�ֵ856;

import java.util.Stack;

public class Solution {
	 public int scoreOfParentheses(String S) {
	        Stack<Integer> stack = new Stack<>();
	        stack.push(0);

	        for(char c: S.toCharArray())
	        {
	            if(c=='(')
	                stack.push(0);
	            else
	            {
	                int v = stack.pop();
	                int w = stack.pop();
	                stack.push(w+Math.max(2*v,1));
	            }
	        }
	        return stack.pop();
	    }
}
