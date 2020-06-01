package 删除字符串中所有相邻重复项;

import java.util.Stack;

public class Solution 
{
	public String removeDuplicates(String S) 
	{	
		StringBuilder ans = new StringBuilder();
		
		int length = 0;
		
		for(char c: S.toCharArray())
		{
			if(length!=0&& c == ans.charAt(length-1))
			{
				ans.deleteCharAt(--length);
			}
			else
			{
				ans.append(c);
				length++;
			}
		}
		return ans.toString();
    }
}
