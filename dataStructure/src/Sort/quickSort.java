package Sort;
import java.util.Arrays;
public class quickSort {
		public static void main(String[] args) {
			int[] newArr=new int[] {5,7,2,9,4,1,0,5,7};
			System.out.println(Arrays.toString(newArr));
			quickSort(newArr, 0, newArr.length-1);
			System.out.println(Arrays.toString(newArr));		
		}
	private static void quickSort(int[] newArr, int start, int end) {
		// TODO Auto-generated method stub
			if(start < end) {    
				int standard = newArr[start];
				int low = start, high = end;
				while(low < high) {
					
					while(low<high && newArr[high]>=standard) {
						high--;
					}
					newArr[low] = newArr[high];       //cannot enter the while loop and newArr[high]<standard;
					while(low<high && newArr[low]<=standard) {
						low++;
					}
					newArr[high] = newArr[low];    //cannot enter the while loop and newArr[low]>standard;
					
				}
				newArr[low] = standard;
				
				quickSort(newArr, start, low);
				quickSort(newArr, low+1, end);
					
			}		
	}

}
