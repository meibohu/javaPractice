package Array;
import java.util.Scanner;

public class Average {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("Please input the count:");
			int cnt = in.nextInt();
			int sum=0;
			int[] newArr = new int[cnt];
			if(cnt>0) {
				for(int i=0;i<cnt;i++) {
					int number = in.nextInt();
					newArr[i] = number;
					sum = sum+newArr[i];
				}
				double average = sum/cnt;
				System.out.println(average);
			}
			
		}

}
 