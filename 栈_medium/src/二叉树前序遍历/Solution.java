package ¶þ²æÊ÷Ç°Ðò±éÀú;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> res = new ArrayList<>();
        helper(root,res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> list)
    {
        if(root==null)  return;
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
    }

}
