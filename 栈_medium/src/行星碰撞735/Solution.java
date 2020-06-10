package ������ײ735;

import java.util.Stack;

/*
 * �ص����ڴ����collusion�����
 */


public class Solution {
	public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for(int ast:asteroids)
        {
            collision:
            {
                while(!stack.isEmpty()&&stack.peek()>0&&ast<0)
                {
                    if(-ast>stack.peek())
                    {
                        stack.pop();
                        continue;
                    }
                    else if(stack.peek()== -ast)
                    {
                        stack.pop();
                    }
                    break collision;
                }
            stack.push(ast);
            }
        }

        int[] res = new int[stack.size()];

        for(int i=res.length-1;i>=0;i--)
        {
            res[i] = stack.pop();
        }
        return res;

    }

}
