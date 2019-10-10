package Sort;
import java.util.Arrays;
public class bubbleSort {
	
		public static void main(String[] args) {
			int[] newArr=new int[] {5,7,2,9,4,1,0,5,7};
			System.out.println(Arrays.toString(newArr));
			bubbleSort(newArr);
			System.out.println(Arrays.toString(newArr));
		}
		//两两交换
		private static void bubbleSort(int[] arr) {
			// TODO Auto-generated method stub
			for(int i=0;i<arr.length-1;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int tmp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = tmp;
					}
				}
			}			
		}
	

}
