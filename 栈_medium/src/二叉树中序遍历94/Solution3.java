package 二叉树中序遍历94;

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
			
			pre.right=curr; 			//把current变为右子节点
			TreeNode temp = curr;		//temp的目的是在进入左子树之后
			curr = curr.left;			//将原curr的左子树置为null
			temp.left = null;
			}
		}
		
		return res;
		
	}

}
