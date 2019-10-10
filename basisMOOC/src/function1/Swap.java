package function1;

public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=4;
			int b=5;
			
			swap(a,b);
		    System.out.println(a+" "+b);
	}

	private static void swap(int a, int b) {
		// TODO Auto-generated method stub
		int t=0;
		t=a;
		a=b;
		b=t;
		//System.out.println(a+" "+b);
	}

}
