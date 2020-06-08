package 字符串解码394;
/*
 * 使用栈存储，从内向外生成与拼接字符串
 */




import java.util.*;


public class Solution2 {
	public String decodeString(String s) {

        LinkedList<String> stack_res = new LinkedList<>();
        LinkedList<Integer> stack_num = new LinkedList<>();
        StringBuffer res = new StringBuffer();
        int num = 0;

        for(Character c:s.toCharArray())
        {
            if(c=='[')
            {
                stack_res.addLast(res.toString());
                stack_num.addLast(num);
                num=0;
                res = new StringBuffer();
            }
                else if(c==']')
                {
                    StringBuffer temp = new StringBuffer();
                    int current_count = stack_num.pollLast();
                    while (current_count!=0)
                    {
                        temp.append(res);
                        current_count--;
                    }
                    res = new StringBuffer(stack_res.pollLast()+temp);
                }
                    else if(c>='0'&&c<='9')
                        num = num*10 + Integer.parseInt(c+"");
                        else
                        res.append(String.valueOf(c));
        }
        return res.toString();


    }

}
