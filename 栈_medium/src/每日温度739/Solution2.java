package 每日温度739;
/*
 * 正向遍历
 */

public class Solution2 {
	public int[] dailyTemperatures(int[] T) {

        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<T.length;i++)
        {
            while(!stack.isEmpty()&&T[stack.peek()]<T[i])
            {   
                res[stack.peek()] = i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return res;

    }

}
