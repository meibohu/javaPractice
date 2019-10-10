package Circulation;
import java.util.Scanner;
public class Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			
			System.out.println("Please input the number:");
			int number = in.nextInt();
			int n = 0;
			while(number!=0) {
				number = number/10;
				n++;
				//continue;
				System.out.println(number+" "+n);
			}
			System.out.println("The bit of number is "+ n);
	}

}
