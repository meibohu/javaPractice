package Sort;
import java.util.Arrays;

public class selectionSort {
	public static void main(String[] args) {
		int[] newArr=new int[] {5,7,2,9,4,1,0,5,7};
		System.out.println(Arrays.toString(newArr));
		selectionSort(newArr);
		System.out.println(Arrays.toString(newArr));
	}
	private static void selectionSort(int[] newArr) {
		// TODO Auto-generated method stub
		for(int i=0;i<newArr.length;i++) {
			int minIndex = i;
			for(int j=i+1;j<newArr.length;j++) {    //finding the minIndex.
				if(newArr[j]<newArr[minIndex]) {
					minIndex = j;
				}
			}
			//if(i!=minIndex) {    //if minIndex has changed.
				int tmp = newArr[minIndex];
				newArr[minIndex] = newArr[i];
				newArr[i] = tmp;
			//}		
		}
	
	}
}
