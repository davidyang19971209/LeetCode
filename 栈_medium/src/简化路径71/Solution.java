package 简化路径71;
/*
 *使用辅助栈，先用/分割数组
 *这里注意的是，stringbuilder与stringbuffer的区别
 *stringbuilder运行效率较高，但是不支持多线程
 *stringbuffer运行效率较低，但是是线程安全的 
 */


import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
    	String[] s = path.split("/");
    	Stack<String> stack = new Stack<>();
    	
    	for(int i=0;i<s.length;i++)
    	{
    		if(!stack.isEmpty()&&s[i].equals(".."))
    			stack.pop();
    		else if(!s[i].equals("")&&!s[i].equals(".")&&!s[i].equals(".."))
    			stack.push(s[i]);
    	}
    	
    	if(stack.isEmpty())
    		return "/";
    	
    	StringBuffer res = new StringBuffer();
    	for(int i=0;i<stack.size();i++)
    	{
    		res.append("/"+stack.get(i));
    	}
    	return res.toString();
    	
    }
	
}
