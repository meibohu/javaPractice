package test;

public class demo1 {
	public static void main(String[] args) {
		int arr1[] = new int[5] ;
		int leng1 = arr1.length ;
		 
	   System.out.println(leng1);
	   System.out.println("leng1");
	   
	   int element0 = arr1[0];
	   System.out.println("element0 is "+ element0);
	   
	   arr1[0] = 100;
	   System.out.println("element0 is "+ arr1[0]);
	   
	   arr1[1] = 99;
	   arr1[2] = 98;
	   arr1[3] = 97;
	   arr1[4] = 96;
	   
	   for(int i=0;i<leng1;i++ ) {
		   System.out.println("element"+i+" "+arr1[i]);
	   }
	   
	   int[] arr2 = new int[] {100,99,98,97,96,90};
	   System.out.println("arr2's length is "+arr2.length);
	   
	}
}
