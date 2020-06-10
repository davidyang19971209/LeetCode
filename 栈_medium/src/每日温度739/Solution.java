package ÿ���¶�739;
/*
 * ���������ע��ݼ�ջ�ڽ�����ʱ��ջ�ڿ��Զѷ����������ѷ�����
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
