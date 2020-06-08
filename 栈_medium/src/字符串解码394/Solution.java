package ×Ö·û´®½âÂë394;

/*
 * µÝ¹é·½·¨
 */
		


public class Solution {
public String decodeString(String s) {
    return dfs(s,0)[0];
}

public String[] dfs(String s, int i)
{
    int num = 0;
    StringBuilder res = new StringBuilder();

    while(i<s.length())
    {
        if( s.charAt(i)>='0'&& s.charAt(i)<='9')
            num = num*10+Integer.parseInt(String.valueOf(s.charAt(i)));
            else if ( s.charAt(i)=='[')
            {   
                String[] temp = dfs(s,i+1);
                i = Integer.parseInt(temp[0]);
                while(num>0)
                {
                    res.append(temp[1]);
                    num--;
                }

            }
                else if( s.charAt(i)==']')
                {
                    return new String[]{String.valueOf(i),res.toString()};
                }
                    else
                        res.append(String.valueOf(s.charAt(i)));
        i++;
    }  
    return new String[]{res.toString()}; 
}
	

}
