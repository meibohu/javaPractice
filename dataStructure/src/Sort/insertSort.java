package Sort;
import java.util.Arrays;
public class insertSort {
		public static void main(String[] args) {
			int[] newArr=new int[] {5,7,2,9,4,1,0,5,7};
			System.out.println(Arrays.toString(newArr));
			insertSort(newArr);
			System.out.println(Arrays.toString(newArr));	
		}
		private static void insertSort(int[] newArr) {
			// TODO Auto-generated method stub
			for(int i=1; i<newArr.length; i++) {
					int tmp = newArr[i];
					int j = i-1;
					
					while(j>=0 && newArr[j]>tmp) {						
						newArr[j+1] = newArr[j];
						j--;
					}				
					newArr[j+1] = tmp;  //must be (j+1);						
			}						
		}					
}
