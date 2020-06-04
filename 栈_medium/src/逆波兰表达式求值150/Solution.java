package 逆波兰表达式求值150;

/*
 * 可以用数组来模拟栈的操作
 */

public class Solution {
	
public int evalRPN(String[] tokens) 
{   
    int[] numStack = new int[tokens.length / 2 + 1];
    int index = 0;
    
    for(String s: tokens)
    {
        switch(s)
        {
            case "+":
                numStack[index-2] += numStack[--index];
                break;
            case "-":
                numStack[index-2] -= numStack[--index];
                break;
            case "*":
                numStack[index-2] *= numStack[--index];
                break;
            case "/":
                numStack[index-2] /= numStack[--index];
                break;
            default:
                numStack[index++] = Integer.parseInt(s);
                break;
        }
    }

    return numStack[0];
}                       
}
