package ¶þ²æÊ÷Ç°Ðò±éÀú;

public class Solution5 {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        if (root == null) 
        {
		    return res;
	    }
        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode curr = stack.pop();
            res.add(curr.val);

            if(curr.right!=null)
            {
                stack.push(curr.right);
            }

            if(curr.left!=null)
            {
                stack.push(curr.left);
            }
        }

        return res;

    }

}
