package 每日温度739;
/*
 * 倒叙遍历，注意递减栈在建立的时候，栈内可以堆放索引，不堆放数字
 */

public class Solution {
    public int[] dailyTemperatures(int[] T) {

        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=T.length-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&T[stack.peek()]<=T[i])
            {
                stack.pop();
            }
            res[i] = stack.isEmpty()?0:stack.peek()-i;
            stack.push(i);
        }
        return res;

    }

}
