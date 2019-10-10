package Sort;
import java.util.Arrays;
public class mergeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] newArr=new int[] {4,23,5,2,7,10,3,8,99};
		System.out.println(Arrays.toString(newArr));
		mergeSort(newArr, 0, 8);
		System.out.println(Arrays.toString(newArr));
	}
	private static void merge(int[] newArr, int start, int middle, int end) { 
		int[] tmp = new int[end-start+1];
		int i = start;      //the first part
		int j = middle+1;   //the second part
		int index = 0;
		
		while(i<=middle && j<=end) {
			if(newArr[i] <= newArr[j]) {
				tmp[index] = newArr[i];
				i++;
			}else {
				tmp[index] = newArr[j];
				j++;
			}
			index++;
		}
		while(i<=middle) {
			tmp[index] = newArr[i];
			i++;
			index++;
		}
		while(j<=end) {
			tmp[index] = newArr[j];
			j++;
			index++;
		}
		for(int k=0;k<tmp.length;k++) {    //putting back to original array.
			newArr[k+start] = tmp[k];   //from start
		}
	}
	
	private static void mergeSort(int[] newArr, int start, int end) {
		// TODO Auto-generated method stub
		if(start<end) {
			int middle = (start+end)/2;
			mergeSort(newArr, start, middle);
			mergeSort(newArr, middle+1, end);
			
			merge(newArr, start, middle, end);
		}	
	}
		
}
