package function1;
import java.util.Scanner;
public class testPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int cnt=0;
		for(int i=m;i<n;i++) {
//			boolean prime = true;
//			for(int k=2;k<i;k++) {
//				if(i%k==0) {
//					prime = false;
//					break;
//				}			
//			}
			if(isPrime(i)) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
public static boolean isPrime(int i) { //constructing method
		
		boolean isPrime = true;
		for(int k=2;k<i;k++) {
			if(i%k==0) {
				isPrime = false;
				break;
			}			
		}
		return isPrime;
	}
}
