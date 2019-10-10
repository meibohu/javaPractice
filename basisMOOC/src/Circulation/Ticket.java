package Circulation;
import java.util.Scanner;
public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);   //1
			int balance = 0;
			while(true){
				System.out.println("Please input the coin:");
				int amount = in.nextInt();       //2
			//	int balance = 0;
				balance = balance + amount;
			
				System.out.println(amount>=10);
				if(balance>=10) {
					System.out.println("*************");
					System.out.println("Ticket");
					System.out.println("10yuan");
					System.out.println("*************");     //3
					
					System.out.println("remain：" + (balance-10));    //4
					balance = 0;    //clear
				}
			}
	}
}
