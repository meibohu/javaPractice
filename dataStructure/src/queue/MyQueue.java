package queue;
public class MyQueue {
	private int[] myArr;
	
	public MyQueue() {
		myArr = new int[0];
	}
	public void add(int element) {
		int[] newArr = new int[myArr.length+1];
		for(int i=0;i<myArr.length;i++) {
			newArr[i] = myArr[i];
		}
		newArr[myArr.length] = element;
		myArr = newArr;
	}
	public int pull() {
		int element = myArr[0];
		int[] newArr1 = new int[myArr.length-1];
		for(int i=0;i<newArr1.length;i++) {
			newArr1[i] = myArr[i+1];
		}
		myArr = newArr1;
		return element;
	}
}
