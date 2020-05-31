package ∞Ù«Ú±»»¸682;

import java.util.Stack;

public class Solution 
{	
    public int calPoints(String[] ops) 
    {	
    	Stack<Integer> stack = new Stack<Integer>();
    	int sum = 0;
    	
    	for(String s: ops)
    	{
    		switch(s)
    		{
    		case "+":
    				int temp = stack.pop();
    				int score = temp+stack.peek();
    				stack.push(temp);
    				stack.push(score);
    		case "D":
    				stack.push(2*stack.peek());
    		case "C":
    				stack.pop();
    		default:
    				stack.push(Integer.parseInt(s));
    		}
    	}
    	for(int i: stack)
    	{
    		sum+=i;
    	}    	
    	return sum;
    }
}
