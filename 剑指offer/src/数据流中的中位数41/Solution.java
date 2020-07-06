package �������е���λ��41;

import java.util.Arrays;
import java.util.Comparator;

/*
 * ע�⣬��������ֶ�����comparator������sort�ıȽ�
 */
class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];

        for (int i=0;i<nums.length;i++)
        {
            strs[i] = String.valueOf(nums[i]);
        }

        // Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));

        Arrays.sort(strs,new Comparator<String>(){
            public int compare(String s1, String s2)
            {
                return (s1+s2).compareTo(s2+s1);
            }
        });

        StringBuilder res = new StringBuilder();
        for(String s: strs)
            res.append(s);
        return res.toString();
    }
}
