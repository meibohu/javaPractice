package function1;
import java.util.Scanner;
public class testSum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int ahu = in.nextInt();
			int amei = in.nextInt();		
			Sum(ahu,amei);
	}

	private static void Sum(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
