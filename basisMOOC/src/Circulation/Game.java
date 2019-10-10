package Circulation;
import java.util.Scanner;
public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int target = (int)(Math.random()*10+1);
//			System.out.println(target);
			System.out.println("Please input the number:");
			int number = in.nextInt();
			int count = 0;
			while(number!=target) {
				if(number<target) {
					System.out.println("the number is smaller.");
				}else
				{
					System.out.println("the number is larger.");
				}
				count++;
				number = in.nextInt();			
			}
		   System.out.println("you are successful! And your count is "+count);		
	}

}
