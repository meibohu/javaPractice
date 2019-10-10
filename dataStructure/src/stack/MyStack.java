package stack;

public class MyStack {
	private int[] myArr;
	
	public MyStack() {
		myArr = new int[0];
	}
	public void push(int element) {
		int[] newArr = new int[myArr.length+1];
		for(int i=0;i<myArr.length;i++) {
			newArr[i] = myArr[i];
		}
		newArr[myArr.length] = element;
		myArr = newArr;
	}
	public int pop() {
		int element = myArr[myArr.length-1];
		int[] newArr1 = new int[myArr.length-1];
		for(int i=0;i<newArr1.length;i++) {
			newArr1[i] = myArr[i];
		}
		myArr = newArr1;
		return element;
	}
	public int getPeek() {
		return myArr[myArr.length-1];
	}
}
