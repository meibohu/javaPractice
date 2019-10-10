package test2.de;
import test2.MyStark;

public class TestMyStack {
	public static void main(String[] args) {
	MyStark hu = new MyStark();
	 
	hu.push(8);
	hu.push(2);
	hu.push(3);
	hu.push(4);
	
	System.out.println(hu.peek());
	System.out.println(hu.pop());
	System.out.println(hu.pop());
	System.out.println(hu.pop());
	
	
	}
}
