package Sort;
import java.util.Arrays;
public class shellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] newArr=new int[] {5,7,2,9,4,1,0,5,7};
		System.out.println(Arrays.toString(newArr));
		shellSort(newArr);
		System.out.println(Arrays.toString(newArr));	
	}

	private static void shellSort(int[] newArr) {
		// TODO Auto-generated method stub
		for(int gap=newArr.length; gap>0; gap/=2 ) {
			for(int i=gap; i<newArr.length; i++) {
				
				for(int j=i-gap; j>=0; j=j-gap) {
					if(newArr[j]>newArr[j+gap]){
						int tmp = newArr[j+gap];
						newArr[j+gap] = newArr[j];
						newArr[j] = tmp;
					}
				}
			}
		}
		
			
		
	}
	
	

}
