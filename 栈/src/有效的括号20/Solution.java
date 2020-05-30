package 有效的括号20;
/**
 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

*/

/*
 思路：
 通过堆栈的方法，左括号进栈，右括号出栈并进行判断

*/




import java.util.HashMap;
import java.util.Stack;

public class Solution {
	
	private HashMap<Character,Character> mappings;
	
	public Solution()
	{
		this.mappings = new HashMap<Character,Character>();
		this.mappings.put(')', '(');
		this.mappings.put('}', '{');
		this.mappings.put(']', '[');
		
	}
	
	public boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			
			if(this.mappings.containsKey(c))
			{
				char topElement = stack.empty()?'#':stack.pop();
				
				if (topElement != this.mappings.get(c))
				{
					return false;
				}
			}
			else
			{
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
