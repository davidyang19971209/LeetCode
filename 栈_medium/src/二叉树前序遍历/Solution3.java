package ¶þ²æÊ÷Ç°Ðò±éÀú;

import java.util.*;

public class Solution3 {
 public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> output = new LinkedList<>();

        TreeNode node = root;

        while(node!=null)
        {
            if(node.left == null)
            {
                output.add(node.val);
                node = node.right;
            }
            else
            {
                TreeNode predcessor = node.left;
                while((predcessor.right!=null)&&(predcessor.right!=node))
                {
                    predcessor = predcessor.right;
                }

                if(predcessor.right==null)
                {
                    output.add(node.val);
                    predcessor.right = node;
                    node = node.left;
                }
                else
                {
                    predcessor.right = null;
                    node = node.right;
                }
            }
        }
        return output;
    }
	
}
