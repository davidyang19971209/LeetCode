package ��ջΪ��;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue queue = new MyQueue();

		queue.push(1);
		queue.push(2);
		System.out.println(queue.peek());  // ���� 1
		System.out.println(queue.pop());   // ���� 1
		System.out.println(queue.empty()); // ���� false

	}

}
