package hello;

import java.util.Scanner;

public class Compare3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the first value:");
		int X1 = in.nextInt();
		System.out.println("Please input the second value:");
		int X2 = in.nextInt();
		System.out.println("Please input the third value:");
		int X3 = in.nextInt();
		
		int max;
		if(X1>=X2) {
			if(X1>=X3) {
				max = X1;
			}else {
				max = X3;
			}
		}else {
			if(X2>=X3) {
				max = X2;
			}else {
				max = X3;
			}
		}
		System.out.println(max);	

	}

}
