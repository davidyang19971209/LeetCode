package 两个栈实现队列;

/**
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.Stack;

public class CQueue {
	
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	

    public CQueue() {

    }
    
    public void appendTail(int value) 
    {
    	s1.push(value);
    }
    
    public int deleteHead() {
    	if(s2.isEmpty()&&s1.isEmpty())
    		return -1;
    	if(s2.isEmpty())
    	{
    		while(!s1.isEmpty())
    		{
    			s2.push(s1.pop());
    		}
    	}
    	return s2.pop();

    }

}
