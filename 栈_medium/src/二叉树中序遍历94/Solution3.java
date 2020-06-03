package ¶þ²æÊ÷ÖÐÐò±éÀú94;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
	public List < Integer > inorderTraversal(TreeNode root) 
	{
		List<Integer> res = new ArrayList<>();
		TreeNode curr = root;
		TreeNode pre;
		
		while(curr!=null)
		{
			if(curr.left==null)
			{
				res.add(curr.val);
				curr = curr.right;
			}
			else
			{
				pre = curr.left;
				curr = curr.right;
			}
			pre.right=cur;
			TreeNode temp = curr;
			curr = curr.left;
			temp.left = null;
		}
		
		return res;
		
	}

}
