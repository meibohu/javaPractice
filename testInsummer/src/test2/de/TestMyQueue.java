package test2.de;
import test2.MyQueue;

public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue hu = new MyQueue();
		hu.add(2);
		hu.add(3);
		hu.add(9);
		hu.add(4);
		
		System.out.println(hu.poll());
		hu.add(5);
		System.out.println(hu.poll());		
	}
}
