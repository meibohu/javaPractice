package Circulation;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner in = new Scanner(System.in);
         System.out.println("Please input the number: ");
         int number = in.nextInt();
         int remain = 0,target=0;
         while(number!=0) {
        	 remain = number%10;
        	 number = number/10;
        	 target = target*10+remain;
         }
         System.out.println(target);
         
	}

}
