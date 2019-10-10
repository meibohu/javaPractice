package CirControl;
import java.util.Scanner;

public class Prime2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner in = new Scanner(System.in);
		 int number = 2;
         int tmp=0;
        // boolean tmp=true;
         int count = 0;
         while(count<50) {
	         for(int j=2;j<number;j++) {
	        	if(number%j==0) {
	        		tmp++;
	        		//tmp = false;
	        		//System.out.println("it's not prime number and i= "+i);
	        		break;
	        	}
	         }
	         if(tmp==0) {
	        	System.out.println("it's prime number!"+number);
	        	count++;
	         }
	         
	         number++;
         }
	
		}

	

}
