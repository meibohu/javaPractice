package Array;
import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
	int[] newArray = new int[10];
	Scanner in = new Scanner(System.in);
	int number = in.nextInt();
	while(number!=-1) {
		if(number>=0&&number<=9) {
			newArray[number]++;
		}
		number = in.nextInt();
	}
	for(int i=0;i<newArray.length;i++) {
		System.out.println("the "+i+" has occurred "+ newArray[i] +" times.");
		
	}
 }
}
