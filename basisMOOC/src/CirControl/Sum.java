package CirControl;

import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 System.out.println("Please input the number: ");
         int number = in.nextInt();
         double sum = 0.0;
         int sign = 1;
         
         for(int i=1;i<=number;i++,sign=-sign) {
        	 sum += 1.0/i*sign;
        	 //sign = -sign;
         }
         System.out.println(sum);
         System.out.printf("%.2f",sum);    //the setting
	}

}
