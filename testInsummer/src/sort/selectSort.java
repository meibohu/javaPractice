package sort;

import java.util.Arrays;

public class selectSort {
	public static void main(String[] args) {
		int newArr[] = new int[] {5,4,2,7,24,62,3};
		SelectSort(newArr);
		System.out.println(Arrays.toString(newArr));
	}
	public static void SelectSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int minArr = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[minArr]>arr[j]) {
					minArr = j;
				}
			}
			if(i!=minArr) {
				int temp = arr[i];
				arr[i] = arr[minArr];
				arr[minArr] = temp;
			}
		}
	}
}
