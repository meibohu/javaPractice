package stack;

public class testMyStack {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(3);
		myStack.push(5);
		myStack.push(23);
		myStack.push(21);
		myStack.push(8);
		myStack.push(5);
		
		int element = myStack.pop();
		System.out.println(element);
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
		
		System.out.println(myStack.getPeek());
		
		
		
		
	}
	
}
