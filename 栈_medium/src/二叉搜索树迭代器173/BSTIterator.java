package ¶ş²æËÑË÷Ê÷µü´úÆ÷173;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();

    private void _leftmostInorder(TreeNode root)
    {
        while(root!=null)
        {
            this.stack.push(root);
            root = root.left;
        }
    }


    public BSTIterator(TreeNode root) {
        this._leftmostInorder(root);
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode topmostNode = this.stack.pop();
        if(topmostNode.right!=null)
            this._leftmostInorder(topmostNode.right);

        return topmostNode.val;
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size()>0;

    }
}
