package 比较含退格的字符串844;

/*
 * 将stack 转换为 string再比较
 */

import java.util.Stack;

public class Solution 
{	
	
	public boolean backspaceCompare(String S, String T) 
    {	
//		因这里返回的是一个string class的数据，所以这两个Build所占据的内存地址不一样
//		无法用 == 比较
		return build(S).equals(build(T));
        
    }
	
	public String build(String s)
	{
		Stack<Character> ans = new Stack<>();
		
		for(char c: s.toCharArray())
		{
			if(c!='#')
			{
				ans.push(c);
			}
			else if(!ans.isEmpty())
			{
				ans.pop();
			}
		}
		
		return String.valueOf(ans);
	}
	
	
}
