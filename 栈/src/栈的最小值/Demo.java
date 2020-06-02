package 栈的最小值;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());  
		minStack.pop();
		System.out.println(minStack.top());      
		System.out.println(minStack.getMin());   


		
	}

}
