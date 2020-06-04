package �������������94;

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
				while(pre.right!=null)
				{
					pre = pre.right;
				}
			
			pre.right=curr;
			TreeNode temp = curr;
			curr = curr.left;
			temp.left = null;
			}
		}
		
		return res;
		
	}

}
