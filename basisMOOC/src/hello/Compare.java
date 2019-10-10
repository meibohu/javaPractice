package hello;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Please input the first value:");
			int X1 = in.nextInt();
			System.out.println("Please input the second value:");
			int X2 = in.nextInt();
			System.out.println("Please input the third value:");
			int X3 = in.nextInt();
			
			
			int max1,max2;
			
			if(X1>=X2) {
				max1 = X1;
			}else {
				max1 = X2;
			}
			if(max1<X3) {
				max2 = X3;
			}else {
				max2 = max1;
			}
			System.out.println(max2);	
	}

}
