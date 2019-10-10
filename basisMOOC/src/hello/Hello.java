package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("hello");
			Scanner in = new Scanner(System.in);
//			System.out.println("echo:"+ in.nextLine()); 
//			System.out.println("2+3="+ 2+3 );
//			System.out.println("2+3="+ (2+3) );
//			System.out.println(2+3 +"=2+3="+ (2+3) );
//			System.out.println("100-23=" + (100-in.nextInt()));
	//		System.out.println("100-"+ in.nextInt()+ "="+ (100-in.nextInt()));
			
			
//			System.out.println("100-"+ target + "=" + (100-target) );
			System.out.print("Please input the amount:");
			int amount = in.nextInt();
			System.out.print("Please input the target:");
			int target = in.nextInt();
			System.out.println(amount +"-"+ target + "=" + (amount-target) );
			
			
			
	}

}
