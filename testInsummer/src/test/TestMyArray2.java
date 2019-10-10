package test;
import test.util.MyArray;

public class TestMyArray2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray hu = new MyArray();
		hu.add(1);
		hu.add(3);
		hu.add(4);
		hu.add(7);
		hu.add(8);
		hu.add(10);
		
		int index =  hu.search(0);
		System.out.println("index="+index);	
		
		int index2 = hu.binarysearch(9);
		System.out.println("index2="+index2);
	}
	
}
