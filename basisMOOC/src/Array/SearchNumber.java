package Array;
import java.util.Scanner;

public class SearchNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		int[] newArr = new int[] {4,2,6,32,53,3,23};
		boolean found = false;
		for(int k:newArr) {
			if(number==k) {
				found = true;
				break;
			}		
		}
		if(found) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
