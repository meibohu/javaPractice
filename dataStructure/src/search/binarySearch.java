package search;
import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
		int[] newArr = new int[] {4,23,53,82,234,324};
		Scanner in = new Scanner(System.in);
		int target = in.nextInt();
		int mid = (newArr.length-1)/2;
		int index = -1;
		while(true) {
			if(newArr[mid]==target) {
				index = mid;
				break;
			}
			else if(newArr[mid]>target) {
				mid = mid/2;
			}else {
				mid = (mid+newArr.length)/2;
			}
			}
		System.out.print(index);
	}			
}
	
	

