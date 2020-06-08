package ����������������173;
/*
 * �ݹ��������
 */


import java.util.*;

public class BSTIterator2 
{
	ArrayList<Integer> nodesSorted = new ArrayList<>();
	int index;
	
	public BSTIterator2(TreeNode root) 
	{
	    this.index=-1;
	    this._inorder(root);
	}
	
	public void _inorder(TreeNode root)
	{
	    if(root==null)
	    {
	        return;
	    }
	    this._inorder(root.left);
	    this.nodesSorted.add(root.val);
	    this._inorder(root.right);
	}
	
	/** @return the next smallest number */
	public int next() {
	    return this.nodesSorted.get(++this.index);
	}
	
	/** @return whether we have a next smallest number */
	public boolean hasNext() {
	     return this.index + 1 < this.nodesSorted.size();
	}

}
