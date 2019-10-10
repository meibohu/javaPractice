package test;

import test.util.MyArray;
public class TestMyArray {
  
	public static void main(String[] args) {
		
		MyArray iu = new MyArray();
		//int size = iu.size();
		iu.show();
		//System.out.println(size);
		
		iu.add(99);
		iu.add(78);
		iu.add(89);
		iu.show();
		//System.out.println(iu.size());
		
	    iu.delete(2);
	    iu.show();
	    //System.out.print(iu.size());
	    
	    System.out.println("==============");
	    
	   // System.out.print(iu.get(1));
	    int element = iu.get(1);
	    System.out.println(element);
	    
	    System.out.println("===============");
	    
	    iu.add(79);
	    iu.add(32);
	    iu.add(27);
	    iu.show();
	    iu.insert(2, 10);
	    iu.show();
	    
	    System.out.println("================");
	    
	    iu.set(2, 77);
	    iu.show();
	    
	}
}
		
