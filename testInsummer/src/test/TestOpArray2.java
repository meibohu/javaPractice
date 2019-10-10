package test;

import java.util.Arrays;

public class TestOpArray2 {
	public static void main(String[] args) {
		
		int[] arr3 = new int[] {3,2,5,3};
		System.out.println(Arrays.toString(arr3));
		
		int ex = 2;
		
		int[] newArr3 = new int[arr3.length-1];
		for(int i=0; i<arr3.length-1; i++) {
			if (i<ex) {
				newArr3[i] = arr3[i];}
			else {
				newArr3[i] = arr3[i+1];
			}
		}
		
		arr3 = newArr3;
		System.out.println(Arrays.toString(arr3));
		
			
		}
		
}
