package CirControl;
import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 Scanner in = new Scanner(System.in);
			 System.out.println("Please input the number: ");
	         int number = in.nextInt();
//	         int tmp=1;
	         boolean tmp=true;
	         for(int i=2;i<number;i++) {
	        	if(number%i==0) {
	        		//tmp++;
	        		tmp = false;
	        		System.out.println("it's not prime number and i= "+i);
	        		break;
	        	}
	         }
	         if(tmp) {
	        	System.out.println("it's not prime number!");
	         }else {
	        	System.out.println("it's prime number!");
	         }
	}

}
