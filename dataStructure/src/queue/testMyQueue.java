package queue;
public class testMyQueue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue wendy = new MyQueue();
		wendy.add(23);
		wendy.add(12);
		wendy.add(235);
		wendy.add(9);
		wendy.add(87);
		wendy.add(36);
		wendy.add(3);
		
		System.out.println(wendy.pull());
		System.out.println(wendy.pull());
		System.out.println(wendy.pull());
		
		
	}

}
