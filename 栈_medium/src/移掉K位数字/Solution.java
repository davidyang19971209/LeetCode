package 移掉K位数字;
/*
 * 维护单调栈，重点在于拿掉数字时候数据的处理（去掉0）
 */


import java.util.LinkedList;

public class Solution {
	public String removeKdigits(String num, int k) {

        LinkedList<Character> stack = new LinkedList<Character>();

        for(char digit:num.toCharArray())
        {
            while(stack.size()>0&&k>0&&stack.peekLast()>digit)
            {
                stack.removeLast();
                k--;
            }

            stack.addLast(digit);
        }
            for(int i=0;i<k;i++)
            {
                stack.removeLast();
            }
            
            StringBuilder res = new StringBuilder();
            boolean LeadingZero = true;

            for(char digit: stack)
            {
                if(LeadingZero && digit == '0') continue;
                LeadingZero = false;
                res.append(digit);
            }

            if (res.length() == 0) return "0";
            return res.toString();
        



}
