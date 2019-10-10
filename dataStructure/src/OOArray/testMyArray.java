package OOArray;

import java.util.Arrays;

public class testMyArray {
	public static void main(String[] args) {
		MyArray wendy = new MyArray();
		
		wendy.addEle(1);
		wendy.addEle(3);
		wendy.addEle(5);
		wendy.addEle(19);
		
		System.out.println(wendy.size());
		System.out.println(wendy.toString());
//		wendy.show();
		wendy.delete(0);
		System.out.println(wendy.toString());
		
		wendy.getEle(0);
		
		wendy.insert(1, 99);
		System.out.println(wendy.toString());
		
		wendy.replace(1, 8);
		System.out.println(wendy.toString());
		wendy.replace(2, 10);
		System.out.println(wendy.toString());
		
		wendy.addEle(42);
		wendy.addEle(78);
		System.out.println(wendy.toString());
		
		int index = wendy.binarySearch(90);
		System.out.println(index);
		
	}
	
}
