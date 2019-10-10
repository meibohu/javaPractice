package Circulation;
import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int target = (int)(Math.random()*10+1);		
//		System.out.println(target);
		int count=0,number;
		do {	
			number = in.nextInt();
			count++;
			if(number<target) {
				System.out.println("the number is smaller.");
			}else
			{
				System.out.println("the number is larger.");
			}
		}while(number!=target) ;
		
		System.out.println("you are successful! And your count is "+count);	
		
		}
		
}
