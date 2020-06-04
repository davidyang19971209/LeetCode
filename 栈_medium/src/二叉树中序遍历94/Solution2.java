package ¶þ²æÊ÷ÖÐÐò±éÀú94;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 
{
	public List<Integer> inorderTraversal(TreeNode root) {
		
		List<Integer> res = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		
		while(stack.size()>0||root!=null)
		{
			if(root!=null)
			{
				stack.push(root);
				root = root.left;
			}
			else 
			{
				TreeNode temp = stack.pop();
				res.add(temp.val);
				root = temp.right;
			}
		}
		return res;
	
	}

}
