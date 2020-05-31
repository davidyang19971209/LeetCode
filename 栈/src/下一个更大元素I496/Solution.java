package 下一个更大元素I496;
/**
 给定两个 没有重复元素 的数组 nums1 和 nums2 ，其中nums1 是 nums2 的子集。找到 nums1 中每个元素在 nums2 中的下一个比其大的值。

nums1 中数字 x 的下一个更大元素是指 x 在 nums2 中对应位置的右边的第一个比 x 大的元素。如果不存在，对应位置输出 -1 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/next-greater-element-i
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/*
 * 思路：通过遍历nums2的每一个元素来建立其所对应的hashmap
 * 遍历时我们需要维护一个单调栈
 * 我们首先把第一个元素 nums2[1] 放入栈，随后对于第二个元素 nums2[2]，
 * 如果 nums2[2] > nums2[1]，那么我们就找到了 nums2[1] 的下一个更大元素 nums2[2]
 * 此时就可以把 nums2[1] 出栈并把 nums2[2] 入栈；
 * 如果 nums2[2] <= nums2[1]，我们就仅把 nums2[2] 入栈。
 * 对于第三个元素 nums2[3]，此时栈中有若干个元素，
 * 那么所有比 nums2[3] 小的元素都找到了下一个更大元素（即 nums2[3]），
 * 因此可以出栈，在这之后，我们将 nums2[3] 入栈，以此类推。

 */


import java.util.HashMap;
import java.util.Stack;

public class Solution {
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) 
	{	
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		int[] res = new int[nums1.length];
		
		for(int i=0;i<nums2.length;i++)
		{
			while(!stack.isEmpty()&&nums2[i]>stack.peek())
			{
				map.put(stack.pop(), nums2[i]);
			}
			stack.push(nums2[i]);
		}
		
		while(!stack.isEmpty())
		{
			map.put(stack.pop(),-1);
		}
		
		for(int i=0;i<nums1.length;i++)
		{
			res[i]=map.get(nums1[i]);
		}
		return res;
	}

}
