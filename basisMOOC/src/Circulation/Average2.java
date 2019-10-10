package Circulation;
import java.util.Scanner;

public class Average2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int sum=0,num,count=0;
			Scanner in = new Scanner(System.in);
			num = in.nextInt();
			
			while(num!=-1) {      //giving a ending mark.
				sum=num+sum;
				num = in.nextInt();
				count++;
			}
			if(count!=0) {                                //
				Double average = (double) (sum/count);    //attention
				System.out.println(average);
			}
	}

}
