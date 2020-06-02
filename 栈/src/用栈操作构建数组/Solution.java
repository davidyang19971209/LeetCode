package 用栈操作构建数组;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	 public List<String> buildArray(int[] target, int n) 
	 {	
		List<String> result = new ArrayList<>();
		int j=1;
		for(int i=0;i<target.length;i++)
		{
			while(target[i]>j)
			{
                result.add("Push");
                result.add("Pop");
                j++;
			}
			
			result.add("Push");
			j++;
		}
		return result;

	 }

}
