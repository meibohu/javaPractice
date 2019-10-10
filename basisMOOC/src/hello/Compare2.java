package hello;
import java.util.Scanner;

public class Compare2 {
	public static void main(String[] args) {
		final int pass = 60;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input your score:");
		int score = in.nextInt();
		if(score<pass) {
			System.out.println("you failed in the exam.");
		}else {
			System.out.println("you succeed in the exam.");
			System.out.println("Have a good time!");
		}
		
		
		
		
	}
}
