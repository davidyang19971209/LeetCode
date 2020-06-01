package 比较含退格的字符串844;
/**
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。

注意：如果对空文本输入退格字符，文本继续为空。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/backspace-string-compare
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 *
 */


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String a = "123";
		String b = "123";
		System.out.println(a==b);
		
		System.out.println(s.backspaceCompare("ab#c", "ad#c"));
	}

}
