package test;

import java.util.Arrays;

public class TestOpArray {
	public static void main(String[] args) {
		int[] arr2 = new int[] {3,2,4,7};
		System.out.println("arr2'length is "+ arr2.length);
		//System.out.println(Arrays.toString(arr2));
		
		int ex = 5;
		
		int[] newArr2 = new int[arr2.length+1];
		for(int i=0; i<arr2.length;i++){
			newArr2[i] = arr2[i];
		}
		
		newArr2[arr2.length] = ex;
		
		arr2 = newArr2;
		System.out.println(Arrays.toString(arr2));
		
	}
}
