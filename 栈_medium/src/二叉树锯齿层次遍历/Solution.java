package ¶þ²æÊ÷¾â³Ý²ã´Î±éÀú;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	
 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	    if (root == null) {
	      return new ArrayList<List<Integer>>();
	    }

	    List<List<Integer>> results = new ArrayList<List<Integer>>();

	    LinkedList<TreeNode> node_deque = new LinkedList<>();

	    node_deque.addLast(root);
	    node_deque.addLast(null);

	    LinkedList<Integer> level_list = new LinkedList<>();
	    boolean is_order_left = true;

	    while(node_deque.size()>0)
	    {
	        TreeNode current_node = node_deque.pollFirst();
	        if(current_node!=null)
	        {
	            if(is_order_left)
	            {
	                level_list.addLast(current_node.val);
	            }
	            else
	            {
	                level_list.addFirst(current_node.val);
	            }
	            if(current_node.left!=null)
	            {
	                node_deque.addLast(current_node.left);
	            }
	            if(current_node.right!=null)
	            {
	                node_deque.addLast(current_node.right);
	            }
	        }
	        else
	        {
	            results.add(level_list);
	            level_list = new LinkedList<Integer>();

	            if(node_deque.size()>0)
	            {
	                node_deque.addLast(null);
	            }
	            is_order_left = !is_order_left;
	        }
	    }
	    return results;
	  }
}
