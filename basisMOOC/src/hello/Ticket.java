package hello;
import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);   //1
			System.out.println("Please input the coin:");
			int amount = in.nextInt();       //2
			
			System.out.println(amount>=10);
			if(amount>=10) {
				System.out.println("*************");
				System.out.println("Ticket");
				System.out.println("10yuan");
				System.out.println("*************");     //3
				
				System.out.println("remain：" + (amount-10));    //4
			}
	}

}
