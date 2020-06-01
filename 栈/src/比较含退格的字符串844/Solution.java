package �ȽϺ��˸���ַ���844;

/*
 * ��stack ת��Ϊ string�ٱȽ�
 */

import java.util.Stack;

public class Solution 
{	
	
	public boolean backspaceCompare(String S, String T) 
    {	
//		�����ﷵ�ص���һ��string class�����ݣ�����������Build��ռ�ݵ��ڴ��ַ��һ��
//		�޷��� == �Ƚ�
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
